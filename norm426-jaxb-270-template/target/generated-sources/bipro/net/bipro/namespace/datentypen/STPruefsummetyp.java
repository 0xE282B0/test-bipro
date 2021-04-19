
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Pruefsummetyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Pruefsummetyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MD5"/&gt;
 *     &lt;enumeration value="SHA1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Pruefsummetyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STPruefsummetyp {


    /**
     * MD5-Algorithmus
     * 
     */
    @XmlEnumValue("MD5")
    MD_5("MD5"),

    /**
     * SHA1-Algorithmus
     * 
     */
    @XmlEnumValue("SHA1")
    SHA_1("SHA1");
    private final String value;

    STPruefsummetyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STPruefsummetyp fromValue(String v) {
        for (STPruefsummetyp c: STPruefsummetyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
