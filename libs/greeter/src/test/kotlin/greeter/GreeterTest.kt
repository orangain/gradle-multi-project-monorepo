/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package greeter

import kotlin.test.Test
import kotlin.test.assertNotNull

class GreeterTest {
    @Test fun testGetGreeting() {
        val classUnderTest = Greeter()
        assertNotNull(classUnderTest.getGreeting(), "getGreeting should return non-null value")
    }
}