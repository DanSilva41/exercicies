import person.Gender.FEMALE
import person.Gender.MALE
import person.Person

fun main() {
    println("\n==== GROUP PEOPLE ====\n")

    val persons = listOf(
        Person("Carlos", 1.82, MALE),
        Person("Amanda", 1.67, FEMALE),
        Person("Josué", 1.75, MALE),
        Person("Will", 1.84, MALE),
        Person("Andy", 1.56, FEMALE),
        Person("Marie", 1.72, FEMALE),
        Person("Matt", 1.79, MALE),
        Person("Cinthia", 1.63, FEMALE),
        Person("Phoebe", 1.72, FEMALE)
    )

    val greaterHeight = persons.maxBy { it.height }
    val averageHeightOfMen = persons
        .filter { it.gender == MALE }
        .map { it.height }
        .average().toBigDecimal().setScale(2)
    val numberOfWomen = persons.count { it.gender == FEMALE }


    println("Greater height: $greaterHeight")
    println("Average height of men: $averageHeightOfMen")
    println("Number of women: $numberOfWomen")
}