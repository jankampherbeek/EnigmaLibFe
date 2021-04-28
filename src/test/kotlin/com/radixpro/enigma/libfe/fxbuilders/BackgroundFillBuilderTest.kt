/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.geometry.Insets
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class BackgroundFillBuilderTest {

    private val color = Color.RED
    private val radii = CornerRadii(6.0)
    private val insets = Insets(3.3)
    private val bgFill = BackgroundFillBuilder().setColor(color).setCornerRadii(radii).setInsets(insets).build()
    private val defaultBgFill = BackgroundFillBuilder().build()

    @Test
    fun `BackgroundFillBuilder should handle color correctly`() {
        bgFill.fill shouldBe color
    }

    @Test
    fun `BackgroundFillBuilder should handle corner radii correctly`() {
        bgFill.radii shouldBe radii
    }

    @Test
    fun `BackgroundFillBuilder should handle insets correctly`() {
        bgFill.insets shouldBe insets
    }

    @Test
    fun `BackgroundFillBuilder should handle default color correctly`() {
        defaultBgFill.fill shouldBe Color.AZURE
    }

    @Test
    fun `BackgroundFillBuilder should handle default corner radii correctly`() {
        defaultBgFill.radii shouldBe CornerRadii(0.0)
    }

    @Test
    fun `BackgroundFillBuilder should handle default insets correctly`() {
        defaultBgFill.insets shouldBe Insets(0.0)
    }

}