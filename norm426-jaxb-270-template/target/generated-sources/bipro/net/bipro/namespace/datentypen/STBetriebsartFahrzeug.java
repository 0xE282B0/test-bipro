
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BetriebsartFahrzeug.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BetriebsartFahrzeug"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BetriebsartFahrzeug")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBetriebsartFahrzeug {


    /**
     * Eigenbetrieb
     * 
     */
    @XmlEnumValue("01")
    EIGENBETRIEB("01"),

    /**
     * Nebenbetrieb
     * 
     */
    @XmlEnumValue("02")
    NEBENBETRIEB("02"),

    /**
     * Lohnbetrieb
     * 
     */
    @XmlEnumValue("03")
    LOHNBETRIEB("03");
    private final String value;

    STBetriebsartFahrzeug(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBetriebsartFahrzeug fromValue(String v) {
        for (STBetriebsartFahrzeug c: STBetriebsartFahrzeug.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
