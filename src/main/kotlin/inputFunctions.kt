import java.util.Scanner

fun getInt(msg:String, min:Int, max:Int, scanner: Scanner):Int {
    print(msg)

    var inputOk:Boolean
    var int:Int = 0
    do {
        inputOk = scanner.hasNextInt()

        if (inputOk) {
            int = scanner.nextInt()

            if (int !in min..max) {
                inputOk = false
                println("Escriba un número dentro del rango entre $min y $max!")
            }

            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputOk)

    return int
}


fun getFloat(msg:String, scanner:Scanner):Float {
    print(msg)

    var inputOk:Boolean
    var float:Float = 0f
    do {
        inputOk = scanner.hasNextFloat()

        if (inputOk) {
            float = scanner.nextFloat()
            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputOk)

    return float
}


fun getDouble(msg:String, scanner:Scanner):Double {
    print(msg)

    var inputOk:Boolean
    var double:Double = 0.0
    do {
        inputOk = scanner.hasNextDouble()

        if (inputOk) {
            double = scanner.nextDouble()
            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputOk)

    return double
}

fun getLong(msg:String, scanner:Scanner):Long {
    print(msg)

    var inputOk:Boolean
    var long:Long = 0
    do {
        inputOk = scanner.hasNextLong()

        if (inputOk) {
            long = scanner.nextLong()
            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputOk)

    return long
}