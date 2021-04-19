
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Szenario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Szenario"&gt;
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
@XmlType(name = "ST_Szenario")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSzenario {


    /**
     * Szenario 1
     * 
     */
    @XmlEnumValue("1")
    SZENARIO_1("1"),

    /**
     * Szenario 2
     * 
     */
    @XmlEnumValue("2")
    SZENARIO_2("2"),

    /**
     * Szenario 3
     * 
     */
    @XmlEnumValue("3")
    SZENARIO_3("3"),

    /**
     * Szenario 4
     * 
     */
    @XmlEnumValue("4")
    SZENARIO_4("4"),

    /**
     * Szenario 5
     * 
     */
    @XmlEnumValue("5")
    SZENARIO_5("5");
    private final String value;

    STSzenario(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSzenario fromValue(String v) {
        for (STSzenario c: STSzenario.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
