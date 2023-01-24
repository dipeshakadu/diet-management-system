package com.app.project.service;

import java.util.Set;

import com.app.project.entity.WLFood;

public interface WLFoodService {
	public WLFood addFood(WLFood food);
	
	public WLFood updateFood(WLFood food);
	
	public Set<WLFood>getFoods();
	
	public WLFood getFood(Long foodId);
	
	public void deleteFood(Long foodId);

}
