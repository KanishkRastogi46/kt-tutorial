fun main(args: Array<String>) {
    
    // while loop
    print("Enter number : ");
    var num : Int = readln().toInt();
    var fact = 1;
    while (num > 0) {
        fact *= num;
        num--;
    }
    println("Factorial is $fact");
    
    
    // do while loop
    print("Enter number 1 : ");
    var num1 : Int = readln().toInt();
    fact = 1;
    do {
        fact *= num1;
        num1--;
    } while (num1 > 0)
    println("Factorial is $fact");


    // for loop
    print("Enter number 2 : ");
    var num2 : Int = readln().toInt();
    fact = 1;
    for (i in 1..num2) {                // increasing for loop
        fact *= i
    }
    println("Factorial is $fact")
    fact = 1;
    for (i in num2 downTo 1) {          // decreasing for loop using downTo keyword
        fact *= i
    }
    println("Factorial is $fact");

    for (i in 0..20 step 2) {           // for loops in steps of 2
        print("$i  ");
    }
    println();
    println("Printing array nums");
    var nums : Array<Int> = arrayOf(10,20,30,40,50);
    for (num in nums) {
        print("$num  ")
    }
}