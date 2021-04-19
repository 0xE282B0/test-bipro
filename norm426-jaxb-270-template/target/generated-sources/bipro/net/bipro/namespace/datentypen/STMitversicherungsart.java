
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Mitversicherungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Mitversicherungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Mitversicherungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMitversicherungsart {


    /**
     * in häuslicher Gemeinschaft mitlebender Partner
     * 
     */
    @XmlEnumValue("01")
    IN_HAEUSLICHER_GEMEINSCHAFT_MITLEBENDER_PARTNER("01"),

    /**
     * Einzelperson in häuslicher Gemeinschaft mitlebend
     * 
     */
    @XmlEnumValue("02")
    EINZELPERSON_IN_HAEUSLICHER_GEMEINSCHAFT_MITLEBEND("02"),

    /**
     * Einzelperson nicht in häuslicher Gemeinschaft mitlebend
     * 
     */
    @XmlEnumValue("03")
    EINZELPERSON_NICHT_IN_HAEUSLICHER_GEMEINSCHAFT_MITLEBEND("03"),

    /**
     * Kinder
     * 
     */
    @XmlEnumValue("04")
    KINDER("04");
    private final String value;

    STMitversicherungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMitversicherungsart fromValue(String v) {
        for (STMitversicherungsart c: STMitversicherungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
