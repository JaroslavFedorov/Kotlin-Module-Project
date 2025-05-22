package menu
import Archive
import BaseMenu

class ArchiveMenu(private val archives: MutableList<Archive>) :
    BaseMenu<Archive>(archives, "архив") {

    override fun createItem() {
        print("Введите имя архива: ")
        val name = readLine()?.trim()
        if (name.isNullOrEmpty()) {
            println("Имя не может быть пустым.")
            return
        }
        archives.add(Archive(name))
        println("Архив \"$name\" создан.")
    }

    override fun onItemSelected(item: Archive) {
        NoteMenu(item).run()
    }
}