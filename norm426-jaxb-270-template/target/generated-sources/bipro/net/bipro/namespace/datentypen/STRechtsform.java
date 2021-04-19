
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Rechtsform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Rechtsform"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Rechtsform")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STRechtsform {


    /**
     * Natuerliche Person
     * 
     */
    @XmlEnumValue("01")
    NATUERLICHE_PERSON("01"),

    /**
     * GBR
     * 
     */
    @XmlEnumValue("02")
    GBR("02"),

    /**
     * OHG
     * 
     */
    @XmlEnumValue("03")
    OHG("03"),

    /**
     * KG
     * 
     */
    @XmlEnumValue("04")
    KG("04"),

    /**
     * GmbH
     * 
     */
    @XmlEnumValue("05")
    GMBH("05"),

    /**
     * gGmbH
     * 
     */
    @XmlEnumValue("06")
    GGMBH("06"),

    /**
     * GmbH & Co KG
     * 
     */
    @XmlEnumValue("07")
    GMBH_UND_CO_KG("07"),

    /**
     * KGaA
     * 
     */
    @XmlEnumValue("08")
    KGAA("08"),

    /**
     * AG
     * 
     */
    @XmlEnumValue("09")
    AG("09"),

    /**
     * e.V.
     * 
     */
    @XmlEnumValue("10")
    EV("10"),

    /**
     * Verein nach BGB
     * 
     */
    @XmlEnumValue("11")
    VEREIN_NACH_BGB("11"),

    /**
     * e.G.
     * 
     */
    @XmlEnumValue("12")
    EG("12"),

    /**
     * Ges. d. oeffentl. Rechts
     * 
     */
    @XmlEnumValue("13")
    GES_D_OEFFENTL_RECHTS("13"),

    /**
     * e.K., e.Kfm., e.Kffr. (eingetragener Kaufmann / eigentragene Kauffrau)
     * 
     */
    @XmlEnumValue("14")
    EK_EKFM_EKFFR("14"),

    /**
     * PartG (Partnerschaftsgesellschaft)
     * 
     */
    @XmlEnumValue("15")
    PARTG("15"),

    /**
     * Partnerreederei
     * 
     */
    @XmlEnumValue("16")
    PARTNERREEDEREI("16"),

    /**
     *  AG & Co. KG
     * 
     */
    @XmlEnumValue("17")
    AG_UND_CO_KG("17"),

    /**
     * VAG (Versicherung auf Gegenseitigkeit)
     * 
     */
    @XmlEnumValue("18")
    VAG("18"),

    /**
     *  Unternehmergesellschaft (haftungsbeschränkt)
     * 
     */
    @XmlEnumValue("19")
    UNTERNEHMERGESELLSCHAFT("19"),

    /**
     * GmbH & Co. KGaA; 
     * 
     */
    @XmlEnumValue("20")
    GMBH_UND_CO_KGAA("20"),

    /**
     * AG & Co. KGaA
     * 
     */
    @XmlEnumValue("21")
    AG_UND_CO_KGAA("21"),

    /**
     *  Stiftung & Co. KGaA
     * 
     */
    @XmlEnumValue("22")
    STIFTUNG_UND_CO_KGAA("22"),

    /**
     * gAG (gemeinützige Aktiengesellschaft)
     * 
     */
    @XmlEnumValue("23")
    GAG("23"),

    /**
     * InvAG (Investmentaktiengesellschaft)
     * 
     */
    @XmlEnumValue("24")
    INVAG("24"),

    /**
     * Ltd (Private Company Limited by Shares)
     * 
     */
    @XmlEnumValue("25")
    LTD("25"),

    /**
     * Inc (Incorporated)
     * 
     */
    @XmlEnumValue("26")
    INC("26"),

    /**
     *  Juristische Person nach altem hamburgischen Recht (eigentümerlos, z.B. HASPA Finanzholding)
     * 
     */
    @XmlEnumValue("27")
    JURISTISCHE_PERSON_NACH_ALTEM_HAMBURGISCHEN_RECHT("27"),

    /**
     * KdöR (Körperschaft des öffentlichen Rechts, darunter fallen: - Gebietskörperschaften (Bund, Länder, Gemeinden); - (staatliche) Universitäten; - Berufsständische Körperschaften (Kammern); - Weltanschauungs- und Religionsgemeinschaften mit Körperschaftsstatus; - Deutschlandradio)
     * 
     */
    @XmlEnumValue("28")
    KDOER("28"),

    /**
     *  AdöR (Anstalt des öffentlichen Rechts darunter fallen: - Landesrundfunkanstalten; - Sparkassen; - Kommunalunternehmen)
     * 
     */
    @XmlEnumValue("29")
    ADOER("29"),

    /**
     *  Stiftung des privaten Rechts
     * 
     */
    @XmlEnumValue("30")
    STIFTUNG_DES_PRIVATEN_RECHTS("30"),

    /**
     *  Stiftung des öffentlichen Rechts
     * 
     */
    @XmlEnumValue("31")
    STIFTUNG_DES_OEFFENTLICHEN_RECHTS("31"),

    /**
     * Gemeinnützige Stiftung
     * 
     */
    @XmlEnumValue("32")
    GEMEINNUETZIGE_STIFTUNG("32"),

    /**
     * Regiebetrieb
     * 
     */
    @XmlEnumValue("33")
    REGIEBETRIEB("33"),

    /**
     * Eigenbetrieb
     * 
     */
    @XmlEnumValue("34")
    EIGENBETRIEB("34"),

    /**
     * Zweckverband
     * 
     */
    @XmlEnumValue("35")
    ZWECKVERBAND("35"),

    /**
     * Gewerkschaften
     * 
     */
    @XmlEnumValue("36")
    GEWERKSCHAFTEN("36"),

    /**
     *  Politische Parteien
     * 
     */
    @XmlEnumValue("37")
    POLITISCHE_PARTEIEN("37"),

    /**
     * Kolonialgesellschaft nach deutschem Schutzgebietsrecht
     * 
     */
    @XmlEnumValue("38")
    KOLONIALGESELLSCHAFT_NACH_DEUTSCHEM_SCHUTZGEBIETSRECHT("38"),

    /**
     * Bergrechtliche Gewerkschaft nach preußischem Recht
     * 
     */
    @XmlEnumValue("39")
    BERGRECHTLICHE_GEWERKSCHAFT_NACH_PREUSSISCHEM_RECHT("39"),

    /**
     * ARGE (Bietergemeinschaft / Arbeitsgemeinschaft)
     * 
     */
    @XmlEnumValue("40")
    ARGE("40"),

    /**
     * IG (Interessengemeinschaft / Strategische Allianz)
     * 
     */
    @XmlEnumValue("41")
    IG("41"),

    /**
     *  Joint-Venture
     * 
     */
    @XmlEnumValue("42")
    JOINT_VENTURE("42"),

    /**
     * nicht eingetragener Verein
     * 
     */
    @XmlEnumValue("43")
    NICHT_EINGETRAGENER_VEREIN("43"),

    /**
     *  Altrechtlicher Verein
     * 
     */
    @XmlEnumValue("44")
    ALTRECHTLICHER_VEREIN("44"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STRechtsform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRechtsform fromValue(String v) {
        for (STRechtsform c: STRechtsform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
