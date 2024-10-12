// enum class
// all the members of enum class are itself object of the class such as
// MON, TUES, WED,.... so on
enum class Days (var num : Int) {
    MON(1),
    TUES(2),
    WED(3),
    THURS(4),
    FRI(5),
    SAT(6),
    SUN(7);

    fun display () {
        println("Inside enum DAYS")
    }
}

fun main(args: Array<String>) {
    var sun = Days.SUN;
    println(sun);
    println(sun.num);
    sun.display();
}