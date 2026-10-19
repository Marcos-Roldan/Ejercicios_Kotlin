class Ejercicio_25 {
    fun ejecutar() {

        println("Introduce un numero: ")
        var numero = readln().toInt()

        var esPrimo = true

        if(numero <= 1) {
            println("No es un numero primo")
        } else {
            for(i in 2..<numero) { //<numero porque no podemos incluir ni 1 ni el propio numero
                if(numero % i == 0) {
                    esPrimo = false
                    break
                }
            }

            if(esPrimo) {
                println("El $numero es primo")
            } else {
                println("El $numero no es primo")
            }
        }
    }
}