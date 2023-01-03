abstract class Engine {
    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun status(): Boolean {
        return isOn
    }

    abstract fun canRide(): Boolean

    abstract fun spend()
}