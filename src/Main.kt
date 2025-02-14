fun main(){
    val automovil1 = Automovil("bmw",200,"todoterreno")
    val motocicleta = Motocicleta("vespa", 60,50)
    automovil1.mostrarInformacion()
    motocicleta.mostrarInformacion()
    println(automovil1.calcularAutonomia())
    println(motocicleta.calcularAutonomia())
}