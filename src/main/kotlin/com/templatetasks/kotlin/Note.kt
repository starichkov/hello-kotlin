package com.templatetasks.kotlin

import java.util.*

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 20.05.2022 17:45
 */
data class Note(val content: String) {

    val id: String = UUID.randomUUID().toString()

    lateinit var author: Author
}