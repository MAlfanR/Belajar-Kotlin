package fans.modul5.menerapkanExceptionHandling



fun main(){
    val someStringValue: String? = "12.0"
    var someIntValue: Int = 0

    try{
        someIntValue = someStringValue!!.toInt()
    }catch (e: NullPointerException){
        someIntValue = 0
    }catch (e:NumberFormatException){
        someIntValue = -1
    }finally {
        when(someIntValue){
            0 -> println("catch blok NullPointerException terpanggil !")
            -1 -> println("catch blok NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}