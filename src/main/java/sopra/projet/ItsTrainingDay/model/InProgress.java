package sopra.projet.ItsTrainingDay.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

public @Data class InProgress {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Date beginingDate;
	private Date endDate;
	private Integer progression;
	
}