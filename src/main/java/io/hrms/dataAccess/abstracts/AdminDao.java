package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.Admin;

public interface AdminDao extends JpaRepository<Admin,Integer>{

}
