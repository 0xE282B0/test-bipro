
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Abrechnungspostenart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Abrechnungspostenart"&gt;
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
 *     &lt;enumeration value="18"/&gt;
 *     &lt;enumeration value="19"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="21"/&gt;
 *     &lt;enumeration value="22"/&gt;
 *     &lt;enumeration value="23"/&gt;
 *     &lt;enumeration value="24"/&gt;
 *     &lt;enumeration value="25"/&gt;
 *     &lt;enumeration value="26"/&gt;
 *     &lt;enumeration value="27"/&gt;
 *     &lt;enumeration value="28"/&gt;
 *     &lt;enumeration value="29"/&gt;
 *     &lt;enumeration value="30"/&gt;
 *     &lt;enumeration value="31"/&gt;
 *     &lt;enumeration value="32"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Abrechnungspostenart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAbrechnungspostenart {


    /**
     * Brutto-Beitrag
     * 
     */
    @XmlEnumValue("01")
    BRUTTO_BEITRAG("01"),

    /**
     * Beitrag (ohne Versicherungssteuer)
     * 
     */
    @XmlEnumValue("02")
    BEITRAG_OHNE_VERSICHERUNGSSTEUER("02"),

    /**
     * Versicherungssteuer
     * 
     */
    @XmlEnumValue("03")
    VERSICHERUNGSSTEUER("03"),

    /**
     * Umsatzsteuer
     * 
     */
    @XmlEnumValue("04")
    UMSATZSTEUER("04"),

    /**
     * Auslandssteuer 
     * 
     */
    @XmlEnumValue("05")
    AUSLANDSTEUER("05"),

    /**
     * Courtage/Provision
     * 
     */
    @XmlEnumValue("06")
    COURTAGE_PROVISION("06"),

    /**
     * Führungsprovision
     * 
     */
    @XmlEnumValue("07")
    FUEHRUNGSPROVISION("07"),

    /**
     * Assekuradeursprovision (Provisionsteilung)
     * 
     */
    @XmlEnumValue("08")
    ASSEKURADEURPROVISION("08"),

    /**
     * Vorschuss/Nachschuss
     * 
     */
    @XmlEnumValue("09")
    VORSCHUSS_NACHSCHUSS("09"),

    /**
     * Zahlungsverkehrsbuchung/Finanzbuchungen
     * 
     */
    @XmlEnumValue("10")
    ZAHLUNGSVERKEHRBUCHUNG("10"),

    /**
     * Abschlag/Zuschlag (ob Abschlag oder Zuschlag ergibt sich aus dem Vorzeichen der Betrages sowie aus dem Abrechnendem)
     * 
     */
    @XmlEnumValue("11")
    ABSCHLAG_ZUSCHLAG("11"),

    /**
     * Vorauszahlung/Nachzahlung (vertragsbezogen)
     * 
     */
    @XmlEnumValue("12")
    VORAUSZAHLUNG_NACHZAHLUNG("12"),

    /**
     * Berechnete Kosten oder Erstattungen z.B. PC-Mieten Gutachterkosten
     * 
     */
    @XmlEnumValue("13")
    BERECHNETE_KOSTEN_ODER_ERSTATTUNGEN("13"),

    /**
     * Bonifikationen und Wettbewerbe
     * 
     */
    @XmlEnumValue("14")
    BONIFIKATIONEN_WETTBEWERBE("14"),

    /**
     * Gewinnbeteiligung
     * 
     */
    @XmlEnumValue("15")
    GEWINNBETEILIGUNG("15"),

    /**
     * Vertragsunabhängige Vergütung
     * 
     */
    @XmlEnumValue("16")
    VERTRAGSUNABHAENGIGE_VERGUETUNG("16"),

    /**
     * Zuschuss
     * 
     */
    @XmlEnumValue("17")
    ZUSCHUSS("17"),

    /**
     * Pauschale
     * 
     */
    @XmlEnumValue("18")
    PAUSCHALE("18"),

    /**
     * Garantie
     * 
     */
    @XmlEnumValue("19")
    GARANTIE("19"),

    /**
     * Stornoreserve
     * 
     */
    @XmlEnumValue("20")
    STORNORESERVE("20"),

    /**
     * Ablösesumme/Provisionsausgleich
     * 
     */
    @XmlEnumValue("21")
    ABLOESESUMME("21"),

    /**
     * Darlehen/Kredit
     * 
     */
    @XmlEnumValue("22")
    DARLEHEN("22"),

    /**
     * Zinsen
     * 
     */
    @XmlEnumValue("23")
    ZINSEN("23"),

    /**
     * Bürgschaften
     * 
     */
    @XmlEnumValue("24")
    BUERGSCHAFTEN("24"),

    /**
     * Schadenzahlung
     * 
     */
    @XmlEnumValue("25")
    SCHADENZAHLUNG("25"),

    /**
     * Schaden-Kulanzzahlung
     * 
     */
    @XmlEnumValue("26")
    SCHADEN_KULANZZAHLUNG("26"),

    /**
     * Schaden-Regresszahlung
     * 
     */
    @XmlEnumValue("27")
    SCHADEN_REGRESSZAHLUNG("27"),

    /**
     * Vergütung aus Dienstleistung
     * 
     */
    @XmlEnumValue("28")
    VERGUETUNG_AUS_DIENSTLEISTUNGEN("28"),

    /**
     * Gebühren
     * 
     */
    @XmlEnumValue("29")
    GEBUEHREN("29"),

    /**
     * Rabatt/Skonto
     * 
     */
    @XmlEnumValue("30")
    RABATT("30"),

    /**
     * Strafzuschlag (Krankenversicherung)
     * 
     */
    @XmlEnumValue("31")
    STRAFZAHLUNG("31"),

    /**
     * Saldo (technische Postenart für übergreifende Salden)
     * 
     */
    @XmlEnumValue("32")
    SALDO("32"),

    /**
     * Sonderfall - Nicht klassifizierbarer Sonderfall
     * 
     */
    @XmlEnumValue("99")
    SONDERFALL("99");
    private final String value;

    STAbrechnungspostenart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAbrechnungspostenart fromValue(String v) {
        for (STAbrechnungspostenart c: STAbrechnungspostenart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
