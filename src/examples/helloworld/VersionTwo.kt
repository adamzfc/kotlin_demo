package examples.helloworld

/**
 * Created by adamzfc on 5/19/17.
 * Reading many names from the command line
 */
fun main(args: Array<String>) {
    for (name in args) {
        println("Hello, $name!")
    }
}
