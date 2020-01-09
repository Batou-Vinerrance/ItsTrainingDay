package sopra.projet.ItsTrainingDay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

public class Certificate {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private boolean certificate;
}