/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXButton
import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class ButtonBarBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 24.0
    private val prefWidth = 200.0
    private val buttonA = JFXButton("a")
    private val buttonB = JFXButton("b")
    private val buttonBar = ButtonBarBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setButtons(buttonA, buttonB).build()
    private val buttonBarDefault = ButtonBarBuilder().build()

    @Test
    fun `ButtonBarBuilder should handle prefHeight correctly`() {
        buttonBar.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `ButtonBarBuilder should handle prefWidth correctly`() {
        buttonBar.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `ButtonBarBuilder should handle adding buttons correctly`() {
        buttonBar.buttons[0] shouldBe buttonA
        buttonBar.buttons.size shouldBe 2
    }

    @Test
    fun `ButtonBarBuilder should handle default prefHeight correctly`() {
        buttonBarDefault.prefHeight shouldBe -1
    }

    @Test
    fun `ButtonBarBuilder should handle default prefWidth correctly`() {
        buttonBarDefault.prefWidth shouldBe -1
    }

    @Test
    fun `ButtonBarBuilder should handle default for adding buttons correctly`() {
        buttonBarDefault.buttons.size shouldBe 0
    }

}