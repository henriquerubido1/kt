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
        engine.spendGas()
        if (engine.status() && engine.hasGas()) {
            println("vrun vrun")
        } else if (!engine.hasGas()) {
            println("you have no gas left")
        } else {
            println("first, turn on")
        }
    }

    fun brake() {
        println("stop")
    }

    fun honk() {
        println("bee bee")
    }
}