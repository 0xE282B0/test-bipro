
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Feuerschaden.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Feuerschaden"&gt;
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
@XmlType(name = "ST_Feuerschaden")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STFeuerschaden {


    /**
     * Feuererscheinung
     * 
     */
    @XmlEnumValue("1")
    FEUERERSCHEINUNG("1"),

    /**
     * Wärme
     * 
     */
    @XmlEnumValue("2")
    WAERME("2"),

    /**
     * Glut
     * 
     */
    @XmlEnumValue("3")
    GLUT("3"),

    /**
     * Rauch/Ruß
     * 
     */
    @XmlEnumValue("4")
    RAUCH_RUSS("4");
    private final String value;

    STFeuerschaden(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFeuerschaden fromValue(String v) {
        for (STFeuerschaden c: STFeuerschaden.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
