/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import com.radixpro.enigma.libfe.core.BasicDate
import io.kotest.matchers.shouldBe
import org.junit.Test

internal class DateBeforeMinus4712Test {

    private val validator = DateBeforeMinus4712()

    @Test
    fun `Valid date should be validated`() {
        val ancientDate = BasicDate(-5000, 1, 1, false)
        validator.dateIsValid(ancientDate) shouldBe true
    }

    @Test
    fun `Date with month too large should not be validated`() {
        val ancientDate = BasicDate(-5000, 13, 1, false)
        validator.dateIsValid(ancientDate) shouldBe false
    }

    @Test
    fun `Date with value 31 for the month May should be validated`() {
        val ancientDate = BasicDate(-5000, 5, 31, false)
        validator.dateIsValid(ancientDate) shouldBe true
    }

    @Test
    fun `Date with value 31 for the month June should not be validated`() {
        val ancientDate = BasicDate(-5000, 6, 31, false)
        validator.dateIsValid(ancientDate) shouldBe false
    }

    @Test
    fun `Date with value 29 for the month Februar in a leap year should be validated`() {
        val ancientDate = BasicDate(-5000, 2, 29, false)
        validator.dateIsValid(ancientDate) shouldBe true
    }

    @Test
    fun `Date with value 29 for the month Februar in a common year should not be validated`() {
        val ancientDate = BasicDate(-5001, 2, 29, false)
        validator.dateIsValid(ancientDate) shouldBe false
    }

}