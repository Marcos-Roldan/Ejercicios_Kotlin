class Ejercicio_14 {
    fun ejecutar() {

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
}