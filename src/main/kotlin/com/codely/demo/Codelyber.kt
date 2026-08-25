import java.time.LocalDate

fun main() {
    println("Please enter a date with the format <yyyy-MM-dd>")
    val readLine: String? = null
//    val input = LocalDate.parse(readLine) //TODO: Rompe en el metodo LocalDate.parse
//    val input = LocalDate.parse(readLine ?: "2026-09-26") //TODO: Usamos el operador elvis operator para devolver un valor por defecto, cuando readline es null
//    val input = LocalDate.parse(readLine!!) //TODO: Rompe en el metodo main
    readLine?.let{
        val input = LocalDate.parse(readLine)
        println("Your wrote $input ${input.dayOfWeek}")
    }
//    println("Your wrote $input ${input.dayOfWeek}")
}
