package sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleTestsJVM {
    @Test
    fun testHello() {
        assertEquals("JVM User", Sample.getUserString())
    }
}