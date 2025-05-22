abstract class BaseMenu<T>(
    private val items: MutableList<T>,
    private val itemName: String
) {
    fun run() {
        while (true) {
            println("\nСписок $itemName:")
            println("0. Создать $itemName")
            items.forEachIndexed { index, item -> println("${index + 1}. $item") }
            println("${items.size + 1}. Завершить работу")

            when (val input = readLine()?.toIntOrNull()) {
                0 -> createItem()
                in 1..items.size -> onItemSelected(items[input!! - 1])
                items.size + 1 -> return
                else -> println("Некорректный ввод, попробуйте снова.")
            }
        }
    }

    protected abstract fun createItem()
    protected abstract fun onItemSelected(item: T)
}