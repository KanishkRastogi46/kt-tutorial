// sealed class
sealed class Ball

// sub-class of sealed class ball
class RedBall (var color : String = "red") : Ball() (

) {

}

// sub-class of sealed class ball
class PinkBall (var color : String = "pink") : Ball() {

}

fun main(args: Array<String>) {
    var value : Ball = PinkBall();

    when (value) {
        is RedBall-> println("Ball is red")
        is PinkBall-> println("Ball is pink")
    }
}