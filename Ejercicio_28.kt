class Ejercicio_28 {
    fun ejecutar() {

        println("Introduce una frase: ")
        val frase = readln()

        println("1. Convertir la frase introducida a mayuscula")
        println("2. Convertir la frase introducida a minuscula")
        val opcion = readln().toInt()

        if (opcion == 1) {
            println(frase.uppercase())
        } else if (opcion == 2) {
            println(frase.lowercase())
        } else {
            println("Opcion no valida")
        }

    }
}