
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_KrankenTarifart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_KrankenTarifart"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_KrankenTarifart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STKrankenTarifart {


    /**
     * Krankenvollversicherung - Kompakttarife (ambulant, stationär, Zahn)
     * 
     */
    @XmlEnumValue("01")
    KRANKENVOLLVERSICHERUNG("01"),

    /**
     * Ambulant (Vollversicherung)
     * 
     */
    @XmlEnumValue("02")
    AMBULANT("02"),

    /**
     * Stationär (Vollversicherung)
     * 
     */
    @XmlEnumValue("03")
    STATIONAER("03"),

    /**
     * Zahn (Vollversicherung)
     * 
     */
    @XmlEnumValue("04")
    ZAHN("04"),

    /**
     * Krankentagegeld
     * 
     */
    @XmlEnumValue("05")
    KRANKENTAGEGELD("05"),

    /**
     * Krankenhaustagegeld
     * 
     */
    @XmlEnumValue("06")
    KRANKENHAUSTAGEGELD("06"),

    /**
     * Kurversicherung
     * 
     */
    @XmlEnumValue("07")
    KURVERSICHERUNG("07"),

    /**
     * Stationäre Zusatzversicherung zur gesetzlichen KV
     * 
     */
    @XmlEnumValue("08")
    STATIONAERE_ZUSATZVERSICHERUNG("08"),

    /**
     * Ergänzungsversicherung zur gesetzlichen KV
     * 
     */
    @XmlEnumValue("09")
    ERGAENZUNGSVERSICHERUNG("09"),

    /**
     * Auslandskrankenversicherung
     * 
     */
    @XmlEnumValue("10")
    AUSLANDSKRANKENVERSICHERUNG("10"),

    /**
     * Pflegepflichtversicherung
     * 
     */
    @XmlEnumValue("11")
    PFLEGEPFLICHTVERSICHERUNG("11"),

    /**
     * Pflegezusatzversicherung
     * 
     */
    @XmlEnumValue("12")
    PFLEGEZUSATZVERSICHERUNG("12"),

    /**
     * Optionstarif
     * 
     */
    @XmlEnumValue("13")
    OPTIONSTARIF("13"),

    /**
     * Zusätze zur Vollversicherung, die sich eindeutig anderen Bereichen zuordnen lassen (z.B. Kombination aus Erweiterung der GOÄ, Auslandsgeltung und zusätzliche Heilpraktikerleistung)
     * 
     */
    @XmlEnumValue("14")
    ZUSAETZE_ZUR_VOLLVERSICHERUNG("14"),

    /**
     * Sonst. KV (wenn keine andere Zuordnung möglich ist)
     * 
     */
    @XmlEnumValue("15")
    SONSTIGE_KV("15"),

    /**
     * Gesetzlicher Zuschlag
     * 
     */
    @XmlEnumValue("16")
    GESETZLICHER_ZUSCHLAG("16"),

    /**
     * Gruppenversicherung Ausland
     * 
     */
    @XmlEnumValue("17")
    GRUPPENVERSICHERUNG_AUSLAND("17"),

    /**
     * GKV pflichtversichert
     * 
     */
    @XmlEnumValue("18")
    GKV_PFLICHTVERSICHERT("18"),

    /**
     * Zahnersatzversicherung PKV
     * 
     */
    @XmlEnumValue("19")
    ZAHNERSATZVERSICHERUNG("19"),

    /**
     * Zahnzusatztarif
     * 
     */
    @XmlEnumValue("20")
    ZAHNZUSATZTARIF("20"),

    /**
     * ambulanter Zusatztarif
     * 
     */
    @XmlEnumValue("21")
    AMBULANTER_ZUSATZTARIF("21"),

    /**
     * GKV freiwillig versichert
     * 
     */
    @XmlEnumValue("22")
    GKV_FREIWILLIG("22"),

    /**
     * Beitragsentlastungstarif
     * 
     */
    @XmlEnumValue("23")
    BEITRAGSENTLASTUNGSTARIF("23"),

    /**
     * Gesetzlicher Zuschlag in der Leistungsphase
     * 
     */
    @XmlEnumValue("24")
    GESETZLICHER_ZUSCHLAG_IN_DER_LEISTUNGSPHASE("24"),

    /**
     * Beitragsentlastungstarif in der Leistungsphase
     * 
     */
    @XmlEnumValue("25")
    BEITRAGSENTLASTUNGSTARIF_IN_DER_LEISTUNGSPHASE("25"),

    /**
     * Tarifbonus Beitragsanpassung ( zeitlich befristeter Tarifbonus der zur Limitierung einer Beitragsanpassung gewährt wird.)
     * 
     */
    @XmlEnumValue("26")
    TARIFBONUS_BEITRAGSANPASSUNG("26"),

    /**
     * Incomingtarife für ausländische Gäste in Deutschland
     * 
     */
    @XmlEnumValue("27")
    INCOMINGTARIFE_FUER_AUSLAENDISCHE_GAESTE("27");
    private final String value;

    STKrankenTarifart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKrankenTarifart fromValue(String v) {
        for (STKrankenTarifart c: STKrankenTarifart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
