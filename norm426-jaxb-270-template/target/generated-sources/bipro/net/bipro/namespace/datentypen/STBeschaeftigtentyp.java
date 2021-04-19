
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Beschaeftigtentyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Beschaeftigtentyp"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Beschaeftigtentyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBeschaeftigtentyp {


    /**
     * Vollzeitmitarbeiter
     * 
     */
    @XmlEnumValue("01")
    VOLLZEITMITARBEITER("01"),

    /**
     * Teilzeitmitarbeiter
     * 
     */
    @XmlEnumValue("02")
    TEILZEITMITARBEITER("02"),

    /**
     * Aushilfe
     * 
     */
    @XmlEnumValue("03")
    AUSHILFE("03"),

    /**
     * Geringfügig Beschäftigter
     * 
     */
    @XmlEnumValue("04")
    GERINGFUEGIG_BESCHAEFTIGTER("04"),

    /**
     * Familienangehöriger
     * 
     */
    @XmlEnumValue("05")
    FAMILIENANGEHOERIGER("05"),

    /**
     * Auszubildender
     * 
     */
    @XmlEnumValue("06")
    AUSZUBILDENDER("06"),

    /**
     * Unentgeltlich
     * 
     */
    @XmlEnumValue("07")
    UNENTGELTLICH("07"),

    /**
     * Saisonkraft
     * 
     */
    @XmlEnumValue("08")
    SAISONKRAFT("08"),

    /**
     * Heimarbeiter
     * 
     */
    @XmlEnumValue("09")
    HEIMARBEITER("09"),

    /**
     * Leiharbeiter
     * 
     */
    @XmlEnumValue("10")
    LEIHARBEITER("10");
    private final String value;

    STBeschaeftigtentyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBeschaeftigtentyp fromValue(String v) {
        for (STBeschaeftigtentyp c: STBeschaeftigtentyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
