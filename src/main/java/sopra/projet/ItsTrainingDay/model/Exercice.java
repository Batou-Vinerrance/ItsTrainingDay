package sopra.projet.ItsTrainingDay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
public @Data class Exercice {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String exerciceName;
	private String exerciceText;
	
	public Exercice() {
		super();
	}

	public Exercice(String exerciceName, String exerciceText) {
		super();
		this.exerciceName = exerciceName;
		this.exerciceText = exerciceText;
	}	
	
}
