class Automovil(marca: String, capacidad: Int, val tipo: String) : Vehiculo(marca, capacidad)  {
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }
}