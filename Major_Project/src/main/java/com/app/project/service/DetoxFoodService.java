package com.app.project.service;

import java.util.Set;

import com.app.project.entity.DetoxFood;

public interface DetoxFoodService {
	
	public DetoxFood addDetoxFood(DetoxFood detoxFood);
	
	public DetoxFood updateDetoxFood(DetoxFood detoxFood);
	
	public Set<DetoxFood> getDetoxFood(); 
	
	public DetoxFood getDetoxFood(Long detId);
	
	public void deleteDetoxFood(Long detId);

}
