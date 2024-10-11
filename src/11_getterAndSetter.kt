// private members can only be accessed within the same class
// protected members can be accessed within the class and by the child class but not outside the class
// public members can be accessed anywhere
// internal members can be accessed 

class User constructor (
    public var name : String= "",
    public var age : Int = 0
) {
    private var email : String = ""
        get() = field
        set(value : String) {
            field = value;
        }

    constructor (name : String, age : Int, email: String) : this(name , age) {
        this.email = email;
    }

    fun getUserDetails () {
        println("User name is ${this.name} , he/she is ${this.age} years old and email id is ${this.email}");
    }
}

fun main(args: Array<String>) {
    var user1 = User("Kanishk", 21, "kanishk@gmail.com");
    user1.getUserDetails();
    user1.name = "Kanishk Rastogi";
    user1.getUserDetails();

    // user1.email = "kanishk46@gmail.com";
    // println("${user1.name} , ${user1.age} , ${user1.email}.");
    // can't access email as it is private member

}