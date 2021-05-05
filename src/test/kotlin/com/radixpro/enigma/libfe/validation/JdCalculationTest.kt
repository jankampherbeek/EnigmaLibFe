/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import com.radixpro.enigma.libfe.core.BasicDate
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import org.junit.Test

internal class JdCalculationTest {

    private val margin = 0.001
    private val jdCalc = JdCalculation()

    @Test
    fun `Julian day should be calculated correctly using Gregorian calendar`() {
        val expectedJdnr = 2451544.5
        val date = BasicDate(2000, 1, 1, true)
        jdCalc.jdFromDate(date) shouldBe (expectedJdnr plusOrMinus margin)
    }

    @Test
    fun `Julian day should be calculated correctly using Julian calendar`() {
        val expectedJdnr = 1842712.5
        val date = BasicDate(333, 1, 27, false)
        jdCalc.jdFromDate(date) shouldBe (expectedJdnr plusOrMinus margin)
    }

    @Test
    fun `Julian day should be calculated correctly using negative year`() {
        val expectedJdnr = 1356001.5
        val date = BasicDate(-1000, 7, 13, false)
        jdCalc.jdFromDate(date) shouldBe (expectedJdnr plusOrMinus margin)
    }

    @Test
    fun `Date should be calculated correctly using Gregorian Calendar`() {
        val jdnr = 2451544.5
        val expectedDate = BasicDate(2000, 1, 1, true)
        jdCalc.dateFromJd(jdnr, true) shouldBe expectedDate
    }

    @Test
    fun `Date should be calculated correctly using Julian Calendar`() {
        val jdnr = 1842712.5
        val expectedDate = BasicDate(333, 1, 27, false)
        jdCalc.dateFromJd(jdnr, false) shouldBe expectedDate
    }

    @Test
    fun `Date should be calculated correctly for negative year`() {
        val jdnr = 1356001.5
        val expectedDate = BasicDate(-1000, 7, 13, false)
        jdCalc.dateFromJd(jdnr, false) shouldBe expectedDate
    }


}