// class with primary constructor
// there can only be single primary constructor in a class
class Class1 constructor (
    var a : Int = 100,
    var b : String = "String1",
) {
    init {
        println("$this is object of class Class1");
    }
}

// class with secondary constructor
// there can be multiple secondary constructors in an class using constructor overloading
class Class2 {
    var a = 0;
    var b = "";
    var c = 0.0f;

    constructor (a : Int, b: String) : this(a, b, 0.0f) {
        println("First constructor of class 2");
    }

    constructor (a : Int, b : String, c : Float) {
        this.a = a;
        this.b = b; 
        this.c = c;
        println("Second constructor of class 2");
    }
}

fun main(args: Array<String>) {
    var obj1 = Class1();
    println(obj1.a);
    println(obj1.b);
    obj1.a += 10;
    obj1.b = "Hello World";
    println(obj1.a);
    println(obj1.b);

    var obj2 = Class2(20, "String2");
    println(obj2.a);
    println(obj2.b);
    println(obj2.c);
}