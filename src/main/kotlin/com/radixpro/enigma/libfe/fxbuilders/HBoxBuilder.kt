/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.geometry.Insets
import javafx.scene.Node
import javafx.scene.layout.HBox

/**
 * Builder for HBox.
 */
class HBoxBuilder {

    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var spacing = -1.0
    private var padding: Insets? = null
    private var children: ArrayList<Node> = ArrayList()

    /**
     * PrefWidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): HBoxBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * PrefHeight. Optional.
     */
    fun setPrefHeight(prefHeight: Double): HBoxBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * Spacing. Optional, default 0.0.
     */
    fun setSpacing(spacing: Double): HBoxBuilder {
        this.spacing = spacing
        return this
    }

    /**
     * Padding. Optional, default Insets(0.0).
     */
    fun setPadding(padding: Insets): HBoxBuilder {
        this.padding = padding
        return this
    }

    /**
     * Child nodes to be shown from left to right.
     */
    fun setChildren(vararg children: Node): HBoxBuilder {
        this.children.addAll(children)
        return this
    }

    /**
     * Build returns instance of HBox.
     */
    fun build(): HBox {
        val hBox = HBox()
        if (prefWidth > 0.0) hBox.prefWidth = prefWidth
        if (prefHeight > 0.0) hBox.prefHeight = prefHeight
        if (spacing >= 0.0) hBox.spacing = spacing
        if (null != padding) hBox.padding = padding
        if (children.isNotEmpty()) hBox.children.addAll(children)
        return hBox
    }
}