package com.app.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.project.entity.DetoxFood;
import com.app.project.entity.WLFood;
import com.app.project.service.DetoxFoodService;

@RestController
@CrossOrigin("*")
public class DetoxFoodController {
	
	@Autowired
	private DetoxFoodService detoxFoodService;
	
	//adding
	@PostMapping("/detoxdietplan")
	public ResponseEntity<DetoxFood> addDetoxFood(@RequestBody DetoxFood detoxFood){
		return ResponseEntity.ok(this.detoxFoodService.addDetoxFood(detoxFood));
			
	}
	
	@PutMapping("/detoxdietplan")
	public ResponseEntity<DetoxFood> updateFood(@RequestBody DetoxFood detoxFood){
		return ResponseEntity.ok(this.detoxFoodService.updateDetoxFood(detoxFood));
		
	}
	
	//getting 
	@GetMapping("/detoxdietplan")
	public ResponseEntity<?>getDetoxFood(){
		return ResponseEntity.ok(this.detoxFoodService.getDetoxFood());
			
	}
	
	//deleting
	@DeleteMapping("/detoxdietplan/{detId}")
	public void delete(@PathVariable("detId")Long detId) {
		this.detoxFoodService.deleteDetoxFood(detId);
		}
	
	

}
