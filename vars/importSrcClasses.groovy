import com.acceleratedskillup.*;

def call(script) {
    def myCar = new Car(script)
	myCar.numberOfDoors = 5
	myCar.brand = "123"
	myCar.model = "abc"
	myCar.printOutCar()
}