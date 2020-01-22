package company.Album;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import company.Album.entity.Album;
import company.Album.entity.MyImage;

public class AlbumDaoImpl implements AlbumDao {

	@Override
	public Album createAlbum(Album album) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
				.addAnnotatedClass(MyImage.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		Album tempAlbum = null;

		try {

			Album tempAlbum1 = new Album("mvn repository",LocalDate.now());

			MyImage myimg = new MyImage("https://mvnrepository.com/artifact/org");

			tempAlbum1.setImage(myimg);

			session.beginTransaction();

			System.out.println("Saving the album: " + tempAlbum);
			session.save(tempAlbum);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
		
		return tempAlbum;
	}

	@Override
	public Album deleteAlbum(Album album) {
		
		
		
		
		
		
		return null;
	}

	@Override
	public Album updateAlbum(Album album) {
		// TODO Auto-generated method stub
		return null;
	}

}












































































