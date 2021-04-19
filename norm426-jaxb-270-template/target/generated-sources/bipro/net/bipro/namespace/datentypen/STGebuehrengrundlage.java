
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gebuehrengrundlage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gebuehrengrundlage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gebuehrengrundlage")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGebuehrengrundlage {


    /**
     * Rechtsanwaltsvergütungsgesetz Fassung 01.07.2004
     * 
     */
    @XmlEnumValue("01")
    RECHTSANWALTVERGUETUNGSGESETZ_2004("01"),

    /**
     * Rechtsanwaltsvergütungsgesetz Fassung 01.08.2013
     * 
     */
    @XmlEnumValue("02")
    RECHTSANWALTVERGUETUNGSGESETZ_2013("02");
    private final String value;

    STGebuehrengrundlage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGebuehrengrundlage fromValue(String v) {
        for (STGebuehrengrundlage c: STGebuehrengrundlage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
