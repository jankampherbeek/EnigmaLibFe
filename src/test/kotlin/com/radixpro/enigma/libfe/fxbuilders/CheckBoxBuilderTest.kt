/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXCheckBox
import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.geometry.Pos
import junit.framework.TestCase
import org.junit.runner.RunWith
import org.junit.Test

@RunWith(JfxTestRunner::class)
class CheckBoxBuilderTest : TestCase() {

    private val alignment = Pos.TOP_LEFT
    private val styleClass = "checkboxStyle"
    private val selected = false
    private val disable = true
    private val focusTraversable = false
    private val text = "Text for checkBox"
    private val checkBox = CheckBoxBuilder()
        .setText(text)
        .setAlignment(alignment)
        .setDisable(disable)
        .setFocusTraversable(focusTraversable)
        .setStyleClass(styleClass)
        .setSelected(selected).build()
    private val checkBoxDefault = CheckBoxBuilder().build()

    @Test
    fun `CheckboxBuilder should return instance of JFXCheckBox`() {
        (checkBox is JFXCheckBox) shouldBe true
    }

    @Test
    fun `A newly defined alignment should be used`() {
        checkBox.alignment shouldBe alignment
    }

    @Test
    fun `A newly defined styleClass should be used`() {
        checkBox.styleClass[2] shouldBe styleClass      // pos. 0 is checkBox, pos 1 is JFXCheckBOx
    }

    @Test
    fun `A newly defined value for selected should be used`() {
        checkBox.isSelected shouldBe selected
    }

    @Test
    fun `A newly defined text should be used`() {
        checkBox.text shouldBe text
    }

    @Test
    fun `A newly defined value for disable should be used`() {
        checkBox.isDisable shouldBe disable
    }

    @Test
    fun `A newly defined value for focusTraversable should be used`() {
        checkBox.isFocusTraversable shouldBe focusTraversable
    }


    @Test
    fun `CheckBoxBuilder should handle default alignment correctly`() {
        checkBoxDefault.alignment shouldBe Pos.CENTER_LEFT
    }

    @Test
    fun `CheckBoxBuilder should handle default styleClass correctly`() {
        checkBoxDefault.styleClass.size shouldBe 2
    }

    @Test
    fun `CheckBoxBuilder should handle default selected correctly`() {
        checkBoxDefault.isSelected shouldBe false
    }

    @Test
    fun `The default value for text should be used`() {
        checkBoxDefault.text shouldBe ""
    }

    @Test
    fun `The default value for disable should be used`() {
        checkBoxDefault.isDisable shouldBe false
    }

    @Test
    fun `The default value for focusTraversable should be used`() {
        checkBoxDefault.isFocusTraversable shouldBe true
    }
}