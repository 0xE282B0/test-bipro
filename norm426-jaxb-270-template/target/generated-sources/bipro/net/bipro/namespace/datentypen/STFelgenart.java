
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Felgenart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Felgenart"&gt;
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
@XmlType(name = "ST_Felgenart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFelgenart {


    /**
     * Stahlfelgen
     * 
     */
    @XmlEnumValue("1")
    STAHLFELGEN("1"),

    /**
     * Leichtmetallfelgen
     * 
     */
    @XmlEnumValue("2")
    LEICHTMETALLFELGEN("2"),

    /**
     * verchromte Felgen
     * 
     */
    @XmlEnumValue("3")
    VERCHROMTE_FELGEN("3"),

    /**
     * Sonstige Felgen
     * 
     */
    @XmlEnumValue("9")
    SONSTIGE_FELGEN("9");
    private final String value;

    STFelgenart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFelgenart fromValue(String v) {
        for (STFelgenart c: STFelgenart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
