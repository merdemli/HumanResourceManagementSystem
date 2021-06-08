package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.CVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.entities.concretes.CV;
import io.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cvs")
public class CVsController  {
	
	private CVService cvService;

	@Autowired
	public CVsController(CVService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getByJobSeekerId")
	public DataResult<List<CV>> getByJobSeekerId(int userId){
		return this.cvService.getByJobSeekerId(userId);
	}
	
	

}
