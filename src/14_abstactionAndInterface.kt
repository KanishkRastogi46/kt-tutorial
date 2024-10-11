// interface
interface User {
    var name : String
    var age : Int
    fun moves() : Unit
    fun display() {
        println("User interface");
    }
}

// implements User interface
class MyClass : User {
    override var name = "XYZ";
    override var age = 0;

    override fun moves() {
        println("User moves")
    }

    fun breathe() {
        println("MyClass breathe");
    }
}

// abstract class
abstract class Person {
    open var name = "Somebody";

    open fun breathe () {
        println("Breathing");
    }

    abstract fun eat()
}

class Kanishk : Person() {
    override var name = "Kanishk";

    override fun breathe () {
        println("Kanishk is breathing");
    }

    override fun eat () {
        println("Kanishk love's eating Chicken Biryani");
    }
}

fun main(args: Array<String>) {
    var kan = Kanishk();
    println(kan.name);
    kan.breathe();
    kan.eat();

    var cls = MyClass();
    println("${cls.name} - ${cls.age}");
    cls.display();
    cls.breathe();
    cls.moves();
}