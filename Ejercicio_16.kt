class Ejercicio_16 {
    fun ejecutar() {
        println("Introduce el primer numero: ")
        val numero1 = readln().toInt()

        println("Introduce el segundo numero: ")
        val numero2 = readln().toInt()

        if (numero1 == numero2) {
            println("Los dos numeros son iguales, el unico numero es: $numero1")
        } else {

            val minimo = minOf(numero1, numero2) //Calculamos minimo directamente
            val maximo = maxOf(numero1, numero2) //Calculamos maximo directamente

            for (i in 1..10) {
                val numerosAleatorios = (Math.random() * (maximo - minimo + 1) + minimo).toInt()
                println("Numero aleatorio: $numerosAleatorios")
            }
        }
    }
}