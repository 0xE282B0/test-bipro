
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_VbArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VbArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_VbArt")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVbArt {


    /**
     * VB gilt fuer einmalige Zulassung
     * 
     */
    @XmlEnumValue("1")
    VB_EINMALIGE_ZULASSUNG("1"),

    /**
     * VB ist eine Dauer-VB
     * 
     */
    @XmlEnumValue("2")
    VB_DAUER_VB("2");
    private final String value;

    STVbArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVbArt fromValue(String v) {
        for (STVbArt c: STVbArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
