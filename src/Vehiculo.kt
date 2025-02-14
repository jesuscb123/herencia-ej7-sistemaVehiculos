open class Vehiculo(val marca: String, val capacidad: Int) {
    fun mostrarInformacion(){
        println("Marca: $marca, capacidad: $capacidad")
    }

    open fun calcularAutonomia(): Int{
        val autonomia = (capacidad * 10)
        return autonomia
    }
}