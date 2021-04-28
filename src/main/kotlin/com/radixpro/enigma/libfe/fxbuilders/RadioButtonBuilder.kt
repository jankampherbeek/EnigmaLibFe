/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXRadioButton
import javafx.scene.control.ToggleGroup
import javafx.scene.paint.Color

class RadioButtonBuilder {

    private var selectedColor = Color.STEELBLUE
    private var unSelectedColor = Color.LIGHTGRAY
    private var disable = false
    private var visible = true
    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var text = ""
    private var toggleGroup: ToggleGroup? = null

    /**
     * SelectedColor. Default: STEELBLUE.
     */
    fun setSelectedColor(color: Color): RadioButtonBuilder {
        this.selectedColor = color
        return this
    }

    /**
     * UnselectedColor. Default: LIGHTGRAY.
     */
    fun setUnselectedColor(color: Color): RadioButtonBuilder {
        this.unSelectedColor = color
        return this
    }

    /**
     * Disable. Default false.
     */
    fun setDisable(disable: Boolean): RadioButtonBuilder {
        this.disable = disable
        return this
    }

    /**
     * Visible. Default true.
     */
    fun setVisible(visible: Boolean): RadioButtonBuilder {
        this.visible = visible
        return this
    }

    /**
     * PrefHeight. Optional
     */
    fun setPrefHeight(prefHeight: Double): RadioButtonBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * PrefWidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): RadioButtonBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * Text for radiobutton. Default "".
     */
    fun setText(text: String): RadioButtonBuilder {
        this.text = text
        return this
    }

    /**
     * ToggleGroup. Optional.
     */
    fun setToggleGroup(toggleGroup: ToggleGroup): RadioButtonBuilder {
        this.toggleGroup = toggleGroup
        return this
    }

    /**
     * Build instance of JFXRadioButton.
     */
    fun build(): JFXRadioButton {
        val radioButton = JFXRadioButton()
        radioButton.selectedColor = selectedColor
        radioButton.unSelectedColor = unSelectedColor
        radioButton.isDisable = disable
        radioButton.isVisible = visible
        if (0.0 < prefHeight) radioButton.prefHeight = prefHeight
        if (0.0 < prefWidth) radioButton.prefWidth = prefWidth
        radioButton.text = text
        if (null != toggleGroup) radioButton.toggleGroup = toggleGroup
        return radioButton
    }

}