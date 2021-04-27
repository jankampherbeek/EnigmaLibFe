/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.jfoenix.controls.JFXTooltip
import javafx.scene.text.TextAlignment

/**
 * Builder for a Tooltip. Returns instance of JFXTooltip.
 */
class TooltipBuilder {

    private var textAlign = TextAlignment.CENTER
    private var text = ""
    private var width = 0.0

    /**
     * Sets alignemnt for text. Only relevant if width is enlarged or if the tooltip contains multiple lines.
     */
    fun setTextAlignment(align: TextAlignment): TooltipBuilder {
       this.textAlign = align
       return this
    }

    /**
     * Text that is shown in tooltip.
     */
    fun setText(text: String): TooltipBuilder {
        this.text = text
        return this
    }

    /**
     * Define width. Might come in handy for tooltips with a very short text. Is not required in most cases.
     */
    fun setPrefWidth(width: Double): TooltipBuilder {
        this.width = width
        return this
    }

    /**
     * Build the tooltip, returns an instance of JFXTooltip.
     */
    fun build(): JFXTooltip {
        val tooltip = JFXTooltip(text)
        tooltip.textAlignment = textAlign
        if (width > 0.0) tooltip.prefWidth = width
        return tooltip
    }

}