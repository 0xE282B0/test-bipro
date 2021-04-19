
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Sitzbezug.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Sitzbezug"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Sitzbezug")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSitzbezug {


    /**
     * Stoff
     * 
     */
    @XmlEnumValue("1")
    STOFF("1"),

    /**
     * Kunstleder
     * 
     */
    @XmlEnumValue("2")
    KUNSTLEDER("2"),

    /**
     * Leder
     * 
     */
    @XmlEnumValue("3")
    LEDER("3");
    private final String value;

    STSitzbezug(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSitzbezug fromValue(String v) {
        for (STSitzbezug c: STSitzbezug.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
