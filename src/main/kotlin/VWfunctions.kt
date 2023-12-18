fun getCarPrice(option:Int, prices:FloatArray):Float {
    return prices[option - 1]
}

fun calculatePrice (purchasePrice:Float, km:Int, wheelsKm:Int):Float {
    val carWear = 0.00001f * km
    val wearPrice = carWear * purchasePrice

    val finalPrice:Float = purchasePrice - wearPrice

    if (wheelsKm < 5000) return finalPrice
    if (wheelsKm < 10000) return finalPrice - 200
    return finalPrice - 300
}