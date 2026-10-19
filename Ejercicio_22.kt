class Ejercicio_22 {
    fun ejecutar() {

        var textoAcumulado = ""

        do {

            println("Introduce un texto, cadena vacia para terminar")
            var texto = readln()

            if(texto != "") {
                textoAcumulado = textoAcumulado + texto + "\n"
            }

        } while (texto != "")

        println("Cadena resultante: ")
        println("---------------------------------------")
        println("$textoAcumulado")
    }
}