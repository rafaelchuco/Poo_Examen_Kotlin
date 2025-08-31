package examen

class Estudiante(val codigo: String, val nombre: String)
fun main() {
    val estudiante = Estudiante("112345", "Rafael")
    println("Bienvenido")
    println("Estimado alumno ${estudiante.nombre} su codigo es ${estudiante.codigo}")
}
