class Product(val price: Double, val quantity: Int) {

    fun getProductInfo(): String {
        return "Цена товара: $price, Количество: $quantity"
    }

    fun calculateTotalCost(): Double {
        return price * quantity
    }
}

fun main() {
    println("Введите цену товара:")
    val price = readLine()?.toDoubleOrNull() ?: run {
        println("Ошибка: неверный формат цены.")
        return
    }

    println("Введите количество единиц товара:")
    val quantity = readLine()?.toIntOrNull() ?: run {
        println("Ошибка: неверный формат количества.")
        return
    }

    val product = Product(price, quantity)

    val productInfo = product.getProductInfo()

    val totalCost = product.calculateTotalCost()

    println("$productInfo\nОбщая стоимость товара: $totalCost")
}
