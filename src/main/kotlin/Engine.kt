class Engine {
    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun status(): String {
        return if (isOn) "The engine is on" else "The engine is off"
    }
}