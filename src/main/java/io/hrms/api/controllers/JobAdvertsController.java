package io.hrms.api.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.JobAdvertService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {
	
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@PostMapping("/update")
	Result update(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.update(jobAdvert);
	}
	
	@PostMapping("/delete")
	Result delete(@PathVariable("id") int id) {
		return this.jobAdvertService.delete(id);
	}
	
	@PostMapping("/changeAdvertStatusClose")
	Result changeAdvertStatusClose(int id) {
		return this.jobAdvertService.changeAdvertStatusClose(id);
		
	}
	
	@GetMapping("/getAllByJobAdvertStatusList")
	DataResult<List<JobAdvert>>getAllByJobAdvertStatusList(){
		
		return this.jobAdvertService.getAllByJobAdvertStatusList();
	}
	
	@GetMapping("/getAll")
	DataResult<List<JobAdvert>>getAll(){
		return this.jobAdvertService.getAll();
	}
	
	@GetMapping("/getAllByCretedAtDesc")
	DataResult<List<JobAdvert>>getAllByCretedAtDesc(){
		return this.jobAdvertService.getAllByCretedAtDesc();
	
	}
	
	@GetMapping("/getByAdvertStatus")
	DataResult<List<JobAdvert>>getByJobAdvertStatus(boolean status){
		return this.jobAdvertService.getByAdvertStatus(status);
	}
	
	@GetMapping("/getAllByEmployerOpenAdvert")
	DataResult<List<JobAdvert>>getAllByEmployerOpenAdvert(int id){
		return this.jobAdvertService.getAllByEmployerOpenAdvert(id);
	}
	
//	@GetMapping("/getByEmployer_employerId")
//	DataResult<List<JobAdvert>>getByEmployer_userId(int userId){
//		
//		return this.jobAdvertService.getByEmployer_userId(userId);
//	}
//	
	@GetMapping("/getById")
	DataResult<JobAdvert>getById(int id){
		return this.jobAdvertService.getById(id);
	}
	
	@GetMapping("/getAllByDeadlineLessThanEqual")
	DataResult<List<JobAdvert>>getAllByDeadlineLessThanEqual(LocalDate date){
		return this.jobAdvertService.getAllByDeadlineLessThanEqual(date);
	}
	
	

}
