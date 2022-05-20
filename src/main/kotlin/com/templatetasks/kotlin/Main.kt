package com.templatetasks.kotlin

fun main(args: Array<String>) {
    println("Welcome to Hello Kotlin example application.")

    printArgs(args)
    printArgs(args, "Debug")

    val author = Author("Vadim", "Starichkov")

    // adding notes using Range and String Templates
    for (i in 1..3) {
        val exclamations = "!".repeat(i)
        author.addNote("$exclamations My $i Note $exclamations")
    }

    println("Printing data class '${author.javaClass}':")
    println(author)

    println("Printing a collection using its toString default implementation")
    println(author.notes)

    println("Printing a collection items using for-loop iteration over collection")
    for (note in author.notes) {
        println(note)
    }

    println("Printing a collection items using lambda for-each")
    author.notes.forEach { println(it) }
}

fun printArgs(args: Array<String>, prefix: String = "Info") {
    println("[$prefix] Program arguments: ${args.joinToString()}")
}
