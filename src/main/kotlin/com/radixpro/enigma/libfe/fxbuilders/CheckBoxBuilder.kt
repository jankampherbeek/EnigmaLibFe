/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.control.CheckBox

import javafx.geometry.Pos

/**
 * Builder for CheckBox. No default values.
 */
class CheckBoxBuilder {

    private var alignment: Pos? = null
    private var styleClass: String = ""
    private var selected = false

    fun setAlignment(alignment: Pos): CheckBoxBuilder {
        this.alignment = alignment
        return this
    }

    fun setStyleClass(styleClass: String): CheckBoxBuilder {
        this.styleClass = styleClass
        return this
    }

    fun setSelected(selected: Boolean): CheckBoxBuilder {
        this.selected = selected
        return this
    }

    fun build(): CheckBox {
        val checkBox = CheckBox()
        checkBox.isSelected = selected
        if (null != alignment) checkBox.alignment = alignment
        if (styleClass.isNotBlank()) checkBox.styleClass.add(styleClass)
        return checkBox
    }

}