package io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
public class Base {

	
	@JsonIgnore
	@Column(name = "createdAt",  columnDefinition = "Date default CURRENT_DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name = "isActive", columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@Column(name = "isDeleted", columnDefinition = "boolean default true")
	private boolean isDeleted = false;
	
	

}
