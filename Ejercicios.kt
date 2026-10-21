fun main() {

    do {
        println("Introduce un ejercicio que quieras ejecutar(O para salir): ")
        var opcion = readln().toInt()

        if (opcion == 0) {
            println("Saliendo...")
        } else if(opcion == 1){
            ejecutar1()
        } else if (opcion == 2){
            ejecutar2()
        } else if (opcion == 3){
            ejecutar3()
        } else if (opcion == 4){
            ejecutar4()
        } else if (opcion == 5){
            ejecutar5()
        } else if (opcion == 6){
            ejecutar6()
        } else if (opcion == 7){
            ejecutar7()
        } else if (opcion == 8){
            ejecutar8()
        } else if (opcion == 9){
            ejecutar9()
        } else if (opcion == 10){
            ejecutar10()
        } else if (opcion == 11){
            ejecutar11()
        } else if (opcion == 12){
            ejecutar12()
        } else if (opcion == 13){
            ejecutar13()
        } else if (opcion == 14){
            ejecutar14()
        } else if (opcion == 15){
            ejecutar15()
        } else if (opcion == 16){
            ejecutar16()
        } else if (opcion == 17){
            ejecutar17()
        } else if (opcion == 18){
            ejecutar18()
        } else if (opcion == 19){
            ejecutar19()
        } else if (opcion == 20){
            ejecutar20()
        } else if (opcion == 21){
            ejecutar21()
        } else if (opcion == 22){
            ejecutar22()
        } else if (opcion == 23){
            ejecutar23()
        } else if (opcion == 24){
            ejecutar24()
        } else if (opcion == 25){
            ejecutar25()
        } else if (opcion == 26){
            ejecutar26()
        } else if (opcion == 27){
            ejecutar27()
        } else if (opcion == 28){
            ejecutar28()
        } else {
            println("Opcion no valida")
        }
    } while (opcion != 0)
}

//EJERCICIO 1
fun ejecutar1() {
    print("Introduce una cadena: ")
    var a = 15.0
    var b = 4.0

    println("Suma:  " + "${a + b}")
    println("Resta:  " + "${a - b}")
    println("Multiplica:  " + "${a * b}")
    println("Division: " + "${a / b}")
    println("Modulo: " +  "${a % b}")
}

//EJERCICIO 2
fun ejecutar2() {
    val nombre = "Pedro"
    println("Bienvenido: $nombre")
}

//EJERCICIO 3
fun ejecutar3() {
    println("Introduce tu nombre: ")
    val nombre = readln()
    println("Bienvenido: $nombre")
}

//EJERCICIO 4
fun ejecutar4() {
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

//EJERCICIO 5
fun ejecutar5() {
    println("Introduce un numero: ")
    val numero = readln().toInt()

    if(numero % 2 == 0) {
        println("El numero $numero es divisible entre 2")
    } else {
        println("El numero $numero no es divisible entre 2")
    }
}

//EJERCICIO 6
fun ejecutar6() {
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

//EJERCICIO 7
fun ejecutar7() {
    for(i in 1..100) {
        println(i)
    }
}

//EJERCICIO 8
fun ejecutar8() {
    var i = 1
    while (i <= 100) {
        println(i)
        i++
    }
}

//EJERCICIO 9
fun ejecutar9() {
    var i = 100
    while (i >= 1) {
        if(i % 2 == 0 || i % 3 == 0){
            println(i)
        }
        i--
    }
}

//EJERCICIO 10
fun ejecutar10() {

    do {
        println("Introduce un numero: ")
        val numero = readln().toInt()

        if (numero >= 0) {
            println("El $numero es mayor o igual a cero")
        }
    } while (numero == 0 || numero <= 0)
}

//EJERCICIO 11
fun ejecutar11() {

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

//EJERCICIO 12
fun ejecutar12() {
    println("Introduce un mes (con numero del 1 al 12): ")
    val numero = readln().toInt()

    if (numero == 1) {
        println("El mes de enero tiene 31 dias")
    } else if (numero == 2) {
        println("¿Es año bisiesto?")
        println("1. Si")
        println("2. No")
        val bisiesto = readln().toInt()

        if(bisiesto == 1) {
            println("El mes de febrero tiene 29 dias")
        } else {
            println("El mes de febrero tiene 28 dias")
        }
    } else if (numero == 3) {
        println("El mes de marzo tiene 31 dias")
    } else if (numero == 4) {
        println("El mes de abril tiene 30 dias")
    } else if (numero == 5) {
        println("El mes de mayo tiene 31 dias")
    } else if (numero == 6) {
        println("El mes de junio tiene 30 dias")
    } else if (numero == 7) {
        println("El mes de julio tiene 31 dias")
    } else if (numero == 8) {
        println("El mes de agosto tiene 31 dias")
    } else if (numero == 9) {
        println("El mes de septiembre tiene 30 dias")
    } else if (numero == 10) {
        println("El mes de octubre tiene 31 dias")
    } else if (numero == 11) {
        println("El mes de noviembre tiene 30 dias")
    } else if (numero == 12) {
        println("El mes de diciembre tiene 31 dias")
    }
}

//EJERCICIO 13
fun ejecutar13() {
    println("Introduce un dia de la semana: ")
    val semana: String = readln()

    val lunes = "lunes"
    val martes = "martes"
    val miercoles = "miercoles"
    val jueves = "jueves"
    val viernes = "viernes"
    val sabado = "sabado"
    val domingo = "domingo"

    if (semana.equals(lunes, ignoreCase = true)) {
        println("Dia laborable")
    } else if(semana.equals(martes, ignoreCase = true)) {
        println("Dia laborable")
    } else if(semana.equals(miercoles, ignoreCase = true)) {
        println("Dia laborable")
    } else if(semana.equals(jueves, ignoreCase = true)) {
        println("Dia laborable")
    } else if(semana.equals(viernes, ignoreCase = true)) {
        println("Dia laborable")
    } else if(semana.equals(sabado, ignoreCase = true)) {
        println("Fin de semana")
    } else if(semana.equals(domingo, ignoreCase = true)) {
        println("Fin de semana")
    } else {
        println("Error: No es un dia de la semana")
    }
}

//EJERCICIO 14
fun ejecutar14() {

    var suma = 0.0

    println("¿Cuantas ventas ha realizado un comercial en el ultimo mes?")
    val CantVentas = readln().toInt()

    if(CantVentas > 0) {
        for (i in 1..CantVentas) {
            println("Introduce la cantidad de la venta $i: ")
            val cantidad = readln().toDouble()

            suma = suma + cantidad
        }
    } else {
        println("No ha realizado ninguna venta")
    }

    println("La suma de ventas es: ${"%.2f".format(suma)}")
}

//EJERCICIO 15
fun ejecutar15() {

    var suma = 0.0

    println("Introduce el valor de la venta (o escribe * para terminar):")
    var ventas = readln()

    while(ventas != "*") {

        val cantidad = ventas.toDouble()
        suma = suma + cantidad

        println("Introduce el valor de la venta (o escribe * para terminar):")
        ventas = readln()
    }

    println("La suma de ventas es: ${"%.2f".format(suma)}")
}

//EJERCICIO 16
fun ejecutar16() {
    println("Introduce el primer numero: ")
    val numero1 = readln().toInt()

    println("Introduce el segundo numero: ")
    val numero2 = readln().toInt()

    if (numero1 == numero2) {
        println("Los dos numeros son iguales, el unico numero es: $numero1")
    } else {

        val minimo = minOf(numero1, numero2) //Calculamos minimo directamente
        val maximo = maxOf(numero1, numero2) //Calculamos maximo directamente

        for (i in 1..10) {
            val numerosAleatorios = (Math.random() * (maximo - minimo + 1) + minimo).toInt()
            println("Numero aleatorio: $numerosAleatorios")
        }
    }
}

//EJERCICIO 17
fun ejecutar17() {

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

//EJERCICIO 18
fun ejecutar18() {

    val cadena = "La lluvia en Sevilla es una maravilla"
    val resultado = cadena.replace("a", "e")

    println("$resultado")
}

//EJERCICIO 19
fun ejecutar19() {

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

//EJERCICIO 20
fun ejecutar20() {

    var suma = 0

    do {

        println("\nIntroduce un numero entero mayor que 1: ")
        var numero = readln().toInt()

        if(numero <= 1) {
            println("Error: El numero debe ser mayor que 1")
        } else {
            for (i in 1..numero) {
                suma = suma + i
            }
        }

    } while(numero <= 1)

    println("La suma desde 1 hasta 5 es: $suma")
}

//EJERCICIO 21
fun ejecutar21() {

    println("Introduce una frase: ")
    val frase = readln()

    val resultado = frase.replace(" ", "")

    println("$resultado")
}

//EJERCICIO 22
fun ejecutar22() {

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

//EJERCICIO 23
fun ejecutar23() {

    println("Introduce una frase: ")
    var frase = readln()

    val solucion = frase.replace(" ", "\n")

    println("Palabras sueltas: ")
    println("$solucion")
}

//EJERCICIO 24
fun ejecutar24() {

    var menor = 0
    var mayor = 0
    var primerNumero = true

    var suma = 0
    var sumaPositivos = 0
    var sumaNegativos = 0

    do {

        println("Introduce un numero entero: ")
        var numero = readln().toInt()

        if (numero != -1) {

            if(primerNumero) { //El primer numero lo guardamos directamente
                menor = numero
                primerNumero = false
            } else if(numero < menor) { //Comprobamos si es menor que el que teniamos
                menor = numero
            }

            if(primerNumero) {
                mayor = numero
                primerNumero = false
            } else if(numero > mayor) {
                mayor = numero
            }

            suma = suma + numero

            if(numero >= 0) {
                sumaPositivos = sumaPositivos + numero
            } else {
                sumaNegativos = sumaNegativos + numero
            }
        }

    } while (numero != -1)

    println("\nEl menor es: $menor")
    println("El mayor es: $mayor")
    println("La suma es: $suma")
    println("La suma de los positivos es: $sumaPositivos")
    println("La suma de los negativos es: $sumaNegativos")
}

//EJERCICIO 25
fun ejecutar25() {

    println("Introduce un numero: ")
    var numero = readln().toInt()

    var esPrimo = true

    if(numero <= 1) {
        println("No es un numero primo")
    } else {
        for(i in 2..<numero) { //<numero porque no podemos incluir ni 1 ni el propio numero
            if(numero % i == 0) {
                esPrimo = false
                break
            }
        }

        if(esPrimo) {
            println("El $numero es primo")
        } else {
            println("El $numero no es primo")
        }
    }
}

//EJERCICIO 26
fun ejecutar26() {

    println("Introduce el primer numero: ")
    var numero1 = readln().toInt()

    println("Introduce el segundo numero: ")
    var numero2 = readln().toInt()

    if (numero1 <= 1 && numero2 <= 1) {
        println("No hay ningun numero primo")
    } else {
        for (i in numero1..numero2) { //i coge cada numero entre los dos numeros introducidos
            if(i > 1) {
                var esPrimo = true

                for(j in 2..<i) { //j coge desde 2 hata i sin incluir
                    if(i % j == 0) {
                        esPrimo = false
                        break
                    }
                }

                if (esPrimo) {
                    println("$i")
                }
            }
        }
    }
}

//EJERCICIO 27
fun ejecutar27() {

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

//EJERCICIO 28
fun ejecutar28() {

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