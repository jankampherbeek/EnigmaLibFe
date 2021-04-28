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
 * Builder for Stage.<br/>
 * Tests omitted, can only run on FX application thread.
 */
class StageBuilder {

    private var minWidth = 0.0
    private var minHeight = 0.0
    private var title: String = ""
    private var modality: Modality = Modality.NONE
    private var alwaysOnTop = false
    private var resizable = false
    private var scene: Scene? = null

    /**
     * Minimum width. Optional.
     */
    fun setMinWidth(minWidth: Double): StageBuilder {
        this.minWidth = minWidth
        return this
    }

    /**
     * Minimum height. Optional.
     */
    fun setMinHeight(minHeight: Double): StageBuilder {
        this.minHeight = minHeight
        return this
    }

    /**
     * Title: defaults to ""
     */
    fun setTitle(title: String): StageBuilder {
        this.title = title
        return this
    }

    /**
     * Modality. Default: NONE.
     */
    fun setModality(modality: Modality): StageBuilder {
        this.modality = modality
        return this
    }

    /**
     * Always on top. Default: false.
     */
    fun setAlwaysOnTop(alwaysOnTop: Boolean): StageBuilder {
        this.alwaysOnTop = alwaysOnTop
        return this
    }

    /**
     * Resizable. Default: false.
     */
    fun setResizable(resizable: Boolean): StageBuilder {
        this.resizable = resizable
        return this
    }

    /**
     * Scene. If not set remains null.
     */
    fun setScene(scene: Scene): StageBuilder {
        this.scene = scene
        return this
    }

    /**
     * Build instance of stage.
     */
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