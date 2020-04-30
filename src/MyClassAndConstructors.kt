class myClass(private val firstName: String, private val age: Int) {
    private  var name: String = "Tutorial.point"
    private val message: String = "Welcome"

    constructor(name: String, age:Int, message: String):this(name, age){
    }


    fun printMe(){
        println("I am learning Kotlin from $name")
        print("Hello $message My first name is $firstName and lastName age is $age")
    }
}

fun main(args: Array<String>){
    val obj = myClass("Rakesh", 40)
    obj.printMe()
}





