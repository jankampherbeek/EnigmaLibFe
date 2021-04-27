/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXButton
import javafx.scene.control.ButtonBar

/**
 * Builder for Buttonbar. No specific defaults.
 */
class ButtonBarBuilder {

    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var buttons = arrayListOf<JFXButton>()

    /**
     * Preferred height. Optional.
     */
    fun setPrefHeight(prefHeight: Double): ButtonBarBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * Preferred width. Optional.
     */
    fun setPrefWidth(prefWidth: Double): ButtonBarBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * Buttons to add. Buttons should be instances of JFXButton.
     */
    fun setButtons(vararg buttons: JFXButton): ButtonBarBuilder {
        this.buttons.addAll(buttons)
        return this
    }

    /**
     * Bulds ButtonBar. (No JFoenix variant available).
     */
    fun build(): ButtonBar {
        val buttonBar = ButtonBar()
        if (prefHeight > 0.0) buttonBar.prefHeight = prefHeight
        if (prefWidth > 0.0) buttonBar.prefWidth = prefWidth
        if (buttons.isNotEmpty()) buttonBar.buttons.addAll(buttons)
        return buttonBar
    }
}