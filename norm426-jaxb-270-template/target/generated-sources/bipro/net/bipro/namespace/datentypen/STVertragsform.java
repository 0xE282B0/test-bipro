
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vertragsform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vertragsform"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vertragsform")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVertragsform {


    /**
     * Einzel
     * 
     */
    @XmlEnumValue("0")
    EINZEL("0"),

    /**
     * Firmengruppen
     * 
     */
    @XmlEnumValue("1")
    FIRMENGRUPPEN("1"),

    /**
     * Vereinsgruppen
     * 
     */
    @XmlEnumValue("2")
    VEREINSGRUPPEN("2"),

    /**
     * Verbandsgruppen
     * 
     */
    @XmlEnumValue("3")
    VERBANDSGRUPPEN("3"),

    /**
     * Sammelversicherung
     * 
     */
    @XmlEnumValue("4")
    SAMMELVERSICHERUNG("4"),

    /**
     * Rahmenvertrag / Generalvertrag / Maklervertrag
     * 
     */
    @XmlEnumValue("5")
    RAHMENVERTRAG_GENERALVERTRAG_MAKLERVERTRAG("5"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STVertragsform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVertragsform fromValue(String v) {
        for (STVertragsform c: STVertragsform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
