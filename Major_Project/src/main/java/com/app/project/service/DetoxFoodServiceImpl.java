package com.app.project.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.entity.DetoxFood;
import com.app.project.repository.DetoxFoodRepository;

@Service
public class DetoxFoodServiceImpl implements DetoxFoodService{
	
	@Autowired
	private DetoxFoodRepository detoxFoodRepository;

	@Override
	public DetoxFood addDetoxFood(DetoxFood detoxFood) {
		
		return this.detoxFoodRepository.save(detoxFood);
	}

	@Override
	public DetoxFood updateDetoxFood(DetoxFood detoxFood) {
		
		return this.detoxFoodRepository.save(detoxFood);
	}

	@Override
	public Set<DetoxFood> getDetoxFood() {
		
		return new HashSet<>(this.detoxFoodRepository.findAll());
	}

	@Override
	public DetoxFood getDetoxFood(Long detId) {
		
		return this.detoxFoodRepository.findById(detId).get();
	}

	@Override
	public void deleteDetoxFood(Long detId) {
		DetoxFood detoxFood=new DetoxFood();
		detoxFood.setDetId(detId);
		this.detoxFoodRepository.delete(detoxFood);
		
	}
	
	
	

}
