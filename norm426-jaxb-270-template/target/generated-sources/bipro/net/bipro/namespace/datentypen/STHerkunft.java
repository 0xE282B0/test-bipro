
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Herkunft.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Herkunft"&gt;
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
@XmlType(name = "ST_Herkunft")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STHerkunft {


    /**
     * Einzahlung
     * 
     */
    @XmlEnumValue("01")
    EINZAHLUNG("01"),

    /**
     * Einzahlung aus Umschichtung
     * 
     */
    @XmlEnumValue("02")
    EINZAHLUNG_UMSCHICHTUNG("02"),

    /**
     * Auszahlung
     * 
     */
    @XmlEnumValue("03")
    AUSZAHLUNG("03"),

    /**
     * Auszahlung zur Umschichtung
     * 
     */
    @XmlEnumValue("04")
    AUSZAHLUNG_UMSCHICHTUNG("04"),

    /**
     * Ausschüttung
     * 
     */
    @XmlEnumValue("05")
    AUSSCHUETTUNG("05"),

    /**
     * Zinsen
     * 
     */
    @XmlEnumValue("06")
    ZINSEN("06"),

    /**
     * Gebühr
     * 
     */
    @XmlEnumValue("07")
    GEBUEHR("07"),

    /**
     * Steuer
     * 
     */
    @XmlEnumValue("08")
    STEUER("08");
    private final String value;

    STHerkunft(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STHerkunft fromValue(String v) {
        for (STHerkunft c: STHerkunft.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
