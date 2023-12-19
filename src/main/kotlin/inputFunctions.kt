import java.util.Scanner

val scanner:Scanner = Scanner(System.`in`)

fun readInt(msg:String):Int {
    print(msg)

    var inputOk:Boolean
    var int:Int = 0
    do {
        inputOk = scanner.hasNextInt()

        if (inputOk) {
            int = scanner.nextInt()
            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputOk)

    return int
}

fun readInt(msg:String, min:Int):Int {
    print(msg)

    var inputOk:Boolean
    var int:Int = 0
    do {
        inputOk = scanner.hasNextInt()

        if (inputOk) {
            int = scanner.nextInt()

            if (int < min) {
                inputOk = false
                println("Valor demasiado pequeño!")
            }

            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un número válido!")
        }
    } while (!inputOk)

    return int
}

fun readInt(msg:String, min:Int, max:Int):Int {
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


fun readFloat(msg:String):Float {
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


fun readDouble(msg:String):Double {
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

fun readLong(msg:String):Long {
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

fun readBoolean(msg:String):Boolean {
    print(msg)

    var inputOk:Boolean
    var boolean:Boolean = false
    do {
        inputOk = scanner.hasNextBoolean()

        if (inputOk) {
            boolean = scanner.nextBoolean()
            scanner.nextLine()
        } else {
            scanner.next()
            println("Escriba un boolean válido!")
        }
    } while (!inputOk)

    return boolean
}
