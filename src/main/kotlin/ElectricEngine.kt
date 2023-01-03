class ElectricEngine : Engine() {
    private var batteryLevel: Int = 1

    override fun spend() {
        batteryLevel--
        println("spending energy, current gas level is: $batteryLevel")
    }

    override fun canRide(): Boolean {
        return batteryLevel > 0
    }
}