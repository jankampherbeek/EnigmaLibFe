/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.TableView

/**
 * Builder for Tableview. Default values: <ul><li>editable: false</li><li>visible: true</li></ul>
 */
class TableViewBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var editable = false
    private var visible = true

    /**
     * PrefHeight. Optional.
     */
    fun setPrefHeight(prefHeight: Double): TableViewBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * PrefWidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): TableViewBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * Indicates if tableview is editable. Default false.
     */
    fun setEditable(editable: Boolean): TableViewBuilder {
        this.editable = editable
        return this
    }

    /**
     * Indicates it tableView is visible. Default true.
     */
    fun setVisible(visible: Boolean): TableViewBuilder {
        this.visible = visible
        return this
    }

    /**
     * Builds instance of TableView.
     */
    fun build(): TableView<Any> {
        val tableView = TableView<Any>()
        tableView.isEditable = editable
        tableView.isVisible = visible
        if (prefHeight > 0.0) tableView.prefHeight = prefHeight
        if (prefWidth > 0.0) tableView.prefWidth = prefWidth
        return tableView
    }


}