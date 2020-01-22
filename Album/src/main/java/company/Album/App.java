package company.Album;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import company.Album.entity.Album;
import company.Album.entity.MyImage;



class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
				.addAnnotatedClass(MyImage.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		

		try {

			Album tempAlbum = new Album("songs",LocalDate.now());

			MyImage myimg = new MyImage("https://www.google.com/search?q=image");

			tempAlbum.setImage(myimg);

			session.beginTransaction();

			System.out.println("Saving the album: " + tempAlbum);
			session.save(tempAlbum);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
		
	}

}
