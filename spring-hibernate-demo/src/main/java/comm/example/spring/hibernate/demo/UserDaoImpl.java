package comm.example.spring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.hibernate.spring.hibernate.demo.Entity.UserDetail;
@Repository("dao")
public class UserDaoImpl implements UserDao {

	 private SessionFactory sessionFactory;
	 private Session session;
	 

	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		// TODO Auto-generated constructor stub
	this.sessionFactory =sessionFactory;
	
	session = sessionFactory.openSession();
	}





	@Override
	public UserDetail createUser(UserDetail user) {
		// TODO Auto-generated method stub
		return user;
	}

}
