package io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {
	
//	@Id
//	@GeneratedValue
//	@Column(name = "user_id")
//	private int userId;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	@Column(name = "company_name")
	private String companyName;

	@OneToMany(mappedBy = "employer")
	private List<JobAdvert>jobAdverts;
}
