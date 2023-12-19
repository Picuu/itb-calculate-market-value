fun main () {
    println("CALCULE EL PRECIO DE SU COCHE USADO")
    println("Escoja su modelo (escriba un número):")

    val cars:Array<String> = arrayOf("Volkswagen Grand California", "Volkswagen Grand California Camper Full Equip")
    val prices:FloatArray = floatArrayOf(73490f, 93490f)

    val userOption:Int = getCarType(cars)
    val purchasePrice:Float = getCarPrice(userOption, prices)

    val years:Int = readInt("Cuántos años tiene su coche? ", 0)
    val km:Int = readInt("Escriba los kilómetros que tiene su coche: ", 0)
    val wheelsKm:Int = readInt("Escriba los kilómetros que tienen sus neumáticos: ", 0)
    val hasBikeRack:Boolean = readBoolean("Indique si su coche dispone de portabicicletas (true/false): ")
    val finalPrice:Float = calculatePrice(purchasePrice, km, years, wheelsKm, hasBikeRack)

    println("\nEl precio de compra de su ${cars[userOption-1]} fue de $purchasePrice€\nActualmente, su coche vale $finalPrice€")
}

fun getCarType(cars:Array<String>):Int {
    for (i in cars.indices) {
        println("${i+1} - ${cars[i]}")
    }

    return readInt("",1, cars.size)
}
