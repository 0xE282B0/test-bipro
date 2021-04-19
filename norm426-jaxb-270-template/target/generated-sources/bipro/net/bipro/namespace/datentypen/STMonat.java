
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Monat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Monat"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Monat")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMonat {


    /**
     * Januar
     * 
     */
    @XmlEnumValue("01")
    JANUAR("01"),

    /**
     * Februar
     * 
     */
    @XmlEnumValue("02")
    FEBRUAR("02"),

    /**
     * März
     * 
     */
    @XmlEnumValue("03")
    MAERZ("03"),

    /**
     * April
     * 
     */
    @XmlEnumValue("04")
    APRIL("04"),

    /**
     * Mai
     * 
     */
    @XmlEnumValue("05")
    MAI("05"),

    /**
     * Juni
     * 
     */
    @XmlEnumValue("06")
    JUNI("06"),

    /**
     * Juli
     * 
     */
    @XmlEnumValue("07")
    JULI("07"),

    /**
     * August
     * 
     */
    @XmlEnumValue("08")
    AUGUST("08"),

    /**
     * September
     * 
     */
    @XmlEnumValue("09")
    SEPTEMBER("09"),

    /**
     * Oktober
     * 
     */
    @XmlEnumValue("10")
    OKTOBER("10"),

    /**
     * November
     * 
     */
    @XmlEnumValue("11")
    NOVEMBER("11"),

    /**
     * Dezember
     * 
     */
    @XmlEnumValue("12")
    DEZEMBER("12");
    private final String value;

    STMonat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMonat fromValue(String v) {
        for (STMonat c: STMonat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
