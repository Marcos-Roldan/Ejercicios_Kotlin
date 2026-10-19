class Ejercicio_26 {
    fun ejecutar() {

        println("Introduce el primer numero: ")
        var numero1 = readln().toInt()

        println("Introduce el segundo numero: ")
        var numero2 = readln().toInt()

        if (numero1 <= 1 && numero2 <= 1) {
            println("No hay ningun numero primo")
        } else {
            for (i in numero1..numero2) { //i coge cada numero entre los dos numeros introducidos
                if(i > 1) {
                    var esPrimo = true

                    for(j in 2..<i) { //j coge desde 2 hata i sin incluir
                        if(i % j == 0) {
                            esPrimo = false
                            break
                        }
                    }

                    if (esPrimo) {
                        println("$i")
                    }
                }
            }
        }
    }
}