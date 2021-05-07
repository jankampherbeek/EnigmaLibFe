/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import com.radixpro.enigma.libfe.core.BasicDate

/**
 * Calculation with Julian Day numbers, only for dates. Enigma uses these calculations only for date-validation.
 * For astronomical calculations the Julian Day calculations of the Swiss Ephemeris are used in libBE.<br/>
 * Based on formulae by Jean Meeus, Astronomical Algorithms, pp. 60..64.
 * Only valid for positive jd nrs, e.g. after -4712 .
 */
class JdCalculation {

    /**
     * Calculate Julian Day for a given date.
     * Meeus uses short variable names which I replaced with more desciptive names:<br/>
     * Y -> year<br/>
     * M -> month<br/>
     * D -> day</br>
     * B -> gregorianCorr<br/>
     * A -> century
     * @param date The date for the calculation. The date should be historical (not astronomical). The date is not
     * necessarily valid as this method is used to check for validation.
     * @return Julian Day number for the date, time is ignored. The JD nr will always end with 0.5 as Julian days are
     * being calculated from noon.
     */
    fun jdFromDate(date: BasicDate): Double {
        var year = date.year
        var month= date.month
        val day = date.day
        if (month < 3) {
            year--
            month+=12
        }
        var gregorianCorr = 0
        if (date.gregorian) {
            val century = (year / 100)
            gregorianCorr = 2 - century + (century / 4)
        }
        return (365.25 * (year + 4716)).toInt() + (30.6001 * (month + 1)).toInt() + day + gregorianCorr - 1524.5
    }

    /**
     * Calculate date from a given Julian Day.
     * Meeus uses short variable names which I replaced with more desciptive names:<br/>
     * Z -> intJd
     * F -> fractJd
     * A -> calendarCorrectedJd
     * m -> month
     * b, c, d, e: unchanged (could not find sensible names).
     */
    fun dateFromJd(jd: Double, gregorian: Boolean): BasicDate {
        val workJd = jd + 0.5
        val intJd = workJd.toInt()
        val fractJd = workJd - intJd
        var calendarCorrectedJd = intJd
        if (gregorian) {   // Gregorian            Meeus checks for z >= 2291161
           val alpha = ((intJd - 1867216.25) / 36524.25).toInt()
           calendarCorrectedJd = intJd + 1 + alpha - (alpha/4)
        }
        val b = calendarCorrectedJd + 1524
        val c = ((b - 122.1) /365.25).toInt()
        val d = (365.25 * c).toInt()
        val e = ((b - d)/30.6001).toInt()
        val day = b - d - (30.6001 * e).toInt() + fractJd
        val month =  if (e < 14) e - 1 else e - 13
        val year = if (month > 2) c - 4716 else c - 4715
        return BasicDate(year, month, day.toInt(), gregorian)
    }
}