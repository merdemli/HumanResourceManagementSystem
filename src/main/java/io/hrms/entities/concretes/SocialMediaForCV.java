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
@Table(name = "cv_social_media")
@AllArgsConstructor
@NoArgsConstructor
public class SocialMediaForCV extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "social_media_id")
//	private int socialMediaId;
	
//	@Column(name = "cv_id")
//	private int cvId;
	
	@Column(name = "link")
	private String link;
	
	@ManyToOne
	@JoinColumn(name = "social_media_id")
	private SocialMedia socialMedia;

	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CV cv;
	
}
