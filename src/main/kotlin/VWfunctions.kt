fun getCarPrice(option:Int, prices:FloatArray): Float {
    return prices[option - 1]
}

fun calculatePrice(purchasePrice:Float, km:Int, wheelsKm:Int, hasBikeRack: Boolean): Float {
    val wearDevaluation:Float = calculateWearDevaluation(purchasePrice, km)

    val wheelsDevaluation:Int = calculateWheelsDevaluation(wheelsKm)

    val bikeRicePrice:Int = calculateBikeRackPrice(hasBikeRack)

    return purchasePrice - wearDevaluation - wheelsDevaluation + bikeRicePrice
}

fun calculateWearDevaluation(initialPrice:Float, km:Int): Float {
    val carWear = 0.00001f * km
    return carWear * initialPrice
}

fun calculateWheelsDevaluation(wheelsKm: Int): Int {
    if (wheelsKm < 5000) return 0
    if (wheelsKm < 10000) return 200
    return 300
}

fun calculateBikeRackPrice(hasBikeRack: Boolean): Int {
    if (hasBikeRack) return 250
    return 0
}
