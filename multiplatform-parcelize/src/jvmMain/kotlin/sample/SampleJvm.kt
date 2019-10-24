package sample

actual object Sample {
    actual fun getUserString(): String {
        val user = User(1, "JVM User")
        return user.userName
    }
}