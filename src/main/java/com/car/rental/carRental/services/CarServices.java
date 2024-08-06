package com.car.rental.carRental.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.rental.carRental.model.Car;
import com.car.rental.carRental.repository.CarRepository;

@Service
public class CarServices {
	@Autowired
	CarRepository carRepository;
	
	public List<Car> getAll() {
		return carRepository.findAll();
	}
	
	public Optional<Car> getCar(int id) {
		return carRepository.findById(id);
	}
	
	public Car addCar(Car car) {
		return carRepository.insert(car);
	}

	public Car updateCar(Car car) {
		return carRepository.save(car);
	}

	public void deleteCar(int id) {
		carRepository.deleteById(id);
	}
	
	public List<Car> findByIsRented(boolean status){
		return carRepository.findAllByIsRented(status);
	}
	
}
