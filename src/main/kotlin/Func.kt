fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"): Unit {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return  x + y
}

fun multiply(x: Int, y: Int) = x * y

infix fun Int.times(str: String) = str.repeat(this)

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){ likedPeople.add(other)}
}

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries)
}