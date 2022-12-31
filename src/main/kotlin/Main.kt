fun main() {
    val owner = Human()
    owner.name = "Henrique"

    val dog = Dog()
    dog.owner = owner
    dog.name = "Felix"
    dog.sayHi()

    val newOwner = Human()
    newOwner.name = "Niró"
    dog.owner = newOwner
    dog.sayHi()
}