class Ejercicio_17 {
    fun ejecutar() {

        val vocales = "aeiouAEIOU"
        var contVocales = 0

        val consonates = "bBcCdDfFgGhHjJkKlLmMnNñÑpPqQrRsStTvVwWxXyYzZ"
        var contConsonantes = 0

        val numeros = "0123456789"
        var contNumeros = 0

        val espacios = " "
        var contEspacios = 0

        println("Introduce una cadena de caracteres: ")
        val cadena = readln()

        for(letra in cadena) { //Recorremos la cadena de texto
            if(vocales.contains(letra)) {
                contVocales++
            } else if (consonates.contains(letra)) {
                contConsonantes++
            } else if(numeros.contains(letra)) {
                contNumeros++
            } else if(espacios.contains(letra)) {
                contEspacios++
            }
        }

        println("La cantidad de vocales son: $contVocales")
        println("La cantidad de consonates son: $contConsonantes")
        println("La cantidad de numeros son: $contNumeros")
        println("La cantidad de espacios en blanco son: $contEspacios")
    }
}