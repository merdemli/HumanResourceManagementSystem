package io.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobseekers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeeker extends User {
	
//	@Id
//	@GeneratedValue
//	@Column(name = "user_id")
//	private int userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "national_id")
	@NotNull
	@NotBlank
	private String nationalId;
	
	@Column(name = "date_of_birth")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified",columnDefinition  = "boolean default false")
	private boolean isVerified = false;
	
	@OneToMany(mappedBy = "jobSeeker")
	private List<CV> cvs;
	
	
	
}
