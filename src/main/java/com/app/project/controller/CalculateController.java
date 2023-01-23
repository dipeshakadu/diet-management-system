package com.app.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.project.entity.Calculate;
import com.app.project.service.CalculateService;

@RestController
@CrossOrigin("*")
public class CalculateController {
	
	@Autowired
	private CalculateService calService;
	
	@PostMapping("/register")
	public double calculateCalories(@RequestBody Calculate calculate) {
		calService.saveCal(calculate);
		double BMR,AMR;
		
		float tempweight=calculate.getWeight();
		float tempheight=calculate.getHeight();
		
		int tempage=calculate.getAge();
		int tempexercise=calculate.getExercise();
		
		char tempgender=calculate.getGender();
		
		if(tempgender=='f'||tempgender=='F')
		{
			BMR = 65.51+(9.65*tempweight)+(1.84*tempheight)-(4.68*tempage);
			if(tempexercise==0) {
				AMR=BMR*1.15;
				
			}
			else if (tempexercise ==1) {
				AMR=BMR*1.35;
			}
			else if (tempexercise ==2) {
				AMR=BMR*1.50;
			}
			else {
				AMR=BMR*1.85;
				
			}
		}
		else
		{
			BMR=66.47+(13.75*tempweight)+(5*tempheight)-(6.76*tempage);
			if(tempexercise==0) {
				AMR=BMR*1.15;
				
			}
			else if (tempexercise ==1) {
				AMR=BMR*1.35;
			}
			else if (tempexercise ==2) {
				AMR=BMR*1.50;
			}
			else {
				AMR=BMR*1.85;
				
		}
		
		}
		
		
		return AMR;
	}
	

	
	

}
