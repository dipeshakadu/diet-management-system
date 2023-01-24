package com.app.project.service;

import java.util.Set;


import com.app.project.entity.DFood;


public interface DFoodService {
    public DFood addItem(DFood item);
	
	public DFood updateItem(DFood item);
	
	public Set<DFood>getItems();
	
	public DFood getItem(Long dId);
	
	public void deleteItem(int dId);
	
	


}
