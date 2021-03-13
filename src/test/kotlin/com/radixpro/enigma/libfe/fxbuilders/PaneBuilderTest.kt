/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.Label
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class PaneBuilderTest {

    private val prefWidth = 300.0
    private val prefHeight = 200.0
    private val styleClass = "paneStyle"
    private val children = arrayListOf<Node>(Button("a"), Label("b"))

    private val pane = PaneBuilder()
        .setPrefWidth(prefWidth)
        .setPrefHeight(prefHeight)
        .setStyleClass(styleClass)
        .setChildren(children).build()
    private val paneDefault = PaneBuilder().build()

    @Test
    fun `PaneBuilder should handle prefWidth correctly`() {
        pane.prefWidth shouldBe prefWidth
    }

    @Test
    fun `PaneBuilder should handle prefHeight correctly`() {
        pane.prefHeight shouldBe prefHeight
    }

    @Test
    fun `PaneBuilder should handle styleClass correctly`() {
        pane.styleClass[0] shouldBe styleClass
    }

    @Test
    fun `PaneBuilder should handle children correctly`() {
        pane.children shouldBe children
    }

    @Test
    fun `PaneBuilder should handle default prefWidth correctly`() {
        paneDefault.prefWidth shouldBe -1
    }

    @Test
    fun `PaneBuilder should handle default prefHeight correctly`() {
        paneDefault.prefHeight shouldBe -1
    }

    @Test
    fun `PaneBuilder should handle default styleClass correctly`() {
        paneDefault.styleClass.size shouldBe 0
    }

    @Test
    fun `PaneBuilder should handle default children correctly`() {
        paneDefault.children.size shouldBe 0
    }


}