
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gebaeudeart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gebaeudeart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="003"/&gt;
 *     &lt;enumeration value="004"/&gt;
 *     &lt;enumeration value="005"/&gt;
 *     &lt;enumeration value="006"/&gt;
 *     &lt;enumeration value="900"/&gt;
 *     &lt;enumeration value="901"/&gt;
 *     &lt;enumeration value="999"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gebaeudeart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGebaeudeart {


    /**
     * Hauptgebäude
     * 
     */
    @XmlEnumValue("001")
    HAUPTGEBAEUDE("001"),

    /**
     * Nebengebäude
     * 
     */
    @XmlEnumValue("002")
    NEBENGEBAEUDE("002"),

    /**
     * Garage
     * 
     */
    @XmlEnumValue("003")
    GARAGE("003"),

    /**
     * Carport
     * 
     */
    @XmlEnumValue("004")
    CARPORT("004"),

    /**
     * Gartenhaus
     * 
     */
    @XmlEnumValue("005")
    GARTENHAUS("005"),

    /**
     * Scheune
     * 
     */
    @XmlEnumValue("006")
    SCHEUNE("006"),

    /**
     * Einfamilienhaus, DARF NICHT für TAA genutzt werden.
     * 
     */
    @XmlEnumValue("900")
    EINFAMILIENHAUS("900"),

    /**
     * Mehrfamilienhaus, DARF NICHT für TAA genutzt werden.
     * 
     */
    @XmlEnumValue("901")
    MEHRFAMILIENHAUS("901"),

    /**
     * sonstiger Gebäudeteil gemäß Beschreibung
     * 
     */
    @XmlEnumValue("999")
    SONSTIGER_GEBAEUDETEIL("999");
    private final String value;

    STGebaeudeart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGebaeudeart fromValue(String v) {
        for (STGebaeudeart c: STGebaeudeart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
