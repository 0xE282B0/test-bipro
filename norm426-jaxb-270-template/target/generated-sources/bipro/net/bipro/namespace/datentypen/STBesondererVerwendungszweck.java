
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BesondererVerwendungszweck.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BesondererVerwendungszweck"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BesondererVerwendungszweck")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBesondererVerwendungszweck {


    /**
     * Hypothekentilgung
     * 
     */
    @XmlEnumValue("1")
    HYPOTHEKENTILGUNG("1"),

    /**
     * Vermögenswirksame Leistung
     * 
     */
    @XmlEnumValue("2")
    VERMOEGENSWIRKSAME_LEISTUNG("2"),

    /**
     * Restschuldversicherung
     * 
     */
    @XmlEnumValue("3")
    RESTSCHULDVERSICHERUNG("3"),

    /**
     * sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STBesondererVerwendungszweck(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBesondererVerwendungszweck fromValue(String v) {
        for (STBesondererVerwendungszweck c: STBesondererVerwendungszweck.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
