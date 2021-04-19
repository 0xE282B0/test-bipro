
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gerichtstyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gerichtstyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gerichtstyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGerichtstyp {


    /**
     * Finanzgericht
     * 
     */
    @XmlEnumValue("01")
    FINANZGERICHT("01"),

    /**
     * Verwaltungsgericht
     * 
     */
    @XmlEnumValue("02")
    VERWALTUNGSGERICHT("02");
    private final String value;

    STGerichtstyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGerichtstyp fromValue(String v) {
        for (STGerichtstyp c: STGerichtstyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
