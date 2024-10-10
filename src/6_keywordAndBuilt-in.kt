import java.util.ArrayList as List;
import java.util.HashSet;

typealias Set = HashSet<Char>;

fun main(args: Array<String>) {
    var str : Any = "String";
    var str2 : String =  str as String;
    println(str2.length);

    var list : List<Int> = List<Int>();
    list.add(1);
    list.add(2);
    list.add(3);
    println(list.toString());

    var set = Set();
    set.add('a');
    set.add('b');
    set.add('c');
    println(set.toString());
}