package sopra.projet.ItsTrainingDay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
public @Data class InProgress {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Date beginingDate;
	private Date endDate;
	private Integer progression;
	
	public InProgress() {
		super();
	}
	
	public InProgress(Date beginingDate, Date endDate, Integer progression) {
		super();
		this.beginingDate = beginingDate;
		this.endDate = endDate;
		this.progression = progression;
	}
	
	
	
}
