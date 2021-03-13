/**
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */
package com.radixpro.enigma.libfe.fxbuilders

import javafx.geometry.Pos
import javafx.scene.control.Label

/**
 * Builder for a Label.<br/>
 * Default values: <ul><li>text: ""</li><li>visible: true</li></ul>
 */
class LabelBuilder {
    private var text = ""
    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var layoutX = 0.0
    private var layoutY = 0.0
    private var alignment: Pos? = null
    private var styleClass: String = ""
    private var visible = true

    fun setText(text: String): LabelBuilder {
        this.text = text
        return this
    }

    fun setVisible(visible: Boolean): LabelBuilder {
        this.visible = visible
        return this
    }

    fun setPrefWidth(prefWidth: Double): LabelBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setPrefHeight(prefHeight: Double): LabelBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setStyleClass(styleClass: String): LabelBuilder {
        this.styleClass = styleClass
        return this
    }

    fun setAlignment(alignment: Pos): LabelBuilder {
        this.alignment = alignment
        return this
    }

    fun build(): Label {
        val lblText: String = text
        val label = Label(lblText)
        label.isVisible = visible
        if (prefWidth > 0.0) label.prefWidth = prefWidth
        if (prefHeight > 0.0) label.prefHeight = prefHeight
        if (layoutX > 0.0) label.layoutX = layoutX
        if (layoutY > 0.0) label.layoutY = layoutY
        if (styleClass.isNotEmpty()) label.styleClass.add(styleClass)
        if (null != alignment) label.alignment = alignment
        return label
    }

}