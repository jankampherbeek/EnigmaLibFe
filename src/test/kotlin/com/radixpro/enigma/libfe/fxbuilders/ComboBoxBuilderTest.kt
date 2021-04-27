/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
internal class ComboBoxBuilderTest {

    private val prefHeight = 130.0
    private val prefWidth = 60.0
    private val disable = true
    private val focusTraversable = false
    private val style = "myStyle"
    private val item1 = "Item1"
    private val item2 = "Item2"
    private val itemList = listOf(item1, item2)
    private val comboBox = ComboBoxBuilder().setPrefHeight(prefHeight).setPrefWidth(prefWidth).setDisable(disable)
        .setFocusTraversable(focusTraversable).setStyleClass(style).setItems(item1, item2).build()
    private val comboBoxItemsInList = ComboBoxBuilder().setItems(itemList).build()
    private val defaultComboBox = ComboBoxBuilder().build()

    @Test
    fun `Defined value for prefHeight should be correct`() {
        comboBox.prefHeight shouldBe prefHeight
    }

    @Test
    fun `Defined value for prefWidth should be correct`() {
        comboBox.prefWidth shouldBe prefWidth
    }

    @Test
    fun `Defined value for styleClass should be correct`() {
        comboBox.styleClass[3] shouldBe style
    }

    @Test
    fun `Values for separately defined items should be correct`() {
        comboBox.items.size shouldBe 2
        comboBox.items[1] shouldBe "Item2"
    }

    @Test
    fun `Defined values for list with items should be correct`() {
        comboBoxItemsInList.items.size shouldBe 2
        comboBoxItemsInList.items[1] shouldBe "Item2"
    }

    @Test
    fun `Defined value for disable should be correct`() {
        comboBox.isDisable shouldBe disable
    }

    @Test
    fun `Defined value for focusTraversable should be correct`() {
        comboBox.isFocusTraversable shouldBe focusTraversable
    }


    @Test
    fun `Default value for prefHeight should be correct`() {
        defaultComboBox.prefHeight shouldBe -1
    }

    @Test
    fun `Default value for prefWidth should be correct`() {
        defaultComboBox.prefWidth shouldBe -1
    }

    @Test
    fun `Default value for styleClass should be correct`() {
        defaultComboBox.styleClass.size shouldBe 3
    }

    @Test
    fun `Default values for non defined items should be correct`() {
        defaultComboBox.items.size shouldBe 0
    }

    @Test
    fun `Default value for disable should be correct`() {
        defaultComboBox.isDisable shouldBe false
    }

    @Test
    fun `Default value for focusTraversable should be correct`() {
        defaultComboBox.isFocusTraversable shouldBe true
    }
}