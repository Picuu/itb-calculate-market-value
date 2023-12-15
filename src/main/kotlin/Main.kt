// Ulises Castell y Carlos Capó

fun calculatePrice (preu: Double, km: Double): Double {
    val kmFinal = (0.00001 * km)
    val preuFinal = kmFinal * preu
    println(kmFinal)
    println(preu - preuFinal)
    return preuFinal
}


fun main () {
    calculatePrice(preu = 73490.0, km = 12340.0)
}
