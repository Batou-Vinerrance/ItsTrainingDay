package sopra.projet.ItsTrainingDay.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
	@Enumerated (EnumType.STRING)
	private Erole role; 
	private boolean commercial;
	private boolean isDisactivated; 
	
	@ManyToMany
	@JoinTable(name="user_program",
	joinColumns = {@JoinColumn(name="user_id")},
	inverseJoinColumns = @JoinColumn(name="program_id"))
	private List<Program> programs = new ArrayList<Program>(); 
	
	@ManyToMany
	@JoinTable(name="user_sport",
	joinColumns = {@JoinColumn(name="user_id")},
	inverseJoinColumns = @JoinColumn(name="sport_id"))
	private List<Sport> sports = new ArrayList<Sport>();
	
	@OneToMany
	private List<InProgress> inProgress = new ArrayList<InProgress>(); 
	
	public User() {
		super();
	}


	public User(String firstName, String lastName, String userName, String email, String password, Date birthDate,
			Erole role, boolean commercial, boolean isDisactivated) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
		this.role = role;
		this.commercial = commercial;
		this.isDisactivated = isDisactivated;
	}


	
	
	
	
	

}
