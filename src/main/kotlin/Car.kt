class Car constructor(
    private val engine: EngineImpl
) : Engine by engine {
    var color: String? = null


    fun ride() {
        when {
            !engine.status() -> println("first, turn on")
            !engine.canRide() -> {
                when(engine) {
                    is ElectricEngine -> println("you must recharge")
                    is CombustionEngine -> println("you must fill the tank")
                }
            }
            else -> {
                engine.spend()
                when(engine) {
                    is ElectricEngine -> println("car riding")
                    is CombustionEngine -> println("car riding: vrun vrun")
                }
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