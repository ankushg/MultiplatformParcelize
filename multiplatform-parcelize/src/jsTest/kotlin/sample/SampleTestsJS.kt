package sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleTestsJS {
    @Test
    fun testJsUser() {
        assertEquals("JS User", Sample.getUserString())
    }
}