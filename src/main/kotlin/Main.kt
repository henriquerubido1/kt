fun main() {
    val owner = Human()
    owner.name = "Henrique"

    val dog = Dog()
    dog.owner = owner
    dog.name = "Felix"
    dog.sayHi()
}