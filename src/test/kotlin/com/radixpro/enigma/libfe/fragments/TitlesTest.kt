/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.fragments

import com.radixpro.enigma.libfe.testsupport.JfxTestRunner
import io.kotest.matchers.shouldBe
import javafx.scene.control.Label

import org.junit.runner.RunWith
import org.junit.Test

@RunWith(JfxTestRunner::class)
internal class TitlesTest {

    private val titleText = "TitleText"
    private val subTitleText = "SubTitleText"
    private val titleWidth = 120.5
    private val subtitleWidth = 100.0
    private val titlePane = Titles.createTitlePane(titleText, titleWidth)
    private val subTitlePane = Titles.createSubTitlePane(subTitleText, subtitleWidth)

    @Test
    fun `TitlePane should have correct text for title`() {
        (titlePane.children[0] as Label).text  shouldBe titleText
    }

    @Test
    fun `TitlePane should have correct value for prefWidth`() {
        titlePane.prefWidth shouldBe titleWidth
    }

    @Test
    fun `SubTitlePane should have correct text for subTitle`() {
        (subTitlePane.children[0] as Label).text shouldBe subTitleText
    }

    @Test
    fun `SubTitlePane should have correct value for prefWidth`(){
        subTitlePane.prefWidth shouldBe subtitleWidth
    }
}