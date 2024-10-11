// by default inheritance is disabled in kotlin
// so use a keyword "open" before class to enable inheritance

// Parent class or Super-class
open class Parent () {
    var x = 10;
    fun parentFunc() {
        println("Inside parent");
    }
}

// Sub-class of Parent/Super class
open class Child : Parent() {
    var y = 15;
    fun childFunc() {
        println("Inside child");
    }
}

// Sub-class of Child class and grand-child of Parent class
class GrandChild : Child() {
    var z = 20;
    fun grandChildFunc() {
        println("Inside grand-child");
    }
}

fun main(args: Array<String>) {
    var obj = Child();
    println(obj.x);
    println(obj.y);
    obj.parentFunc();
    obj.childFunc();

    var obj_ = GrandChild();
    println(obj_.x);
    println(obj_.y);
    println(obj_.z);
    obj_.parentFunc();
    obj_.childFunc();
    obj_.grandChildFunc();
}