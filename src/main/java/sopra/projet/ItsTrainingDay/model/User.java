package sopra.projet.ItsTrainingDay.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

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
	
	
	
	
	

}