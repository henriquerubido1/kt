class CombustionEngine : Engine() {
    private var gasLevel: Int = 2

    fun hasGas(): Boolean {
        return gasLevel > 0
    }

    fun spendGas() {
        gasLevel--
        println("spending gas, current gas level is: $gasLevel")
    }

    fun canRide(): Boolean
}