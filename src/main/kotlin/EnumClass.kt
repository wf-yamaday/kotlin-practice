enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(
    val rgb: Int
) {
    RED(0xFF000),
    GREEN(0x00FF00),
    BLUE(0x000ff),
    YELLOW(0xFFFF00);

    fun containesRed() = (this.rgb and 0xFF0000 != 0)
}
