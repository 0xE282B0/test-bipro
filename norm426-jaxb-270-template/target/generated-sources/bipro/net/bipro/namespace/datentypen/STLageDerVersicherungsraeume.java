
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LageDerVersicherungsraeume.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LageDerVersicherungsraeume"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ErdObergeschoss"/&gt;
 *     &lt;enumeration value="Keller"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_LageDerVersicherungsraeume")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLageDerVersicherungsraeume {


    /**
     * Oberhalb oder gleich der Erdgleiche.
     * 
     */
    @XmlEnumValue("ErdObergeschoss")
    ERD_OBERGESCHOSS("ErdObergeschoss"),

    /**
     * Unterhalb der Erdgleiche.
     * 
     */
    @XmlEnumValue("Keller")
    KELLER("Keller");
    private final String value;

    STLageDerVersicherungsraeume(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLageDerVersicherungsraeume fromValue(String v) {
        for (STLageDerVersicherungsraeume c: STLageDerVersicherungsraeume.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
