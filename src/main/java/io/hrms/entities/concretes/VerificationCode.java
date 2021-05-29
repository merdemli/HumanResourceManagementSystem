package io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "verification_codes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationCode {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "is_confirmed",columnDefinition  = "boolean default false")
	private boolean isConfirmed =false;
	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name = "activation_date")
	private LocalDate activationDate;

}
