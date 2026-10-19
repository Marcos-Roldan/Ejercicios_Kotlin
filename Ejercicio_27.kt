class Ejercicio_27 {
    fun ejecutar() {

        var contNumeros = 0

        println("-------------------------------------------------------------")
        print("Introduce valor numerico + Enter. Valor numerico + Enter...")
        println("\nCuando quieras terminar, teclea -1 + Enter")
        println("-------------------------------------------------------------")

        do {
            var opcion = readln().toInt()

            if (opcion != -1) {
                contNumeros++
            }

        } while (opcion != -1)

        println("Fin, has introducido $contNumeros numeros")
    }
}