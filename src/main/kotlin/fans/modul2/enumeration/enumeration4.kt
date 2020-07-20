package fans.modul2.enumeration

fun main(){

}
enum class Colors (val value: Int){
    RED(0xFF0000){
        override fun printValue(){
            println("Value of RED is $value")
        }
    };

    abstract fun printValue()
}