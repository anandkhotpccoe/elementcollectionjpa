package com.example.elementcollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.elementcollection.model.Car;



public interface CarRepository extends JpaRepository<Car, Long> {
	
	Car findByName(String name);

}
