class User (
    var name : String,
    var age : Int,
    var city : String,
    var isAdult : Boolean
) {
    fun getDetails () {
        println("User name is ${this.name} and his age is ${this.age}, he/she lives in ${this.city} and he/ahe isAdult or not ${this.isAdult}");
    }
}

class Person {
    var name : String = "";
    var age : Int = 0;
}

fun main(args: Array<String>) {
    // Person class object
    var person1 = Person();
    person1.name = "Rahul Jain";
    person1.age = 30;
    println("Person1 name ${person1.name} and age ${person1.age}")

    // User class object
    var user1 = User("Kanishk Rastogi", 21, "Lucknow", true);
    user1.getDetails();
    user1.name = "Kanishk";
    user1.getDetails();
}