
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_RisikokennzifferWohngebaeude.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_RisikokennzifferWohngebaeude"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0051"/&gt;
 *     &lt;enumeration value="0052"/&gt;
 *     &lt;enumeration value="0053"/&gt;
 *     &lt;enumeration value="0054"/&gt;
 *     &lt;enumeration value="0055"/&gt;
 *     &lt;enumeration value="0059"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_RisikokennzifferWohngebaeude")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STRisikokennzifferWohngebaeude {


    /**
     * Reine Wohngebaeude
     * 
     */
    @XmlEnumValue("0051")
    REINES_WOHNGEBAEUDE("0051"),

    /**
     * Gemischt genutzte Wohngebaeude
     * 
     */
    @XmlEnumValue("0052")
    GEMISCHT_GENUTZTES_WOHNGEBAEUDE("0052"),

    /**
     * Reine Wohngebaeude Einfamilienhaeuser (ggf. inkl. Einliegerwohnung)
     * 
     */
    @XmlEnumValue("0053")
    REINE_WOHNGEBAEUDE_EINFAMILIENHAEUSER("0053"),

    /**
     * Reine Wohngebaeude Zweifamilienhaeuser (ggf. inkl. Einliegerwohnung)
     * 
     */
    @XmlEnumValue("0054")
    REINE_WOHNGEBAEUDE_ZWEIFAMILIENHAEUSER("0054"),

    /**
     * Reine Wohngebaeude Mehrfamilienhaeuser
     * 
     */
    @XmlEnumValue("0055")
    REINE_WOHNGEBAEUDE_MEHRFAMILIENHAEUSER("0055"),

    /**
     * Nicht staendig bewohnte Wochenend-, Ferienhaeuser sowie aehnliche Gebaeude
     * 
     */
    @XmlEnumValue("0059")
    NICHT_STAENDIG_BEWOHNT("0059");
    private final String value;

    STRisikokennzifferWohngebaeude(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRisikokennzifferWohngebaeude fromValue(String v) {
        for (STRisikokennzifferWohngebaeude c: STRisikokennzifferWohngebaeude.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
