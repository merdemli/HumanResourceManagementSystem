package io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employers_verification_byAdmins")
@AllArgsConstructor
@NoArgsConstructor
public class EmployerVerificationByAdmin extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "admin_id")
	private int adminId;
	
	@Column(name = "verification_status" ,columnDefinition = "boolean default false")
	private boolean verificationStatus = false;
	
	
	

}
