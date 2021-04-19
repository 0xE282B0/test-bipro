
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_KrankenVersicherungsschutz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_KrankenVersicherungsschutz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_KrankenVersicherungsschutz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STKrankenVersicherungsschutz {


    /**
     * Vollversicherung
     * 
     */
    @XmlEnumValue("1")
    VOLLVERSICHERUNG("1"),

    /**
     * Zusatzversicherung
     * 
     */
    @XmlEnumValue("2")
    ZUSATZVERSICHERUNG("2"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("3")
    SONSTIGES("3");
    private final String value;

    STKrankenVersicherungsschutz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKrankenVersicherungsschutz fromValue(String v) {
        for (STKrankenVersicherungsschutz c: STKrankenVersicherungsschutz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
