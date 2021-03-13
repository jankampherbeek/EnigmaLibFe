/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.geometry.Pos
import javafx.scene.control.TextField

/**
 * Builder for TextField. No defaults.
 */
class TextFieldBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var styleClass = ""
    private var text = ""
    private var promptText = ""
    private var alignment: Pos? = null

    fun setPrefHeight(prefHeight: Double): TextFieldBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setPrefWidth(prefWidth: Double): TextFieldBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setStyleClass(styleClass: String): TextFieldBuilder {
        this.styleClass = styleClass
        return this
    }

    fun setText(text: String): TextFieldBuilder {
        this.text = text
        return this
    }

    fun setPromptText(text: String): TextFieldBuilder {
        this.promptText = text
        return this
    }

    fun setAlignment(alignment: Pos): TextFieldBuilder {
        this.alignment = alignment
        return this
    }

    fun build(): TextField {
        val textField = TextField()
        if (prefHeight > 0.0) textField.prefHeight = prefHeight
        if (prefWidth > 0.0) textField.prefWidth = prefWidth
        if (styleClass.isNotEmpty()) textField.styleClass.add(styleClass)
        if (text.isNotEmpty()) textField.text = text
        if (promptText.isNotEmpty()) textField.promptText = promptText
        if (null != alignment) textField.alignment = alignment
        return textField
    }

}