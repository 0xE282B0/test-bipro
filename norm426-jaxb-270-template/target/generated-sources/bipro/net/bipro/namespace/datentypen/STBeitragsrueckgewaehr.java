
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Beitragsrueckgewaehr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Beitragsrueckgewaehr"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Beitragsrueckgewaehr")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBeitragsrueckgewaehr {


    /**
     * vor Rentenbeginn
     * 
     */
    @XmlEnumValue("01")
    VOR_RENTENBEGINN("01"),

    /**
     * nach Rentenbeginn
     * 
     */
    @XmlEnumValue("02")
    NACH_RENTENBEGINN("02"),

    /**
     * vor und nach Rentenbeginn
     * 
     */
    @XmlEnumValue("03")
    VOR_NACH_RENTENBEGINN("03");
    private final String value;

    STBeitragsrueckgewaehr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBeitragsrueckgewaehr fromValue(String v) {
        for (STBeitragsrueckgewaehr c: STBeitragsrueckgewaehr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
