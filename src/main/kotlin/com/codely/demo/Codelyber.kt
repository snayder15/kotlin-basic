import java.time.LocalDate

fun main() {
    println("Please enter a date with the format <yyyy-MM-dd>")
    val input = LocalDate.parse(readln())
    println("Your wrote $input ${input.dayOfWeek}")
}
