
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Anwartschaftsgrund.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Anwartschaftsgrund"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Anwartschaftsgrund")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAnwartschaftsgrund {


    /**
     * Arbeitslosigkeit
     * 
     */
    @XmlEnumValue("01")
    ARBEITSLOSIGKEIT("01"),

    /**
     * GKV-Übertritt
     * 
     */
    @XmlEnumValue("02")
    GKV_UEBERTRITT("02"),

    /**
     * Freie Heilfürsorge
     * 
     */
    @XmlEnumValue("03")
    FREIE_HEILFUERSORGE("03"),

    /**
     * Kleine Anwartschaft
     * 
     */
    @XmlEnumValue("04")
    KLEINE_ANWARTSCHAFT("04"),

    /**
     * Wirtschaftliche Notlage
     * 
     */
    @XmlEnumValue("05")
    WIRTSCHAFTLICHE_NOTLAGE("05"),

    /**
     * Pflichtversicherung
     * 
     */
    @XmlEnumValue("06")
    PFLICHTVERSICHERUNG("06"),

    /**
     * Soldat/Zivildienst
     * 
     */
    @XmlEnumValue("07")
    SOLDAT_ZIVILDIENST("07"),

    /**
     * Auslandsaufenthalt
     * 
     */
    @XmlEnumValue("08")
    AUSLANDSAUFENTHALT("08"),

    /**
     * Zahlungsunfähigkeit
     * 
     */
    @XmlEnumValue("09")
    ZAHLUNGSUNFAEHIGKEIT("09"),

    /**
     * Familienversicherung
     * 
     */
    @XmlEnumValue("10")
    FAMILIENVERSICHERUNG("10"),

    /**
     * Ausbildung/Studium
     * 
     */
    @XmlEnumValue("11")
    AUSBILDUNG_STUDIUM("11"),

    /**
     * Sonstige Gründe
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE_GRUENDE("99");
    private final String value;

    STAnwartschaftsgrund(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAnwartschaftsgrund fromValue(String v) {
        for (STAnwartschaftsgrund c: STAnwartschaftsgrund.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
