package com.car.rental.carRental.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.car.rental.carRental.model.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, Integer>{
	List<Car> findAllByIsRented(boolean status);
}
