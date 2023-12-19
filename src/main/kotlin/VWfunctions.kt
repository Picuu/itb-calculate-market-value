/**
 * This method can be used to get a value from a FloatArray
 * @author picuu
 * @since 19/12/2023
 * @paramo option Integer that represents the value that is wanted from the array. It's index+1.
 * @param array FloatArray from which to pick the value
 * @return Float from the given array
 */
fun getCarPrice(option:Int, array:FloatArray): Float {
    return array[option - 1]
}

/**
 * This method can be used to calculate the final price of the car, after all the devaluations and conditions
 * @author picuu
 * @since 19/12/2023
 * @param purchasePrice Float that represents the price at which the car was purchased
 * @param km Integer of the kilometers that the car has
 * @param years Integer of the years that the car has
 * @param wheelsKm Integer of the kilometers that the wheels of the car have
 * @param hasBikeRack Boolean that represents whether if the car has bicycle rack or not
 * @return Float of the final price of the car after the calculation
 * @see calculateWearDevaluation
 * @see calculateWheelsDevaluation
 * @see calculateBikeRackPrice
 */
fun calculatePrice(purchasePrice:Float, km:Int, years:Int, wheelsKm:Int, hasBikeRack: Boolean): Float {
    val wearDevaluation:Float = calculateWearDevaluation(purchasePrice, km, years)

    val wheelsDevaluation:Int = calculateWheelsDevaluation(wheelsKm)

    val bikeRicePrice:Int = calculateBikeRackPrice(hasBikeRack)

    return purchasePrice - wearDevaluation - wheelsDevaluation + bikeRicePrice
}

/**
 * This method can be used to calculate how much value the car loses based on its years and kilometers
 * @author picuu
 * @since 19/12/2023
 * @param initialPrice
 * @param km Integer of the kilometers that the car has
 * @param years Integer of the years that the car has
 */
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
