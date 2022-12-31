class Car constructor(
    private val engine: Engine
) {
    var color: String? = null

    fun ride() {
        println("vrun vrun")
    }

    fun brake() {
        println("stop")
    }

    fun honk() {
        println("bee bee")
    }
}