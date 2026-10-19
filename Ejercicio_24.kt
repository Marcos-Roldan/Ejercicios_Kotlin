class Ejercicio_24 {
    fun ejecutar() {

        var menor = 0
        var mayor = 0
        var primerNumero = true

        var suma = 0
        var sumaPositivos = 0
        var sumaNegativos = 0

        do {

            println("Introduce un numero entero: ")
            var numero = readln().toInt()

            if (numero != -1) {

                if(primerNumero) { //El primer numero lo guardamos directamente
                    menor = numero
                    primerNumero = false
                } else if(numero < menor) { //Comprobamos si es menor que el que teniamos
                    menor = numero
                }

                if(primerNumero) {
                    mayor = numero
                    primerNumero = false
                } else if(numero > mayor) {
                    mayor = numero
                }

                suma = suma + numero

                if(numero >= 0) {
                    sumaPositivos = sumaPositivos + numero
                } else {
                    sumaNegativos = sumaNegativos + numero
                }
            }

        } while (numero != -1)

        println("\nEl menor es: $menor")
        println("El mayor es: $mayor")
        println("La suma es: $suma")
        println("La suma de los positivos es: $sumaPositivos")
        println("La suma de los negativos es: $sumaNegativos")
    }
}