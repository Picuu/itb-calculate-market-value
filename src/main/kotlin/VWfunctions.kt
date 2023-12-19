fun getCarPrice(option:Int, prices:FloatArray): Float {
    return prices[option - 1]
}

fun calculatePrice(purchasePrice:Float, km:Int, years:Int, wheelsKm:Int, hasBikeRack: Boolean): Float {
    val wearDevaluation:Float = calculateWearDevaluation(purchasePrice, km, years)

    val wheelsDevaluation:Int = calculateWheelsDevaluation(wheelsKm)

    val bikeRicePrice:Int = calculateBikeRackPrice(hasBikeRack)

    return purchasePrice - wearDevaluation - wheelsDevaluation + bikeRicePrice
}

fun calculateWearDevaluation(initialPrice:Float, km:Int, years: Int = 0): Float {
    var devaluation:Float = 0.00001f
    if (years in 6..10) devaluation = 0.00002f
    else if (years > 10) devaluation = 0.00004f

    val carWear = devaluation * km
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
