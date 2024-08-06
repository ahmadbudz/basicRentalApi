"# basicRentalApi" 

GET Methods:

GET /cars
	will show all cars in the db
	
GET /cars/id
	will show the car with that id
	
GET /rentals
	will show all cars that are available to rent
	
PUT Methods:

PUT /cars
	will update the car with the info specified in the request body
	
PUT /rentals/rent
	will update the car to be rented 
	
PUT /rentals/return
	will update the car to be returned 
	
POST Methods:
	
POST /cars
	will add a car to the mongodb
	
Delete Methods:

delete /cars/{id}
	will delete the car with that id
