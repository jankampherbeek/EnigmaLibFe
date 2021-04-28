/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.geometry.Insets
import javafx.scene.Node
import javafx.scene.layout.Background
import javafx.scene.layout.Pane

/**
 * Builder for Pane.
 */
class PaneBuilder {

    private var prefWidth = 0.0
    private var prefHeight = 0.0
    private var padding = Insets(0.0)
    private var background: Background? = null
    private var styleClass: String = ""
    private var children: ArrayList<Node> = ArrayList()

    /**
     * PrefWidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): PaneBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * PrefHeight. Optional.
     */
    fun setPrefHeight(prefHeight: Double): PaneBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * Insets for padding, default 0.0.
     */
    fun setPadding(padding: Insets): PaneBuilder {
        this.padding = padding
        return this
    }

    /**
     * Background. Default none.
     */
    fun setBackground(background: Background): PaneBuilder {
        this.background = background
        return this
    }

    /**
     * Styleclass, to be processed after other styles. Optional.
     */
    fun setStyleClass(styleClass: String): PaneBuilder {
        this.styleClass = styleClass
        return this
    }

    /**
     * Child nodes.
     */
    fun setChildren(vararg children: Node): PaneBuilder {
        this.children.addAll(children)
        return this
    }

    /**
     * Construct instance of Pane.
     */
    fun build(): Pane {
        val pane = Pane()
        if (Insets(0.0) != padding) pane.padding = padding
        if (null != background) pane.background = background
        if (prefWidth > 0.0) pane.prefWidth = prefWidth
        if (prefHeight > 0.0) pane.prefHeight = prefHeight
        if (styleClass.isNotBlank()) pane.styleClass.add(styleClass)
        if (children.size > 0) pane.children.addAll(children)
        return pane
    }
}