package com.templatetasks.kotlin

import java.util.UUID

/**
 * @author Vadim Starichkov (starichkovva@gmail.com)
 * @since 16.05.2022 15:58
 */
data class Author(val firstName: String, val lastName: String) {

    val id: String = UUID.randomUUID().toString()

    val notes: MutableSet<Note> = mutableSetOf()

    fun addNote(content: String) {
        val note = Note(content)
        note.author = this
        notes.add(note)
    }
}