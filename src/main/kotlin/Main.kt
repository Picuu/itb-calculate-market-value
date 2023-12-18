import java.util.Scanner

// Ulises Castell y Carlos Capó

fun main () {
    val scanner:Scanner = Scanner(System.`in`)
    println("CALCULE EL PRECIO DE SU COCHE USADO")
    println("Escoja su modelo (escriba un número):")

    val cars:Array<String> = arrayOf("Volkswagen Grand California", "Volkswagen Camper Full Equip")
    val prices:FloatArray = floatArrayOf(73490f, 93490f)
    for (i in cars.indices) {
        println("${i+1} - ${cars[i]}")
    }

    val userOption:Int = getInt("", 1, cars.size, scanner)
    val purchasePrice:Float = getCarPrice(userOption, prices)

    val km:Float = getFloat("Escriba los kilómetros que tiene su coche: ", scanner)
    val finalPrice:Float = calculatePrice(purchasePrice, km)

    println("\nEl precio actual de su coche es de $finalPrice€")
}
