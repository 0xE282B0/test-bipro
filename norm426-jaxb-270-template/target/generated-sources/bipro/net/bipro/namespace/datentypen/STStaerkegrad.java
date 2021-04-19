
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Staerkegrad.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Staerkegrad"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Staerkegrad")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STStaerkegrad {


    /**
     * leicht
     * 
     */
    @XmlEnumValue("01")
    LEICHT("01"),

    /**
     * mittel
     * 
     */
    @XmlEnumValue("02")
    MITTEL("02"),

    /**
     * schwer
     * 
     */
    @XmlEnumValue("03")
    SCHWER("03");
    private final String value;

    STStaerkegrad(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STStaerkegrad fromValue(String v) {
        for (STStaerkegrad c: STStaerkegrad.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
