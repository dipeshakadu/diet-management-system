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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.app.project.entity.WLFood;
import com.app.project.service.WLFoodService;

@RestController

@CrossOrigin("*")
public class WLFoodController {
	
	@Autowired
	private WLFoodService WLfoodService;
	
	//add
	@PostMapping("/wlfooditems")
	public ResponseEntity<WLFood> addFood(@RequestBody WLFood food){
		return ResponseEntity.ok(this.WLfoodService.addFood(food));
		
	}
	
	//update 
	@PutMapping("/wlfooditems")
	public ResponseEntity<WLFood> updateFood(@RequestBody WLFood food){
		return ResponseEntity.ok(this.WLfoodService.updateFood(food));
		
	}
	
	//getting 
	@GetMapping("/wlfooditems")
	public ResponseEntity<?> foods(){
		return ResponseEntity.ok(this.WLfoodService.getFoods());
		
	}
	
	//get single item
	@GetMapping("/wlfooditems/{fid}")
	public WLFood food(@PathVariable("fid")Long fid) {
		return this.WLfoodService.getFood(fid);
	}
	
	
	
	//deleting
	@DeleteMapping("/fooditems/{fid}")
	public void delete(@PathVariable("fid")Long fid) {
		this.WLfoodService.deleteFood(fid);
	}
	
	@DeleteMapping("/fooditems")
	public void deleteitem(@RequestParam Long fid) {
		this.WLfoodService.deleteFood(fid);
	}

}
