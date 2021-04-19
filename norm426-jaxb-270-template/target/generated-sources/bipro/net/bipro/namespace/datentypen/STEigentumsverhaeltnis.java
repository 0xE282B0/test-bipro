
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Eigentumsverhaeltnis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Eigentumsverhaeltnis"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Eigentumsverhaeltnis")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STEigentumsverhaeltnis {


    /**
     * Eigentum VN
     * 
     */
    @XmlEnumValue("1")
    EIGENTUM_VN("1"),

    /**
     * Eigentum / Finanzierung
     * 
     */
    @XmlEnumValue("2")
    EIGENTUM_FINANZIERUNG("2"),

    /**
     * Leasing
     * 
     */
    @XmlEnumValue("3")
    LEASING("3"),

    /**
     * Mieter
     * 
     */
    @XmlEnumValue("4")
    MIETER("4"),

    /**
     * Pächter
     * 
     */
    @XmlEnumValue("5")
    PAECHTER("5"),

    /**
     * Niessbrauch
     * 
     */
    @XmlEnumValue("6")
    NIESSBRAUCH("6");
    private final String value;

    STEigentumsverhaeltnis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STEigentumsverhaeltnis fromValue(String v) {
        for (STEigentumsverhaeltnis c: STEigentumsverhaeltnis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
