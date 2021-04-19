
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vereinbarung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vereinbarung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vereinbarung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVereinbarung {


    /**
     * Nominal (feste, nicht gestaffelte Vereinbarung) 
     * 
     */
    @XmlEnumValue("01")
    NOMINAL("01"),

    /**
     * Staffel (nach bestimmten Kriterien gestaffelte Vereinbarung)
     * 
     */
    @XmlEnumValue("02")
    STAFFEL("02");
    private final String value;

    STVereinbarung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVereinbarung fromValue(String v) {
        for (STVereinbarung c: STVereinbarung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
