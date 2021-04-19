
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Abstellort.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Abstellort"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Abstellort")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAbstellort {


    /**
     * Straße
     * 
     */
    @XmlEnumValue("01")
    STRASSE("01"),

    /**
     * Stellplatz
     * 
     */
    @XmlEnumValue("02")
    STELLPLATZ("02"),

    /**
     * Tiefgarage
     * 
     */
    @XmlEnumValue("03")
    TIEFGARAGE("03"),

    /**
     * Einzelgarage
     * 
     */
    @XmlEnumValue("04")
    EINZELGARAGE("04"),

    /**
     * Parkhaus
     * 
     */
    @XmlEnumValue("05")
    PARKHAUS("05"),

    /**
     * Hofraum
     * 
     */
    @XmlEnumValue("06")
    HOFRAUM("06"),

    /**
     * unbewachter Parkplatz
     * 
     */
    @XmlEnumValue("07")
    UNBEWACHTER_PARKPLATZ("07"),

    /**
     * bewachter Parkplatz
     * 
     */
    @XmlEnumValue("08")
    BEWACHTER_PARKPLATZ("08");
    private final String value;

    STAbstellort(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAbstellort fromValue(String v) {
        for (STAbstellort c: STAbstellort.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
