package cmr.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import com.mysql.cj.x.protobuf.MysqlxCursor.Open;

import cmr.model.Customer;
import util.CustomerUtil;

public class CustomerDAOImpl implements CustomerDAO {
	
	private Session session;
	private EntityManager entitymanager;
	{
		session=CustomerUtil.getMySessionFactory().openSession();
		session.getTransaction().begin();
		entitymanager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
		
	}
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(customer);
		entitymanager.getTransaction().commit();
		return customer;
		
		
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Query query=entitymanager.createQuery("from Customer",Customer.class);
		return null;
	}
	

}
