
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Motorart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Motorart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Motorart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STMotorart {


    /**
     * Viertakter
     * 
     */
    @XmlEnumValue("01")
    VIERTAKTER("01"),

    /**
     * Diesel-Motor
     * 
     */
    @XmlEnumValue("02")
    DIESEL_MOTOR("02"),

    /**
     * Zweitakter
     * 
     */
    @XmlEnumValue("03")
    ZWEITAKTER("03"),

    /**
     * Gas
     * 
     */
    @XmlEnumValue("04")
    GAS("04"),

    /**
     * Hybrid
     * 
     */
    @XmlEnumValue("05")
    HYBRID("05"),

    /**
     * Elektro
     * 
     */
    @XmlEnumValue("06")
    ELEKTRO("06"),

    /**
     * Brennstoffzelle
     * 
     */
    @XmlEnumValue("07")
    BRENNSTOFFZELLE("07"),

    /**
     * sonstiger Motor
     * 
     */
    @XmlEnumValue("99")
    SONSTIGER_MOTOR("99");
    private final String value;

    STMotorart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMotorart fromValue(String v) {
        for (STMotorart c: STMotorart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
