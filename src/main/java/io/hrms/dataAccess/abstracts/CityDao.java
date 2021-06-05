package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>
{
	City getById(int id);
	
}



