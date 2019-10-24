package sample

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testMe() {
        assertTrue(Sample.getUserString().isNotEmpty())
    }
}