
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gebaeudeeinheit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gebaeudeeinheit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gebaeudeeinheit")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGebaeudeeinheit {


    /**
     * Wohnung
     * 
     */
    @XmlEnumValue("01")
    WOHNUNG("01"),

    /**
     * Gewerbeeinheit
     * 
     */
    @XmlEnumValue("02")
    GEWERBEEINHEIT("02"),

    /**
     * Einliegerwohnung
     * 
     */
    @XmlEnumValue("03")
    EINLIEGERWOHNUNG("03"),

    /**
     * Garage / Abstellplatz
     * 
     */
    @XmlEnumValue("04")
    GARAGE_ABSTELLPLATZ("04"),

    /**
     * Bootsliegeplatz
     * 
     */
    @XmlEnumValue("05")
    BOOTSLIEGEPLATZ("05"),

    /**
     * Einfamilienhaus
     * 
     */
    @XmlEnumValue("06")
    EINFAMILIENHAUS("06");
    private final String value;

    STGebaeudeeinheit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGebaeudeeinheit fromValue(String v) {
        for (STGebaeudeeinheit c: STGebaeudeeinheit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
