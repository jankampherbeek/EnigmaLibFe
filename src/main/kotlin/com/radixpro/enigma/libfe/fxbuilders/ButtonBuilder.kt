/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.geometry.Insets
import javafx.scene.control.Button

/**
 * Builder for Button.
 * Defaults: <ul><li>text: ""</li><li>disabled: false</li><li>focusTraversable: false</li></ul>
 */
class ButtonBuilder {
    private var text = ""
    private var disabled = false
    private var focusTraversable = false
    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var padding = Insets(0.0)

    fun setText(text: String): ButtonBuilder {
        this.text = text
        return this
    }

    fun setPrefHeight(height: Double): ButtonBuilder {
        this.prefHeight = height
        return this
    }

    fun setPrefWidth(width: Double): ButtonBuilder {
        this.prefWidth = width
        return this
    }

    fun setPadding(padding: Insets): ButtonBuilder {
        this.padding = padding
        return this
    }

    fun setDisabled(disabled: Boolean): ButtonBuilder {
        this.disabled = disabled
        return this
    }

    fun setFocusTraversable(focusTraversable: Boolean): ButtonBuilder {
        this.focusTraversable = focusTraversable
        return this
    }

    fun build(): Button {
        val button = Button(text)
        if (padding != Insets(0.0)) button.padding = padding
        button.isDisable = disabled
        button.isFocusTraversable = focusTraversable
        if (prefHeight > 0.0) button.prefHeight = prefHeight
        if (prefWidth > 0.0) button.prefWidth = prefWidth
        return button
    }

}