/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXButton
import javafx.geometry.Insets
import javafx.geometry.Pos

/**
 * Builder for Button. Returns instance of JFXButton.<br/>
 * Defaults: <ul><li>text: ""</li><li>disabled: false</li><li>focusTraversable: false</li></ul>
 */
class ButtonBuilder {
    private var text = ""
    private var disable = false
    private var focusTraversable = false
    private var alignment: Pos? = null
    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var padding = Insets(0.0)

    /**
     * Define text to be shown on button. Default empty String.
     */
    fun setText(text: String): ButtonBuilder {
        this.text = text
        return this
    }

    /**
     * Define prefHeight for button. Optional: defaults to standard height for a button.
     */
    fun setPrefHeight(height: Double): ButtonBuilder {
        this.prefHeight = height
        return this
    }

    /**
     * Define prefWidth for button. Optional: defaults to standard width for a button.
     */
    fun setPrefWidth(width: Double): ButtonBuilder {
        this.prefWidth = width
        return this
    }

    /**
     * Define alignment for button. Optional: defaults to CENTER_LEFT.
     */
    fun setAlignment(alignment: Pos): ButtonBuilder {
        this.alignment = alignment
        return this
    }

    /**
     * Define padding for button. Optional: defaults to Insets(0, 0)
     */
    fun setPadding(padding: Insets): ButtonBuilder {
        this.padding = padding
        return this
    }

    /**
     * Define disable for button. Optional: defaults to false.
     */
    fun setDisabled(disable: Boolean): ButtonBuilder {
        this.disable = disable
        return this
    }

    /**
     * Define focusTraversable for button. Optional: defaults to true.
     */
    fun setFocusTraversable(focusTraversable: Boolean): ButtonBuilder {
        this.focusTraversable = focusTraversable
        return this
    }

    /**
     * Build button. Returns instance of JFXButton.
     */
    fun build(): JFXButton {
        val button = JFXButton(text)
        if (padding != Insets(0.0)) button.padding = padding
        if (null != alignment) button.alignment = alignment
        button.isDisable = disable
        button.isFocusTraversable = focusTraversable
        if (prefHeight > 0.0) button.prefHeight = prefHeight
        if (prefWidth > 0.0) button.prefWidth = prefWidth
        return button
    }

}