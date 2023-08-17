import temperature.Celsius
import temperature.TypeOfTemperature.*
import java.util.*

fun main() {
    println("\n==== TEMPERATURE CONVERTER ====\n")

    val reader = Scanner(System.`in`)
    print("Enter a temperature(°C): ")
    val degreesTyped = reader.nextDouble()

    val celsius = Celsius(degreesTyped)
    val fahrenheit = celsius.transform(FAHRENHEIT)
    val kelvin = celsius.transform(KELVIN)
    val reaumur = celsius.transform(REAUMUR)
    val rankine = celsius.transform(RANKINE)

    println("Celsius: ${celsius.formatted()}")
    println("Fahrenheit: ${fahrenheit.formatted()}")
    println("Kelvin: ${kelvin.formatted()}")
    println("Réaumur: ${reaumur.formatted()}")
    println("Rankine: ${rankine.formatted()}")
}