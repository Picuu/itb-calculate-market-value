// Ulises Castell y Carlos Capó

fun main () {
    calculatePrice(73490.0f, 12340.0f)
}

fun calculatePrice (purchasePrice:Float, km:Float):Float {
    val carWear = 0.00001f * km
    val wearPrice = carWear * purchasePrice

    return purchasePrice - wearPrice
}
