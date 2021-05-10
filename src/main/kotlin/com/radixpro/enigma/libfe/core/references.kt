/*
 * Jan Kampherbeek, (c) 2021.
 * EnigmaLibFe is open source.
 * Please check the file copyright.txt in the root of the source for further details.
 */

package com.radixpro.enigma.libfe.core


/**
 * Categories for celestial points.
 * @param rbKey Key for Resource Bundle.
 */
enum class CelPointCat(val rbKey: String) {
    CLASSIC("shr.cpcat.classic"),
    MODERN("shr.cpcat.modern"),
    PLUTOID("shr.cpcat.plutoid"),
    ASTEROID("shr.cpcat.asteroid"),
    MATH_POINT("shr.cpcat.mathpoint"),
    CENTAUR("shr.cpcat.centaur")
}


/**
 * Celestial points.
 * @param seId id as used by the Swiss Ephemeris.
 * @param category Category for celestial points.
 * @param geo Indicates if celestial point is available for geocentric calculations.
 * @param helio Indicates if celestial point is available for heliocentric calculations.
 * @param glyph String to present celestial symbol using font EnigmaAstrology.
 * @param startJd First Julian day of supported period.
 * @param endJd Last Julian day of supported period.
 * @param rbKey Key for Resource Bundle.
 */
enum class UiCelPoints(val seId: Int, val category: CelPointCat, val geo: Boolean, val helio: Boolean,
                       val glyph: String, val startJd:Double, val endJd:Double, val rbKey: String) {
    SUN(0, CelPointCat.CLASSIC, true, false,"a", -3026613.5, 5227458.5,"shr.celpoints.sun"),
    MOON(1, CelPointCat.CLASSIC, true, false,"b",-3026613.5, 5227458.5,"shr.celpoints.moon"),
    MERCURY(2, CelPointCat.CLASSIC, true, true, "c",-3026613.5, 5227458.5,"shr.celpoints.mercury"),
    VENUS(3, CelPointCat.CLASSIC, true, true,"d",-3026613.5, 5227458.5,"shr.celpoints.venus"),
    EARTH(14, CelPointCat.CLASSIC, false, true,"e",-3026613.5, 5227458.5,"shr.celpoints.earth"),
    MARS(4, CelPointCat.CLASSIC, true, true, "f",-3026613.5, 5227458.5,"shr.celpoints.mars"),
    JUPITER(5, CelPointCat.CLASSIC, true, true,"g",-3026613.5, 5227458.5,"shr.celpoints.jupiter"),
    SATURN(6, CelPointCat.CLASSIC, true, true,"h",-3026613.5, 5227458.5,"shr.celpoints.saturn"),
    URANUS(7, CelPointCat.MODERN, true, true,"i",-3026613.5, 5227458.5,"shr.celpoints.uranus"),
    NEPTUNE(8, CelPointCat.MODERN,true, true,"j",-3026613.5, 5227458.5,"shr.celpoints.neptune"),
    PLUTO(9, CelPointCat.MODERN, true, true,"k",-3026613.5, 5227458.5,"shr.celpoints.pluto"),
    MEAN_NODE(10, CelPointCat.MATH_POINT, true, false, "{",-3026613.5, 5227458.5,"shr.celpoints.meannode"),
    TRUE_NODE(11, CelPointCat.MATH_POINT, true, false,"{",-3026613.5, 5227458.5,"shr.celpoints.truenode"),
    MEAN_APOGEE(12, CelPointCat.MATH_POINT, true, false,",",-3026613.5, 5227458.5,"shr.celpoints.meanapogee"),
    OSCU_APOGEE(13, CelPointCat.MATH_POINT, true, false,".",-3026613.5, 5227458.5,"shr.celpoints.oscuapogee"),
    CHEIRON(15, CelPointCat.CENTAUR, true, true,"w", 1967601.5, 3419437.5,"shr.celpoints.cheiron"),
    PHOLUS(16, CelPointCat.CENTAUR, true, true,")", 640648.5, 4390615.5,"shr.celpoints.pholus"),
    NESSUS(17066, CelPointCat.CENTAUR, true, true,"(",625372.5, 2816371.5,"shr.celpoints.nessus"),
    CERES(17, CelPointCat.ASTEROID,true, true,"_", -3026613.5,5224242.5,"shr.celpoints.ceres"),
    PALLAS(18, CelPointCat.ASTEROID, true, true,"û", -3026613.5,5227458.5,"shr.celpoints.pallas"),
    JUNO(19, CelPointCat.ASTEROID, true, true,"ü",-3026613.5,5227458.5,"shr.celpoints.juno"),
    VESTA(20, CelPointCat.ASTEROID, true, true,"À",-3026613.5,5221544.5,"shr.celpoints.vesta"),
    HUYA(48628, CelPointCat.PLUTOID, true, true,"ï", 625296.5, 2816291.5,"shr.celpoints.huya"),
    MAKEMAKE(146472, CelPointCat.PLUTOID, true, true,"î",625296.5, 2816291.5, "shr.celpoints.makemake"),
    HAUMEA( 146108, CelPointCat.PLUTOID, true, true,"í",625296.5, 2816291.5, "shr.celpoints.haumea"),
    ERIS( 146199, CelPointCat.PLUTOID, true, true,"*", 625384.5, 2816383.5,"shr.celpoints.eris"),
    IXION( 38978, CelPointCat.PLUTOID, true, true,"ó", 625296.5, 2816291.5,"shr.celpoints.ixion"),
    ORCUS( 100482, CelPointCat.PLUTOID, true, true,"ù", 625296.5, 2816291.5,"shr.celpoints.orcus"),
    QUAOAR( 60000, CelPointCat.PLUTOID, true, true,"ô", 625296.5, 2816291.5, "shr.celpoints.quaoar"),
    SEDNA( 100377, CelPointCat.PLUTOID, true, true,"ö", 625296.5, 2816291.5,"shr.celpoints.sedna"),
    VARUNA(30000, CelPointCat.PLUTOID, true, true,"ò", 625296.5, 2816291.5,"shr.celpoints.varuna"),
}