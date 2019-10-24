package sample

actual object Sample {

    actual fun getUserString(): String {
        val user = User(1, "JS User")
        return user.userName
    }
}