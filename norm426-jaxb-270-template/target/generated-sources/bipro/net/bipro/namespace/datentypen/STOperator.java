
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Operator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gleich"/&gt;
 *     &lt;enumeration value="ungleich"/&gt;
 *     &lt;enumeration value="groesserals"/&gt;
 *     &lt;enumeration value="groesserodergleich"/&gt;
 *     &lt;enumeration value="kleinerals"/&gt;
 *     &lt;enumeration value="kleinerodergleich"/&gt;
 *     &lt;enumeration value="in"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Operator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STOperator {


    /**
     * gleich (=)
     * 
     */
    @XmlEnumValue("gleich")
    GLEICH("gleich"),

    /**
     * ungleich (!=)
     * 
     */
    @XmlEnumValue("ungleich")
    UNGLEICH("ungleich"),

    /**
     * gößer als (>)
     * 
     */
    @XmlEnumValue("groesserals")
    GROESSERALS("groesserals"),

    /**
     * größer oder gleich (>=)
     * 
     */
    @XmlEnumValue("groesserodergleich")
    GROESSERODERGLEICH("groesserodergleich"),

    /**
     * kleiner als (<)
     * 
     */
    @XmlEnumValue("kleinerals")
    KLEINERALS("kleinerals"),

    /**
     * kleiner oder gleich (<=)
     * 
     */
    @XmlEnumValue("kleinerodergleich")
    KLEINERODERGLEICH("kleinerodergleich"),

    /**
     * Ist nur in Verbindung mit einer AntwortWerteliste gültig.
     * 
     */
    @XmlEnumValue("in")
    IN("in");
    private final String value;

    STOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STOperator fromValue(String v) {
        for (STOperator c: STOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
