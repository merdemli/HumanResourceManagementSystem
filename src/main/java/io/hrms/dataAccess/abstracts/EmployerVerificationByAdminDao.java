package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.EmployerVerificationByAdmin;

public interface EmployerVerificationByAdminDao extends JpaRepository<EmployerVerificationByAdmin, Integer> {

}
