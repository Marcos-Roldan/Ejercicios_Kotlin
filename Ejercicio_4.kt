class Ejercicio_4 {
    fun ejecutar() {
        println("Introduce un numero: ")
        val numero1 = readln()
        println("Introduce un numero: ")
        val numero2 = readln()

        if (numero1 > numero2) {
            println("El numero $numero1 es mayor que $numero2")
        } else if (numero1 < numero2) {
            println("El numero $numero2 es mayor que $numero1")
        } else {
            println("Los dos numeros son iguales")
        }
    }
}