/**
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */
package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXTooltip
import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import javafx.geometry.Pos
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class LabelBuilderTest {

    private val text = "my text"
    private val visible = true
    private val prefWidth = 33.33
    private val prefHeight = 44.44
    private val styleClass = "my styleclass"
    private val tooltip = JFXTooltip("tooltip")
    private val alignment = Pos.TOP_LEFT
    private val margin = 0.00000001
    private val label = LabelBuilder().setText(text)
        .setVisible(visible)
        .setPrefWidth(prefWidth)
        .setPrefHeight(prefHeight)
        .setTooltip(tooltip)
        .setStyleClass(styleClass)
        .setAlignment(alignment).build()
    private val labelDefault = LabelBuilder().build()

    @Test
    fun `LabelBuilder should handle text correctly`() {
        label.text shouldBe text
    }

    @Test
    fun `LabelBuilder should handle visibility correctly`() {
        label.isVisible shouldBe visible
    }

    @Test
    fun `LabelBuilder should handle prefWidth correctly`() {
        label.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `LabelBuilder should handle prefHeight correctly`() {
        label.prefHeight shouldBe prefHeight
    }

    @Test
    fun `LabelBuilder should handle tooltip correctly`() {
        label.tooltip shouldBe tooltip
    }

    @Test
    fun `LabelBuilder should handle styleClass correctly`() {
        label.styleClass[1]  shouldBe styleClass
    }

    @Test
    fun `LabelBuilder should handle alignment correctly`() {
        label.alignment shouldBe alignment
    }

    @Test
    fun `LabelBuilder should handle default text correctly`() {
        labelDefault.text shouldBe ""
    }

    @Test
    fun `LabelBuilder should handle default visibility correctly`() {
        labelDefault.isVisible shouldBe true
    }

    @Test
    fun `LabelBuilder should handle default tooltip correctly`() {
        labelDefault.tooltip shouldBe null
    }

    @Test
    fun `LabelBuilder should handle default prefWidth correctly`() {
        labelDefault.prefWidth shouldBe (-1.0 plusOrMinus margin)
    }

    @Test
    fun `LabelBuilder should handle default prefHeight correctly`() {
        labelDefault.prefHeight shouldBe (-1.0 plusOrMinus margin)
    }

    @Test
    fun `LabelBuilder should handle default styleClass correctly`() {
        labelDefault.styleClass.size shouldBe 1  // array with only name for label
    }

    @Test
    fun `LabelBuilder should handle default alignment correctly`() {
        labelDefault.alignment shouldBe Pos.CENTER_LEFT
    }




}