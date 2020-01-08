package sopra.projet.ItsTrainingDay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	
	

}
