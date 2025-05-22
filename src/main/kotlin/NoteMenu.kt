package menu

import Archive
import BaseMenu
import Note

class NoteMenu(private val archive: Archive) :
    BaseMenu<Note>(archive.notes, "заметка") {

    override fun createItem() {
        print("Введите название заметки: ")
        val name = readLine()?.trim()
        if (name.isNullOrEmpty()) {
            println("Название не может быть пустым.")
            return
        }

        print("Введите текст заметки: ")
        val text = readLine()?.trim()
        if (text.isNullOrEmpty()) {
            println("Текст не может быть пустым.")
            return
        }

        archive.notes.add(Note(name, text))
        println("Заметка \"$name\" добавлена.")
    }

    override fun onItemSelected(item: Note) {
        println("Название: ${item.name}")
        println("Содержание: ${item.text}")
        println("Нажмите Enter, чтобы вернуться...")
        readLine()
    }
}