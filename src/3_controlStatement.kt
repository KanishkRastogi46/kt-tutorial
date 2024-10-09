fun main(args: Array<String>) {
    print("Enter number between 0 and 100 : ");
    var num : Int = readln().toInt();

    // if ... elseif ... else
    if (num < 0) println("Negative number : $num");
    else if (num > 100) println("Number greater than 100 : $num");
    else println("Number from 0 - 100 : $num");

    var num2 : Int = readln().toInt();
    var max = if (num > num2) {
        num
    } else  num2;
    println("max is $max");

    // when statement
    var grade = when(num2) {
        in 30..40-> 'D'
        in 40..50-> 'C'
        in 50..60-> 'B'
        in 60..70-> 'A'
        in 70..100-> "A+"
        else-> 'F'
    };
    println("Grade is $grade");

}