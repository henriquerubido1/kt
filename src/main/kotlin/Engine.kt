class Engine {
    private var isOn: Boolean = false
    private var gasLevel: Int = 2

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun status(): Boolean {
        return isOn
    }

    fun hasGas(): Boolean {
        return gasLevel > 0
    }

    fun spendGas() {
        gasLevel--
        println("spending gas, current gas level is: $gasLevel")
    }
}