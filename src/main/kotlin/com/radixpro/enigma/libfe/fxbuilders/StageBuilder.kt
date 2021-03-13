/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import javafx.scene.Scene
import javafx.stage.Modality
import javafx.stage.Stage

/**
 * Builder for Stage.
 * Default values: <ul><li>title: ""</li><li>modality: Modality.NONE</li><li>alwaysOnTop: false</li>
 * <li>resizable: false</li></ul>
 */
class StageBuilder {

    private var minWidth = 0.0
    private var minHeight = 0.0
    private var title: String = ""
    private var modality: Modality = Modality.NONE
    private var alwaysOnTop = false
    private var resizable = false
    private var scene: Scene? = null

    fun setMinWidth(minWidth: Double): StageBuilder {
        this.minWidth = minWidth
        return this
    }

    fun setMinHeight(minHeight: Double): StageBuilder {
        this.minHeight = minHeight
        return this
    }

    fun setTitle(title: String): StageBuilder {
        this.title = title
        return this
    }

    fun setModality(modality: Modality): StageBuilder {
        this.modality = modality
        return this
    }

    fun setAlwaysOnTop(alwaysOnTop: Boolean): StageBuilder {
        this.alwaysOnTop = alwaysOnTop
        return this
    }

    fun setResizable(resizable: Boolean): StageBuilder {
        this.resizable = resizable
        return this
    }

    fun setScene(scene: Scene): StageBuilder {
        this.scene = scene
        return this
    }

    fun build(): Stage {
        val stage = Stage()
        stage.isAlwaysOnTop = alwaysOnTop
        stage.isResizable = resizable
        if (minWidth > 0.0) stage.minWidth = minWidth
        if (minHeight > 0.0) stage.minHeight = minHeight
        stage.title = title
        stage.initModality(modality)
        if (null != scene) stage.scene = scene
        return stage
    }


}