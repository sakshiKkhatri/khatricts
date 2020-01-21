package company.Hibernate_Dao;

import java.io.IOException;
import java.util.List;

public interface PersonService {
	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public List<Person> getPersonByid(String uId);
	public Person updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);
	Person getPersonByid(Integer id);

}