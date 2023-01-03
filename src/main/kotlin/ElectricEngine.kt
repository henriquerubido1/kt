class ElectricEngine : Engine() {
    private var batteryLevel: Int = 1

    fun hasEnergy(): Boolean {
        return batteryLevel > 0
    }

    fun spendEnergy() {
        batteryLevel--
        println("spending energy, current gas level is: $batteryLevel")
    }
}