package com.app.project.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.project.entity.DFood;
import com.app.project.repository.DFoodRepository;

@Service
public class DFoodServiceImpl implements DFoodService{
	
	@Autowired
	private DFoodRepository dFoodRepository;

	@Override
	public DFood addItem(DFood item) {
		
		return this.dFoodRepository.save(item);
	}

	@Override
	public DFood updateItem(DFood item) {
		
		return this.dFoodRepository.save(item);
	}

	@Override
	public Set<DFood> getItems() {
		
		return new HashSet<>(this.dFoodRepository.findAll());
	}

	@Override
	public DFood getItem(Long dId) {
		
		return this.dFoodRepository.findById(dId).get();
	}

	@Override
	public void deleteItem(int dId) {
		DFood dFood=new DFood();
		dFood.setDid(dId);
		this.dFoodRepository.delete(dFood);
	}

}
