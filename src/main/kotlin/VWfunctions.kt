fun getCarPrice(option:Int, prices:FloatArray):Float {
    return prices[option - 1]
}

fun calculatePrice (purchasePrice:Float, km:Int, wheelsKm:Int, hasBikeRack: Boolean):Float {
    val carWear = 0.00001f * km
    val wearPrice = carWear * purchasePrice

    var finalPrice:Float = purchasePrice - wearPrice

    if (wheelsKm < 5000) finalPrice = finalPrice
    if (wheelsKm < 10000) finalPrice -= 200
    else finalPrice -= 300

    if (hasBikeRack) return finalPrice + 250
    return finalPrice
}