class Ejercicio_19 {
    fun ejecutar() {

        println("Introduce el primer numero: ")
        var numero1 = readln().toInt()

        println("Introduce el segundo numero: ")
        var numero2 = readln().toInt()

        do {

            menu()
            println("Introduce una opcion: ")
            var opcion = readln().toInt()

            if(opcion == 1) {
                var suma = numero1 + numero2
                println("La suma es: $suma")

            } else if (opcion == 2) {
                var resta = numero1 - numero2
                println("La resta es: $resta")

            } else if (opcion == 3) {
                var multiplicacion = numero1 * numero2
                println("La multiplicacion es: $multiplicacion")

            } else if (opcion == 4) {
                var division = numero1 / numero2
                println("La division es: $division")

            } else if (opcion == 5) {
                var potencia = Math.pow(numero1.toDouble(), numero2.toDouble()) //Math.pow espera numeros Double
                println("La potencia es: $potencia")

            } else if (opcion == 6) {
                var modulo = numero1 % numero2
                println("El modulo es: $modulo")

            } else if (opcion == 7) {
                println("Introduce el primer numero: ")
                numero1 = readln().toInt()

                println("Introduce el segundo numero: ")
                numero2 = readln().toInt()

            } else  if (opcion == 8) {
                println("Saliendo...")

            } else {
                println("Opcion no valida")
            }

        } while (opcion != 8)
    }

    fun menu() {
        println("1: suma los operandos.")
        println("2: resta los operandos")
        println("3: multiplica los operandos.")
        println("4: divide los operandos")
        println("5: potencia (1º operando como base y 2º como exponente).")
        println("6: módulo , resto de la división entre operando1 y operando2.")
        println("7: pedir 2 operandos nuevos")
        println("8: Salir")
    }
}