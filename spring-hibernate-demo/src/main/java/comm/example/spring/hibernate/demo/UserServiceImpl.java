package comm.example.spring.hibernate.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.hibernate.spring.hibernate.demo.Entity.UserDetail;

@Service("service")
public class UserServiceImpl implements UserService{
	 private UserDao dao;
	 
@Autowired
	public UserServiceImpl(UserDao dao) {
		super();
		// TODO Auto-generated constructor stub
	
		this.dao= dao;
		
		
	}


	@Override
	public UserDetail createUser(UserDetail user) {
		// TODO Auto-generated method stub
		return dao.createUser(user);
	}

}
