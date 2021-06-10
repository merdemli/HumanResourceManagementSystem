package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.CoverLetterForCvService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.CoverLetterForCV;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {
	
	private CoverLetterForCvService coverLetterForCvService;

	@Autowired
	public CoverLettersController(CoverLetterForCvService coverLetterForCvService) {
		super();
		this.coverLetterForCvService = coverLetterForCvService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetterForCV coverLetterForCV) {
		return this.coverLetterForCvService.add(coverLetterForCV);
	}
	@PostMapping("/update")
	public Result update(@RequestBody CoverLetterForCV coverLetterForCV) {
		return this.coverLetterForCvService.update(coverLetterForCV);

}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.coverLetterForCvService.delete(id);
	}
	@GetMapping("/getAll")
	public DataResult<List<CoverLetterForCV>>getAll(){
		return this.coverLetterForCvService.getAll();
		}
	
	@GetMapping("/getbyid")
	public DataResult<CoverLetterForCV>getById(@RequestParam("id") int id){
		return this.coverLetterForCvService.getById(id);
	
	}
	
	}




