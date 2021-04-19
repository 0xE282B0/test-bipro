
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_FinanzierungDerZusage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_FinanzierungDerZusage"&gt;
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
@XmlType(name = "ST_FinanzierungDerZusage")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STFinanzierungDerZusage {


    /**
     * Rückdeckungsversicherung
     * 
     */
    @XmlEnumValue("1")
    RUECKDECKUNGSVERSICHERUNG("1"),

    /**
     * Rückdeckungsversicherung partiell
     * 
     */
    @XmlEnumValue("2")
    RUECKDECKUNGSVERSICHERUNG_PARTIELL("2"),

    /**
     * Rückdeckungsversicherung kongruent
     * 
     */
    @XmlEnumValue("3")
    RUECKDECKUNGSVERSICHERUNG_KONGRUENT("3"),

    /**
     * Pensionsfonds
     * 
     */
    @XmlEnumValue("4")
    PENSIONSFONDS("4");
    private final String value;

    STFinanzierungDerZusage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFinanzierungDerZusage fromValue(String v) {
        for (STFinanzierungDerZusage c: STFinanzierungDerZusage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
