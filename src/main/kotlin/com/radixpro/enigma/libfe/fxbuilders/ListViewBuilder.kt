/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXListView
import com.jfoenix.controls.JFXTooltip
import javafx.scene.control.SelectionMode

/**
 * Builder for ListView. Returns instance of JFXListView.
 */
class ListViewBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var styleClass: String = ""
    private var selectionMode = SelectionMode.MULTIPLE
    private var tooltip = JFXTooltip("")
    private var showTooltip = false
    private var verticalGap = 0.0

    /**
     * PrefWidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): ListViewBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * PrefHeight. Optional.
     */
    fun setPrefHeight(prefHeight: Double): ListViewBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * SelectionMode. Defaults to SelectionMode.MULTIPLE.
     */
    fun setSelectionMode(mode: SelectionMode): ListViewBuilder {
       this.selectionMode = mode
       return this
    }

    /**
     * Tooltip. Optional.
     */
    fun setTooltip(tooltip: JFXTooltip): ListViewBuilder {
        this.tooltip = tooltip
        return this
    }

    /**
     * ShowTooltop. Defaults to false.
     */
    fun setShowTooltip(show: Boolean): ListViewBuilder {
        this.showTooltip = show
        return this
    }

    /**
     * Vertical gap between cells. Optional.
     */
    fun setVerticalGap(vGap: Double): ListViewBuilder {
        this.verticalGap = vGap
        return this
    }

    /**
     * Styleclass, is used after rocessing other styles. Optional.
     */
    fun setStyleClass(styleClass: String): ListViewBuilder {
        this.styleClass = styleClass
        return this
    }

    fun build(): JFXListView<String> {
        val listView = JFXListView<String>()
        listView.isShowTooltip = showTooltip
        if (tooltip.text != "") listView.tooltip = tooltip
        listView.selectionModel.selectionMode = selectionMode
        if (0.0 < verticalGap) listView.verticalGap = verticalGap
        if (0.0 < prefHeight) listView.prefHeight = prefHeight
        if (0.0 < prefWidth) listView.prefWidth = prefWidth
        if (styleClass.isNotBlank()) listView.styleClass.add(styleClass)
        return listView
    }

}