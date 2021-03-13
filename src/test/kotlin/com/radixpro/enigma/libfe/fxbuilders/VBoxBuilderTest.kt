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
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.Label
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class VBoxBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 80.0
    private val prefWidth = 160.0
    private val padding = Insets(6.0)
    private val children: ArrayList<Node> = arrayListOf(Label("x"), Button("y"))
    private val style = "myStyle"
    private val vBox = VBoxBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setPadding(padding)
        .setChildren(children)
        .setStyle(style).build()
    private val vBoxDefault = VBoxBuilder().build()

    @Test
    fun `VBoxBuilder should handle prefWidth correctly`() {
        vBox.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `VBoxBuilder should handle prefHeight correctly`() {
        vBox.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `VBoxBuilder should handle padding correctly`() {
        vBox.padding shouldBe (padding)
    }

    @Test
    fun `VBoxBuilder should handle children correctly`() {
        vBox.children shouldBe children
    }

    @Test
    fun `VBoxBuilder should handle style correctly`() {
        vBox.style shouldBe style
    }

    @Test
    fun `VBoxBuilder should handle default prefWidth correctly`() {
        vBoxDefault.prefWidth shouldBe -1
    }

    @Test
    fun `VBoxBuilder should handle default prefHeight correctly`() {
        vBoxDefault.prefHeight shouldBe -1
    }

    @Test
    fun `VBoxBuilder should handle default padding correctly`() {
        vBoxDefault.padding shouldBe Insets(0.0)
    }

    @Test
    fun `VBoxBuilder should handle default children correctly`() {
        vBoxDefault.children.size shouldBe 0
    }

    @Test
    fun `VBoxBuilder should handle default style correctly`() {
        vBoxDefault.style shouldBe ""
    }
}