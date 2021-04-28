/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.geometry.Insets
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class BackgroundBuilderTest {

    private val bgFillTop = BackgroundFill(Color.OLIVE, CornerRadii(1.1), Insets(2.2))
    private val bgFillBottom = BackgroundFill(Color.AQUA, CornerRadii(4.4), Insets(3.3))
    private val background = BackgroundBuilder().setBackgroundFillBottom(bgFillBottom).setBackgroundFillTop(bgFillTop).build()
    private val defaultBackground = BackgroundBuilder().build()

    @Test
    fun `Top fill should be correct`() {
        background.fills[0] shouldBe bgFillBottom
    }

    @Test
    fun `Bottom fill should be correct`() {
        background.fills[1] shouldBe bgFillTop
    }

    @Test
    fun `Default Background should have no fills`() {
        defaultBackground.fills.size shouldBe 0
    }

}