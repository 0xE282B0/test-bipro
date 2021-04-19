
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Glasrisiko.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Glasrisiko"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="09"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="13"/&gt;
 *     &lt;enumeration value="14"/&gt;
 *     &lt;enumeration value="15"/&gt;
 *     &lt;enumeration value="16"/&gt;
 *     &lt;enumeration value="17"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Glasrisiko")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGlasrisiko {


    /**
     * Einfamilienhaus ohne Einliegerwohnung
     * 
     */
    @XmlEnumValue("01")
    EINFAMILIENHAUS_OHNE_EINLIEGERWOHNUNG("01"),

    /**
     * Einfamilienhaus mit Einliegerwohnung
     * 
     */
    @XmlEnumValue("02")
    EINFAMILIENHAUS_MIT_EINLIEGERWOHNUNG("02"),

    /**
     * Mietwohnung
     * 
     */
    @XmlEnumValue("03")
    MIETWOHNUNG("03"),

    /**
     * Wohnung moebliert vermietet
     * 
     */
    @XmlEnumValue("04")
    WOHNUNG_MOEBLIERT_VERMIETET("04"),

    /**
     * Mehrfamilienhaus
     * 
     */
    @XmlEnumValue("05")
    MEHRFAMILIENHAUS("05"),

    /**
     * Wohngebaeude
     * 
     */
    @XmlEnumValue("06")
    WOHNGEBAEUDE("06"),

    /**
     * Geschaeftsgebaeude
     * 
     */
    @XmlEnumValue("07")
    GESCHAEFTSGEBAEUDE("07"),

    /**
     * Wohn- / Geschaeftsgebaeude
     * 
     */
    @XmlEnumValue("08")
    WOHN_GESCHAEFTSGEBAEUDE("08"),

    /**
     * Buerogebaeude
     * 
     */
    @XmlEnumValue("09")
    BUEROGEBAEUDE("09"),

    /**
     * Geschaefts- / Buerobetrieb
     * 
     */
    @XmlEnumValue("10")
    GESCHAEFTS_BUEROBETRIEB("10"),

    /**
     * Industriebau
     * 
     */
    @XmlEnumValue("11")
    INDUSTRIEBAU("11"),

    /**
     * Glas - Keramik
     * 
     */
    @XmlEnumValue("12")
    GLAS_KERAMIK("12"),

    /**
     * Aquarium
     * 
     */
    @XmlEnumValue("13")
    AQUARIUM("13"),

    /**
     * Ganzglaskonstruktion
     * 
     */
    @XmlEnumValue("14")
    GANZGLASKONSTRUKTION("14"),

    /**
     * Werbeanlagen
     * 
     */
    @XmlEnumValue("15")
    WERBEANLAGEN("15"),

    /**
     * Kunststoff
     * 
     */
    @XmlEnumValue("16")
    KUNSTSTOFF("16"),

    /**
     * Inhalt
     * 
     */
    @XmlEnumValue("17")
    INHALT("17"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STGlasrisiko(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGlasrisiko fromValue(String v) {
        for (STGlasrisiko c: STGlasrisiko.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
