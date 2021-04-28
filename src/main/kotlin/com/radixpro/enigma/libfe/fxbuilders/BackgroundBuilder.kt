/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill

/**
 * Builder for Background.
 */
class BackgroundBuilder {

    private var backgroundFillTop: BackgroundFill? = null
    private var backgroundFillBottom: BackgroundFill? = null

    /**
     * Backgroundfill to be shown on top. Use only as an overlay.
     */
    fun setBackgroundFillTop(fill: BackgroundFill): BackgroundBuilder {
        this.backgroundFillTop = fill
        return this
    }

    /**
     * Backgroundfill base. Can be overlayed with another BackgroundFill.
     */
    fun setBackgroundFillBottom(fill: BackgroundFill): BackgroundBuilder {
        this.backgroundFillBottom = fill
        return this
    }

    /**
     * Return instance of Background
     */
    fun build(): Background {
        return Background(backgroundFillBottom, backgroundFillTop)
    }


}