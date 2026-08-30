package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

class Codelyber {
    fun greet() = "Welcome to kotlin skeleton!!!"
}

fun main() {
    println("Please enter your birthday with the format <yyyy-MM-dd>")
//    supportNullableString(readLine()).takeUnless { // -> si es verdadero devuelve null si no devuelve line
//        it.isNullOrEmpty() || it.isNullOrBlank();
//    }
    supportNullableString(readLine()).takeIf { // -> Si es verdadero devuelve line si no devuelve null
        !it.isNullOrEmpty() && !it.isNullOrBlank();
    }?.let {
        LocalDate.parse(it)
    }.apply {
        if (this == null) {
            println("The date is not valid")
            exitProcess(1)
        }
    }?.also {
        println("You wrote $it")
    }.run {
        with(Period.between(this, LocalDate.now())) {
            when {
                years > 0 -> println("The difference between the date you wrote and year is ${years}")
                months > 0 -> println("The difference between the date you wrote and months is ${months}")
                days > 0 -> println("The difference between the date you wrote and day is ${days}")
            }
        }
    }
}

fun supportNullableString(line: String?) = line
