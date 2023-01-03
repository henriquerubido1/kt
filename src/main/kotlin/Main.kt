fun main() {
    val combustionEngine = CombustionEngine()
    val car: Car = Car(combustionEngine)
    car.turnOn()
    car.ride()
    car.turnOff()

    val electricEngine = ElectricEngine()
    val tesla: Car = Car(electricEngine).also {
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