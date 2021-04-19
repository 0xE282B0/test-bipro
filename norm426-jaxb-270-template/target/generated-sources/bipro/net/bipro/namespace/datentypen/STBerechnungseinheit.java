
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Berechnungseinheit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Berechnungseinheit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="15"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="21"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Berechnungseinheit")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBerechnungseinheit {


    /**
     * Prozent
     * 
     */
    @XmlEnumValue("10")
    PROZENT("10"),

    /**
     * Promille
     * 
     */
    @XmlEnumValue("11")
    PROMILLE("11"),

    /**
     * Faktor
     * 
     */
    @XmlEnumValue("15")
    FAKTOR("15"),

    /**
     * Waehrung gem. Waehrunsschluessel
     * 
     */
    @XmlEnumValue("20")
    WAEHRUNG("20"),

    /**
     * Mark 1914
     * 
     */
    @XmlEnumValue("21")
    MARK_1914("21");
    private final String value;

    STBerechnungseinheit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBerechnungseinheit fromValue(String v) {
        for (STBerechnungseinheit c: STBerechnungseinheit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
