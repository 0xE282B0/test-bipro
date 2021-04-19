
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Mangelart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Mangelart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Mangelart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STMangelart {


    /**
     * Bau
     * 
     */
    @XmlEnumValue("01")
    BAU("01"),

    /**
     * Durchnässung
     * 
     */
    @XmlEnumValue("02")
    DURCHNAESSUNG("02"),

    /**
     * Dach
     * 
     */
    @XmlEnumValue("03")
    DACH("03"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE("99");
    private final String value;

    STMangelart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMangelart fromValue(String v) {
        for (STMangelart c: STMangelart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
