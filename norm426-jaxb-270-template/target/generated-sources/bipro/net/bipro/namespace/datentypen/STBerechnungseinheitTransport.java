
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BerechnungseinheitTransport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BerechnungseinheitTransport"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BerechnungseinheitTransport")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBerechnungseinheitTransport {


    /**
     * Jahrestransportwert
     * 
     */
    @XmlEnumValue("01")
    JAHRESTRANSPORT("01"),

    /**
     * Jahresumsatz
     * 
     */
    @XmlEnumValue("02")
    JAHRESUMSATZ("02"),

    /**
     * Ausstellungswert
     * 
     */
    @XmlEnumValue("03")
    AUSSTELLUNGSWERT("03"),

    /**
     * Ausstellungsumsatz
     * 
     */
    @XmlEnumValue("04")
    AUSSTELLUNGSUMSATZ("04"),

    /**
     * Einkaufswert
     * 
     */
    @XmlEnumValue("05")
    EINKAUFSWERT("05"),

    /**
     * Investitionssumme
     * 
     */
    @XmlEnumValue("06")
    INVESTITIONSSUMME("06"),

    /**
     * Wert Musterkollektionen
     * 
     */
    @XmlEnumValue("07")
    WERT_MUSTERKOLLEKTIONEN("07"),

    /**
     * max. monatlicher Lagerbestand
     * 
     */
    @XmlEnumValue("08")
    MAX_MONATLICHER_LAGERBESTAND("08"),

    /**
     * durchschnittlicher monatlicher Lagerbestand
     * 
     */
    @XmlEnumValue("09")
    DURCHSCHNITTLICHER_MONATLICHER_LAGERBESTAND("09"),

    /**
     * Anzahl Ausstellungen
     * 
     */
    @XmlEnumValue("10")
    ANZAHL_AUSSTELLUNGEN("10"),

    /**
     * Anzahl Musterkollektionen
     * 
     */
    @XmlEnumValue("11")
    ANZAHL_MUSTERKOLLEKTIONEN("11"),

    /**
     * Anzahl Ausstellungstage
     * 
     */
    @XmlEnumValue("12")
    ANZAHL_AUSSTELLUNGSTAGE("12");
    private final String value;

    STBerechnungseinheitTransport(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBerechnungseinheitTransport fromValue(String v) {
        for (STBerechnungseinheitTransport c: STBerechnungseinheitTransport.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
