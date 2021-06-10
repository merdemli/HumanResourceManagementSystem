package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer> {

	Photo getById(int id);
}
