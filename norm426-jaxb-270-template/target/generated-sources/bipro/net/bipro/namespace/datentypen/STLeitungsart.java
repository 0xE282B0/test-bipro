
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Leitungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Leitungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Leitungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLeitungsart {


    /**
     * Antenne
     * 
     */
    @XmlEnumValue("1")
    ANTENNE("1"),

    /**
     * Telefonleitung
     * 
     */
    @XmlEnumValue("2")
    TELEFONLEITUNG("2"),

    /**
     * Stromleitung
     * 
     */
    @XmlEnumValue("3")
    STROMLEITUNG("3"),

    /**
     * LAN-Kabel
     * 
     */
    @XmlEnumValue("4")
    LAN_KABEL("4");
    private final String value;

    STLeitungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLeitungsart fromValue(String v) {
        for (STLeitungsart c: STLeitungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
