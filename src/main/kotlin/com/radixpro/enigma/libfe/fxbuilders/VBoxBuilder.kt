/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.helpers.Dictionary.baseStyleSheet
import javafx.geometry.Insets
import javafx.scene.Node
import javafx.scene.layout.VBox
import kotlin.collections.ArrayList

/**
 * Builder for VBox.
 */
class VBoxBuilder {

    private var prefWidth = 0.0
    private var padding: Insets? = null
    private var prefHeight = 0.0
    private var style: String = ""
    private var children: ArrayList<Node> = ArrayList()

    /**
     * PrefWidth. Optional.
     */
    fun setPrefWidth(prefWidth: Double): VBoxBuilder {
        this.prefWidth = prefWidth
        return this
    }

    /**
     * PrefHeight. Optional.
     */
    fun setPrefHeight(prefHeight: Double): VBoxBuilder {
        this.prefHeight = prefHeight
        return this
    }

    /**
     * Insets for padding. Optional.
     */
    fun setPadding(padding: Insets): VBoxBuilder {
        this.padding = padding
        return this
    }

    /**
     * Child nodes.
     */
    fun setChildren(vararg children: Node): VBoxBuilder {
        this.children.addAll(children)
        return this
    }

    /**
     * Styleclass. WIll be processed after other styles. Optional.
     */
    fun setStyle(style: String): VBoxBuilder {
        this.style = style
        return this
    }

    /**
     * Build instance of VBox.
     */
    fun build(): VBox {
        val vBox = VBox()
        vBox.stylesheets.add(baseStyleSheet)
        if (prefWidth > 0.0) vBox.prefWidth = prefWidth
        if (prefHeight > 0.0) vBox.prefHeight = prefHeight
        if (null != padding) vBox.padding = padding
        if (style.isNotBlank()) vBox.style = style
        if (children.size > 0) vBox.children.addAll(children)
        return vBox
    }


}