/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.geometry.Pos
import junit.framework.TestCase
import org.junit.runner.RunWith
import org.junit.Test

@RunWith(JfxTestRunner::class)
class CheckBoxBuilderTest : TestCase() {

    private val alignment = Pos.TOP_LEFT
    private val styleClass = "checkb0xStyle"
    private val selected = false
    private val checkBox = CheckBoxBuilder()
        .setAlignment(alignment)
        .setStyleClass(styleClass)
        .setSelected(selected).build()
    private val checkBoxDefault = CheckBoxBuilder().build()

    @Test
    fun `CheckBoxBuilder should handle alignment correctly`() {
        checkBox.alignment shouldBe alignment
    }

    @Test
    fun `CheckBoxBuilder should handle styleClass correctly`() {
        checkBox.styleClass[1] shouldBe styleClass
    }

    @Test
    fun `CheckBoxBuilder should handle selected correctly`() {
        checkBox.isSelected shouldBe selected
    }

    @Test
    fun `CheckBoxBuilder should handle default alignment correctly`() {
        checkBoxDefault.alignment shouldBe Pos.CENTER_LEFT
    }

    @Test
    fun `CheckBoxBuilder should handle default styleClass correctly`() {
        checkBoxDefault.styleClass.size shouldBe 1
    }

    @Test
    fun `CheckBoxBuilder should handle default selected correctly`() {
        checkBoxDefault.isSelected shouldBe false
    }
}