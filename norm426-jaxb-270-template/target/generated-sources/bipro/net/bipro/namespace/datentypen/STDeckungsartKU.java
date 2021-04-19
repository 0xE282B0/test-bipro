
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_DeckungsartKU.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_DeckungsartKU"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "ST_DeckungsartKU")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STDeckungsartKU {


    /**
     * Insassenversicherung nach dem Pauschalsystem außer WKZ 001, 002, 003, 005, 012, 018, 022, 028, 760, 761, 765, 766
     * 
     */
    @XmlEnumValue("1")
    INSASSENVERSICHERUNG_PAUSCHALSYSTEM_AUSSER_WKZ("1"),

    /**
     * Insassenversicherung nach dem Platzsystem außer WKZ 001, 002, 003, 005, 012, 018, 022, 028, 760, 761, 765, 766
     * 
     */
    @XmlEnumValue("2")
    INSASSENVERSICHERUNG_PLATZSYSTEM_AUSSER_WKZ("2"),

    /**
     * Insassenversicherung nach dem Pauschalsystem für WKZ 001, 002, 003, 005, 012, 018, 022, 028, 760, 761, 765, 766
     * 
     */
    @XmlEnumValue("3")
    INSASSENVERSICHERUNG_PAUSCHALSYSTEM_WKZ("3"),

    /**
     * Berufs- und Beifahrerversicherung unter Ausschluss der Kraftradbenutzung
     * 
     */
    @XmlEnumValue("4")
    INSASSENVERSICHERUNG_PLATZSYSTEM_WKZ("4"),

    /**
     * Berufs- und Beifahrerversicherung mit Einschluss der Kraftradbenutzung
     * 
     */
    @XmlEnumValue("5")
    BERUFS_BEIFAHRERVERSICHERUNG_OHNE_KRAFTRADNUTZUNG("5"),

    /**
     * Namentliche Unfallversicherung
     * 
     */
    @XmlEnumValue("9")
    NAMENTLICHE_UNFALLVERSICHERUNG("9");
    private final String value;

    STDeckungsartKU(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDeckungsartKU fromValue(String v) {
        for (STDeckungsartKU c: STDeckungsartKU.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
