
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Reserveradart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Reserveradart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Reserveradart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STReserveradart {


    /**
     * kein Reserverad
     * 
     */
    @XmlEnumValue("0")
    KEIN_RESERVERAD("0"),

    /**
     * Reserverad
     * 
     */
    @XmlEnumValue("1")
    RESERVERAD("1"),

    /**
     * Notrad
     * 
     */
    @XmlEnumValue("2")
    NOTRAD("2"),

    /**
     * sonstiges (z.B. ein im Fahrzeug mitgeliefertes Pannenset/Kompressor) 
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STReserveradart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STReserveradart fromValue(String v) {
        for (STReserveradart c: STReserveradart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
