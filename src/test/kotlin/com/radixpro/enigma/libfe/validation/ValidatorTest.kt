/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import com.radixpro.enigma.libfe.core.UiCelPoints
import io.kotest.matchers.shouldBe
import org.junit.Test

internal class ValidatorTest {

    private val validator = Validator()

    @Test
    fun `Happy flow for validating a text that represents an int should return true`() {
        validator.isValidInt("12") shouldBe true
    }

    @Test
    fun `Validating a text with leading and trailing space and that represents an int should return true`() {
        validator.isValidInt("   12  ") shouldBe true
    }

    @Test
    fun `Validating a text that contains non-numeric characters and repesents an int should return false`() {
        validator.isValidInt("1a") shouldBe false
    }

    @Test
    fun `Validating an empty text that represents an int should return false`() {
        validator.isValidInt("") shouldBe false
    }

    @Test
    fun `Happy flow for validating a text that represents a double should return true`() {
        validator.isValidDouble("12.5") shouldBe true
    }

    @Test
    fun `Validating a text with leading and trailing space and that represents a double should return true`() {
        validator.isValidDouble("   12.5  ") shouldBe true
    }

    @Test
    fun `Validating a text that contains non-numeric characters and repesents a double should return false`() {
        validator.isValidDouble("1.5a") shouldBe false
    }

    @Test
    fun `Validating an empty text that represents a double should return false`() {
        validator.isValidDouble("") shouldBe false
    }

    @Test
    fun `Happy flow for validating time should return true`() {
        validator.isValidTime("1:22:33") shouldBe true
    }

    @Test
    fun `Happy flow for validating time without seconds return true`() {
        validator.isValidTime("1:22") shouldBe true
    }

    @Test
    fun `Validating time with incorrect separator should return false`() {
        validator.isValidTime("12/12/12") shouldBe false
    }

    @Test
    fun `Validating time with non-numeric values should return false`() {
        validator.isValidTime("12:a3:00") shouldBe false
    }

    @Test
    fun `Validating time with hour too large should return false`() {
        validator.isValidTime("24:00:00") shouldBe false
    }

    @Test
    fun `Validating time with negative hour should return false`() {
        validator.isValidTime("-1:00:00") shouldBe false
    }

    @Test
    fun `Validating time with minute too large should return false`() {
        validator.isValidTime("12:60:00") shouldBe false
    }

    @Test
    fun `Validating time with negative minute should return false`() {
        validator.isValidTime("12:-5:00") shouldBe false
    }

    @Test
    fun `Validating time with second too large should return false`() {
        validator.isValidTime("12:00:60") shouldBe false
    }

    @Test
    fun `Validating time with negative second should return false`() {
        validator.isValidTime("12:15:-14") shouldBe false
    }

    @Test
    fun `Validating time for empty string should return false`() {
        validator.isValidTime("") shouldBe false
    }

    @Test
    fun `Validating date for happy flow should return true`() {
        validator.isValidDate("2021/5/5", true) shouldBe true
    }

    @Test
    fun `Validating date with syntax error should return false`() {
        validator.isValidDate("2021/x/5", true) shouldBe false
    }

    @Test
    fun `Validating date with value out of bounds should return false`() {
        validator.isValidDate("2021/13/5", true) shouldBe false
    }

    @Test
    fun `Validating correct date before -4712 should return true`() {
        validator.isValidDate("-5000/5/5", true) shouldBe true
    }

    @Test
    fun `Validating incorrect date before -4712 should return false`() {
        validator.isValidDate("-5000/55/5", true) shouldBe false
    }

    @Test
    fun `Validating date too far in the future should return false`() {
        validator.isValidDate("16800/1/8", true) shouldBe false
    }

    @Test
    fun `Validating date too far in the past should return false`() {
        validator.isValidDate("-12999/8/10", true) shouldBe false
    }

    @Test
    fun `Validating last possible date in the future should return true`() {
        validator.isValidDate("16800/1/7", true) shouldBe true
    }

    @Test
    fun `Validating first possible date in the past should return true`() {
        validator.isValidDate("-12999/8/11", true) shouldBe true
    }

    @Test
    fun `Validating if celestial point can be calculated at a supported given date should return true`() {
        validator.isValidDateForCelPoint(2000000.0, UiCelPoints.SEDNA) shouldBe true
    }

    @Test
    fun `Validating if celestial point can be calculated at an unsupported given date should return false`() {
        validator.isValidDateForCelPoint(3000000.0, UiCelPoints.SEDNA) shouldBe false
    }

    @Test
    fun `Validating if a celestial point can be calculated during a supported period should return true`() {
        validator.isValidPeriodForCelPoint(2000000.0, 2100000.0, UiCelPoints.SEDNA) shouldBe true
    }

    @Test
    fun `Validating if a celestial point can be calculated during a unsupported period should return false`() {
        validator.isValidPeriodForCelPoint(3000000.0, 3100000.0, UiCelPoints.SEDNA) shouldBe false
    }

    @Test
    fun `Validating if a celestial point can be calculated during a partly supported period should return false`() {
        validator.isValidPeriodForCelPoint(2000000.0, 3000000.0, UiCelPoints.SEDNA) shouldBe false
    }

}