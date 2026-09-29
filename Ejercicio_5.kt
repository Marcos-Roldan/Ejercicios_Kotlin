class Ejercicio_5 {
    fun ejecutar() {
        println("Introduce un numero: ")
        val numero = readln().toInt()

        if(numero % 2 == 0) {
            println("El numero $numero es divisible entre 2")
        } else {
            println("El numero $numero no es divisible entre 2")
        }
    }
}