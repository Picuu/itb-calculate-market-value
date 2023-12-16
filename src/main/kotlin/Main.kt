import java.util.Scanner

// Ulises Castell y Carlos Capó

fun main () {
    println("Calcule el precio de su coche usado.")

    val purchasePrice:Float = getFloat("Escriba el precio de mercado del vehículo: ")
    val km:Float = getFloat("Escriba los kilómetros que tiene su coche: ")
    val finalPrice:Float = calculatePrice(purchasePrice, km)

    println("\nEl precio actual de su coche es de $finalPrice€")
}

fun calculatePrice (purchasePrice:Float, km:Float):Float {
    val carWear = 0.00001f * km
    val wearPrice = carWear * purchasePrice

    return purchasePrice - wearPrice
}

fun getFloat(msg:String):Float {
    val scanner:Scanner = Scanner(System.`in`)
    print(msg)

    var inputOk:Boolean = false
    var float:Float = 0f
    do {
        if (scanner.hasNextFloat()) {
            inputOk = true
            float = scanner.nextFloat()
            scanner.nextLine()
        } else if (scanner.hasNextInt()) {
            inputOk = true
            float = scanner.nextInt().toFloat()
            scanner.nextLine()
        } else println("Escriba un número válido!")
    } while (!inputOk)

    return float
}
