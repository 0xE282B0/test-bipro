
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Konstruktionsteil.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Konstruktionsteil"&gt;
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
@XmlType(name = "ST_Konstruktionsteil")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STKonstruktionsteil {


    /**
     * Bedachung
     * 
     */
    @XmlEnumValue("01")
    BEDACHUNG("01"),

    /**
     * Decke
     * 
     */
    @XmlEnumValue("02")
    DECKE("02"),

    /**
     * Deckenverkleidung
     * 
     */
    @XmlEnumValue("03")
    DECKENVERKLEIDUNG("03"),

    /**
     * Wand
     * 
     */
    @XmlEnumValue("04")
    WAND("04"),

    /**
     * Wandverkleidung
     * 
     */
    @XmlEnumValue("05")
    WANDVERKLEIDUNG("05"),

    /**
     * Unterboden
     * 
     */
    @XmlEnumValue("06")
    UNTERBODEN("06"),

    /**
     * Bodenbelag
     * 
     */
    @XmlEnumValue("07")
    BODENBELAG("07");
    private final String value;

    STKonstruktionsteil(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKonstruktionsteil fromValue(String v) {
        for (STKonstruktionsteil c: STKonstruktionsteil.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
