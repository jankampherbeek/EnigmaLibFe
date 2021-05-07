/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.texts

import io.kotest.matchers.shouldBe
import org.junit.Test

class RosettaTest {


    @Test
    fun `After setting language to dutch, Rosetta should return dutch texts`() {
        Rosetta.setLanguage("du")
        Rosetta.getText("test.property") shouldBe "Declinatie"
    }

    @Test
    fun `After setting language to english, Rosetta should return english texts`() {
        Rosetta.setLanguage("en")
        Rosetta.getText("test.property") shouldBe "Declination"
    }


    @Test
    fun `Using english, Rosetta should return the correct help text`() {
        Rosetta.setLanguage("en")
        Rosetta.getHelpText("myscreen.title") shouldBe "Aspects"
    }

    @Test
    fun `Using dutch, Rosetta should return the correct help text`() {
        Rosetta.setLanguage("du")
        Rosetta.getHelpText("myscreen.title") shouldBe "Aspecten"
    }
}