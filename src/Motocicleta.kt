class Motocicleta(marca: String, capacidad: Int,
                  cilindrada: Int) : Vehiculo(marca,capacidad) {
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}