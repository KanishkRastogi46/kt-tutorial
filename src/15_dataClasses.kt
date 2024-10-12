// Note* :-
// data class should have atleast one var or val variable in primary constructor
// data class automatically provides following methods :-
// 1.) equals()
// 2.) hashCode()
// 3.) toString()
// 4.) copy()

class Test {

}

data class User (
    var name : String
) {
    var age : Int = 0;

    constructor (name : String, age : Int) : this(name) {
        this.age = age;
    }
}

fun main(args: Array<String>) {
    var u1 = User("Kanishk", 21);
    println(u1.name);
    println(u1.age);

    // copy method of data class which will copy the values of variable in primary constructor
    println();
    println("copy() method of data class which will copy the values of variable in primary constructor")
    var u1copy = u1.copy();
    println(u1copy.name);
    u1copy.age = 25;
    println(u1copy.age);

    // toString() method of data class prints the values of variable in primary constructor
    println();
    println("toString() method of data class prints the values of variable in primary constructor");
    println(u1);
    println(u1copy);

    // hashCode() method
    println();
    println(Test());
}