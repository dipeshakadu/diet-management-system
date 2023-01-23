package com.app.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class DetoxFood {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long detId;
	private String itemName;
	private float Cal;
	private float fatNo;
	private String amount;
	private String time;
	
	


	public DetoxFood(long detId, String itemName, float cal, float fatNo, String amount, String time) {
		super();
		this.detId = detId;
		this.itemName = itemName;
		this.Cal = cal;
		this.fatNo = fatNo;
		this.amount = amount;
		this.time = time;
	}


	public DetoxFood() {
		
	}


	public long getDetId() {
		return detId;
	}


	public void setDetId(long detId) {
		this.detId = detId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public float getFatNo() {
		return fatNo;
	}


	public void setFatNo(float fatNo) {
		this.fatNo = fatNo;
	}



	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public float getCal() {
		return Cal;
	}


	public void setCal(float cal) {
		Cal = cal;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	
	
	

	
}
