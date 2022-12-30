object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = ${username}:${password}")
    }
}

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}