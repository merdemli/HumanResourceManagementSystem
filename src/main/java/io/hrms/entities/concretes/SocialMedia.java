package io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "social_media")
@AllArgsConstructor
@NoArgsConstructor
public class SocialMedia extends Base {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "social_media_name")
	private String socialMediaName;
	
	@OneToMany(mappedBy = "socialMedia")
	private List<SocialMediaForCV>socialMediaForCVs;

	
}
