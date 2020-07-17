package com.alfan.kotlin.modul3.sets

//pada set bisa menambah dan menghapus item tetapi tidak bisa mengubah nilai
fun main(){
    //set hanya menampilkan 1 jika ada lebih dari 1 data yang sama
    val integerSet = setOf(3,2 ,4, 6, 7, 3, 3)
    println(integerSet)

    //set tidak memperhatikan urutan
    val iSet = setOf(2, 3, 4, 6 , 7)
    if(integerSet == iSet){
        println("Yeay")
    }


    //mengecek apakah ada nilai 3 di dalam set
    println(3 in iSet)

    //union dan intersect
    val ran = setOf(2, 5, 7)
    val union = ran.union(integerSet)
    println(union)

    val intersect = ran.intersect(integerSet)
    println(intersect)


}