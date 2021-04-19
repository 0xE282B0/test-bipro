
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Nutzung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Nutzung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fremdgenutzt"/&gt;
 *     &lt;enumeration value="selbstgenutzt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Nutzung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STNutzung {


    /**
     * fremdgenutzt
     * 
     */
    @XmlEnumValue("fremdgenutzt")
    FREMDGENUTZT("fremdgenutzt"),

    /**
     * selbstgenutzt
     * 
     */
    @XmlEnumValue("selbstgenutzt")
    SELBSTGENUTZT("selbstgenutzt");
    private final String value;

    STNutzung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STNutzung fromValue(String v) {
        for (STNutzung c: STNutzung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
