package fans.modul1

//ifExpression
fun main(){
    val openHours = 21
    val now = 20
//    if(now > openHours){
//        println("Kantor buka")
//    }else{
//        println("Kantor tutup")
//    }
    val office: String
    if(now > openHours){
        office ="Kantor selalu buka"
    }else{
        office = "Kantor tutup"
    }

    println(office)

    val maen = 5
    val berhenti:String

    //bisa begini ternyata
    berhenti =if (maen >5){
        "Maen terus"
    }else if (maen <5){
        "Bentar amat maennya"
    }else{
        "Nah gitu dong cukup maennya"
    }

    println(berhenti)
}