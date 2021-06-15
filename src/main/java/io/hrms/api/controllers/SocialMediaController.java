package io.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hrms.business.abstracts.SocialMediaService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;

import io.hrms.entities.concretes.SocialMedia;

@RestController
@RequestMapping("/api/socialmedia")
public class SocialMediaController {
	
	private SocialMediaService socialMediaService;

	public SocialMediaController(SocialMediaService socialMediaService) {
		super();
		this.socialMediaService = socialMediaService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody SocialMedia socialMedia) {
		return this.socialMediaService.add(socialMedia);
	}
	
	@GetMapping("/getAll")
	DataResult<List<SocialMedia>>getAll(){
		return this.socialMediaService.getAll();}
	
}
