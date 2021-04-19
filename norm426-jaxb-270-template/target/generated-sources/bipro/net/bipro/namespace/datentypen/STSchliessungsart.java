
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Schliessungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Schliessungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Schliessungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STSchliessungsart {


    /**
     * Schließung mit Zahlung
     * 
     */
    @XmlEnumValue("01")
    SCHLIESSUNG_MIT_ZAHLUNG("01"),

    /**
     * Ablehnung
     * 
     */
    @XmlEnumValue("02")
    ABLEHNUNG("02"),

    /**
     * Schließung ohne Zahlung (z.B. unterhalb Selbstbehalt)
     * 
     */
    @XmlEnumValue("03")
    SCHLIESSUNG_OHNE_ZAHLUNG("03"),

    /**
     * Kulanz
     * Ist aufgrund von Compliance nicht mehr zu verwenden. 
     * 
     */
    @XmlEnumValue("04")
    KULANZ("04"),

    /**
     * Falschanlage
     * 
     */
    @XmlEnumValue("05")
    FALSCHANLAGE("05");
    private final String value;

    STSchliessungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSchliessungsart fromValue(String v) {
        for (STSchliessungsart c: STSchliessungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
