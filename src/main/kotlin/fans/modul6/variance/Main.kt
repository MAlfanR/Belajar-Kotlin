package fans.modul6.variance

fun main(){
    val car = Car(150)
    val motorCycle = MotorCycle(250)

    var vehicle: Vehicle
    vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100), Car(150))
    var vehicleList = carList
}