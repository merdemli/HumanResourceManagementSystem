package io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.WorkExperienceForCvService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.Photo;
import io.hrms.entities.concretes.WorkExperienceForCV;
import io.hrms.entities.dtos.WorkExperienceWithCvWithJobSeekerDto;

@RestController
@RequestMapping("/api/workexperiences")
public class WorkExperiencesController {
	
	private WorkExperienceForCvService workExperienceForCvService;

	@Autowired
	public WorkExperiencesController(WorkExperienceForCvService workExperienceForCvService) {
		super();
		this.workExperienceForCvService = workExperienceForCvService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody WorkExperienceForCV workExperienceForCv) {
		return this.workExperienceForCvService.add(workExperienceForCv);
	}
	
	@GetMapping("/getAll")
	DataResult<List<WorkExperienceForCV>>getAll(){
		return this.workExperienceForCvService.getAll();}
	
	@GetMapping("/getWorkExperienceWitCvWithJobSeeker")
	DataResult<List<WorkExperienceWithCvWithJobSeekerDto>>getWorkExperienceWithCvWithJobSeekerDetails(int userId){
		return this.workExperienceForCvService.getWorkExperienceWithCvWithJobSeekerDetails(userId);}

}

