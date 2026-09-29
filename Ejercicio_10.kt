class Ejercicio_10 {
    fun ejecutar() {

        do {
            println("Introduce un numero: ")
            val numero = readln().toInt()

            if (numero >= 0) {
                println("El $numero es mayor o igual a cero")
            }
        } while (numero == 0 || numero <= 0)
    }
}