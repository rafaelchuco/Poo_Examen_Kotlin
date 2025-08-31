package examen

class Producto(private val id: String, private val nombre: String, private val precio: Double) {

    constructor(id: String, nombre: String): this(id, nombre, 0.00)

    fun mostrarInfo(){
        println("El $nombre con codigo $id cuesta $precio ")
    }
}
fun main(){

    val producto1 = Producto(
        "1234",
        "Pan",
        4.20
    )

    val producto2 = Producto(
        "4321",
        "vino"
    )

    producto1.mostrarInfo()
    producto2.mostrarInfo()
}