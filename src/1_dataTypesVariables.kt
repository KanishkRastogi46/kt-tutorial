class User (
    var name : String,
    var age : Int
)
{
    fun getUser() {
        println(name);
        println(age);
    }
}

fun main(args: Array<String>) {
    // var can be changed but val is constant
    var name = "Kanishk Rastogi";
    val age = 21;
    println("My name is $name and age is $age");


    // Integer type
    var num1 : Byte = 10;
    var num2 : Short = 100;
    var num3 : Int = 10000;
    var num4 : Long = 100000000;
    println("byte = $num1, short = $num2, int = $num3, long = $num4"); 

    // Floating type
    var num5 : Float = 45.45f;
    var num6 : Double = 45.4545454;
    println("float = $num5, double = $num6"); 

    // Character type
    var a = 'A';
    println("char = $a");

    // String type
    var available = "yes";
    println("string = $available");

    // Boolean type
    var accept : Boolean = true;
    println("boolean = $accept");

    // Array
    var nums : Array<Int> = arrayOf(1,2,3,4,5);
    println(nums[2]);

    num1--;
    num2++;
    println(num1)
    println(num2);
    println(num3.toFloat());

    // User class object
    var user1 : User = User("Kanishk Rastogi", 21);
    user1.getUser();
}