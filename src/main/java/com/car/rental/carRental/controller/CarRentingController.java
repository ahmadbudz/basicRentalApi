package com.car.rental.carRental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.car.rental.carRental.model.Car;
import com.car.rental.carRental.services.CarServices;

@Controller
@RequestMapping("/rentals")
public class CarRentingController {
	
	@Autowired
	CarServices carServices;
	
	@GetMapping("/")
	public List<Car> findAllAvailableCars(){
		return carServices.findByIsRented(false);
	}
	
	@PutMapping("/rent")
	public Car rentACar(@RequestBody Car car) {
		car.setRented(true);
		return carServices.updateCar(car);
	}
	
	@PutMapping("/return")
	public Car returntACar(@RequestBody Car car) {
		car.setRented(false);
		return carServices.updateCar(car);
	}
	
}
