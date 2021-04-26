/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXCheckBox

import javafx.geometry.Pos
import javafx.scene.paint.Color

/**
 * Builder for CheckBox. No default values.
 */
class CheckBoxBuilder {

    private val colorChecked = Color.STEELBLUE
    private var align: Pos? = null
    private var styleClass = ""
    private var text = ""
    private var selected = false
    private var focusTraversable = true
    private var disable = false

    fun setAlignment(align: Pos): CheckBoxBuilder {
        this.align = align
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

    fun setFocusTraversable(focusTrav: Boolean): CheckBoxBuilder {
        this.focusTraversable = focusTrav
        return this
    }

    fun setDisable(disable: Boolean): CheckBoxBuilder {
        this.disable = disable
        return this
    }

    fun setText(text: String): CheckBoxBuilder {
        this.text = text
        return this
    }

    fun build(): JFXCheckBox {
        val checkBox = JFXCheckBox()
        checkBox.text = text
        checkBox.checkedColor = colorChecked
        checkBox.isFocusTraversable = focusTraversable
        checkBox.isDisable = disable
        checkBox.isSelected = selected
        if (null != align) checkBox.alignment = align
        if (styleClass.isNotBlank()) checkBox.styleClass.add(styleClass)
        return checkBox
    }
}