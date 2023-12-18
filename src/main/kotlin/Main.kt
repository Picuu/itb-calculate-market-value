import java.util.Scanner

fun main () {
    val scanner:Scanner = Scanner(System.`in`)
    println("CALCULE EL PRECIO DE SU COCHE USADO")
    println("Escoja su modelo (escriba un número):")

    val cars:Array<String> = arrayOf("Volkswagen Grand California", "Volkswagen Grand California Camper Full Equip")
    val prices:FloatArray = floatArrayOf(73490f, 93490f)

    val userOption:Int = getCarType(cars, scanner)
    val purchasePrice:Float = getCarPrice(userOption, prices)

    val km:Int = getInt("Escriba los kilómetros que tiene su coche: ", 0, 2000000, scanner)
    val wheelsKm:Int = getInt("Escriba los kilómetros que tienen sus neumáticos: ", 0, 1000000, scanner)
    val finalPrice:Float = calculatePrice(purchasePrice, km, wheelsKm)

    println("\nEl precio de compra de su ${cars[userOption-1]} fue de $purchasePrice€\nActualmente, su coche vale $finalPrice€")
}

fun getCarType(cars:Array<String>, scanner:Scanner):Int {
    for (i in cars.indices) {
        println("${i+1} - ${cars[i]}")
    }

    return getInt("",1, cars.size, scanner)
}
