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

import com.app.project.entity.DFood;
import com.app.project.service.DFoodService;

@RestController

@CrossOrigin("*")
public class DFoodController {
	
	@Autowired
	private DFoodService dFoodService;
	
	@PostMapping("/diabetesplan")
	public ResponseEntity<DFood> addItem(@RequestBody DFood item){
		return ResponseEntity.ok(this.dFoodService.addItem(item));
	}
	
	//update 
		@PutMapping("/diabetesplan")
		public ResponseEntity<DFood> updateItem(@RequestBody DFood item){
			return ResponseEntity.ok(this.dFoodService.updateItem(item));
			
		}
	
		//getting 
		@GetMapping("/diabetesplan")
		public ResponseEntity<?> items(){
			return ResponseEntity.ok(this.dFoodService.getItems());
			
		}
		
		//get single item
		@GetMapping("/diabetesplan/{did}")
		public DFood item(@PathVariable("did")Long did) {
			return this.dFoodService.getItem(did);
		}
		
		@DeleteMapping("/diabetesplan/{did}")
		public void deleteItem(@PathVariable("did")int did) {
			this.dFoodService.deleteItem(did);
		}
		

}
