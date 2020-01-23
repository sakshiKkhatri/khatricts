package company.One_to_onebi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import company.One_to_onebi.entity.Instructor;
import company.One_to_onebi.entity.InstructorDetail;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			int theId = 1;
			session.getTransaction().begin();
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			session.getTransaction().commit();
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {

			// session.close();

			factory.close();
		}
	}

}