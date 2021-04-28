/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.geometry.Insets
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color

/**
 * Builder for Backgroundfill.
 */
class BackgroundFillBuilder {
    private var color = Color.AZURE
    private var cornerRadii = CornerRadii(0.0)
    private var insets = Insets(0.0)

    /**
     * Color for background, default Azure.
     */
    fun setColor(color: Color): BackgroundFillBuilder{
        this.color = color
        return this
    }

    /**
     * Radius for corners, default 0.0.
     */
    fun setCornerRadii(cornerRadii: CornerRadii): BackgroundFillBuilder {
        this.cornerRadii = cornerRadii
        return this
    }

    /**
     * Insets for background, default 0.0.
     */
    fun setInsets(insets: Insets): BackgroundFillBuilder {
        this.insets = insets
        return this
    }

    /**
     * Create instance of BackgroundFill.
     */
    fun build(): BackgroundFill {
        return BackgroundFill(color, cornerRadii, insets)
    }

}