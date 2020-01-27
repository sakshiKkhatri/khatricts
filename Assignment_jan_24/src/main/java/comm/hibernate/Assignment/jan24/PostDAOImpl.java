package comm.hibernate.Assignment.jan24;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.hibernate.Assignment.jan24.Entity.Post;

@Repository("dao")
public class PostDAOImpl implements PostDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	
	
	@Autowired
	 public PostDAOImpl (SessionFactory sessionFactory) 
	{
		super();
		this.sessionFactory=sessionFactory;
		session=sessionFactory.openSession();
		
	}
	
	@Override
	public Post createPost(Post post) {
		session.save(post);
	
		return post;
	}

}


	
	



