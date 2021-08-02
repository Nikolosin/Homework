fun main() {
    calculateFee(100, 800f)
    calculateFee(500, 5_000f)
    calculateFee(700, 11_000f, exclusive = true)
    calculateFee(2000, 53_000f)
}

fun calculateFee(amount: Int, total: Float, exclusive: Boolean = false): Float {
    val newtotal: Float
    var percent = 0.3f
    if (total > 1_001) percent = 0.25f
    if (total > 10_001) percent = 0.20f
    if (total > 50_001) percent = 0.15f
    if (exclusive) percent -= 0.05f
    newtotal = total + amount * (1 - percent)
    println("Итоговая сумма продаж: $newtotal")
    return newtotal
}


