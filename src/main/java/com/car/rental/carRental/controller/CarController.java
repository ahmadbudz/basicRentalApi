package com.car.rental.carRental.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.rental.carRental.model.Car;
import com.car.rental.carRental.services.CarServices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	CarServices carServices;

	/*
	 * gets all cars in the mongodb if accessed by get http method
	 * @return a list of car objects
	 */
	@GetMapping("/")
	public List<Car> getAll() {
		return carServices.getAll();
	}
	
	/*
	 * gets a car by its id if accessed by get http method
	 * @params int id
	 * @return Car object
	 */
	@GetMapping("/{id}")
	public Optional<Car> getCar(@PathVariable int id) {
		return carServices.getCar(id);
	}
	
	/*
	 * inserts and returns a the inserted car in the mongodb if accessed with post http method
	 * @params non existing Car car
	 * @return car object
	 */
	@PostMapping("/")
	public Car addCar(@RequestBody Car car) {
		return carServices.addCar(car);
	}
	
	/*
	 * update and returns a the updated car in the mongodb if accessed with put http method
	 * @params existing car
	 * @return car object
	 */
	@PutMapping("/")
	public Car updateCar(@RequestBody Car car) {
		return carServices.updateCar(car);
	}
	
	/*
	 * deletes a car from the mongodb if accessed with delete http method
	 * @params id of the car (int)
	 */
	@DeleteMapping("/{id}")
	public void deleteCar(@PathVariable int id) {
		carServices.deleteCar(id);
	}

}
