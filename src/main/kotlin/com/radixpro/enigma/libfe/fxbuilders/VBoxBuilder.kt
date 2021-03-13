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
 * Builder for VBox. No default values.
 */
class VBoxBuilder {

    private var prefWidth = 0.0
    private var padding: Insets? = null
    private var prefHeight = 0.0
    private var style: String = ""
    private var children: ArrayList<Node> = ArrayList()

    fun setPrefWidth(prefWidth: Double): VBoxBuilder {
        this.prefWidth = prefWidth
        return this
    }

    fun setPrefHeight(prefHeight: Double): VBoxBuilder {
        this.prefHeight = prefHeight
        return this
    }

    fun setPadding(padding: Insets): VBoxBuilder {
        this.padding = padding
        return this
    }

    fun setChildren(children: ArrayList<Node>): VBoxBuilder {
        this.children = children
        return this
    }

    fun setStyle(style: String): VBoxBuilder {
        this.style = style
        return this
    }

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