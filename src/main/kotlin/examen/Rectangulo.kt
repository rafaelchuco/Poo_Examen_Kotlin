package examen

class Rectangulo(val ancho: Double, val alto: Double) {

    fun calcularArea(): Double {
        return alto * ancho
    }

    fun calcularPerimetro(): Double{
        return 2 * (ancho + alto)
    }
}

fun main() {

    val rectangulo = Rectangulo(22.0, 33.0)

    println("Rectangulo: ")
    println("ancho = ${rectangulo.ancho}")
    println("alto = ${rectangulo.alto}")
    println("Area = ${rectangulo.calcularArea()}")
    println("Perimetro = ${rectangulo.calcularPerimetro()}")

}