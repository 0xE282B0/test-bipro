
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BeschaedigungKfz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BeschaedigungKfz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BeschaedigungKfz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBeschaedigungKfz {


    /**
     * Frontscheibe
     * 
     */
    @XmlEnumValue("01")
    FRONTSCHEIBE("01"),

    /**
     * Seitenscheibe
     * 
     */
    @XmlEnumValue("02")
    SEITENSCHEIBE("02"),

    /**
     * Heckscheibe
     * 
     */
    @XmlEnumValue("03")
    HECKSCHEIBE("03"),

    /**
     * Scheinwerfer
     * 
     */
    @XmlEnumValue("04")
    SCHEINWERFER("04"),

    /**
     * Heckleuchte
     * 
     */
    @XmlEnumValue("05")
    HECKLEUCHTE("05"),

    /**
     * Spiegel
     * 
     */
    @XmlEnumValue("06")
    SPIEGEL("06"),

    /**
     * Blinker
     * 
     */
    @XmlEnumValue("07")
    BLINKER("07");
    private final String value;

    STBeschaedigungKfz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBeschaedigungKfz fromValue(String v) {
        for (STBeschaedigungKfz c: STBeschaedigungKfz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
