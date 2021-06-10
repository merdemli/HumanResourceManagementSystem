package io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_foreign_languages")
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguageForCv extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "cv_id")
//	private int cvId;
	
//	@Column(name = "language_level_id")
//	private int laguageLevelId;
//	
//	@Column(name = "foreign_language_id")
//	private int foreignLanguageId;
	
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CV cv;
	
	@ManyToOne()
	@JoinColumn(name = "foreign_language_id")
	private ForeignLanguage foreignLanguage;
	
	@Column(name = "level")
	@Min(value = 1)
	@Max(value = 5)
	@NotBlank
	@NotNull
	private int level;

//	@ManyToOne
//	@JoinColumn(name = "language_level_id")
//	private LanguageLevel languageLevel;
	
	
	
	
}
