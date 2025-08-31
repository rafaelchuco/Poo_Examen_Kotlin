package examen

class Libro(private val titulo: String, private val autor: String ) {

    fun mostrarInfo() {
        print("El libro llamado $titulo tiene de autor a $autor")
    }

}
fun main() {

    val libro1 = Libro(
        "El principito",
        "Antoine de Saint-Exupéry"
    )

    val libro2 = Libro(
        "Cien años de soledad",
        "Gabriel García Márquez"
    )

    libro1.mostrarInfo()
    libro2.mostrarInfo()
}
