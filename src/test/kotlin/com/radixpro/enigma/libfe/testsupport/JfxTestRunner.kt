/**
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 * This class makes it possible to unittest JavaFX items.
 * An example was published by Oliver Jan Krylow at https://stackoverflow.com/questions/18429422/basic-junit-test-for-javafx-8
 * Code retrieved via https://gist.github.com/bugabinga/
 * © 2015 isp-insoft all rights reserved.
 */
package com.radixpro.enigma.libfe.testsupport

import com.sun.javafx.application.PlatformImpl
import org.junit.runners.BlockJUnit4ClassRunner
import org.junit.runners.model.InitializationError
import java.util.concurrent.CountDownLatch

/**
 * This runner can be used to run JUnit-Tests on the JavaFx-Thread. This class can be used as a parameter to
 * the RunWith annotation. Example: *
 *
 * <pre>
 * `
 * &#64;RunWith( JfxTestRunner.class )
 * public class MyUnitTest
 * {
 * &#64;Test
 * public void testMyMethod()
 * {
 * //...
 * }
 * }
` *
</pre> *
 *
 * @author okr
 * @date 18.11.2015
 */
class JfxTestRunner(klass: Class<*>?) : BlockJUnit4ClassRunner(klass) {
    companion object {
        @Throws(InterruptedException::class)
        private fun setupJavaFX() {
            val latch = CountDownLatch(1)
            // initializes JavaFX environment
            PlatformImpl.startup {}
            latch.countDown()
            latch.await()
        }
    }

    /**
     * Creates a test runner, that initializes the JavaFx runtime.
     *
     * @throws : InitializationError if the test class is malformed.
     */
    init {
        try {
            setupJavaFX()
        } catch (e: InterruptedException) {
            throw InitializationError("Could not initialize the JavaFx platform.")
        }
    }
}