/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders
import com.radixpro.enigma.libfe.helpers.Dictionary
import javafx.geometry.Insets
import javafx.scene.layout.GridPane

/**
 * Builder for GridPane.
 */
class GridPaneBuilder {
    private var prefHeight = 0.0
    private var prefWidth = 0.0
    private var padding: Insets? = null
    private var hGap = 0.0
    private var vGap = 0.0
    private var styleSheet: String = ""

    /**
     * PrefHeight. Optional.
     */
    fun setPrefHeight(prefHeight: Double): GridPaneBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * Prefwidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): GridPaneBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * Define padding: space around the gridPane.
     */
    fun setPadding(padding: Insets): GridPaneBuilder {
        this.padding = padding
        return this
    }

    /**
     * Define vertical gap: vertical space between elements in gridPane.
     */
    fun setVGap(vGap: Double): GridPaneBuilder {
        this.vGap = vGap
        return this
    }

    /**
     * Define horizontal gap: horizontal space between elements in gridPane.
     */
    fun setHGap(hGap: Double): GridPaneBuilder {
        this.hGap = hGap
        return this
    }

    /**
     * Define stylesheet. Optional, will be added after existing stylesheets.
     */
    fun setStyleSheet(styleSheet: String): GridPaneBuilder {
        this.styleSheet = styleSheet
        return this
    }

    /**
     * Build GridPane.
     */
    fun build(): GridPane {
        val gridPane = GridPane()
        gridPane.stylesheets.add(Dictionary.baseStyleSheet)
        if (prefHeight > 0.0) gridPane.prefHeight = prefHeight
        if (prefWidth > 0.0) gridPane.prefWidth = prefWidth
        if (null != padding) gridPane.padding = padding
        if (hGap > 0.0) gridPane.hgap = hGap
        if (vGap > 0.0) gridPane.vgap = vGap
        if (styleSheet.isNotBlank()) gridPane.stylesheets.add(styleSheet)
        return gridPane
    }

}