package com.app.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.entity.Calculate;

import com.app.project.repository.CalculateRepository;

@Service
public class CalculateService {
	
	@Autowired
	private CalculateRepository calrepo;
	
	public Calculate saveCal(Calculate cal) {
		
		return calrepo.save(cal);
		
	}
	
	public Calculate fetchCalculateByWeightAndHeight(float weight,float height) {
		return calrepo.findByWeightAndHeight(weight,height);
	}
	
	public Calculate fetchCalculateByAgeAndExercise(int age,int exercise) {
		return calrepo.findByAgeAndExercise(age,exercise);
	}
	
	public Calculate fetchCalculateByGender(char gender) {
		return calrepo.findByGender(gender);
	}

}
