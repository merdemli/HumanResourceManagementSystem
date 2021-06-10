package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.ForeignLanguageForCVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.ForeignLanguageForCv;

@RestController
@RequestMapping("/api/foreignlanguagesforcv")
public class ForeignLanguagesForCvController {
	
	@Autowired
	private ForeignLanguageForCVService foreignLanguageForCVService;

	public ForeignLanguagesForCvController(ForeignLanguageForCVService foreignLanguageForCVService) {
		super();
		this.foreignLanguageForCVService = foreignLanguageForCVService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody ForeignLanguageForCv ForeignLanguageForCv) {
		return this.foreignLanguageForCVService.add(ForeignLanguageForCv);
	}
	
	@GetMapping("/getAll")
	DataResult<List<ForeignLanguageForCv>>getAll(){
		return this.foreignLanguageForCVService.getAll();}
	
	
	
	

}
