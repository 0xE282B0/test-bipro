
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Beihilfetraeger.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Beihilfetraeger"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BB"/&gt;
 *     &lt;enumeration value="BLO"/&gt;
 *     &lt;enumeration value="BLW"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BW"/&gt;
 *     &lt;enumeration value="BY"/&gt;
 *     &lt;enumeration value="DP"/&gt;
 *     &lt;enumeration value="HBG"/&gt;
 *     &lt;enumeration value="HES"/&gt;
 *     &lt;enumeration value="KVB"/&gt;
 *     &lt;enumeration value="MV"/&gt;
 *     &lt;enumeration value="NDS"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="RP"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="BDO"/&gt;
 *     &lt;enumeration value="BDW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Beihilfetraeger")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBeihilfetraeger {


    /**
     * Brandenburg
     * 
     */
    @XmlEnumValue("BB")
    BRANDENBURG("BB"),

    /**
     * Berlin Ost
     * 
     */
    @XmlEnumValue("BLO")
    BERLIN_OST("BLO"),

    /**
     * Berlin West
     * 
     */
    @XmlEnumValue("BLW")
    BERLIN_WEST("BLW"),

    /**
     * Bremen
     * 
     */
    @XmlEnumValue("BR")
    BREMEN("BR"),

    /**
     * Baden-Wuerttemberg
     * 
     */
    @XmlEnumValue("BW")
    BADEN_WUERTTEMBERG("BW"),

    /**
     * Bayern
     * 
     */
    @XmlEnumValue("BY")
    BAYERN("BY"),

    /**
     * Post
     * 
     */
    @XmlEnumValue("DP")
    POST("DP"),

    /**
     * Hamburg
     * 
     */
    @XmlEnumValue("HBG")
    HAMBURG("HBG"),

    /**
     * Hessen
     * 
     */
    @XmlEnumValue("HES")
    HESSEN("HES"),

    /**
     * Bundesbahn
     * 
     */
    @XmlEnumValue("KVB")
    BUNDESBAHN("KVB"),

    /**
     * Mecklenburg / Vorpommern
     * 
     */
    @XmlEnumValue("MV")
    MECKLENBURG_VORPOMMERN("MV"),

    /**
     * Niedersachsen
     * 
     */
    @XmlEnumValue("NDS")
    NIEDERSACHSEN("NDS"),

    /**
     * Nordrhein-Westfalen
     * 
     */
    @XmlEnumValue("NW")
    NORDRHEIN_WESTFALEN("NW"),

    /**
     * Rheinland-Pfalz
     * 
     */
    @XmlEnumValue("RP")
    RHEINLAND_PFALZ("RP"),

    /**
     * Sachsen-Anhalt
     * 
     */
    @XmlEnumValue("SA")
    SACHSEN_ANHALT("SA"),

    /**
     * Sachsen
     * 
     */
    @XmlEnumValue("SC")
    SACHSEN("SC"),

    /**
     * Schleswig-Holstein
     * 
     */
    @XmlEnumValue("SH")
    SCHLESWIG_HOLSTEIN("SH"),

    /**
     * Saarland
     * 
     */
    @XmlEnumValue("SL")
    SAARLAND("SL"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("SO")
    SONSTIGE("SO"),

    /**
     * Thueringen
     * 
     */
    @XmlEnumValue("TH")
    THUERINGEN("TH"),

    /**
     * Bund Ost
     * 
     */
    @XmlEnumValue("BDO")
    BUND_OST("BDO"),

    /**
     * Bund West
     * 
     */
    @XmlEnumValue("BDW")
    BUND_WEST("BDW");
    private final String value;

    STBeihilfetraeger(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBeihilfetraeger fromValue(String v) {
        for (STBeihilfetraeger c: STBeihilfetraeger.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
