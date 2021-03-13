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
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class ChoiceBoxBuilderTest {

    private val margin = 0.00000001
    private val prefHeight = 200.0
    private val prefWidth = 300.0
    private val styleClass = "ChoiceBoxStyle"
    private val disabled = false
    private val itemTexts = arrayListOf("a", "b")
    private var items : ObservableList<String> = FXCollections.observableArrayList(itemTexts)

    private val choiceBox = ChoiceBoxBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setStyleClass(styleClass)
        .setDisabled(disabled).setItems(items).build()
    private val choiceBoxDefault = ChoiceBoxBuilder().build()

    @Test
    fun `ChoiceBoxBuilder should handle prefHeight correctly`() {
        choiceBox.prefHeight shouldBe (prefHeight plusOrMinus margin)
    }

    @Test
    fun `ChoiceBoxBuilder should handle prefWidth correctly`() {
        choiceBox.prefWidth shouldBe (prefWidth plusOrMinus margin)
    }

    @Test
    fun `ChoiceBoxBuilder should handle styleClass correctly`() {
        choiceBox.styleClass[1] shouldBe styleClass
    }

    @Test
    fun `ChoiceBoxBuilder should handle items correctly`() {
        choiceBox.items shouldBe items
    }

    @Test
    fun `ChoiceBoxBuilder should handle disabled correctly`() {
        choiceBox.isDisable shouldBe disabled
    }

    @Test
    fun `ChoiceBoxBuilder should handle default prefHeight correctly`() {
        choiceBoxDefault.prefHeight shouldBe -1
    }

    @Test
    fun `ChoiceBoxBuilder should handle default prefWidth correctly`() {
        choiceBoxDefault.prefWidth shouldBe  -1
    }

    @Test
    fun `ChoiceBoxBuilder should handle default styleClass correctly`() {
        choiceBoxDefault.styleClass.size shouldBe 1
    }

    @Test
    fun `ChoiceBoxBuilder should handle default items correctly`() {
        choiceBoxDefault.items.size shouldBe 0
    }

    @Test
    fun `ChoiceBoxBuilder should handle default disabled correctly`() {
        choiceBoxDefault.isDisable shouldBe false
    }
}