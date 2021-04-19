
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BusBauart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BusBauart"&gt;
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
@XmlType(name = "ST_BusBauart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBusBauart {


    /**
     * Eindeckerbus
     * 
     */
    @XmlEnumValue("01")
    EINDECKERBUS("01"),

    /**
     * Eindecker-Gelenkbus
     * 
     */
    @XmlEnumValue("02")
    EINDECKER_GELENKBUS("02"),

    /**
     * Anderthalbdecker
     * 
     */
    @XmlEnumValue("03")
    ANDERTHALBDECKER("03"),

    /**
     * Doppeldeckerbus
     * 
     */
    @XmlEnumValue("04")
    DOPPELDECKERBUS("04"),

    /**
     * Doppeldecker-Gelenkbus
     * 
     */
    @XmlEnumValue("05")
    DOPPELDECKER_GELENKBUS("05"),

    /**
     * Kleinbus
     * 
     */
    @XmlEnumValue("06")
    KLEINBUS("06");
    private final String value;

    STBusBauart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBusBauart fromValue(String v) {
        for (STBusBauart c: STBusBauart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
