
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Dateityp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Dateityp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dokument"/&gt;
 *     &lt;enumeration value="Nettodaten"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Dateityp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STDateityp {


    /**
     * Dokument
     * 
     */
    @XmlEnumValue("Dokument")
    DOKUMENT("Dokument"),

    /**
     * Nettodaten
     * 
     */
    @XmlEnumValue("Nettodaten")
    NETTODATEN("Nettodaten");
    private final String value;

    STDateityp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDateityp fromValue(String v) {
        for (STDateityp c: STDateityp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
