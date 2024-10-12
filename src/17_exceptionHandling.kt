fun main(args: Array<String>) {
    try {
        var num : Int = readln().toInt();
        println(num);
    }
    catch(err : Exception) {
        println("Some error occured ${err.message}");
    }
    finally {
        println("Program ended");
    }
}