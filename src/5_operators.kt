fun main(args: Array<String>) {
    var a = 10;
    var b = 11;
    var c = 12;
    var d = 12;
    var e = 0;

    // arithmetic operators
    println(10 + 20);
    println(a++);
    println(a--);
    println(10 - 20);
    println(++a);
    println(--a);
    println(10 * 20);
    println("${20 / 10}");
    println(20 % 11);
    a += 1;
    println(a);
    a -= 1;
    println(a);
    a *= 2;
    println(a);
    a /= 2;
    println(a);
    a %= 7;
    println(a);

    // comparison operators
    println(b == c);
    println(c == d);
    println(a < d);
    println(c >= b);
    
    // logical operators
    println(false && true);
    println(false || true);
    println(!true);
    
    print("Enter age for working : ");
    var age : Int = readln().toInt();
    if (age < 0 || age > 60) {
        println("Invalid age for working");
    } 
    else if (age >= 18 && age <= 60) {
        println("Valid age for working");
    }
}