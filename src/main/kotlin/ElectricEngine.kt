class ElectricEngine : EngineImpl() {
    private var batteryLevel: Int = 1

    override fun spend() {
        batteryLevel--
        println("spending energy, current battery level is: $batteryLevel")
    }

    override fun canRide(): Boolean {
        return batteryLevel > 0
    }
}