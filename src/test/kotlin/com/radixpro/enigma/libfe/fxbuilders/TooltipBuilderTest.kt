/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXTooltip
import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.scene.text.TextAlignment
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class TooltipBuilderTest: TestCase() {

    private val width = 123.45
    private val text = "Just a tip"
    private val align = TextAlignment.RIGHT
    private val tooltip = TooltipBuilder().setPrefWidth(width).setTextAlignment(align).setText(text).build()
    private val defaultTooltip = TooltipBuilder().build()

    @Test
    fun `A newly defined alignment should be used`() {
        tooltip.textAlignment shouldBe align
    }

    @Test
    fun `A defined text should be used`() {
        tooltip.text shouldBe text
    }

    @Test
    fun `A newly defined value for prefwidth should be used`() {
        tooltip.prefWidth shouldBe width
    }


    @Test
    fun `The default alignment should be used`() {
        defaultTooltip.textAlignment shouldBe TextAlignment.CENTER
    }

    @Test
    fun `The default for text should be an empty string`() {
        defaultTooltip.text shouldBe ""
    }

    @Test
    fun `The default for width shouldBe used`() {
        defaultTooltip.prefWidth shouldBe -1.0
    }

}