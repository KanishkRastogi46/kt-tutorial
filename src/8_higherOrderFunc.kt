// higher order functions
// They are functions in which body of another function is passed as an argument

fun doSomething (str : String, factorial : (n : Int) -> Int) : Int {
    println(str);
    print("Enter number : ")
    var n = readln().toInt();
    var res = factorial(n);
    return res;
}

fun someTask (str : String, cb : () -> Unit) {
    println(str);
    cb();
}

// varargs
fun addition (vararg nums : Int) : Int {
    var sum = 0;
    for (num in nums) {
        sum += num;
    }
    return sum;
}

fun main(args: Array<String>) {
    /* Lambda functions */
    val Lambda = {
        println("Hi I'm a Lambda function");
    };
    var square = {n:Int -> n * n};
    Lambda();
    println(square(10));

    // higher order function with another function as argument
    var ans = doSomething("Factorial function", fun (n : Int) : Int {
        var fact = 1;
        for (i in 1..n) {
            fact *= i;
        }
        return fact;
    })
    println(ans);

    // higher order function with lambda function as argument
    someTask("Some task function", {
        println("Inside callback function in Some task function");
    });

    // vararg function :- function with dynamic no of parameters
    var sum = addition(10, 20, 40);
    println(sum);
}