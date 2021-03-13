/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import javafx.geometry.Insets
import org.junit.Test

class GridPaneBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 200.0
    private val prefWidth = 240.0
    private val padding = Insets(0.0)
    private val vGap = 3.0
    private val hGap = 6.0
    private val styleSheet = "gridStyleSheet"

    private val gridPane = GridPaneBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setPadding(padding)
        .setVGap(vGap)
        .setHGap(hGap)
        .setStyleSheet(styleSheet).build()
    private val gridPaneDefault = GridPaneBuilder().build()

    @Test
    fun `GridPaneBuilder should handle prefHeight correctly`() {
        gridPane.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `GridPaneBuilder should handle prefWidth correctly`() {
        gridPane.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `GridPaneBuilder should handle padding correctly`() {
        gridPane.padding shouldBe padding
    }

    @Test
    fun `GridPaneBuilder should handle vGap correctly`() {
        gridPane.vgap shouldBe vGap
    }

    @Test
    fun `GridPaneBuilder should handle hGap correctly`() {
        gridPane.hgap shouldBe hGap
    }

    @Test
    fun `GridPaneBuilder should handle styleSheet correctly`() {
        gridPane.stylesheets[1] shouldBe styleSheet
    }

    @Test
    fun `GridPaneBuilder should handle default prefHeight correctly`() {
        gridPaneDefault.prefHeight shouldBe -1
    }

    @Test
    fun `GridPaneBuilder should handle default prefWidth correctly`() {
        gridPaneDefault.prefWidth shouldBe -1
    }

    @Test
    fun `GridPaneBuilder should handle default padding correctly`() {
        gridPaneDefault.padding shouldBe Insets(0.0)
    }

    @Test
    fun `GridPaneBuilder should handle default vGap correctly`() {
        gridPaneDefault.vgap shouldBe 0.0
    }

    @Test
    fun `GridPaneBuilder should handle default hGap correctly`() {
        gridPaneDefault.hgap shouldBe 0.0
    }

    @Test
    fun `GridPaneBuilder should handle default styleSheet correctly`() {
        gridPaneDefault.stylesheets.size shouldBe 1
    }


}