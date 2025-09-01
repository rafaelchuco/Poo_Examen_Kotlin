package examen

class CuentaBancaria(
    private val numero: String,
    private val titular: String,
    private var saldo: Double
) {
    constructor(numero: String, titular: String) : this(numero, titular, 0.00)

    fun depositar(monto: Double) {
        if (monto > 0.00) {
            saldo += monto
            println("Depósito exitoso de S/ $monto. Saldo actual: S/ $saldo")
        } else {
            println("No puede depositar el monto de $monto")
        }
    }

    fun retirar(monto: Double) {
        if (monto > 0.00 && saldo >= monto) {
            saldo -= monto
            println("Retiro exitoso de S/ $monto. Saldo actual: S/ $saldo")
        } else {
            println("El monto que quiere retirar es inválido o supera el saldo disponible")
        }
    }

    fun mostrarInfo() {
        println("Cuenta: $numero | Titular: $titular | Saldo: S/ $saldo")
    }
}

fun main() {
    println("==== Crear su cuenta bancaria ====")
    print("Ingrese su nombre: ")
    val titular = readLine()!!
    print("Ingrese su número de cuenta: ")
    val numero = readLine()!!
    print("Ingrese su saldo inicial (dejar vacío para 0): ")
    val saldoInput = readLine()!!

    val cuenta = if (saldoInput.isBlank()) {
        CuentaBancaria(numero, titular)
    } else {
        CuentaBancaria(numero, titular, saldoInput.toDouble())
    }

    var opcion: Int
    do {
        println("\n--- Menú ---")
        println("1. Depositar")
        println("2. Retirar")
        println("3. Mostrar información")
        println("0. Salir")
        print("Seleccione una opción: ")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Ingrese monto a depositar: ")
                val monto = readLine()!!.toDouble()
                cuenta.depositar(monto)
            }
            2 -> {
                print("Ingrese monto a retirar: ")
                val monto = readLine()!!.toDouble()
                cuenta.retirar(monto)
            }
            3 -> cuenta.mostrarInfo()
            0 -> println("Gracias por usar el sistema.")
            else -> println("Opción inválida.")
        }
    } while (opcion != 0)
}
