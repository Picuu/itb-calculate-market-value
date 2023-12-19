fun main () {
    println(getASCIICar())
    println("$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD CALCULE EL PRECIO DE SU COCHE USADO $RESET")
    println(PURPLE_BOLD_BRIGHT + "Escoja su modelo (escriba un número):" + RESET)

    val cars:Array<String> = arrayOf("Volkswagen Grand California", "Volkswagen Grand California Camper Full Equip")
    val prices:FloatArray = floatArrayOf(73490f, 93490f)

    val userOption:Int = getCarType(cars)
    val purchasePrice:Float = getCarPrice(userOption, prices)

    val years:Int = readInt(BLUE + "Cuántos años tiene su coche? " + RESET, "Tipo de dato incorrecto!", "Valor demasiado pequeño!", 0)
    val km:Int = readInt(BLUE + "Escriba los kilómetros que tiene su coche: " + RESET, "Tipo de dato incorrecto!","Valor demasiado pequeño!", 0)
    val wheelsKm:Int = readInt(BLUE + "Escriba los kilómetros que tienen sus neumáticos: " + RESET, "Tipo de dato incorrecto!","Valor demasiado pequeño!", 0)
    val hasBikeRack:Boolean = readBoolean(BLUE + "Indique si su coche dispone de portabicicletas (true/false): " + RESET, "Tipo de dato incorrecto!")
    val finalPrice:Float = calculatePrice(purchasePrice, km, years, wheelsKm, hasBikeRack)

    println(YELLOW_BOLD_BRIGHT + "\nEl precio de compra de su $CYAN${cars[userOption-1]}$YELLOW_BOLD_BRIGHT fue de $GREEN_BRIGHT$purchasePrice€$YELLOW_BOLD_BRIGHT\nActualmente, su coche vale $GREEN_BRIGHT$finalPrice€" + RESET)
}

/**
 * This method can be used to get a string of an ASCII art of a car
 * @author picuu
 * @since 19/12/2023
 * @return String ASCII art of the car
 */
fun getASCIICar():String {
    return "         _______" + "\n" +
            "        //  ||\\ \\" + "\n" +
            "  _____//___||_\\ \\___" + "\n" +
            "  )  _          _    \\" + "\n" +
            "  |_/ \\________/ \\___|" + "\n" +
            "____\\_/________\\_/______"
}

/**
 * This method can be used to read an Int value from the user through keyboard using java.util.Scanner with a min value
 * @author picuu
 * @since 19/12/2023
 * @param cars Strings Array of the cars to be shown to the user
 * @return Int Integer given by the user on readInt() function
 * @see readInt()
 */
fun getCarType(cars:Array<String>):Int {
    for (i in cars.indices) {
        println(PURPLE + "${i+1} - ${cars[i]}" + RESET)
    }

    return readInt("", "Tipo de dato incorrecto!", "Valor fuera del rango!",1, cars.size)
}
