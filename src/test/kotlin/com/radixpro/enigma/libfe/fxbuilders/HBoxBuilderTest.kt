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
import javafx.scene.control.Button
import javafx.scene.control.Label
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class HBoxBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 150.0
    private val prefWidth = 200.0
    private val spacing = 3.3
    private val padding = Insets(1.0, 2.0, 1.0, 2.0)
    private val child1 = Label("a")
    private val child2 = Button("b")
    private val hBox = HBoxBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setSpacing(spacing)
        .setPadding(padding)
        .setChildren(child1, child2).build()
    private val hBoxDefault = HBoxBuilder().build()

    @Test
    fun `HBoxBuilder should handle prefWidth correctly`() {
        hBox.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `HBoxBuilder should handle prefHeight correctly`() {
        hBox.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `HBoxBuilder should handle spacing correctly`() {
        hBox.spacing shouldBe (spacing plusOrMinus margin)
    }

    @Test
    fun `HBoxBuilder should handle padding correctly`() {
        hBox.padding shouldBe padding
    }

    @Test
    fun `HBoxBuilder should handle children correctly`() {
        hBox.children.size shouldBe 2
        hBox.children[1] shouldBe child2
    }

    @Test
    fun `HBoxBuilder should handle default prefWidth correctly`() {
        hBoxDefault.prefWidth shouldBe -1
    }

    @Test
    fun `HBoxBuilder should handle default prefHeight correctly`() {
        hBoxDefault.prefHeight shouldBe -1
    }


    @Test
    fun `HBoxBuilder should handle default spacing correctly`() {
        println(hBoxDefault.spacing)
        hBoxDefault.spacing shouldBe 0.0
    }

    @Test
    fun `HBoxBuilder should handle default padding correctly`() {
        hBoxDefault.padding shouldBe Insets(0.0)
    }

    @Test
    fun `HBoxBuilder should handle default children correctly`() {
        hBoxDefault.children.size shouldBe 0
    }

}