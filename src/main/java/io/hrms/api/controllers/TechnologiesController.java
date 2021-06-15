package io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.TechnologyService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Technology;


@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	
	private TechnologyService technologyService;

	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}

	@PostMapping("/add")
	Result add(@RequestBody Technology technology) {
		return this.technologyService.add(technology);
	}
	
	@GetMapping("/getAll")
	DataResult<List<Technology>>getAll(){
		return this.technologyService.getAll();}
	
}
