import java.io.File;

// reading from file which will return a List of Strings as result of read operation
fun readFile (path : String) : List<String> {
    return File(path).readLines();
}

// writing to file
fun writeFile(path : String , text : String) {
    File(path).writeText(text);
    println("Write operation successfull");
}

// appending text to existing file
fun appendFile(path : String , text : String) {
    File(path).appendText("\n$text");
    println("Append operation successfull");
}

fun main(args: Array<String>) {
    writeFile("./io/file.txt", "Hello world from Kotlin I/O !!");
    appendFile("./io/file.txt", "I'm learning Kotlin for Android development");

    var lines = readFile("./io/file.txt");
    lines.forEach {println(it)};
}