import menu.ArchiveMenu



fun main() {
    val archives = mutableListOf<Archive>()
    ArchiveMenu(archives).run()
}