
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Anschriftart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Anschriftart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Anschriftart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAnschriftart {


    /**
     * Strassenadresse
     * 
     */
    @XmlEnumValue("1")
    STRASSENADRESSE("1"),

    /**
     * Postfachadresse
     * 
     */
    @XmlEnumValue("2")
    POSTFACHADRESSE("2"),

    /**
     * Grosskundenadresse
     * 
     */
    @XmlEnumValue("3")
    GROSSKUNDENADRESSE("3");
    private final String value;

    STAnschriftart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAnschriftart fromValue(String v) {
        for (STAnschriftart c: STAnschriftart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
