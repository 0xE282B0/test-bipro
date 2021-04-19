
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtDesVorhabens.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtDesVorhabens"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="09"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="13"/&gt;
 *     &lt;enumeration value="14"/&gt;
 *     &lt;enumeration value="15"/&gt;
 *     &lt;enumeration value="16"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtDesVorhabens")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtDesVorhabens {


    /**
     * Neubau
     * 
     */
    @XmlEnumValue("01")
    NEUBAU("01"),

    /**
     * Umbau mit Eingriff in tragende Konstruktion
     * 
     */
    @XmlEnumValue("02")
    UMBAU_EINGRIFF_IN_MIT_TRAGENDER_KONSTRUKTION("02"),

    /**
     * Umbau ohne Eingriff in tragende Konstruktion
     * 
     */
    @XmlEnumValue("03")
    UMBAU_OHNE_EINGRIFF_IN_TRAGENDE_KONSTRUKTION("03"),

    /**
     * Anbau
     * 
     */
    @XmlEnumValue("04")
    ANBAU("04"),

    /**
     * Aufstockung
     * 
     */
    @XmlEnumValue("05")
    AUFSTOCKUNG("05"),

    /**
     * Tief- oder Ingenieursbau
     * 
     */
    @XmlEnumValue("06")
    TIEF_ODER_INGENIEURSBAU("06"),

    /**
     * mit Tiefgaragen
     * 
     */
    @XmlEnumValue("07")
    MIT_TIEFGARAGEN("07"),

    /**
     * mit Garagen
     * 
     */
    @XmlEnumValue("08")
    MIT_GARAGEN("08"),

    /**
     * mit  Erdwärmenutzung mittels Kollektoren
     * 
     */
    @XmlEnumValue("09")
    ERDWAERMENUTZUNG_KOLLEKTOREN("09"),

    /**
     * mit  Erdwärmenutzung mittels Erdsonde bis 100m
     * 
     */
    @XmlEnumValue("10")
    ERDWAERMENUTZUNG_ERDSONDE_100("10"),

    /**
     * mit  Erdwärmenutzung mittels Erdsonde bis 400m
     * 
     */
    @XmlEnumValue("11")
    ERDWAERMENUTZUNG_ERDSONDE_400("11"),

    /**
     * Neumontage
     * 
     */
    @XmlEnumValue("12")
    NEUMONTAGE("12"),

    /**
     * Demontage
     * 
     */
    @XmlEnumValue("13")
    DEMONTAGE("13"),

    /**
     * De- und Remontage
     * 
     */
    @XmlEnumValue("14")
    DE_REMONTAGE("14"),

    /**
     * Montage und Demontage
     * 
     */
    @XmlEnumValue("15")
    MONTAGE_DEMONTAGE("15"),

    /**
     * Reparaturen und Umbauten
     * 
     */
    @XmlEnumValue("16")
    REPARATUREN_UMBAUTEN("16");
    private final String value;

    STArtDesVorhabens(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtDesVorhabens fromValue(String v) {
        for (STArtDesVorhabens c: STArtDesVorhabens.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
