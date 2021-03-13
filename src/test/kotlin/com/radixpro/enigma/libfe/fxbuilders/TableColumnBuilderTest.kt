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
class TableColumnBuilderTest {

    private val text = "columnText"
    private val editable = true
    private val resizable = false
    private val sortable = true
    private val visible = false
    private val tableColumn = TableColumnBuilder()
        .setText(text)
        .setEditable(editable)
        .setResizable(resizable)
        .setSortable(sortable)
        .setVisible(visible).build()
    private val tableColumnDefault = TableColumnBuilder().build()

    @Test
    fun `TableBuilder should handle text correctly`() {
        tableColumn.text shouldBe text
    }

    @Test
    fun `TableBuilder should handle editable correctly`() {
        tableColumn.isEditable shouldBe editable
    }

    @Test
    fun `TableBuilder should handle resizable correctly`() {
        tableColumn.isResizable shouldBe resizable
    }

    @Test
    fun `TableBuilder should handle sortable correctly`() {
        tableColumn.isSortable shouldBe sortable
    }

    @Test
    fun `TableBuilder should handle visible correctly`() {
        tableColumn.isVisible shouldBe visible
    }

    @Test
    fun `TableBuilder should handle default text correctly`() {
        tableColumnDefault.text shouldBe ""
    }

    @Test
    fun `TableBuilder should handle default editable correctly`() {
        tableColumnDefault.isEditable shouldBe false
    }

    @Test
    fun `TableBuilder should handle default resizable correctly`() {
        tableColumnDefault.isResizable shouldBe true
    }

    @Test
    fun `TableBuilder should handle default sortable correctly`() {
        tableColumnDefault.isSortable shouldBe false
    }

    @Test
    fun `TableBuilder should handle default visible correctly`() {
        tableColumnDefault.isVisible shouldBe true
    }




}