package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.EducationInfoForCVService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.CV;
import io.hrms.entities.concretes.EducationInfoForCV;
import io.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/educationsforcv")
public class EducationsForCvController {
	
	private EducationInfoForCVService educationInfoForCVService;
	
	@Autowired
	public EducationsForCvController(EducationInfoForCVService educationInfoForCVService) {
		super();
		this.educationInfoForCVService = educationInfoForCVService;
	}

	@PostMapping("/add")
	Result add(@RequestBody EducationInfoForCV educationForCv) {
		return this.educationInfoForCVService.add(educationForCv);
	}
	
	@GetMapping("/getAll")
	DataResult<List<EducationInfoForCV>>getAll(){
		return this.educationInfoForCVService.getAll();	}

}

