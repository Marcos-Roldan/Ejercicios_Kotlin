class Ejercicio_12 {
    fun ejecutar() {
        println("Introduce un mes (con numero del 1 al 12): ")
        val numero = readln().toInt()

        if (numero == 1) {
            println("El mes de enero tiene 31 dias")
        } else if (numero == 2) {
            println("¿Es año bisiesto?")
            println("1. Si")
            println("2. No")
            val bisiesto = readln().toInt()

            if(bisiesto == 1) {
                println("El mes de febrero tiene 29 dias")
            } else {
                println("El mes de febrero tiene 28 dias")
            }
        } else if (numero == 3) {
            println("El mes de marzo tiene 31 dias")
        } else if (numero == 4) {
            println("El mes de abril tiene 30 dias")
        } else if (numero == 5) {
            println("El mes de mayo tiene 31 dias")
        } else if (numero == 6) {
            println("El mes de junio tiene 30 dias")
        } else if (numero == 7) {
            println("El mes de julio tiene 31 dias")
        } else if (numero == 8) {
            println("El mes de agosto tiene 31 dias")
        } else if (numero == 9) {
            println("El mes de septiembre tiene 30 dias")
        } else if (numero == 10) {
            println("El mes de octubre tiene 31 dias")
        } else if (numero == 11) {
            println("El mes de noviembre tiene 30 dias")
        } else if (numero == 12) {
            println("El mes de diciembre tiene 31 dias")
        }
    }
}