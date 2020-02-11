import kotlin.math.abs

fun main () {

    var input:Double =0.0
    val normTemp:Double = 98.5
    var diff:Double = 0.0

    input = readLine()!!.toDouble()

    while (input != 98.5) {
        println("Input temperature")


        diff = abs(input-normTemp)

        if (diff < 1) {
            println("You are not sick, carryon!")
        } else if (diff < 1.5 && input > normTemp)
            println("A little warm, need to lay down")
        else if (diff < 1.5 && input < normTemp)
            println("A little cool, need to lay down")
        else if (diff < 2 && input > normTemp)
            println("You are sick, take medicine!")
        else
            println("Seek medical care immediately!")

    }
println("You are perfectly healthy")
}

main()