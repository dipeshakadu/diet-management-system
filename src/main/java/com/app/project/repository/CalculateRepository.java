package com.app.project.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.app.project.entity.Calculate;


public interface CalculateRepository extends JpaRepository<Calculate, Integer>{

	 public Calculate findByAMR(double AMR);

	public Calculate findByWeightAndHeight(float weight, float height);

	public Calculate findByAgeAndExercise(int age, int exercise);

	public Calculate findByGender(char gender);

}
