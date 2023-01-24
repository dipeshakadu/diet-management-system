package com.app.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calculate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private float weight;
	private float height;
	private int age;
	private String male;
	private String female;
	private char gender;
	private int exercise;
	private int total;
	private double AMR;
	private double BMR;
	
	
	public Calculate() {
		
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getFemale() {
		return female;
	}
	public void setFemale(String female) {
		this.female = female;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	public double getBMR() {
		return BMR;
	}

	public void setBMR(double bMR) {
		BMR = bMR;
	}

	public double getAMR() {
		return AMR;
	}

	public void setAMR(double aMR) {
		AMR = aMR;
	}

	public int getExercise() {
		return exercise;
	}

	public void setExercise(int exercise) {
		this.exercise = exercise;
	}
	
	

	public Calculate(int cid, float weight, float height, int age, String male, String female, char gender, int exercise,int total,double AMR,double BMR) 
	{
		super();
		this.cid = cid;
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.male = male;
		this.female = female;
		this.gender = gender;
		this.exercise=exercise;
		this.total = total;
		this.AMR=AMR;
		this.BMR=BMR;
	}
	

	

}
