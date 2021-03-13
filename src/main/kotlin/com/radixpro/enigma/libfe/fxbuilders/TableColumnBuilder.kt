/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.TableColumn

/**
 * Builder for TableColumn.
 * Default values:
 * <ul><li>text: ""</li><li>editable: false</li><li>resizable: true</li><li>sortable: false</li>
 * <li>visible: true</li></ul>
 * CellValueFactory needs to be defined separately.
 */
class TableColumnBuilder {

    private var text: String = ""
    private var editable = false
    private var resizable = true
    private var sortable = false
    private var visible = true

    fun setText(text: String): TableColumnBuilder {
        this.text = text
        return this
    }

    fun setEditable(editable: Boolean): TableColumnBuilder {
        this.editable = editable
        return this
    }

    fun setResizable(resizable: Boolean): TableColumnBuilder {
        this.resizable = resizable
        return this
    }

    fun setSortable(sortable: Boolean): TableColumnBuilder {
        this.sortable = sortable
        return this
    }

    fun setVisible(visible: Boolean): TableColumnBuilder {
        this.visible = visible
        return this
    }

    fun build(): TableColumn<*, *> {
        val tableColumn = TableColumn<Any, String>()
        tableColumn.isEditable = editable
        tableColumn.isResizable = resizable
        tableColumn.isSortable = sortable
        tableColumn.isVisible = visible
        if (text.isNotBlank()) tableColumn.text = text
        return tableColumn
    }

}