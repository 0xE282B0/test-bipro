
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Anredeschluessel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Anredeschluessel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Anredeschluessel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAnredeschluessel {


    /**
     * ohne Anrede
     * 
     */
    @XmlEnumValue("0")
    OHNE_ANREDE("0"),

    /**
     * Herr
     * 
     */
    @XmlEnumValue("1")
    HERR("1"),

    /**
     * Frau
     * 
     */
    @XmlEnumValue("2")
    FRAU("2"),

    /**
     * Firma
     * 
     */
    @XmlEnumValue("3")
    FIRMA("3"),

    /**
     * Herr und Frau
     * 
     */
    @XmlEnumValue("4")
    HERR_UND_FRAU("4"),

    /**
     * Fraeulein
     * 
     */
    @XmlEnumValue("5")
    FRAEULEIN("5");
    private final String value;

    STAnredeschluessel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAnredeschluessel fromValue(String v) {
        for (STAnredeschluessel c: STAnredeschluessel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
