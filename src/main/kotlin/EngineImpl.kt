abstract class EngineImpl : Engine {
    private var isOn: Boolean = false

    override fun turnOn() {
        isOn = true
    }

    override fun turnOff() {
        isOn = false
    }

    fun status(): Boolean {
        return isOn
    }

    abstract fun canRide(): Boolean

    abstract fun spend()
}