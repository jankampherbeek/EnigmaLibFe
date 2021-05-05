/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.validation

/**
 * Validations for date, time and numeric inputs.
 */
class Validator {

    /**
     * Checks if a string can be converted to an Int. Leading and trailing spaces are ignored.
     */
    fun isValidInt(text: String): Boolean {
        return try {
            val testValue = text.trim().toInt()
            true
        } catch (e: Exception) {
            false
        }
    }
}