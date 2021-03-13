/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.Node
import javafx.scene.layout.HBox

/**
 * Builder for HBox. No defaults.
 */
class HBoxBuilder {

    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var children: ArrayList<Node> = ArrayList()

    fun setPrefWidth(prefWidth: Double): HBoxBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setPrefHeight(prefHeight: Double): HBoxBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setChildren(children: ArrayList<Node>): HBoxBuilder {
        this.children = children
        return this
    }

    fun build(): HBox {
        val hBox = HBox()
        if (prefWidth > 0.0) hBox.prefWidth = prefWidth
        if (prefHeight > 0.0) hBox.prefHeight = prefHeight
        if (children.isNotEmpty()) hBox.children.addAll(children)
        return hBox
    }
}