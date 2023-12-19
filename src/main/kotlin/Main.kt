fun main () {
    printASCII()
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

fun printASCII() {
    println("         _______")
    println("        //  ||\\ \\")
    println("  _____//___||_\\ \\___")
    println("  )  _          _    \\")
    println("  |_/ \\________/ \\___|")
    println("____\\_/________\\_/______")
}

fun getCarType(cars:Array<String>):Int {
    for (i in cars.indices) {
        println(PURPLE + "${i+1} - ${cars[i]}" + RESET)
    }

    return readInt("", "Tipo de dato incorrecto!", "Valor fuera del rango!",1, cars.size)
}
