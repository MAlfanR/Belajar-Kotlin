package fans.modul1

//function yang mengembalikan nilai
// pada kotlin pengembalian nilai menggunakan tipe data
fun setUser(name: String, age: Int) :String{
    return "nama mu adalah $name, dan kamu $age years old"
}

//bisa menggunakan unit bisa juga tidak
fun printUser(name: String): Unit{
    println("Your name is $name")
}

//bisa menggunakan "="
fun setBla (name: String, age: Int): String = "nama mu adalah $name, dan kamu $age years old"
fun main(){
    val user = setUser("Ranger", 20)
    println(user)
    printUser("King")
    val a = setBla("Ana", 15)
    println(a)
}