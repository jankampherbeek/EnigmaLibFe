/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.Node
import javafx.scene.layout.Pane

/**
 * Builder for Pane.
 */
class PaneBuilder {

    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var styleClass: String = ""
    private var children: ArrayList<Node> = ArrayList()

    fun setPrefWidth(prefWidth: Double): PaneBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setPrefHeight(prefHeight: Double): PaneBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setStyleClass(styleClass: String): PaneBuilder {
        this.styleClass = styleClass
        return this
    }

    fun setChildren(children: ArrayList<Node>): PaneBuilder {
        this.children = children
        return this
    }

    fun build(): Pane {
        val pane = Pane()
        pane.border
        pane.padding
        pane.background
        if (prefWidth > 0.0) pane.prefWidth = prefWidth
        if (prefHeight > 0.0) pane.prefHeight = prefHeight
        if (styleClass.isNotBlank()) pane.styleClass.add(styleClass)
        if (children.size > 0) pane.children.addAll(children)
        return pane
    }
}