fun main(args: Array<String>){
    val a: Int = 5
    val b: Int = 2
    var max: Int

    if(a>b){
        max = a
    }else{
        max = b
    }
    print("Maximum number is $max\n")

    //switch case in C3

    when(a){
        1 -> print("a == 1")
        2 -> print("a == 2")
        3 -> print("a == 3")
        4 -> print("a == 4")
        5,6 -> print("a == 5 or 6\n")
        5 -> print("a == 5")

        else -> {
            print("...")
        }


    }
}
