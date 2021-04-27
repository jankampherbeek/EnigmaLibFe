/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXComboBox


/**
 * Builder for ComboBox. Returns instance of JFXComboBox.
 */
class ComboBoxBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var styleClass: String = ""
    private var items= mutableListOf<String>()
    private var disable = false
    private var focusTraversable = true

    fun setPrefHeight(prefHeight: Double): ComboBoxBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setPrefWidth(prefWidth: Double): ComboBoxBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setStyleClass(styleClass: String): ComboBoxBuilder {
        this.styleClass = styleClass
        return this
    }

    fun setItems(vararg items: String): ComboBoxBuilder {
        this.items.addAll(items)
        return this
    }

    fun setItems(items: List<String>): ComboBoxBuilder {
        this.items.addAll(items)
        return this
    }

    fun setDisable(disable: Boolean): ComboBoxBuilder {
        this.disable = disable
        return this
    }

    fun setFocusTraversable(focusTraversable: Boolean): ComboBoxBuilder {
        this.focusTraversable = focusTraversable
        return this
    }

    fun build(): JFXComboBox<String> {
        val comboBox = JFXComboBox<String>()
        comboBox.isDisable = disable
        comboBox.isFocusTraversable = focusTraversable
        if (prefWidth > 0.0) comboBox.prefWidth = prefWidth
        if (prefHeight > 0.0) comboBox.prefHeight = prefHeight
        if (styleClass.isNotEmpty()) comboBox.styleClass.add(styleClass)
        comboBox.items.clear()
        comboBox.items.addAll(items)
        return comboBox
    }
}

