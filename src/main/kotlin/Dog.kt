class Dog {
    var owner: Human? = null
    var name: String? = null

    fun sayHi() {
        println("Hi ${owner?.name}, my name is $name")
    }
}