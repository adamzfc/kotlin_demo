package examples.basicsyntax

/**
 * Created by adamzfc on 5/19/17.
 */
fun main(args: Array<String>) {
    println(max(args[0].toInt(), args[1].toInt()))
}

fun max(a: Int, b: Int) = if (a > b) a else b
