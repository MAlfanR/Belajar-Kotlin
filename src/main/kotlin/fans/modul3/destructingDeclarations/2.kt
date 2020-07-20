package fans.modul3.destructingDeclarations

//dapat menerapkan behaviour dalam data class
//membuat fungsi di dalam data class
data class  DataUser(val name: String, val age : Int){
    fun ranger(){
        println("Nama saya $name, Saya berumur $age")
    }
}
fun main(){
    val dataUser = DataUser("Alfan", 22)
    dataUser.ranger()
}