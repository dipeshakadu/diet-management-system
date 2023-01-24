package com.app.project.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.entity.WLFood;
import com.app.project.repository.WLFoodRepository;

@Service
public class WLFoodServiceImpl implements WLFoodService {
	
	@Autowired
	private WLFoodRepository WLfoodRepository;

	@Override
	public WLFood addFood(WLFood food) {
		
		return this.WLfoodRepository.save(food);
	}

	@Override
	public WLFood updateFood(WLFood food) {
		
		return this.WLfoodRepository.save(food);
	}

	@Override
	public Set<WLFood> getFoods() {
		
		return new HashSet<>(this.WLfoodRepository.findAll());
	}

	@Override
	public WLFood getFood(Long foodId) {
		
		return this.WLfoodRepository.findById(foodId).get();
	}

	@Override
	public void deleteFood(Long foodId) {
		WLFood food =new WLFood();
		food.setFid(foodId);
		this.WLfoodRepository.delete(food);
		
	}

}
