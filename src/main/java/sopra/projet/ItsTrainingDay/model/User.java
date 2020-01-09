package sopra.projet.ItsTrainingDay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
public @Data class User {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	private Date birthDate;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String userName, String email, String password, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
	}
	
	
	
	
	

}
