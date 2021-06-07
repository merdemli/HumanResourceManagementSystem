package io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="cv_cover_letters")
@NoArgsConstructor
public class CoverLetterForCV extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cv_id")
	private int cvId;
	
	@Column(name = "content")
	private String content;
	
	public CoverLetterForCV(int id, int cv_id, String content) {
		super();
		this.id = id;
		this.cvId = cv_id;
		this.content = content;
	}
	
}
