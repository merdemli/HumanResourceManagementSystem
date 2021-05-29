package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.VerificationCode;

public interface VertificationCodeDao extends JpaRepository<VerificationCode, Integer> {

}
