package temperature

import temperature.TypeOfTemperature.*
import java.math.RoundingMode

enum class TypeOfTemperature {
    CELSIUS, FAHRENHEIT, KELVIN, REAUMUR, RANKINE
}

sealed class Temperature(degrees: Double) {

    val degrees = degrees
        get() = field.toBigDecimal()
            .setScale(2, RoundingMode.DOWN)
            .toDouble()

    fun formatted() = "$degrees ${suffix()}"

    abstract fun transform(type: TypeOfTemperature): Temperature
    abstract fun suffix(): String
}

class Celsius(degrees: Double) : Temperature(degrees) {
    override fun transform(type: TypeOfTemperature): Temperature {
        return when (type) {
            CELSIUS -> this
            FAHRENHEIT -> Fahrenheit(degrees * 1.8 + 32)
            KELVIN -> Kelvin(degrees + 273.15)
            REAUMUR -> Reaumur(degrees * 0.8)
            RANKINE -> Rankine(degrees * 1.8 + 32 + 459.67)
        }
    }

    override fun suffix() = "°C"
}

class Fahrenheit(degrees: Double) : Temperature(degrees) {
    override fun transform(type: TypeOfTemperature): Temperature {
        TODO()
    }

    override fun suffix() = "F"
}

class Kelvin(degrees: Double) : Temperature(degrees) {
    override fun transform(type: TypeOfTemperature): Temperature {
        TODO()
    }

    override fun suffix() = "K"
}

class Reaumur(degrees: Double) : Temperature(degrees) {
    override fun transform(type: TypeOfTemperature): Temperature {
        TODO()
    }

    override fun suffix() = "R"
}

class Rankine(degrees: Double) : Temperature(degrees) {
    override fun transform(type: TypeOfTemperature): Temperature {
        TODO()
    }

    override fun suffix() = "rankine"
}