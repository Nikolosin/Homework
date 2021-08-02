fun main() {
    val index = bodyMassIndex(1.8f, 80f)
    val verdict = when (index) {
        in 0f..18.5f -> "Выраженный дефицит массы тела"
        in 16.1f..18.5f -> "Недостаточная (дефицит) масса тела"
        in 18.6f..25f -> "Норма"
        in 25.1f..30f -> "Избыточная масса тела (предожирение)"
        in 30.1f..35f -> "Ожирение 1 степени"
        in 35.1f..40f -> "Ожирение 2 степени"
        else -> "Ожирение 3 степени"
    }
    println(verdict)
}

fun bodyMassIndex(growth: Float, weight: Float): Float {
    return weight / (growth * growth)
}