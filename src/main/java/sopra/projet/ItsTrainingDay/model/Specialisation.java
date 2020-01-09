package sopra.projet.ItsTrainingDay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

public @Data class Specialisation {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String speName;
	private String speDescription;
	
	public Specialisation() {
		super();
	}
	
	public Specialisation(String speName, String speDescription) {
		super();
		this.speName = speName;
		this.speDescription = speDescription;
	}
	
	

}
