package examples.helloworld

/**
 * Created by adamzfc on 5/19/17.
 * Reading a name from the command line
 */
fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a name as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}
