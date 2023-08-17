package person

enum class Gender {
    MALE, FEMALE
}

class Person(val name: String, val height: Double, val gender: Gender) {
    override fun toString(): String {
        return "(Name: $name, Height: $height, Gender: $gender)"
    }
}