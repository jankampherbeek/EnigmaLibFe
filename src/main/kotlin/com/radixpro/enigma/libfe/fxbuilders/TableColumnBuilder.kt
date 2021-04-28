/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.TableColumn

/**
 * Builder for TableColumn.<br/>
 * CellValueFactory needs to be defined separately.
 */
class TableColumnBuilder {

    private var text: String = ""
    private var editable = false
    private var resizable = true
    private var sortable = false
    private var visible = true

    /**
     * Text for column. Default "".
     */
    fun setText(text: String): TableColumnBuilder {
        this.text = text
        return this
    }

    /**
     * Indicates ic column is editable. Default false.
     */
    fun setEditable(editable: Boolean): TableColumnBuilder {
        this.editable = editable
        return this
    }

    /**
     * Indicates if column is resizable. Default false.
     */
    fun setResizable(resizable: Boolean): TableColumnBuilder {
        this.resizable = resizable
        return this
    }

    /**
     * Indiates if column is sortable. Default false.
     */
    fun setSortable(sortable: Boolean): TableColumnBuilder {
        this.sortable = sortable
        return this
    }

    /**
     * Indicates if column is visible. Default true.
     */
    fun setVisible(visible: Boolean): TableColumnBuilder {
        this.visible = visible
        return this
    }

    /**
     * Builds instance of TableColumn.
     */
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