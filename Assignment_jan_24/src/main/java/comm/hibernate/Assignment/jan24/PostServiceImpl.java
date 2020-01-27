package comm.hibernate.Assignment.jan24;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import comm.hibernate.Assignment.jan24.Entity.Post;


@Service("service")
public class PostServiceImpl implements PostDAO {

	private PostDAO dao;
	
	@Autowired

	public PostServiceImpl() {
		super();
		this.dao=dao;
	}

	
	@Override
	@Transactional
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		
		return dao.createPost(post) ;
	}

	
	
	

}
