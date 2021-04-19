
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Meldeturnus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Meldeturnus"&gt;
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
@XmlType(name = "ST_Meldeturnus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMeldeturnus {


    /**
     * Anmeldung vor Risikobeginn
     * 
     */
    @XmlEnumValue("01")
    VOR_RISIKOBEGINN("01"),

    /**
     * Anmeldung wöchentlich
     * 
     */
    @XmlEnumValue("02")
    WOECHENTLICH("02"),

    /**
     * Anmeldung monatlich
     * 
     */
    @XmlEnumValue("03")
    MONATLICH("03"),

    /**
     * Anmeldung vierteljährlich
     * 
     */
    @XmlEnumValue("04")
    VIERTELJAEHRLICH("04"),

    /**
     * Anmeldung halbjährlich
     * 
     */
    @XmlEnumValue("05")
    HALBJAEHRLICH("05"),

    /**
     * Anmeldung jährlich
     * 
     */
    @XmlEnumValue("06")
    JAEHRLICH("06");
    private final String value;

    STMeldeturnus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMeldeturnus fromValue(String v) {
        for (STMeldeturnus c: STMeldeturnus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
