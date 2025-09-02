package examen

class Empleado(val nombre: String, var sueldo: Double) {

    fun aumentarSueldo(porcentaje: Double): Double {
        sueldo += sueldo * (porcentaje / 100)
        return sueldo
    }

    fun mostrarInfo() {
        println("Hola $nombre, su sueldo es S/ ${"%.2f".format(sueldo)}")
    }
}

fun main() {
    println("Ingrese su nombre")
    val nombre = readln()
    println("Ingrese su sueldo")
    val sueldo = readln().toDouble()

    val empleado = Empleado(nombre, sueldo)

    empleado.mostrarInfo()

    println("Ingrese el porcentaje de aumento: ")
    val porcentaje = readln().toDouble()

    empleado.aumentarSueldo(porcentaje)
    empleado.mostrarInfo()
}
