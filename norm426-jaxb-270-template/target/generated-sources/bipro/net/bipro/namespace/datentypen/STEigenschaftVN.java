
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_EigenschaftVN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_EigenschaftVN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_EigenschaftVN")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STEigenschaftVN {


    /**
     * Mieter
     * 
     */
    @XmlEnumValue("01")
    MIETER("01"),

    /**
     * Vermieter
     * 
     */
    @XmlEnumValue("02")
    VERMIETER("02"),

    /**
     * Eigentümer
     * 
     */
    @XmlEnumValue("03")
    EIGENTUEMER("03"),

    /**
     * Nutzungsberechtigter
     * 
     */
    @XmlEnumValue("04")
    NUTZUNGSBERECHTIGTER("04"),

    /**
     * Arbeitgeber
     * 
     */
    @XmlEnumValue("05")
    ARBEITGEBER("05"),

    /**
     * Arbeitnehmer
     * 
     */
    @XmlEnumValue("06")
    ARBEITNEHMER("06");
    private final String value;

    STEigenschaftVN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STEigenschaftVN fromValue(String v) {
        for (STEigenschaftVN c: STEigenschaftVN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
