/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.fxbuilders

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(JfxTestRunner::class)
class ListViewBuilderTest {

    private val prefWidth = 160.0
    private val prefHeight = 240.0
    private val styleClass = "listViewStyle"

    private val listView = ListViewBuilder()
        .setPrefHeight(prefHeight)
        .setPrefWidth(prefWidth)
        .setStyleClass(styleClass).build()
    private val listViewDefault = ListViewBuilder().build()

    @Test
    fun `ListViewBuilder should handle prefWidth correctly`() {
        listView.prefWidth shouldBe prefWidth
    }

    @Test
    fun `ListViewBuilder should handle prefHeight correctly`() {
        listView.prefHeight shouldBe prefHeight
    }

    @Test
    fun `ListViewBuilder should handle styleClass correctly`() {
        listView.styleClass[1] shouldBe styleClass
    }

    @Test
    fun `ListViewBuilder should handle default prefWidth correctly`() {
        listViewDefault.prefWidth shouldBe -1
    }

    @Test
    fun `ListViewBuilder should handle default prefHeight correctly`() {
        listViewDefault.prefHeight shouldBe -1
    }

    @Test
    fun `ListViewBuilder should handle default styleClass correctly`() {
        listViewDefault.styleClass.size shouldBe 1
    }


}