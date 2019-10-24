package sample

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(AndroidJUnit4::class)
class SampleInstrumentationTestsAndroid {
    @Test
    fun testHello() {
        assertEquals("Android User", Sample.getUserString())
    }
}