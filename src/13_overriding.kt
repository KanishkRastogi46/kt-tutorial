open class Person {
    open var category = "Human";
    open fun display() {
        println("Human class");
    }
}

// overriding the category attribute and display method of Person/Super class
class Employee : Person() {
    override var category = "Human and Corporate mazdoor";
    override fun display() {
        println("Employee class");
    }
}

// overriding the category attribute and display method of Person/Super class
class User : Person() {
    override var category = "Human and User";
    override fun display() {
        println("User class");
    }
}

fun main(args: Array<String>) {
    var emp : Person  = Employee();
    println(emp.category);
    emp.display();

    var usr : Person = User();
    println(usr.category);
    usr.display();
}