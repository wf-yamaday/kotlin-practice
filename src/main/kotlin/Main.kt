
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

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    val user = User("Alex", 1)
    println(user)                                          // 3

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 6
    println(user === user.copy())                          // 7
    println(user.copy("Max"))                              // 8
    println(user.copy(id = 3))                             // 9

    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")

    val state = State.RUNNING
    val message = when(state) {
        State.IDLE -> "アイドル状態"
        State.RUNNING -> "実行中"
        State.FINISHED -> "実行完了"
    }
    println(message)

    val red = Color.RED
    println(red)
    println(red.containesRed())
    println(Color.BLUE.containesRed())
    println(Color.YELLOW.containesRed())
    println(Color.GREEN.containesRed())
}
