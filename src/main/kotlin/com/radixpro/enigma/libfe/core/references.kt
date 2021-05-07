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
 * @param rbKey Key for Resource Bundle.
 */
enum class UiCelPoints(val seId: Int, val category: CelPointCat, val geo: Boolean, val helio: Boolean,
                       val glyph: String, val rbKey: String) {
    SUN(0, CelPointCat.CLASSIC, true, false,"a","shr.celpoints.sun"),
    MOON(1, CelPointCat.CLASSIC, true, false,"b","shr.celpoints.moon"),
    MERCURY(2, CelPointCat.CLASSIC, true, true, "c","shr.celpoints.mercury"),
    VENUS(3, CelPointCat.CLASSIC, true, true,"d","shr.celpoints.venus"),
    EARTH(14, CelPointCat.CLASSIC, false, true,"e","shr.celpoints.earth"),
    MARS(4, CelPointCat.CLASSIC, true, true, "f","shr.celpoints.mars"),
    JUPITER(5, CelPointCat.CLASSIC, true, true,"g","shr.celpoints.jupiter"),
    SATURN(6, CelPointCat.CLASSIC, true, true,"h","shr.celpoints.saturn"),
    URANUS(7, CelPointCat.MODERN, true, true,"i","shr.celpoints.uranus"),
    NEPTUNE(8, CelPointCat.MODERN,true, true,"j","shr.celpoints.neptune"),
    PLUTO(9, CelPointCat.MODERN, true, true,"k","shr.celpoints.pluto"),
    MEAN_NODE(10, CelPointCat.MATH_POINT, true, false, "{","shr.celpoints.meannode"),
    TRUE_NODE(11, CelPointCat.MATH_POINT, true, false,"{","shr.celpoints.truenode"),
    MEAN_APOGEE(12, CelPointCat.MATH_POINT, true, false,",","shr.celpoints.meanapogee"),
    OSCU_APOGEE(13, CelPointCat.MATH_POINT, true, false,".","shr.celpoints.oscuapogee"),
    CHEIRON(15, CelPointCat.CENTAUR, true, true,"w","shr.celpoints.cheiron"),
    PHOLUS(16, CelPointCat.CENTAUR, true, true,")","shr.celpoints.pholus"),
    NESSUS(17066, CelPointCat.CENTAUR, true, true,"(","shr.celpoints.nessus"),
    CERES(17, CelPointCat.ASTEROID,true, true,"_", "shr.celpoints.ceres"),
    PALLAS(18, CelPointCat.ASTEROID, true, true,"û", "shr.celpoints.pallas"),
    JUNO(19, CelPointCat.ASTEROID, true, true,"ü","shr.celpoints.juno"),
    VESTA(20, CelPointCat.ASTEROID, true, true,"À","shr.celpoints.vesta"),
    HUYA(48628, CelPointCat.PLUTOID, true, true,"ï", "shr.celpoints.huya"),
    MAKEMAKE(146472, CelPointCat.PLUTOID, true, true,"î", "shr.celpoints.makemake"),
    HAUMEA( 146108, CelPointCat.PLUTOID, true, true,"í", "shr.celpoints.haumea"),
    ERIS( 146199, CelPointCat.PLUTOID, true, true,"*", "shr.celpoints.eris"),
    IXION( 38978, CelPointCat.PLUTOID, true, true,"ó", "shr.celpoints.ixion"),
    ORCUS( 100482, CelPointCat.PLUTOID, true, true,"ù", "shr.celpoints.orcus"),
    QUAOAR( 60000, CelPointCat.PLUTOID, true, true,"ô",  "shr.celpoints.quaoar"),
    SEDNA( 100377, CelPointCat.PLUTOID, true, true,"ö", "shr.celpoints.sedna"),
    VARUNA(30000, CelPointCat.PLUTOID, true, true,"ò", "shr.celpoints.varuna"),
}