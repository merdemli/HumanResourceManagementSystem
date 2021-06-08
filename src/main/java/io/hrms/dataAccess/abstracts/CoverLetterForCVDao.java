package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.CV;
import io.hrms.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCVDao extends JpaRepository<CoverLetterForCV, Integer>{

	CoverLetterForCV getById(int id);
}
