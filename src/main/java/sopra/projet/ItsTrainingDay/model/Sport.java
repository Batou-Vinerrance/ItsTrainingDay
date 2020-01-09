package sopra.projet.ItsTrainingDay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

public @Data class Sport {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String sportName;
	private String sportDescription;
	public Sport() {
		super();
	}
	public Sport(String sportName, String sportDescription) {
		super();
		this.sportName = sportName;
		this.sportDescription = sportDescription;
	}
	
	
}
