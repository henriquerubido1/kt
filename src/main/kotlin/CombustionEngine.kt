class CombustionEngine : EngineImpl() {
    private var gasLevel: Int = 2

    override fun spend() {
        gasLevel--
        println("spending gas, current gas level is: $gasLevel")
    }

    override fun canRide(): Boolean {
        return gasLevel > 0
    }
}