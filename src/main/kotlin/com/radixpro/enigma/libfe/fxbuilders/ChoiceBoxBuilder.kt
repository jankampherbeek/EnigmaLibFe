/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.ChoiceBox

import javafx.collections.ObservableList

/**
 * Builder for ChoiceBox. Default value for disabled: false.
 */
class ChoiceBoxBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var styleClass: String = ""
    private var items: ObservableList<String>? = null
    private var disabled = false

    fun setPrefHeight(prefHeight: Double): ChoiceBoxBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setPrefWidth(prefWidth: Double): ChoiceBoxBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setStyleClass(styleClass: String): ChoiceBoxBuilder {
        this.styleClass = styleClass
        return this
    }

    fun setItems(items: ObservableList<String>): ChoiceBoxBuilder {
        this.items = items
        return this
    }

    fun setDisabled(disabled: Boolean): ChoiceBoxBuilder {
        this.disabled = disabled
        return this
    }

    fun build(): ChoiceBox<*> {
        val choiceBox: ChoiceBox<String> = ChoiceBox<String>()
        choiceBox.isDisable = disabled
        if (prefWidth > 0.0) choiceBox.prefWidth = prefWidth
        if (prefHeight > 0.0) choiceBox.prefHeight = prefHeight
        if (styleClass.isNotEmpty()) choiceBox.styleClass.add(styleClass)
        if (!items.isNullOrEmpty()) choiceBox.items = items
        return choiceBox
    }


}