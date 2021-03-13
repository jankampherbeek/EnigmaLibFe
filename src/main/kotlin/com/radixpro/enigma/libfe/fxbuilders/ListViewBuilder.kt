/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.ListView

/**
 * Builder for ListView. No defaults.
 */
class ListViewBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var styleClass: String = ""

    fun setPrefWidth(prefWidth: Double): ListViewBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setPrefHeight(prefHeight: Double): ListViewBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setStyleClass(styleClass: String): ListViewBuilder {
        this.styleClass = styleClass
        return this
    }

    fun build(): ListView<String> {
        val listView = ListView<String>()
        if (0.0 < prefHeight) listView.prefHeight = prefHeight
        if (0.0 < prefWidth) listView.prefWidth = prefWidth
        if (styleClass.isNotBlank()) listView.styleClass.add(styleClass)
        return listView
    }

}