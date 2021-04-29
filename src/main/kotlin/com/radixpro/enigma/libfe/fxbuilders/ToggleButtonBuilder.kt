/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXToggleButton
import com.jfoenix.controls.JFXTooltip
import javafx.geometry.Pos
import javafx.scene.control.Tooltip
import javafx.scene.paint.Color

/**
 * Builder for ToggleButton. Returns JFXToggleButton
 */
class ToggleButtonBuilder {

    private var toggleColor = Color.STEELBLUE
    private var toggleLineColor = Color.LIGHTSTEELBLUE
    private var unToggleColor = Color.GRAY
    private var unToggleLineColor = Color.LIGHTGRAY
    private var disable = false
    private var visible = true
    private var tooltip: Tooltip? = null
    private var text = ""
    private var alignment = Pos.CENTER_LEFT

    fun setToggleColor(color: Color): ToggleButtonBuilder {
        this.toggleColor = color
        return this
    }

    fun setToggleLineColor(color: Color) : ToggleButtonBuilder {
        this.toggleLineColor = color
        return this
    }

    fun setUnToggleColor(color: Color) : ToggleButtonBuilder {
        this.unToggleColor = color
        return this
    }

    fun setUnToggleLineColor(color: Color) : ToggleButtonBuilder {
        this.unToggleLineColor = color
        return this
    }

    fun setDisable(disable: Boolean): ToggleButtonBuilder {
        this.disable = disable
        return this
    }

    fun setVisible(visible: Boolean): ToggleButtonBuilder {
        this.visible = visible
        return this
    }

    fun setTooltip(tooltip: JFXTooltip): ToggleButtonBuilder {
        this.tooltip = tooltip
        return this
    }

    fun setText(text: String): ToggleButtonBuilder {
        this.text = text
        return this
    }

    fun setAlignment(align: Pos): ToggleButtonBuilder {
        this.alignment = align
        return this
    }

    fun build(): JFXToggleButton {
        val toggleButton = JFXToggleButton()
        toggleButton.toggleColor = toggleColor
        toggleButton.toggleLineColor = toggleLineColor
        toggleButton.unToggleColor = unToggleColor
        toggleButton.unToggleLineColor = unToggleLineColor
        toggleButton.isDisable = disable
        toggleButton.isVisible = visible
        if(null != tooltip) toggleButton.tooltip = tooltip
        toggleButton.text = text
        toggleButton.alignment = alignment
        return toggleButton
    }
}