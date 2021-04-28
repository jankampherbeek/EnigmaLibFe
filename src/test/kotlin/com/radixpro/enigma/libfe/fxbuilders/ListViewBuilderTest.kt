/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXTooltip
import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.scene.control.SelectionMode
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class ListViewBuilderTest {

    private val prefWidth = 160.0
    private val prefHeight = 240.0
    private val verticalGap =  12.0
    private val tooltip = JFXTooltip("tooltip")
    private val showTooltip = true
    private val selectionMode = SelectionMode.SINGLE
    private val styleClass = "listViewStyle"

    private val listView = ListViewBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setSelectionMode(selectionMode)
        .setTooltip(tooltip)
        .setShowTooltip(showTooltip)
        .setVerticalGap(verticalGap)
        .setStyleClass(styleClass).build()
    private val listViewDefault = ListViewBuilder().build()

    @Test
    fun `ListViewBuilder should handle prefWidth correctly`() {
        listView.prefWidth shouldBe prefWidth
    }

    @Test
    fun `ListViewBuilder should handle prefHeight correctly`() {
        listView.prefHeight shouldBe prefHeight
    }

    @Test
    fun `ListViewBuilder should handle vertical gap correctly`() {
        listView.verticalGap shouldBe verticalGap
    }

    @Test
    fun `ListViewBuilder should handle tooltip correctly`() {
        listView.tooltip shouldBe tooltip
    }

    @Test
    fun `ListViewBuilder should handle showTooltip correctly`() {
        listView.isShowTooltip shouldBe showTooltip
    }

    @Test
    fun `ListViewBuilder should handle selectionMode correctly`() {
        listView.selectionModel.selectionMode shouldBe selectionMode
    }

    @Test
    fun `ListViewBuilder should handle styleClass correctly`() {
        listView.styleClass[2] shouldBe styleClass
    }

    @Test
    fun `ListViewBuilder should handle default prefWidth correctly`() {
        listViewDefault.prefWidth shouldBe -1
    }

    @Test
    fun `ListViewBuilder should handle default prefHeight correctly`() {
        listViewDefault.prefHeight shouldBe -1
    }

    @Test
    fun `ListViewBuilder should handle default vertical gap correctly`() {
        listViewDefault.verticalGap shouldBe 0.0
    }


    @Test
    fun `ListViewBuilder should handle default tooltip correctly`() {
        listViewDefault.tooltip shouldBe null
    }

    @Test
    fun `ListViewBuilder should handle default showTooltip correctly`() {
        listViewDefault.isShowTooltip shouldBe false
    }

    @Test
    fun `ListViewBuilder should handle defaultselectionMode correctly`() {
        listViewDefault.selectionModel.selectionMode shouldBe SelectionMode.MULTIPLE
    }

    @Test
    fun `ListViewBuilder should handle default styleClass correctly`() {
        listViewDefault.styleClass.size shouldBe 2
    }


}