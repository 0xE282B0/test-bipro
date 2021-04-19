
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Geltungsbereich.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Geltungsbereich"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Geltungsbereich")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGeltungsbereich {


    /**
     * Inland
     * 
     */
    @XmlEnumValue("1")
    INLAND("1"),

    /**
     * Ausland (Europa und Mittelmeerstaaten) 
     * 
     */
    @XmlEnumValue("2")
    AUSLAND_EUROPA("2"),

    /**
     * Europa und Mittelmeerstaaten 
     * 
     */
    @XmlEnumValue("3")
    EUROPA_MITTELMEERSTAATEN("3"),

    /**
     * Ausland (weltweit) 
     * 
     */
    @XmlEnumValue("4")
    AUSLAND_WELTWEIT("4"),

    /**
     * Weltweit
     * 
     */
    @XmlEnumValue("5")
    WELTWEIT("5");
    private final String value;

    STGeltungsbereich(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGeltungsbereich fromValue(String v) {
        for (STGeltungsbereich c: STGeltungsbereich.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
