
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Besitzverhaeltnis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Besitzverhaeltnis"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Besitzverhaeltnis")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBesitzverhaeltnis {


    /**
     * Leihe
     * 
     */
    @XmlEnumValue("1")
    LEIHE("1"),

    /**
     * Miete
     * 
     */
    @XmlEnumValue("2")
    MIETE("2"),

    /**
     * Pacht
     * 
     */
    @XmlEnumValue("3")
    PACHT("3"),

    /**
     * Verwahrung
     * 
     */
    @XmlEnumValue("4")
    VERWAHRUNG("4"),

    /**
     * Leasing
     * 
     */
    @XmlEnumValue("5")
    LEASING("5"),

    /**
     * verbotene Eigenmacht / Diebstahl
     * 
     */
    @XmlEnumValue("6")
    DIEBSTAHL("6"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STBesitzverhaeltnis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBesitzverhaeltnis fromValue(String v) {
        for (STBesitzverhaeltnis c: STBesitzverhaeltnis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
