package fans.modul5.visibilityModifiers

class animal(private var name: String, private val weight: Double, private val age: Int){

    fun getName() : String{
        return name
    }

    fun setName(newName: String){
        name = newName
    }
}
//fun main(){
//
//}