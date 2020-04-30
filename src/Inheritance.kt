open class ABC{
    open fun think(){
        print("Hey!! I am thinking ")
    }

    open fun think(whatsOnMind: String){
        println(whatsOnMind)
        }
    open fun thinkMore(whatsMoreonMind: String){
        println(whatsMoreonMind)
    }
}

class BCD: ABC(){
    override fun think(){
        println("Hey guys!! I am thinking.")
    }
}


fun main(args: Array<String>){
    val a = BCD()
    a.think("Hey guys!! I got some crazy ideas.\n")
    a.think()
}

