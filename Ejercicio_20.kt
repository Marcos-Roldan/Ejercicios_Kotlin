class Ejercicio_20 {
    fun ejecutar() {

        var suma = 0

        do {

            println("\nIntroduce un numero entero mayor que 1: ")
            var numero = readln().toInt()

            if(numero <= 1) {
                println("Error: El numero debe ser mayor que 1")
            } else {
                for (i in 1..numero) {
                    suma = suma + i
                }
            }

        } while(numero <= 1)

        println("La suma desde 1 hasta 5 es: $suma")
    }
}