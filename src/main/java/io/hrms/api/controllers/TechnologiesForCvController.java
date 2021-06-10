package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.TechnologyForCvService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Photo;
import io.hrms.entities.concretes.TechnologyForCV;

@RestController
@RequestMapping("/api/technologiesforcv")
public class TechnologiesForCvController {
	
	@Autowired
	private TechnologyForCvService technologyForCvService;

	public TechnologiesForCvController(TechnologyForCvService technologyForCvService) {
		super();
		this.technologyForCvService = technologyForCvService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody TechnologyForCV technologyForCv) {
		return this.technologyForCvService.add(technologyForCv);
	}
	
	@GetMapping("/getAll")
	DataResult<List<TechnologyForCV>>getAll(){
		return this.technologyForCvService.getAll();}
	
	

}
