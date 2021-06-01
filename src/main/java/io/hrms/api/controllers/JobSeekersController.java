package io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.JobSeekerService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;

	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobSeeker>>getAll(){
		
		return jobSeekerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker)
	{
		return jobSeekerService.add(jobSeeker);
	}
	

}
