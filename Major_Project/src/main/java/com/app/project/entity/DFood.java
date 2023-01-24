package com.app.project.entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.FetchType;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name="DiabetesDietPlan")
	public class DFood {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int did;
		private String foodName;
		private double kcal;
		private float fats;
		private float quantity;
		private String timing;
		
	
		
		public DFood() {
			
		}
		
	


		public DFood(int did, String foodName, double kcal, float fats, float quantity, String timing) {
			super();
			this.did = did;
			this.foodName = foodName;
			this.kcal = kcal;
			this.fats = fats;
			this.quantity = quantity;
			this.timing = timing;
		}



		public long getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		
		public double getKcal() {
			return kcal;
		}
		public void setKcal(double kcal) {
			this.kcal = kcal;
		}
		
		public float getFats() {
			return fats;
		}
		public void setFats(float fats) {
			this.fats = fats;
		}
		
		public float getQuantity() {
			return quantity;
		}
		public void setQuantity(float quantity) {
			this.quantity = quantity;
		}

		public String getTiming() {
			return timing;
		}

   	public void setTiming(String timing) {
			this.timing = timing;
		}
		
		




}
