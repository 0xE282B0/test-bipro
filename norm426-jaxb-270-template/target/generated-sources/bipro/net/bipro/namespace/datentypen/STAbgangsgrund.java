
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Abgangsgrund.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Abgangsgrund"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Abgangsgrund")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAbgangsgrund {


    /**
     * Kuendigung VN zum Ablauf
     * 
     */
    @XmlEnumValue("01")
    KUENDIGUNG_VN_ZUM_ABLAUF("01"),

    /**
     * Kuendigung VN im Schadenfall / allgemeine Differenzen
     * 
     */
    @XmlEnumValue("02")
    KUENDIGUNG_VN_IM_SCHADENFALL_ALLGEMEINE_DIFFERENZEN("02"),

    /**
     * Kuendigung VN bei Beitragserhoehung / Tarifaktion
     * 
     */
    @XmlEnumValue("03")
    KUENDIGUNG_VN_BEI_BEITRAGSERHOEHUNG_TARIFAKTION("03"),

    /**
     * Kuendigung VU zum Ablauf
     * 
     */
    @XmlEnumValue("04")
    KUENDIGUNG_VU_ZUM_ABLAUF("04"),

    /**
     * Kuendigung VU im Schadenfall
     * 
     */
    @XmlEnumValue("05")
    KUENDIGUNG_VU_IM_SCHADENFALL("05"),

    /**
     * Kuendigung VU mangels Beitragszahlung (Folgebeitrag § 38 VVG)
     * 
     */
    @XmlEnumValue("06")
    KUENDIGUNG_VU_MANGELS_BEITRAGSZAHLUNG("06"),

    /**
     * Kuendigung Risikofortfall (Besitzerwechsel) / Umzug ins Ausland / Versicherungsfaehigkeit nicht gegeben / Berufsunfaehigkeit /
     *      Totalschaden
     * 
     */
    @XmlEnumValue("07")
    KUENDIGUNG_RISIKOFORTFALL_UMZUG_INS_AUSLAND_VERSICHERUNGSFAEHIGKEIT_NICHT_GEGEBEN_BERUFSUNFAEHIGKEIT_TOTALSCHADEN("07"),

    /**
     * Ersatzversicherung / Umstellung Einzelversicherung in Gruppenversicherung / Umstellung Gruppenversicherung in Einzelversicherung
     * 
     */
    @XmlEnumValue("08")
    ERSATZVERSICHERUNG("08"),

    /**
     * Storno zum Ablauf kurzfristiger Vertraege
     * 
     */
    @XmlEnumValue("09")
    STORNO_ZUM_ABLAUF_KURZFRISTIGER_VERTRAEGE("09"),

    /**
     * Vertragsunterbrechung mit Reservierung (spez. KFZ)
     * 
     */
    @XmlEnumValue("10")
    VERTRAGSUNTERBRECHUNG_MIT_RESERVIERUNG("10"),

    /**
     * Vertragsunterbrechung ohne Reservierung (spez. KFZ)
     * 
     */
    @XmlEnumValue("11")
    VERTRAGSUNTERBRECHUNG_OHNE_RESERVIERUNG("11"),

    /**
     * Nicht in Kraft getretener Vertrag / Storno ab Beginn (§ 37 VVG) (deprecated, siehe auch Schlüssel 39 und 40)
     * 
     */
    @XmlEnumValue("12")
    NICHT_IN_KRAFT_GETRETENER_VERTRAG_STORNO_AB_BEGINN("12"),

    /**
     * Kuendigung des Erwerbers bei Besitzwechsel
     * 
     */
    @XmlEnumValue("13")
    KUENDIGUNG_DES_ERWERBERS_BEI_BESITZWECHSEL("13"),

    /**
     * Tod Versicherungsnehmer
     * 
     */
    @XmlEnumValue("14")
    TOD_VERSICHERUNGSNEHMER("14"),

    /**
     * Altersablauf / Endalter
     * 
     */
    @XmlEnumValue("15")
    ALTERSABLAUF_ENDALTER("15"),

    /**
     * Kuendigungsklausel gestrichen
     * 
     */
    @XmlEnumValue("16")
    KUENDIGUNGSKLAUSEL_GESTRICHEN("16"),

    /**
     * Erlebensfallauszahlung
     * 
     */
    @XmlEnumValue("17")
    ERLEBENSFALLAUSZAHLUNG("17"),

    /**
     * Abgang aus Rahmenvertrag
     * 
     */
    @XmlEnumValue("18")
    ABGANG_AUS_RAHMENVERTRAG("18"),

    /**
     * Beitragsfreistellung vom VN beantragt
     * 
     */
    @XmlEnumValue("19")
    BEITRAGSFREISTELLUNG_VOM_VN_BEANTRAGT("19"),

    /**
     * Beitragsfreistellung gemaess § 38 VVG
     * 
     */
    @XmlEnumValue("20")
    BEITRAGSFREISTELLUNG_GEMAESS_38_VVG("20"),

    /**
     * Vertragsende durch Tod der versicherten Person
     * 
     */
    @XmlEnumValue("21")
    VERTRAGSENDE_DURCH_TOD_DER_VERSICHERTEN_PERSON("21"),

    /**
     * Vertragsende durch Ablauf (Vertrag)
     * 
     */
    @XmlEnumValue("22")
    VERTRAGSENDE_DURCH_ABLAUF("22"),

    /**
     * Vertragsende durch Heirat (mitversichertes Kind)
     * 
     */
    @XmlEnumValue("23")
    VERTRAGSENDE_DURCH_HEIRAT("23"),

    /**
     * Rueckkauf
     * 
     */
    @XmlEnumValue("24")
    RUECKKAUF("24"),

    /**
     * Verfall
     * 
     */
    @XmlEnumValue("25")
    VERFALL("25"),

    /**
     * Anbieterwechsel
     * 
     */
    @XmlEnumValue("26")
    ANBIETERWECHSEL("26"),

    /**
     * Wechsel zur Gesetzlichen-Krankenversicherung - pflichtig
     * 
     */
    @XmlEnumValue("27")
    WECHSEL_ZUR_GESETZLICHEN_KRANKENVERSICHERUNG_PFLICHTIG("27"),

    /**
     * Wechsel zur Gesetzlichen-Krankenversicherung - freiwillig
     * 
     */
    @XmlEnumValue("28")
    WECHSEL_ZUR_GESETZLICHEN_KRANKENVERSICHERUNG_FREIWILLIG("28"),

    /**
     * Vertragstrennung / -Zusammenlegung
     * 
     */
    @XmlEnumValue("29")
    VERTRAGSTRENNUNG_ZUSAMMENLEGUNG("29"),

    /**
     * Agentur und/oder Geschaeftsstellenwechsel
     * 
     */
    @XmlEnumValue("30")
    AGENTUR_UND_ODER_GESCHAEFTSSTELLENWECHSEL("30"),

    /**
     * Ruecktritt (z. B. Verletzung der vorvertraglichen Anzeigepflicht / Anfechtung)
     * 
     */
    @XmlEnumValue("31")
    RUECKTRITT_VERLETZUNG_DER_VORVERTRAGLICHEN_ANZEIGEPFLICHT_ANFECHTUNG("31"),

    /**
     * Abgang nach Tarifwechsel
     * 
     */
    @XmlEnumValue("32")
    ABGANG_NACH_TARIFWECHSEL("32"),

    /**
     * Rücktritt vom Vertrag wegen Verletzung der
     * Informationspflicht
     * 
     */
    @XmlEnumValue("33")
    RUECKTRITT_VOM_VERTRAG_WEGEN_VERLETZUNG_DER_INFORMATIONSPFLICHT("33"),

    /**
     * Fristlose Kündigung wegen vorsätzlicher oder grob fahrlässiger Verletzung der Anzeigepflicht
     * 
     */
    @XmlEnumValue("34")
    FRISTLOSE_KUENDIGUNG_WEGEN_VORSAETZLICHER_ODER_GROB_FAHRLAESSIGER_VERLETZUNG_DER_ANZEIGEPFLICHT("34"),

    /**
     * Kündigung wegen leicht fahrlässiger oder nicht zu vertretender Verletzung der Anzeigepflicht durch VN
     * 
     */
    @XmlEnumValue("35")
    KUENDIGUNG_WEGEN_LEICHT_FAHRLAESSIGER_ODER_NICHT_ZU_VERTRETENDER_VERLETZUNG_DER_ANZEIGEPFLICHT_DURCH_VN("35"),

    /**
     * Kündigung VN wegen Ausschluss der Gefahr durch VU
     * 
     */
    @XmlEnumValue("36")
    KUENDIGUNG_VN_WEGEN_AUSSCHLUSS_DER_GEFAHR_DURCH_VU("36"),

    /**
     * Storno mit Übergang auf anderes VU im Falle einer Fusion bzw. eines Zukaufs
     * 
     */
    @XmlEnumValue("37")
    STORNO_MIT_UEBERGANG_AUF_ANDERES_VU_IM_FALLE_EINER_FUSION_BZW_EINES_ZUKAUFS("37"),

    /**
     * Storno wegen Fortführung unter neuer
     * Versicherungsscheinnummer
     * 
     */
    @XmlEnumValue("38")
    STORNO_WEGEN_FORTFUEHRUNG_UNTER_NEUER_VERSICHERUNGSSCHEINNUMMER("38"),

    /**
     * Kündigung VU mangels Beitragszahlung (Erstbeitrag)
     * 
     */
    @XmlEnumValue("39")
    KUENDIGUNG_VU_MANGELS_BEITRAGSZAHLUNG_ERSTBEITRAG("39"),

    /**
     * Widerruf des VN ab Beginn.
     * 
     */
    @XmlEnumValue("40")
    WIDERRUF_DES_VN_AB_BEGINN("40"),

    /**
     * Doppelversicherung
     * 
     */
    @XmlEnumValue("41")
    DOPPELVERSICHERUNG("41"),

    /**
     * Beendigung wegen Aufgabe der im Antrag genannten beruflichen Tätigkeit.
     * 
     */
    @XmlEnumValue("42")
    BEENDIGUNG_WEGEN_AUFGABE_DER_IM_ANTRAG_GENANNTEN_BERUFLICHEN_TAETIGKEIT("42"),

    /**
     * Aufgrund einer Änderung entsteht rechtlich ein neuer Vertrag.
     * 
     */
    @XmlEnumValue("43")
    AUFGRUND_EINER_AENDERUNG_ENTSTEHT_RECHTLICH_EIN_NEUER_VERTRAG("43"),

    /**
     * sonstige Stornogruende
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE_STORNOGRUENDE("99");
    private final String value;

    STAbgangsgrund(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAbgangsgrund fromValue(String v) {
        for (STAbgangsgrund c: STAbgangsgrund.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
