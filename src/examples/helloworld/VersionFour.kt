package examples.helloworld

/**
 * Created by adamzfc on 5/19/17.
 * An object-oriented Hello
 */
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}


fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}
