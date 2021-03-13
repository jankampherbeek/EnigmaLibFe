/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import javafx.geometry.Insets
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class ButtonBuilderTest {

    private val text = "button text"
    private val prefHeight = 50.0
    private val prefWidth = 150.0
    private val padding = Insets(6.0)
    private val disabled = false
    private val focusTraversable = true
    private val margin = 0.00000001
    private val button = ButtonBuilder()
        .setText(text)
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setPadding(padding)
        .setDisabled(disabled)
        .setFocusTraversable(focusTraversable).build()
    private val buttonDefault = ButtonBuilder().build()

    @Test
    fun `ButtonBuilder should handle text correctly`() {
        button.text shouldBe text
    }

    @Test
    fun `ButtonBuilder should handle prefHeight correctly`() {
        button.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `ButtonBuilder should handle prefWidth correctly`() {
        button.prefWidth shouldBe prefWidth
    }

    @Test
    fun `ButtonBuilder should handle padding correctly`() {
        button.padding shouldBe padding
    }

    @Test
    fun `ButtonBuilder should handle disabled correctly`() {
        button.isDisabled shouldBe disabled
    }

    @Test
    fun `ButtonBuilder should handle focusTraversable correctly`() {
        button.isFocusTraversable shouldBe focusTraversable
    }

    @Test
    fun `ButtonBuilder should handle default text correctly`() {
        buttonDefault.text shouldBe ""
    }

    @Test
    fun `ButtonBuilder should handle default prefHeight correctly`() {
        buttonDefault.prefHeight shouldBe -1.0
    }

    @Test
    fun `ButtonBuilder should handle default prefWidth correctly`() {
        buttonDefault.prefWidth shouldBe -1.0
    }

    @Test
    fun `ButtonBuilder should handle default padding correctly`() {
        buttonDefault.padding shouldBe Insets(0.0)
    }

    @Test
    fun `ButtonBuilder should handle default disabled correctly`() {
        buttonDefault.isDisabled shouldBe false
    }

    @Test
    fun `ButtonBuilder should handle default focusTraversable correctly`() {
        buttonDefault.isFocusTraversable shouldBe false
    }
}