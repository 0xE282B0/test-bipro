
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BruttoNetto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BruttoNetto"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Brutto"/&gt;
 *     &lt;enumeration value="Netto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BruttoNetto")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBruttoNetto {

    @XmlEnumValue("Brutto")
    BRUTTO("Brutto"),
    @XmlEnumValue("Netto")
    NETTO("Netto");
    private final String value;

    STBruttoNetto(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBruttoNetto fromValue(String v) {
        for (STBruttoNetto c: STBruttoNetto.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
