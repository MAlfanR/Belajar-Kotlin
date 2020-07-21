package fans.modul5.interfaces

class Bird(override val nomorSayap: Int): IFly{

    override fun fly() {
        if(nomorSayap > 0) println("Yeah")
        else println("Hmm")
    }
}