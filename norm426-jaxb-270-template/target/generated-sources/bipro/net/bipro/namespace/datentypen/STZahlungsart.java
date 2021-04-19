
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Zahlungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Zahlungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Zahlungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STZahlungsart {


    /**
     * Lastschrift
     * 
     */
    @XmlEnumValue("1")
    LASTSCHRIFT("1"),

    /**
     * Rechnung (Überweisung)
     * 
     */
    @XmlEnumValue("2")
    RECHNUNG("2"),

    /**
     * Dauerauftrag
     * 
     */
    @XmlEnumValue("3")
    DAUERAUFTRAG("3"),

    /**
     * Depot
     * 
     */
    @XmlEnumValue("4")
    DEPOT("4"),

    /**
     * Gehaltsabzug
     * 
     */
    @XmlEnumValue("5")
    GEHALTSABZUG("5"),

    /**
     * Kreditkarte
     * 
     */
    @XmlEnumValue("6")
    KREDITKARTE("6"),

    /**
     * Sammeleinzug/Sammelinkasso
     * 
     */
    @XmlEnumValue("7")
    SAMMELEINZUG_SAMMELINKASSO("7"),

    /**
     * Scheck
     * 
     */
    @XmlEnumValue("8")
    SCHECK("8"),

    /**
     * sonstige
     * 
     */
    @XmlEnumValue("9")
    SONSTIGE("9"),

    /**
     * Barzahlung
     * 
     */
    @XmlEnumValue("10")
    BARZAHLUNG("10");
    private final String value;

    STZahlungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZahlungsart fromValue(String v) {
        for (STZahlungsart c: STZahlungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
