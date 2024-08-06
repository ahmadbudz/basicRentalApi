package com.car.rental.carRental.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
	
	@Id
	private int carNumber;
	private String model;
	private String type;
	private String engine;
	private String carColor;
	private boolean isRented;

	public Car(int carNumber, String model, String type, String engine, String carColor) {
		this.carNumber = carNumber;
		this.model = model;
		this.type = type;
		this.engine = engine;
		this.carColor = carColor;
		this.isRented = false;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

}
