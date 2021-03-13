/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.Button
import javafx.scene.control.ButtonBar

/**
 * Builder for Buttonbar. No specific defaults.
 */
class ButtonBarBuilder {

    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var buttons = arrayListOf<Button>()

    fun setPrefHeight(prefHeight: Double): ButtonBarBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setPrefWidth(prefWidth: Double): ButtonBarBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setButtons(buttons: ArrayList<Button>): ButtonBarBuilder {
        this.buttons = buttons
        return this
    }

    fun build(): ButtonBar {
        val buttonBar = ButtonBar()
        if (prefHeight > 0.0) buttonBar.prefHeight = prefHeight
        if (prefWidth > 0.0) buttonBar.prefWidth = prefWidth
        if (buttons.isNotEmpty()) buttonBar.buttons.addAll(buttons)
        return buttonBar
    }
}