/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import com.radixpro.enigma.libfe.core.BasicDate

/**
 * Validations for date, time and numeric inputs.
 */
class Validator {

    /**
     * Checks if a string contains a valid Int. Leading and trailing spaces are ignored.
     */
    fun isValidInt(text: String): Boolean {
        return try {
            text.trim().toInt()
            true
        } catch (e: Exception) {
            false
        }
    }

    /**
     * Checks if a string contains a valid Double. Leading and trailing spaces are ignored.
     */
    fun isValidDouble(text: String): Boolean {
        return try {
            text.trim().toDouble()
            true
        } catch (e: Exception) {
            false
        }
    }

    /**
     * Checks if a string contains a valid time. Format of the string should be hh:mm:ss or hh:mm .
     */
    fun isValidTime(text: String): Boolean {
        val values = text.split(":")
        if ((values.size < 2) || (values.size > 3)) return false
        val hour: Int
        val minute: Int
        val second: Int
        try {
            hour = values[0].toInt()
            minute = values[1].toInt()
            second = if (values.size == 2) 0 else values[2].toInt()
        } catch (e: Exception) {
            return false
        }
        if (0 > hour || hour > 23) return false
        if (0 > minute || minute > 59) return false
        if (0 > second || second > 59) return false
        return true
    }

    /**
     * Checks if a string contains a valid date, takes the calendar (Gregorian or Julian) into account.<br/>
     * Format of the string should be yyyy/mm/dd
     */
    fun isValidDate(text: String, gregorian: Boolean): Boolean {
        val values = text.split("/")
        if (values.size != 3) return false
        val year: Int
        val month: Int
        val day: Int
        try {
            year = values[0].toInt()
            month = values[1].toInt()
            day = values[2].toInt()
        } catch(e: Exception) {
            return false
        }
        if (-13000 > year || 16800 < year) return false
        if ((year == -12999) && ((month < 8) || (month == 8 && day < 11))) return false
        if ((year == 16800) && ((month > 1)  || (month == 1 && day > 7))) return false
        val basicDate = BasicDate(year, month, day, gregorian)
        if (year < -4712) return DateBeforeMinus4712().dateIsValid(basicDate)
        val jdnr = JdCalculation().jdFromDate(basicDate)
        val constructedDate = JdCalculation().dateFromJd(jdnr, gregorian)
        return constructedDate == basicDate
    }


}