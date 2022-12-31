class Dog constructor(
    private val owner: String
) {
    var name: String? = null

    fun sayHi() {
        println("Hi $owner, my name is $name")
    }
}