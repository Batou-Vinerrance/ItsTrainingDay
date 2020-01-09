package sopra.projet.ItsTrainingDay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
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
		
		public Program() {
			super();
		}
		
		public Program(String name, String description, int duration, int nbValidation, Date creationDate,
				boolean isValidated, boolean isDone) {
			super();
			this.name = name;
			this.description = description;
			this.duration = duration;
			this.nbValidation = nbValidation;
			this.creationDate = creationDate;
			this.isValidated = isValidated;
			this.isDone = isDone;
		}
}
