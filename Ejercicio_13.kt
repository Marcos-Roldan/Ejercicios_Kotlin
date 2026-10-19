class Ejercicio_13 {
    fun ejecutar() {
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
}