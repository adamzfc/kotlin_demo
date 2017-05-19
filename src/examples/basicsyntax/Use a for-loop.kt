package examples.basicsyntax

/**
 * Created by adamzfc on 5/19/17.
 */
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }
    // or
    println()
    for (i in args.indices)
        println(args[i])
}
