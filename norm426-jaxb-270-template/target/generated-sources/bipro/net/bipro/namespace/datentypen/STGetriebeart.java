
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Getriebeart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Getriebeart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Getriebeart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGetriebeart {


    /**
     * ohne Getriebe
     * 
     */
    @XmlEnumValue("0")
    OHNE_GETRIEBE("0"),

    /**
     * Schaltgetriebe
     * 
     */
    @XmlEnumValue("1")
    SCHALTGETRIEBE("1"),

    /**
     * automatisches Getriebe
     * 
     */
    @XmlEnumValue("2")
    AUTOMATISCHES_GETRIEBE("2"),

    /**
     * sequentielles Getriebe (z.B. Tiptronic)
     * 
     */
    @XmlEnumValue("3")
    SEQUENTIELLES_GETRIEBE("3"),

    /**
     * sonstige
     * 
     */
    @XmlEnumValue("9")
    SONSTIGE("9");
    private final String value;

    STGetriebeart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGetriebeart fromValue(String v) {
        for (STGetriebeart c: STGetriebeart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
