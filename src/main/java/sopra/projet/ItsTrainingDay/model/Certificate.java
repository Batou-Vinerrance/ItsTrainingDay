package sopra.projet.ItsTrainingDay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
public @Data class Certificate {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private boolean certificate;
	
	public Certificate() {
		super();
	}
	
	public Certificate(boolean certificate) {
		super();
		this.certificate = certificate;
	}
	
	
}
