fun main(args: Array<String>) = readLine()!!.split(' ').map(String::toInt).let { (a, b) ->
    for (i in 1..b) {
        for (i in 1..a) {
            print("*")
        }   
        println()
    }
}