
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Wasserart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Wasserart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Wasserart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STWasserart {


    /**
     * Kaltwasser
     * 
     */
    @XmlEnumValue("01")
    KALTWASSER("01"),

    /**
     * Warmwasser
     * 
     */
    @XmlEnumValue("02")
    WARMWASSER("02"),

    /**
     * Heizungswasser
     * 
     */
    @XmlEnumValue("03")
    HEIZUNGSWASSER("03"),

    /**
     * Abwasser
     * 
     */
    @XmlEnumValue("04")
    ABWASSER("04"),

    /**
     * Regenwasser
     * 
     */
    @XmlEnumValue("05")
    REGENWASSER("05"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STWasserart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWasserart fromValue(String v) {
        for (STWasserart c: STWasserart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
