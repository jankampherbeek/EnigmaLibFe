/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.scene.control.ToggleGroup
import javafx.scene.paint.Color
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class RadioButtonBuilderTest {

    private val selectedColor = Color.PINK
    private val unSelectedColor = Color.ORANGE
    private val disable =  true
    private val visible = false
    private val myToggleGroup = ToggleGroup()
    private val prefHeight = 200.0
    private val prefWidth = 120.0
    private val text = "myText"
    private val radioButton = RadioButtonBuilder()
        .setSelectedColor(selectedColor)
        .setUnselectedColor(unSelectedColor)
        .setDisable(disable)
        .setVisible(visible)
        .setToggleGroup(myToggleGroup)
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setText(text)
        .build()
    private val defaultRadioButton = RadioButtonBuilder().build()

    @Test
    fun `SelectedColor should have the correct value`() {
        radioButton.selectedColor shouldBe selectedColor
    }

    @Test
    fun `UnSelectedColor should have the correct value`() {
        radioButton.unSelectedColor shouldBe unSelectedColor
    }

    @Test
    fun `Disable should have the correct value`() {
        radioButton.isDisable shouldBe disable
    }

    @Test
    fun `Visible should have the correct value`() {
        radioButton.isVisible shouldBe visible
    }

    @Test
    fun `ToggleGroup should have the correct value`() {
        radioButton.toggleGroup shouldBe myToggleGroup
    }

    @Test
    fun `PrefHeight should have the correct value`() {
        radioButton.prefHeight shouldBe prefHeight
    }

    @Test
    fun `PrefWidth should have the correct value`() {
        radioButton.prefWidth shouldBe prefWidth
    }

    @Test
    fun `Text should have the correct value`() {
        radioButton.text shouldBe text
    }

    @Test
    fun `SelectedColor should have the correct default value`() {
        defaultRadioButton.selectedColor shouldBe Color.STEELBLUE
    }

    @Test
    fun `UnSelectedColor should have the correct default value`() {
        defaultRadioButton.unSelectedColor shouldBe Color.LIGHTGRAY
    }

    @Test
    fun `Disable should have the correct default value`() {
        defaultRadioButton.isDisable shouldBe false
    }


    @Test
    fun `Visible should have the correct default value`() {
        defaultRadioButton.isVisible shouldBe true
    }

    @Test
    fun `ToggleGroup should have the correct default value`() {
        defaultRadioButton.toggleGroup shouldBe null
    }

    @Test
    fun `PrefHeight should have the correct default value`() {
        defaultRadioButton.prefHeight shouldBe -1
    }

    @Test
    fun `PrefWidth should have the correct default value`() {
        defaultRadioButton.prefWidth shouldBe -1
    }

    @Test
    fun `Text should have the correct default value`() {
        defaultRadioButton.text shouldBe ""
    }


}