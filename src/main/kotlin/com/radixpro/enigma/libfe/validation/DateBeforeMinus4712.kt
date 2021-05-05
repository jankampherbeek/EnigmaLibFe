/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

import com.radixpro.enigma.libfe.core.BasicDate

/**
 * Check a date before -4712 (so for a negative Julian Day number)
 */
class DateBeforeMinus4712 {

    fun dateIsValid(date: BasicDate): Boolean {

        if (1 > date.month || date.month > 12) return false
        if (1 > date.day || date.day > 31) return false
        if (31 == date.day && (date.month in arrayOf(2, 4, 6, 9, 11))) return false
        if (30 == date.day && date.month == 2) return false
        if (29 == date.day && date.month == 2 && date.year % 4 != 0) return false
        return true
    }

}