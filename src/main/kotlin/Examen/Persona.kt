package Examen

// Lo que hice:
//class Persona {
//    var nombre: String = ""
//    var edad: Int = 0
//}
//
//fun main(){
//    val persona1 = Persona()
//    persona1.nombre = "Rafael"
//    persona1.edad = 19
//    println("Hola ${persona1.nombre} tu edad es ${persona1.edad}")
//}
// Como se puede mejorar?

class Persona(val nombre: String, val edad: Int)
fun main(){
    val persona01 = Persona("Rafael", 19)
    println("Nombre: ${persona01.nombre}")
    println("Edad: ${persona01.edad}")
    // Gracias a Codark ya imprime bonito
}
