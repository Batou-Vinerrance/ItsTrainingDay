package sopra.projet.ItsTrainingDay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
public @Data class Level {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String levelName;
	private String levelDescription;
}
