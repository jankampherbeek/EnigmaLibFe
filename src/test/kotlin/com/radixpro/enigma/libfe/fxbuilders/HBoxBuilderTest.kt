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
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.Label
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class HBoxBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 150.0
    private val prefWidth = 200.0
    private val children: ArrayList<Node> = arrayListOf(Label("a"), Button("b"))
    private val hBox = HBoxBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setChildren(children).build()
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
    fun `HBoxBuilder should handle children correctly`() {
        hBox.children shouldBe children
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
    fun `HBoxBuilder should handle default children correctly`() {
        hBoxDefault.children.size shouldBe 0
    }

}