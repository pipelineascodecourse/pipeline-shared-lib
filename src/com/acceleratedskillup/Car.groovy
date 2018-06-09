package com.acceleratedskillup;

class Car {
  int numberOfDoors
  String brand
  String model
  def script
  
	Car(script) {
		this.script = script
	}
	
  	void printOutCar() {
		script.echo "using script.echo"
  		script.echo "numberOfDoors:${numberOfDoors}"    	
		script.echo "brand:${brand}"    	
		script.echo "model:${model}"
  	}  
  
}
