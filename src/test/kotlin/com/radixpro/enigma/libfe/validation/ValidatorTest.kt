/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import io.kotest.matchers.shouldBe
import org.junit.Test

internal class ValidatorTest {

    private val validator = Validator()

    @Test
    fun `Happy flow for validating a text that represents an int should return true`() {
        validator.isValidInt("12") shouldBe true
    }

    @Test
    fun `Validating a text with leasing and trailing space and that represents an int should return true`() {
        validator.isValidInt("   12  ") shouldBe true
    }

    @Test
    fun `Validating a text that contains non-numeric characters should return false`() {
        validator.isValidInt("1a") shouldBe false
    }

    @Test
    fun `Validating an empty text should return false`() {
        validator.isValidInt("") shouldBe false
    }

}