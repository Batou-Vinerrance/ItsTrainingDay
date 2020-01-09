package sopra.projet.ItsTrainingDay.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

public @Data class Program {

		@Id
		@GeneratedValue
		private Long id;
		@Version
		private int version;
		private String name;
		private String description;
		private int duration;
		private int nbValidation;
		private Date creationDate;
		private boolean isValidated;
		private boolean isDone;
}
