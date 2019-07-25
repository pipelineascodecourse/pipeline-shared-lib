import com.acceleratedskillup.*;

def call(body, scriptInput) {

	script{
      body()
	}
	
	def myCar = new Car(scriptInput)
	myCar.numberOfDoors = 5
	myCar.brand = "123"
	myCar.model = "abc"
	myCar.printOutCar()
}