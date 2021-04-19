
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vermittlerrolle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vermittlerrolle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vermittlerrolle")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVermittlerrolle {


    /**
     * Hauptvermittler
     * 
     */
    @XmlEnumValue("01")
    HAUPTVERMITTLER("01"),

    /**
     * Untervermittler
     * 
     */
    @XmlEnumValue("02")
    UNTERVERMITTLER("02"),

    /**
     * Uebermittelnder Vermittler
     * 
     */
    @XmlEnumValue("03")
    UEBERMITTELNDER_VERMITTLER("03"),

    /**
     * Filialnummer
     * 
     */
    @XmlEnumValue("10")
    FILIALNUMMER("10");
    private final String value;

    STVermittlerrolle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVermittlerrolle fromValue(String v) {
        for (STVermittlerrolle c: STVermittlerrolle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
