
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Stichtagswert.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Stichtagswert"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Stichtagswert")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STStichtagswert {


    /**
     * Beitragsfreie Erlebensfallleistung
     * 
     */
    @XmlEnumValue("01")
    BEITRAGSFREIE_ERLEBENSFALLLEISTUNG("01"),

    /**
     * Beitragsfreie Rente
     * 
     */
    @XmlEnumValue("02")
    BEITRAGSFREIE_RENTE("02"),

    /**
     * Beitragsfreie Todesfallleistung
     * 
     */
    @XmlEnumValue("03")
    BEITRAGSFREIE_TODESFALLLEISTUNG("03"),

    /**
     * Entnahmemöglichkeit
     * 
     */
    @XmlEnumValue("04")
    ENTNAHMEMOEGLICHKEIT("04"),

    /**
     * Garantierte Erlebensfallleistung
     * 
     */
    @XmlEnumValue("05")
    GARANTIERTE_ERLEBENSFALLLEISTUNG("05"),

    /**
     * Garantierte Rente
     * 
     */
    @XmlEnumValue("06")
    GARANTIERTE_RENTE("06"),

    /**
     * Garantierte Todesfallleistung
     * 
     */
    @XmlEnumValue("07")
    GARANTIERTE_TODESFALLLEISTUNG("07"),

    /**
     * Gesamte Erlebensfallleistung
     * 
     */
    @XmlEnumValue("08")
    GESAMTE_ERLEBENSFALLLEISTUNG("08"),

    /**
     * Gesamter Beleihungswert
     * 
     */
    @XmlEnumValue("09")
    GESAMTER_BELEIHUNGSWERT("09"),

    /**
     * Gesamte Rente
     * 
     */
    @XmlEnumValue("10")
    GESAMTE_RENTE("10"),

    /**
     * Gesamte Todesfallleistung
     * 
     */
    @XmlEnumValue("11")
    GESAMTE_TODESFALLLEISTUNG("11"),

    /**
     * Letzte erhaltene Zulage
     * 
     */
    @XmlEnumValue("12")
    LETZTE_ERHALTENE_ZULAGE("12"),

    /**
     * Letzte Sonderzuzahlung
     * 
     */
    @XmlEnumValue("13")
    LETZTE_SONDERZUZAHLUNG("13"),

    /**
     * Rückkaufswert
     * 
     */
    @XmlEnumValue("14")
    RUECKKAUFWERT("14"),

    /**
     * Summe erhaltene Zulagen
     * 
     */
    @XmlEnumValue("15")
    SUMME_ERHALTENE_ZULAGEN("15"),

    /**
     * Summe gezahlter Beiträge
     * 
     */
    @XmlEnumValue("16")
    SUMME_GEZAHLTER_BEITRAEGE("16"),

    /**
     * Summe der Sonderzuzahlungen
     * 
     */
    @XmlEnumValue("17")
    SUMME_DER_SONDERZAHLUNGEN("17"),

    /**
     * Ueberschussguthaben
     * 
     */
    @XmlEnumValue("18")
    UEBERSCHUSSGUTHABEN("18"),

    /**
     * Verfuegbarer Beleihungswert
     * 
     */
    @XmlEnumValue("19")
    VERFUEGBARER_BELEIHUNGSWERT("19"),

    /**
     * Vertragswert
     * 
     */
    @XmlEnumValue("20")
    VERTRAGSWERT("20"),

    /**
     * Rückgewährsumme
     * 
     */
    @XmlEnumValue("21")
    RUECKGEWAHRSUMME("21"),

    /**
     * Ablaufleistung
     * 
     */
    @XmlEnumValue("22")
    ABLAUFLEISTUNG("22"),

    /**
     * Kapitalertragssteuer
     * 
     */
    @XmlEnumValue("23")
    KAPITALERTRAGSSTEUER("23"),

    /**
     * Solidaritätszuschlag
     * 
     */
    @XmlEnumValue("24")
    SOLIDARITAETSZUSCHLAG("24");
    private final String value;

    STStichtagswert(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STStichtagswert fromValue(String v) {
        for (STStichtagswert c: STStichtagswert.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
