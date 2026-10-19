class Ejercicio_15 {
    fun ejecutar() {

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
}