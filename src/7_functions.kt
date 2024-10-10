fun add (a:Int, b:Int) : Int{
    return a + b;
}

fun subtract (a:Int, b:Int) : Int{
    return a - b;
}

fun product (a:Int, b:Int) : Int{
    return a * b;
}

fun divide (a:Int, b:Int) : Int{
    return a / b;
}

fun mod (a:Int, b:Int) : Int{
    return a % b;
}

fun main(args: Array<String>) {
    print("Enter a : ");
    var a : Int = readln().toInt();
    print("Enter b : ");
    var b : Int = readln().toInt();

    println(add(a , b));
    println(subtract(a , b));
    println(product(a , b));
    println(divide(a , b));
    println(mod(a , b));
} 