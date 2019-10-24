package sample

import android.os.Bundle

actual object Sample {
    private const val USER_BUNDLE_KEY = "user"

    actual fun getUserString(): String {
        val bundle = Bundle().apply {
            putParcelable(
                USER_BUNDLE_KEY,
                User(1, "Android User")
            )
        }

        val unparceledUser : User? = bundle.getParcelable(USER_BUNDLE_KEY)

        return unparceledUser?.userName
            ?: "Null User :("
    }
}