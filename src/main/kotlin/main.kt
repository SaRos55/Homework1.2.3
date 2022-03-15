fun main() {
    val diskountStart = 1_000
    val diskount = 100
    val extraSpent = 10_000
    val addDiscount = 5
    val melomanDiskount = 1
    val meloman = true

    var totalPrice = 15000

    println("Покупка - $totalPrice рублей")
    if (totalPrice > extraSpent) {
        totalPrice = (totalPrice * (100 - addDiscount)) / 100
        println()
        println("После применения $addDiscount% скидки - $totalPrice рублей.")
    }

    if (totalPrice >= diskountStart) {
        totalPrice -= 100
        println()
        println("После применения скидки $diskount рублей - $totalPrice рублей.")
    }

    if (meloman) {
        totalPrice = (totalPrice * (100 - melomanDiskount)) / 100
        println()
        println("После применения $melomanDiskount% скидки - $totalPrice рублей.")
    }
}