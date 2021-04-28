/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class TableViewBuilderTest {

    private val prefHeight = 240.0
    private val prefWidth = 120.0
    private val editable = true
    private val visible = false
    private val tableView = TableViewBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setEditable(editable)
        .setVisible(visible).build()
    private val tableViewDefault = TableViewBuilder().build()

    @Test
    fun `TableViewBuilder should handle prefHeight correctly`() {
        tableView.prefHeight shouldBe prefHeight
    }

    @Test
    fun `TableViewBuilder should handle prefWidth correctly`() {
        tableView.prefWidth shouldBe prefWidth
    }

    @Test
    fun `TableViewBuilder should handle editable correctly`() {
        tableView.isEditable shouldBe editable
    }

    @Test
    fun `TableViewBuilder should handle visible correctly`() {
        tableView.isVisible shouldBe visible
    }

    @Test
    fun `TableViewBuilder should handle default prefHeight correctly`() {
        tableViewDefault.prefHeight shouldBe -1
    }

    @Test
    fun `TableViewBuilder should handle default prefWidth correctly`() {
        tableViewDefault.prefWidth shouldBe -1
    }

    @Test
    fun `TableViewBuilder should handle default editable correctly`() {
        tableViewDefault.isEditable shouldBe false
    }

    @Test
    fun `TableViewBuilder should handle default visible correctly`() {
        tableViewDefault.isVisible shouldBe true
    }


}