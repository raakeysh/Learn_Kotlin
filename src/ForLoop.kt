fun main(args: Array<String>){
        val items = listOf(1,2,3,4,5,6,7,8)
        for(i in items){
            println("$i")
        }

        for((index, value) in items.withIndex()){
            println("$index, $value")
        }

        println("Example of Break and Continue")

    myLabel@ for( x in 1..10){
        if(x == 5)
        {
            println("Inside block If with value $x\n Hence it will close the application")
            break@myLabel
        }else{
            println("Inside block Else with value $x\n Hence it will continue the application")
            continue@myLabel
        }
    }
}