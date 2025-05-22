import menu.ArchiveMenu
import models.Archive

fun main() {
val archives = mutableListOf<Archive>()
ArchiveMenu(archives).run()
}