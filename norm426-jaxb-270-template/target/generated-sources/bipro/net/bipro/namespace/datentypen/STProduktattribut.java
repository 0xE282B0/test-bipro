
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Produktattribut.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Produktattribut"&gt;
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
 *     &lt;enumeration value="33"/&gt;
 *     &lt;enumeration value="34"/&gt;
 *     &lt;enumeration value="35"/&gt;
 *     &lt;enumeration value="36"/&gt;
 *     &lt;enumeration value="37"/&gt;
 *     &lt;enumeration value="38"/&gt;
 *     &lt;enumeration value="39"/&gt;
 *     &lt;enumeration value="40"/&gt;
 *     &lt;enumeration value="41"/&gt;
 *     &lt;enumeration value="42"/&gt;
 *     &lt;enumeration value="43"/&gt;
 *     &lt;enumeration value="44"/&gt;
 *     &lt;enumeration value="45"/&gt;
 *     &lt;enumeration value="46"/&gt;
 *     &lt;enumeration value="47"/&gt;
 *     &lt;enumeration value="48"/&gt;
 *     &lt;enumeration value="49"/&gt;
 *     &lt;enumeration value="50"/&gt;
 *     &lt;enumeration value="51"/&gt;
 *     &lt;enumeration value="52"/&gt;
 *     &lt;enumeration value="53"/&gt;
 *     &lt;enumeration value="54"/&gt;
 *     &lt;enumeration value="55"/&gt;
 *     &lt;enumeration value="56"/&gt;
 *     &lt;enumeration value="57"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Produktattribut")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STProduktattribut {


    /**
     * fondsgebunden
     * 
     */
    @XmlEnumValue("01")
    FONDSGEBUNDEN("01"),

    /**
     * Todesfallleistung steigend
     * 
     */
    @XmlEnumValue("02")
    TODESFALLLEISTUNG_STEIGEND("02"),

    /**
     * Todesfallleistung fallend
     * 
     */
    @XmlEnumValue("03")
    TODESFALLLEISTUNG_FALLEND("03"),

    /**
     * dynamisch
     * 
     */
    @XmlEnumValue("04")
    DYNAMISCH("04"),

    /**
     * fester Ablauftermin
     * 
     */
    @XmlEnumValue("05")
    FESTER_ABLAUFTERMIN("05"),

    /**
     * Kinderversorgung
     * 
     */
    @XmlEnumValue("06")
    KINDERVERSORGUNG("06"),

    /**
     * Bestattungsversorgung
     * 
     */
    @XmlEnumValue("07")
    BESTATTUNGSVERSORGUNG("07"),

    /**
     * Teilauszahlung
     * 
     */
    @XmlEnumValue("08")
    TEILAUSZAHLUNG("08"),

    /**
     * verbundene Leben
     * 
     */
    @XmlEnumValue("09")
    VERBUNDENE_LEBEN("09"),

    /**
     * vermögenswirksame Leistung
     * 
     */
    @XmlEnumValue("10")
    VERMOEGENSWIRKSAME_LEISTUNGEN("10"),

    /**
     * flexible Auszahlphase
     * 
     */
    @XmlEnumValue("11")
    FLEXIBLE_AUSZAHLPHASE("11"),

    /**
     * Gruppenvertragskonditionen
     * 
     */
    @XmlEnumValue("12")
    GRUPPENVERTRAGSKONDITIONEN("12"),

    /**
     * ohne Gesundheitsfragen
     * 
     */
    @XmlEnumValue("13")
    OHNE_GESUNDHEITSFRAGEN("13"),

    /**
     * unterschiedliche Beitragsverläufe
     * 
     */
    @XmlEnumValue("14")
    UNTERSCHIEDLICHE_BEITRAGSVERLAUEFE("14"),

    /**
     * niedriger Granatiezins
     * 
     */
    @XmlEnumValue("15")
    NIEDRIGER_GARANTIEZINS("15"),

    /**
     * lebenslang
     * 
     */
    @XmlEnumValue("16")
    LEBENSLANG("16"),

    /**
     * abgekürzt
     * 
     */
    @XmlEnumValue("17")
    ABGEKUERZT("17"),

    /**
     * sofortbeginnend
     * 
     */
    @XmlEnumValue("18")
    SOFORTBEGINNEND("18"),

    /**
     * privat
     * 
     */
    @XmlEnumValue("19")
    PRIVAT("19"),

    /**
     * Riesterrente
     * 
     */
    @XmlEnumValue("20")
    RIESTERRENTE("20"),

    /**
     * Basisrente
     * 
     */
    @XmlEnumValue("21")
    BASISRENTE("21"),

    /**
     * mit Beitragsrückgewähr
     * 
     */
    @XmlEnumValue("22")
    MIT_BEITRAGSRUECKGEWAEHR("22"),

    /**
     * mit Rentengarantiezeit
     * 
     */
    @XmlEnumValue("23")
    MIT_RENTENGARANTIEZEIT("23"),

    /**
     * mit Rentenauszahlung
     * 
     */
    @XmlEnumValue("24")
    MIT_RENTENAUSZAHLUNG("24"),

    /**
     * Nichtraucher
     * 
     */
    @XmlEnumValue("25")
    NICHTRAUCHER("25"),

    /**
     * Umtauschoption
     * 
     */
    @XmlEnumValue("26")
    UMTAUSCHOPTIONEN("26"),

    /**
     * fallende Leistung
     * 
     */
    @XmlEnumValue("27")
    FALLENDE_LEISTUNGEN("27"),

    /**
     * abweichende Leistungsdauer
     * 
     */
    @XmlEnumValue("28")
    ABFALLENDE_LEISTUNGSDAUER("28"),

    /**
     * Ausprägung Erwerbsunfähigkeit
     * 
     */
    @XmlEnumValue("29")
    AUSPRAEGUNG_ERWERBSFAEHIGKEIT("29"),

    /**
     * Ausprägung Berufsunfähigkeit
     * 
     */
    @XmlEnumValue("30")
    AUSPRAEGUNG_BERUFSUNFAEHIGKEIT("30"),

    /**
     * Ausprägung Erwerbsminderung
     * 
     */
    @XmlEnumValue("31")
    AUSPRAEGUNG_ERWERBSMINDERUNG("31"),

    /**
     * Nachversicherungsgarantie
     * 
     */
    @XmlEnumValue("32")
    NACHVERSICHERUNGSGARANTIE("32"),

    /**
     * Karenzzeit
     * 
     */
    @XmlEnumValue("33")
    KARENZZEIT("33"),

    /**
     * Einmalleistung
     * 
     */
    @XmlEnumValue("34")
    EINMALLEISTUNG("34"),

    /**
     * Pflegestufe 1
     * (ab 2017 werden die Pflegestufen durch Pflegegrade ersetzt.)
     * 
     */
    @XmlEnumValue("35")
    PFLEGESTUFE_1("35"),

    /**
     * Leistungsart Kapital
     * 
     */
    @XmlEnumValue("36")
    LEISTUNGSART_KAPITAL("36"),

    /**
     * Leistungsart Rente
     * 
     */
    @XmlEnumValue("37")
    LEISTUNGSART_RENTE("37"),

    /**
     * Leistungsart gemischt
     * 
     */
    @XmlEnumValue("38")
    LEISTUNGSART_GEMISCHT("38"),

    /**
     * Beitragsbefreiung
     * 
     */
    @XmlEnumValue("39")
    BEITRAGSBEFREIUNG("39"),

    /**
     * Erlebensfallleistung niedriger
     * 
     */
    @XmlEnumValue("40")
    ERLEBENSFALLLEISTUNG_NIEDRIGER("40"),

    /**
     * Erlebensfallleistung höher
     * 
     */
    @XmlEnumValue("41")
    ERLEBENSFALLLEISTUNG_HOEHER("41"),

    /**
     * Leistung bei Heirat
     * 
     */
    @XmlEnumValue("42")
    LEISTUNG_BEI_HEIRAT("42"),

    /**
     * Hinterbliebenenrente
     * 
     */
    @XmlEnumValue("43")
    HINTERBLIEBENENRENTE("43"),

    /**
     * Verfügungsoption
     * 
     */
    @XmlEnumValue("44")
    VERFUEGUNGSOPTION("44"),

    /**
     * Pflegestufe 2
     * (ab 2017 werden die Pflegestufen durch Pflegegrade ersetzt.)
     * 
     */
    @XmlEnumValue("45")
    PFLEGESTUFE_2("45"),

    /**
     * Pflegestufe 3
     * (ab 2017 werden die Pflegestufen durch Pflegegrade ersetzt.)
     * 
     */
    @XmlEnumValue("46")
    PFLEGESTUFE_3("46"),

    /**
     * Beitragserhaltungsgarantie
     * 
     */
    @XmlEnumValue("47")
    BEITRAGSERHALTUNGSGARANTIE("47"),

    /**
     * Beitragserhaltungsgarantie Investment
     * 
     */
    @XmlEnumValue("48")
    BEITRAGSERHALTUNGSGARANTIE_INVESTMENT("48"),

    /**
     * öffentlicher Dienst
     * 
     */
    @XmlEnumValue("49")
    OEFFENTLICHER_DIENST("49"),

    /**
     * klassisch (nicht fondsgebunden)
     * 
     */
    @XmlEnumValue("50")
    KLASSISCH("50"),

    /**
     * konstante Todesfallleistung
     * 
     */
    @XmlEnumValue("51")
    KONSTANTE_TODESFALLLEISTUNG("51"),

    /**
     * Leistungsstaffel
     * 
     */
    @XmlEnumValue("52")
    LEISTUNGSSTAFFEL("52"),

    /**
     * Pflegegrad 1
     * 
     */
    @XmlEnumValue("53")
    PFLEGEGRAD_1("53"),

    /**
     * Pflegegrad 2
     * 
     */
    @XmlEnumValue("54")
    PFLEGEGRAD_2("54"),

    /**
     * Pflegegrad 3
     * 
     */
    @XmlEnumValue("55")
    PFLEGEGRAD_3("55"),

    /**
     * Pflegegrad 4
     * 
     */
    @XmlEnumValue("56")
    PFLEGEGRAD_4("56"),

    /**
     * Pflegegrad 5
     * 
     */
    @XmlEnumValue("57")
    PFLEGEGRAD_5("57");
    private final String value;

    STProduktattribut(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STProduktattribut fromValue(String v) {
        for (STProduktattribut c: STProduktattribut.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
