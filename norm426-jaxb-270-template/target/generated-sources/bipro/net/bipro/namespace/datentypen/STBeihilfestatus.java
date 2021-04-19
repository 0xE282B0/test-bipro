
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Beihilfestatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Beihilfestatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Beihilfestatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBeihilfestatus {


    /**
     * Beihilfeberechtigter
     * 
     */
    @XmlEnumValue("1")
    BEIHILFEBERECHTIGTER("1"),

    /**
     * Berücksichtigungsfähiger Ehegatte
     * 
     */
    @XmlEnumValue("2")
    BERUECKSICHTIGUNGSFAEHIGER_EHEGATTE("2"),

    /**
     * Berücksichtigungsfähiges Kind 
     * 
     */
    @XmlEnumValue("3")
    BERUECKSICHTIGUNGSFAEHIGES_KIND("3"),

    /**
     * Versorgungsempfänger 
     * 
     */
    @XmlEnumValue("4")
    VERSORGUNGSEMPFAENGER("4"),

    /**
     * Waise / Halbwaise 
     * 
     */
    @XmlEnumValue("5")
    WAISE_HALBWAISE("5"),

    /**
     * Freie Heilfürsorge
     * 
     */
    @XmlEnumValue("6")
    FREIE_HEILFUERSORGE("6");
    private final String value;

    STBeihilfestatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBeihilfestatus fromValue(String v) {
        for (STBeihilfestatus c: STBeihilfestatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
