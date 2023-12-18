fun getCarPrice(option:Int, prices:FloatArray):Float {
    return prices[option - 1]
}

fun calculatePrice (purchasePrice:Float, km:Float):Float {
    val carWear = 0.00001f * km
    val wearPrice = carWear * purchasePrice

    return purchasePrice - wearPrice
}