
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Berechnungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Berechnungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Berechnungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBerechnungsart {


    /**
     * inklusive (z.B. 5 Aushilfen von insgesamt 20 Mitarbeitern)
     * 
     */
    @XmlEnumValue("01")
    INKLUSIVE("01"),

    /**
     * zuzüglich (z.B. 5 Aushilfen zusätzlich zu 20 Mitarbeitern)
     * 
     */
    @XmlEnumValue("02")
    ZUZUEGLICH("02");
    private final String value;

    STBerechnungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBerechnungsart fromValue(String v) {
        for (STBerechnungsart c: STBerechnungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
