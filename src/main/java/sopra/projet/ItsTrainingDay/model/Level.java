package sopra.projet.ItsTrainingDay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

public @Data class Level {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String levelName;
	private String levelDescription;
}
