
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Bezugsrecht.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Bezugsrecht"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Bezugsrecht")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBezugsrecht {


    /**
     * Versicherungsnehmer
     * 
     */
    @XmlEnumValue("1")
    VERSICHERUNGSNEHMER("1"),

    /**
     * Versicherte Person
     * 
     */
    @XmlEnumValue("2")
    VERSICHERTE_PERSON("2"),

    /**
     * Ehepartner zum Zeitpunkt des Leistungsfalls
     * 
     */
    @XmlEnumValue("3")
    EHEPARTNER_BEI_LEISTUNGSFALL("3"),

    /**
     * mitversicherte Person
     * 
     */
    @XmlEnumValue("4")
    MITVERSICHERTE_PERSON("4"),

    /**
     * gesetzliche Erbfolge
     * 
     */
    @XmlEnumValue("5")
    GESETZLICHE_ERBFOLGE("5"),

    /**
     * Reihenfolge: Ehegatte, Kinder, Eltern, Erben
     * 
     */
    @XmlEnumValue("6")
    EHEGATTE_KINDER_ELTERN_ERBEN("6"),

    /**
     * Leistungsberechtigte im Sinne des § 10 Abs.1, Nr. 2b EStG (Rürup-Rente)
     * 
     */
    @XmlEnumValue("7")
    LEISTUNGSBERECHTIGTE("7"),

    /**
     * individuell
     * 
     */
    @XmlEnumValue("9")
    INDIVIDUELL("9"),

    /**
     * Lebensgefährte
     * 
     */
    @XmlEnumValue("10")
    LEBENSGEFAEHRTE("10"),

    /**
     * Kinder
     * 
     */
    @XmlEnumValue("11")
    KINDER("11"),

    /**
     * §32 EStG (enger Hinterbliebenenbegriff gemäß BMF-Schreiben 31.03.10)
     * 
     */
    @XmlEnumValue("12")
    ESTG_32("12");
    private final String value;

    STBezugsrecht(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBezugsrecht fromValue(String v) {
        for (STBezugsrecht c: STBezugsrecht.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
