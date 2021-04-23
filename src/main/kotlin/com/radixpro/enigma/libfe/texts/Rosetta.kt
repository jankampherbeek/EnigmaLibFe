/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 *
 */

package com.radixpro.enigma.libfe.texts

import java.util.*

/**
 * i18N manager, takes care of Resource Bundles.<br>
 * Implemented as a singleton.<br>
 * setLanguage() needs to be called before using this class. Otherwise Rosetta always uses English.
 */
object Rosetta {
    private var resourceBundle: ResourceBundle? = null
    private var helpResourceBundle: ResourceBundle? = null
    private var shrResourceBundle: ResourceBundle? = null
    private var shrHelpResourceBundle: ResourceBundle? = null
    private const val RB_LOCATION = "texts"
    private const val RB_SHR_LOCATION = "shrtexts"
    private const val RB_HELP_LOCATION = "help"
    private const val RB_SHR_HELP_LOCATION = "shrhelp"
    private const val DUTCH = "du"
    private const val ENGLISH = "en"
    private const val PROP_LANG = "lang"
    private var initialized = false
    private var language = "en"
    private var locale: Locale = Locale(ENGLISH, ENGLISH.toUpperCase())

    /**
     * Sets new language
     *
     * @param language use "en" for English or "du" for Dutch (case-sensitive).
     */
    fun setLanguage(language: String) {
        this.language = language
        if (language == ENGLISH || language == DUTCH) reInitialize()
    }

    private fun reInitialize() {
        initi18N()
        defineResourceBundles()
        initialized = true
    }

    private fun initi18N() {
        locale = if (language == DUTCH) Locale(DUTCH, DUTCH.toUpperCase()) else Locale(ENGLISH, ENGLISH.toUpperCase())
    }

    private fun defineResourceBundles() {
        resourceBundle = ResourceBundle.getBundle(RB_LOCATION, locale)
        helpResourceBundle = ResourceBundle.getBundle(RB_HELP_LOCATION, locale)
        shrResourceBundle = ResourceBundle.getBundle(RB_SHR_LOCATION, locale)
        shrHelpResourceBundle = ResourceBundle.getBundle(RB_SHR_HELP_LOCATION, locale)
    }

    fun getText(key: String): String {
        if (!initialized) reInitialize()
        return if ((key.length >= 3) && (key.startsWith("shr"))) shrResourceBundle!!.getString(key)
        else resourceBundle!!.getString(key)
    }

    fun getHelpText(key: String): String {
        if (!initialized) reInitialize()
        return if ((key.length >= 3) && (key.startsWith("shr"))) shrHelpResourceBundle!!.getString(key)
        else helpResourceBundle!!.getString(key)
    }

}