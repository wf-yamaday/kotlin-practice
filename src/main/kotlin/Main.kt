fun main(args: Array<String>) {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    println(sum(1, 2))
    println(multiply(2, 4))

    val pair = "Ferrari" to "Katrina"
    println(pair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudi")
    sophia likes claudia

    printAll("Hello", "World")
    printAll("Hello", "World", "こんにちは", "世界")

    printAllWithPrefix(
        "Hello", "World",
        prefix = "Log: "
    )

    log("a", "b", "c")
}
