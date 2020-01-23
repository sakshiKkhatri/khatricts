package company.Album2;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import company.Album2.Entity.Album;
import company.Album2.Entity.MyImage;



public final class HibernateUtil {
	
	private static SessionFactory factory;
	
static {
	Logger logger = Logger.getLogger("org.hibernate");
	logger.setLevel(Level.OFF);
	factory=new Configuration().configure().
			addAnnotatedClass(Album.class).
			addAnnotatedClass(MyImage.class).
			buildSessionFactory();
}
	private HibernateUtil() {
		
	}
	public static Session getSession()
	{
		return factory.openSession();
	}

}