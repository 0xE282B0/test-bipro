
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vertraulich.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vertraulich"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vertraulich")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVertraulich {


    /**
     * Aufgrund einer Vereinbarung zwischen Consumer und Provider besonders schützenswert.
     * 
     */
    @XmlEnumValue("01")
    BESONDERS_SCHUETZENSWERT("01"),

    /**
     * Aufgrund einer Vereinbarung zwischen Consumer und Provider nicht besonders schützenswert.
     * 
     */
    @XmlEnumValue("02")
    NICHT_BESONDERS_SCHUETZENSWERT("02");
    private final String value;

    STVertraulich(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVertraulich fromValue(String v) {
        for (STVertraulich c: STVertraulich.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
