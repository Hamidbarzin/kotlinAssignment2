// Vehicle.kt
open class Vehicle(val color: String, val make: String, val model: String, val numberOfDoors: Int) {
    fun accelerate() {
        println("$color $make is accelerating")
    }

    fun stop() {
        println("$color $make is stopping")
    }

    fun parallelPark() {
        println("$color $make is parallel parking")
    }
}

// Car.kt
class Car(color: String, make: String, model: String, numberOfDoors: Int) : Vehicle(color, make, model, numberOfDoors) {
    fun additionalFeature() {
        println("Additional feature of $color $make")
    }
}

// Bus.kt
class Bus(val passengerCapacity: Int) {
    fun openRearDoor() {
        println("Opening rear door of the Bus")
    }

    fun additionalFeature() {
        println("Additional feature of the Bus")
    }
}

// Main.kt
fun main() {
    val toyota = Car("Red", "Toyota", "Camry", 4)
    toyota.accelerate()
    toyota.stop()
    toyota.parallelPark()
    toyota.additionalFeature()

    val honda = Car("Blue", "Honda", "Accord", 4)
    honda.accelerate()
    honda.stop()
    honda.parallelPark()
    honda.additionalFeature()

    val porsche = Car("Gray", "Porsche", "911", 2)
    porsche.accelerate()
    porsche.stop()
    porsche.parallelPark()
    porsche.additionalFeature()

    val benz = Bus(30)
    benz.openRearDoor()
    benz.additionalFeature()
}