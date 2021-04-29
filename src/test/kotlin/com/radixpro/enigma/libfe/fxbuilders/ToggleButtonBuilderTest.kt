/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXTooltip
import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.geometry.Pos
import javafx.scene.paint.Color
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class ToggleButtonBuilderTest {

    private val toggleColor = Color.PINK
    private val toggleLineColor = Color.MAGENTA
    private val unToggleColor = Color.YELLOW
    private val unToggleLineColor = Color.GREEN
    private val disable = true
    private val visible = false
    private val tooltip = JFXTooltip("toggleTip")
    private val text = "toggleText"
    private val alignment = Pos.TOP_RIGHT
    private val toggleButton = ToggleButtonBuilder()
        .setToggleColor(toggleColor)
        .setToggleLineColor(toggleLineColor)
        .setUnToggleColor(unToggleColor)
        .setUnToggleLineColor(unToggleLineColor)
        .setDisable(disable)
        .setVisible(visible)
        .setTooltip(tooltip)
        .setText(text)
        .setAlignment(alignment)
        .build()
    private val defaultToggleButton = ToggleButtonBuilder().build()


    @Test
    fun `ToggleColor should have correct value`() {
        toggleButton.toggleColor shouldBe toggleColor
    }

    @Test
    fun `ToggleLineColor should have correct value`() {
        toggleButton.toggleLineColor shouldBe toggleLineColor
    }

    @Test
    fun `UnToggleColor should have correct value`() {
        toggleButton.unToggleColor shouldBe unToggleColor
    }

    @Test
    fun `UnToggleLineColor should have correct value`() {
        toggleButton.unToggleLineColor shouldBe unToggleLineColor
    }

    @Test
    fun `Disable should have correct value`() {
        toggleButton.isDisable shouldBe disable
    }

    @Test
    fun `Visible should have correct value`() {
        toggleButton.isVisible shouldBe visible
    }

    @Test
    fun `Tooltip should have correct value`() {
        toggleButton.tooltip shouldBe tooltip
    }

    @Test
    fun `Text should have correct value`() {
        toggleButton.text shouldBe text
    }

    @Test
    fun `ALignment should have correct value`() {
        toggleButton.alignment shouldBe alignment
    }

    @Test
    fun `Disable should have correct default value`() {
        defaultToggleButton.isDisable shouldBe false
    }

    @Test
    fun `Visible should have correct default value`() {
        defaultToggleButton.isVisible shouldBe true
    }

    @Test
    fun `Tooltip should have correct default value`() {
        defaultToggleButton.tooltip shouldBe null
    }

    @Test
    fun `Text should have correct default value`() {
        defaultToggleButton.text shouldBe ""
    }

    @Test
    fun `ALignment should have correct default value`() {
        defaultToggleButton.alignment shouldBe Pos.CENTER_LEFT
    }

}