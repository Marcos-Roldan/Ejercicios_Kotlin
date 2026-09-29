class Ejercicio_11 {
    fun ejecutar() {

        var intentos = 3
        var contrasenaAdivinar = ""

        println("Introduce una contraseña: ")
        val contrasenaCodigo = readln()

        println("Intenta adivinar la contraseña")

        do {
            println("\nIntroduce una contraseña")
            contrasenaAdivinar = readln()

            if(contrasenaCodigo != contrasenaAdivinar) {
                intentos--
                println("Has fallado. Te quedan $intentos intentos")
            }

        } while (contrasenaCodigo != contrasenaAdivinar && intentos > 0)

        if(contrasenaCodigo == contrasenaAdivinar) {
            println("Enhorabuena, acertaste")
        } else {
            println("Te has quedado sin intentos")
        }
    }
}