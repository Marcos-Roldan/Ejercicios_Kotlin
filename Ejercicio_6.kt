class Ejercicio_6 {
    fun ejecutar() {
        println("¿Cuál es la capital de Colombia?")
        println("a. La Paz ")
        println("b. Buenos Aires")
        println("c. La Habana ")
        println("d. Bogotá")

        println("Respuesta: ")
        val respuesta = readln()

        if(respuesta == "a"){
            println("Respuesta incorrecta")
        } else if (respuesta == "b"){
            println("Respuesta incorrecta")
        } else if (respuesta == "c"){
            println("Respuesta incorrecta")
        } else if (respuesta == "d"){
            println("Felicitaciones")
        } else {
            println("Opcion no valida")
        }
    }
}