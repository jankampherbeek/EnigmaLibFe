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
import javafx.geometry.Pos
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class TextFieldBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 20.0
    private val prefWidth = 100.0
    private val maxWidth = 120.0
    private val styleClass = "textFieldStyleClass"
    private val text = "text4TextField"
    private val promptText = "promptText4TextField"
    private val alignment = Pos.CENTER
    private val textField = TextFieldBuilder()
        .setText(text)
        .setPromptText(promptText)
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setMaxWidth(maxWidth)
        .setStyleClass(styleClass)
        .setAlignment(alignment).build()
    private val textFieldDefault = TextFieldBuilder().build()


    @Test
    fun `TextFieldBuilder should handle prefHeight correctly`() {
        textField.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `TextFieldBuilder should handle prefWidth correctly`() {
        textField.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `TextFieldBuilder should handle maxWidth correctly`() {
        textField.maxWidth shouldBe (maxWidth plusOrMinus margin)
    }

    @Test
    fun `TextFieldBuilder should handle styleClass correctly`() {
        textField.styleClass[3] shouldBe styleClass         // index 3 is used for styleclass JFoenix
    }

    @Test
    fun `TextFieldBuilder should handle text correctly`() {
        textField.text shouldBe text
    }

    @Test
    fun `TextFieldBuilder should handle promptText correctly`() {
        textField.promptText shouldBe promptText
    }

    @Test
    fun `TextFieldBuilder should handle alignment correctly`() {
        textField.alignment shouldBe alignment
    }

    @Test
    fun `TextFieldBuilder should handle default prefHeight correctly`() {
        textFieldDefault.prefHeight shouldBe -1
    }

    @Test
    fun `TextFieldBuilder should handle default prefWidth correctly`() {
        textFieldDefault.prefWidth shouldBe -1
    }

    @Test
    fun `TextFieldBuilder should handle default maxWidth correctly`() {
        textFieldDefault.maxWidth shouldBe -1
    }

    @Test
    fun `TextFieldBuilder should handle default styleClass correctly`() {
        textFieldDefault.styleClass.size shouldBe 3
    }

    @Test
    fun `TextFieldBuilder should handle default text correctly`() {
        textFieldDefault.text shouldBe ""
    }

    @Test
    fun `TextFieldBuilder should handle default promptText correctly`() {
        textFieldDefault.promptText shouldBe ""
    }

    @Test
    fun `TextFieldBuilder should handle default alignment correctly`() {
        textFieldDefault.alignment shouldBe Pos.CENTER_LEFT
    }

}