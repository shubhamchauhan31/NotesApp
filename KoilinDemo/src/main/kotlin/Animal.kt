abstract class Animal(
    var name:String ?=null
) {
    init {
        println("Animal Name is $name")
    }

    abstract fun makeSound()
}