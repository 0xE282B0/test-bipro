
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Eigenbeitragsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Eigenbeitragsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="min"/&gt;
 *     &lt;enumeration value="max"/&gt;
 *     &lt;enumeration value="individuell"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Eigenbeitragsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STEigenbeitragsart {


    /**
     * Minimaler Eigenbeitrag bei vollen Zulagen
     * 
     */
    @XmlEnumValue("min")
    MIN("min"),

    /**
     * Maximaler Eigenbeitrag
     * 
     */
    @XmlEnumValue("max")
    MAX("max"),

    /**
     * Individuell festgelegter Eigenbeitrag
     * 
     */
    @XmlEnumValue("individuell")
    INDIVIDUELL("individuell");
    private final String value;

    STEigenbeitragsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STEigenbeitragsart fromValue(String v) {
        for (STEigenbeitragsart c: STEigenbeitragsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
