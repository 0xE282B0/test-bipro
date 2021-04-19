
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Drittrecht.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Drittrecht"&gt;
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
@XmlType(name = "ST_Drittrecht")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STDrittrecht {


    /**
     * Abtretung
     * 
     */
    @XmlEnumValue("01")
    ABTRETUNG("01"),

    /**
     * Verpfändung
     * 
     */
    @XmlEnumValue("02")
    VERPFAENDUNG("02"),

    /**
     * Pfändung
     * 
     */
    @XmlEnumValue("03")
    PFAENDUNG("03"),

    /**
     * Konkurs
     * 
     */
    @XmlEnumValue("04")
    KONKURS("04"),

    /**
     * Vergleich
     * 
     */
    @XmlEnumValue("05")
    VERGLEICH("05");
    private final String value;

    STDrittrecht(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDrittrecht fromValue(String v) {
        for (STDrittrecht c: STDrittrecht.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
