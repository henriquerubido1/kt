fun main() {
    val engine = CombustionEngine()
    val car: Car = Car(engine)
    car.turnOn()
    car.ride()
    car.ride()
    car.ride()
    car.turnOff()

    val tesla: Car = Car(engine).also {
        it.turnOn()
        it.ride()
    }
}




//fun main() {
//    val owner = Human()
//    owner.name = "Henrique"
//
//    val dog = Dog()
//    dog.owner = owner
//    dog.name = "Felix"
//    dog.sayHi()
//
//    val newOwner = Human()
//    newOwner.name = "Niró"
//    dog.owner = newOwner
//    dog.sayHi()
//}