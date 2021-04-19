
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BootMotorlage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BootMotorlage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BootMotorlage")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBootMotorlage {


    /**
     * Außenborder
     * 
     */
    @XmlEnumValue("01")
    AUSSENBORDER("01"),

    /**
     * Innenborder
     * 
     */
    @XmlEnumValue("02")
    INNENBORDER("02");
    private final String value;

    STBootMotorlage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBootMotorlage fromValue(String v) {
        for (STBootMotorlage c: STBootMotorlage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
