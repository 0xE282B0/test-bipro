
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Verfahrensstadium.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Verfahrensstadium"&gt;
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
 *     &lt;enumeration value="17"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Verfahrensstadium")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVerfahrensstadium {


    /**
     * Erstberatung 
     * 
     */
    @XmlEnumValue("01")
    ERSTBERATUNG("01"),

    /**
     * Beratung 
     * 
     */
    @XmlEnumValue("02")
    BERATUNG("02"),

    /**
     * Vorverfahren 
     * 
     */
    @XmlEnumValue("03")
    VORVERFAHREN("03"),

    /**
     * Vorermittlungen 
     * 
     */
    @XmlEnumValue("04")
    VORVERMITTLUNGEN("04"),

    /**
     * Widerspruchsverfahren 
     * 
     */
    @XmlEnumValue("05")
    WIDERSPRUCHSVERFAHREN("05"),

    /**
     * Vorverfahren inkl. 1. Instanz
     * 
     */
    @XmlEnumValue("06")
    VORVERFAHREN_INKL_ERSTE_INSTANZ("06"),

    /**
     * Außergerichtliche Interessenvertretung 
     * 
     */
    @XmlEnumValue("07")
    AUSSERGERICHTLICHE_INTERESSENVERTRETUNG("07"),

    /**
     * Förmliches Verfahren
     * 
     */
    @XmlEnumValue("08")
    FOERMLICHES_VERFAHREN("08"),

    /**
     * Beweisverfahren
     * 
     */
    @XmlEnumValue("09")
    BEWEISVERFAHREN("09"),

    /**
     *  1. Instanz 
     * 
     */
    @XmlEnumValue("10")
    ERSTE_INSTANZ("10"),

    /**
     *  2. Instanz 
     * 
     */
    @XmlEnumValue("11")
    ZWEITE_INSTANZ("11"),

    /**
     *  3. Instanz
     * 
     */
    @XmlEnumValue("12")
    DRITTE_INSTANZ("12"),

    /**
     * Zwangsvollstreckung
     * 
     */
    @XmlEnumValue("13")
    ZWANGSVOLLSTRECKUNG("13"),

    /**
     * Gnadenverfahren/Strafvollstreckungsverfahren
     * 
     */
    @XmlEnumValue("14")
    GNADENVERFAHREN_STRAFVOLLSTRECKUNGSVERFAHREN("14"),

    /**
     * Deckungsklage
     * 
     */
    @XmlEnumValue("15")
    DECKUNGSKLAGE("15"),

    /**
     * Einstweilige Verfügung
     * 
     */
    @XmlEnumValue("16")
    EINSTWEILIGE_VERFUEGUNG("16"),

    /**
     * Arrest
     * 
     */
    @XmlEnumValue("17")
    ARREST("17");
    private final String value;

    STVerfahrensstadium(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVerfahrensstadium fromValue(String v) {
        for (STVerfahrensstadium c: STVerfahrensstadium.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
