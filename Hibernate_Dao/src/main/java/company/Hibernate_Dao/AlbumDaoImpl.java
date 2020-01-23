package company.Hibernate_Dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import company.Album2.Entity.Album;
import company.Album2.Entity.MyImage;

public class AlbumDaoImpl implements AlbumDao {
	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session=Hibernate.getSession();
		transaction=session.getTransaction();
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	public Album createAlbum(Album album)
	{
		try {
			
			transaction.begin();
			System.out.println("Saving the album: " + album);
			session.save(album);			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return album;
	}
	
	@Override
	public List<Album> getAllAlbums() {
		Query query=session.createQuery("from Album");
		return query.list();
	}

	@Override
	public Album findById(Integer id) {
	  Album alb=session.get(Album.class, id);
		if(alb==null)
		{
			System.out.println("not found");
		}
		return alb;
	}
	@Override
	public Album updateAlbum(Integer id) throws IOException {
		Album alb=session.get(Album.class, id);
		if(alb!=null)
		{			
			 System.out.println("Name: ");
			  String name=br.readLine().toString(); 
			 alb.setAlbumName(name);
			transaction.begin();
			session.update(alb);
			transaction.commit();
			
			
			
		}
		else {
			System.out.println("not found");
		}
		
		return alb;
	}
	
	@Override
	public Album deleteAlbum(Integer id) {
		Album a=session.get(Album.class, id);
		if(a!=null)
		{
			transaction.begin();
			session.delete(a);
			transaction.commit();
			
		}
		else
		{
			System.out.println("not found");
		}
		return a;
	}

	
	}

