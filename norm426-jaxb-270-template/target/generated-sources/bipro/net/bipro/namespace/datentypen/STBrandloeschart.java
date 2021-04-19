
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Brandloeschart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Brandloeschart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Brandloeschart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBrandloeschart {


    /**
     * Wasser
     * 
     */
    @XmlEnumValue("1")
    WASSER("1"),

    /**
     * Halon
     * 
     */
    @XmlEnumValue("2")
    HALON("2"),

    /**
     * CO2
     * 
     */
    @XmlEnumValue("3")
    CO2("3"),

    /**
     * Feuerlöscher
     * 
     */
    @XmlEnumValue("4")
    FEUERLOESCHER("4"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STBrandloeschart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBrandloeschart fromValue(String v) {
        for (STBrandloeschart c: STBrandloeschart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
