package io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "cv_technologies")
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyForCV extends Base {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
//	
//	@Column(name = "cv_id")
//	private int cvId;
////	
//	@Column(name = "technology_id")
//	private int technologyId;
	
	@ManyToOne
	@JoinColumn(name = "technology_id")
	private Technology technologies;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CV cv;
}
