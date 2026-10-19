class Ejercicio_23 {
    fun ejecutar() {

        println("Introduce una frase: ")
        var frase = readln()

        val solucion = frase.replace(" ", "\n")

        println("Palabras sueltas: ")
        println("$solucion")
    }
}