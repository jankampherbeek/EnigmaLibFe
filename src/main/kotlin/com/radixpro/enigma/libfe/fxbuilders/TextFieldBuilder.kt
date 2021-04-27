/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXTextField
import javafx.geometry.Pos

/**
 * Builder for a textfield. Returns an instance of JFTextField.
 */
class TextFieldBuilder {

    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var maxWidth = 0.0
    private var styleClass = ""
    private var text = ""
    private var promptText = ""
    private var alignment: Pos? = null

    /**
     * prefHeight is optional.
     */
    fun setPrefHeight(prefHeight: Double): TextFieldBuilder {
        this.prefHeight = prefHeight
        return this
    }


    /**
     * prefWidth is optional.
     */
    fun setPrefWidth(prefWidth: Double): TextFieldBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * maxWidth is optional.
     */
    fun setMaxWidth(maxWidth: Double): TextFieldBuilder {
        this.maxWidth = maxWidth
        return this
    }

    /**
     * style thtat possibly overrules existing styles. Optional.
     */
    fun setStyleClass(styleClass: String): TextFieldBuilder {
        this.styleClass = styleClass
        return this
    }

    /**
     * Text to be entered by default in textfield. Optional, default empty.
     */
    fun setText(text: String): TextFieldBuilder {
        this.text = text
        return this
    }

    /**
     * Text to show as a prompt in textfield. Optional, default empty.
     */
    fun setPromptText(text: String): TextFieldBuilder {
        this.promptText = text
        return this
    }

    /**
     * Alignment for textfield. Optional.
     */
    fun setAlignment(alignment: Pos): TextFieldBuilder {
        this.alignment = alignment
        return this
    }

    /**
     * Build textfield. Returns an instance of JFXTextfield.
     */
    fun build(): JFXTextField {
        val textField = JFXTextField()
        if (prefHeight > 0.0) textField.prefHeight = prefHeight
        if (prefWidth > 0.0) textField.prefWidth = prefWidth
        if (maxWidth > 0.0) textField.maxWidth = maxWidth
        if (styleClass.isNotEmpty()) textField.styleClass.add(styleClass)
        if (text.isNotEmpty()) textField.text = text
        if (promptText.isNotEmpty()) textField.promptText = promptText
        if (null != alignment) textField.alignment = alignment
        return textField
    }

}