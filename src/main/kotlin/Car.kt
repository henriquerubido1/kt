class Car constructor(
    private val engine: Engine
) {
    var color: String? = null

    fun turnOn() {
        println("turning on")
        engine.turnOn()
    }

    fun turnOff() {
        println("turning off")
        engine.turnOff()
    }

    fun ride() {
        when {
            !engine.status() -> println("first, turn on")
            !engine.canRide() -> {
                println("you have no gas left")
                turnOff()
            }
            else -> {
                println("vrun vrun")
                engine.spend()
            }
        }
    }

    fun brake() {
        println("stop")
    }

    fun honk() {
        println("bee bee")
    }
}