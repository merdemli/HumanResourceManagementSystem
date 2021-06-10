package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.ForeignLanguageService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.ForeignLanguage;
import io.hrms.entities.concretes.ForeignLanguageForCv;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguagesController {
	
	@Autowired
	private ForeignLanguageService foreignLanguageService;

	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody ForeignLanguage foreignLanguage) {
		return this.foreignLanguageService.add(foreignLanguage);
	}
	
	@GetMapping("/getAll")
	DataResult<List<ForeignLanguage>>getAll(){
		return this.foreignLanguageService.getAll();}
	
	

}
