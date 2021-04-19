
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Leistungsfall.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Leistungsfall"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Todesfall"/&gt;
 *     &lt;enumeration value="Erlebensfall"/&gt;
 *     &lt;enumeration value="Leistungsfall"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Leistungsfall")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLeistungsfall {


    /**
     * Zahlung bei Tod der VP
     * 
     */
    @XmlEnumValue("Todesfall")
    TODESFALL("Todesfall"),

    /**
     * Zahlung zum Auszahlungstermin der Versicherung
     * 
     */
    @XmlEnumValue("Erlebensfall")
    ERLEBENSFALL("Erlebensfall"),

    /**
     * z.B. Selbständige BU
     * 
     */
    @XmlEnumValue("Leistungsfall")
    LEISTUNGSFALL("Leistungsfall");
    private final String value;

    STLeistungsfall(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLeistungsfall fromValue(String v) {
        for (STLeistungsfall c: STLeistungsfall.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
