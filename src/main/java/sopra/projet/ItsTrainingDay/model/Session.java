package sopra.projet.ItsTrainingDay.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

public @Data class Session {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String name;
	private String text;
	private Integer nbSession;
	
	public Session() {
		super();
	}
	public Session(String name, String text, Integer nbSession) {
		super();
		this.name = name;
		this.text = text;
		this.nbSession = nbSession;
	} 
	
	
}
