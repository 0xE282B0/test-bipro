
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Haftungsgrundlage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Haftungsgrundlage"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Haftungsgrundlage")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STHaftungsgrundlage {


    /**
     * ADSp (Allgemeine Deutsche Spediteurbedingungen)
     * 
     */
    @XmlEnumValue("01")
    ADSP("01"),

    /**
     * ADSp Lager (Allgemeine Deutsche Spediteurbedingungen Lager)
     * 
     */
    @XmlEnumValue("02")
    ADSP_LAGER("02"),

    /**
     * AGB (Allgemeine GeschĂ¤ftsbedingungen)
     * 
     */
    @XmlEnumValue("03")
    AGB("03"),

    /**
     * ALB (Allgemeine Lagerbedingungen des Deutschen MĂ¶beltransports)
     * 
     */
    @XmlEnumValue("04")
    ALB("04"),

    /**
     * BSK (Allgemeine GeschĂ¤ftsbedingungen der Bundesfachgruppe Schwertransporte und Kranarbeiten (AGB-BSK Kran und Transport))
     * 
     */
    @XmlEnumValue("05")
    BSK("05"),

    /**
     * CIM (Ăśbereinkommen ĂĽber den internationalen Eisenbahnverkehr)
     * 
     */
    @XmlEnumValue("06")
    CIM("06"),

    /**
     * CMNI (Budapester Ăśbereinkommens ĂĽber den Vertrag ĂĽber die GĂĽterbefĂ¶rderung in der Binnenschifffahrt)
     * 
     */
    @XmlEnumValue("07")
    CMNI("07"),

    /**
     * CMR (Ăśbereinkommens ĂĽber den BefĂ¶rderungsvertrag im internationalen StraĂźengĂĽterverkehr)
     * 
     */
    @XmlEnumValue("08")
    CMR("08"),

    /**
     * HGB bis 40 SZR/kg (Vierter Abschnitt FrachtgeschĂ¤ft Handelsgesetzbuch Â§ 449 Abweichende Vereinbarungen ĂĽber die Haftung)
     * 
     */
    @XmlEnumValue("09")
    HGB_40_SZRKG("09"),

    /**
     * HGB bis 8,33 SZR/kg (Vierter Abschnitt FrachtgeschĂ¤ft Handelsgesetzbuch Â§ 431 HaftungshĂ¶chstbetrag)
     * 
     */
    @XmlEnumValue("10")
    HGB_8_33_SZRKG("10"),

    /**
     * HGB Lager (Sechster Abschnitt LagergeschĂ¤ft Handelsgesetzbuch Â§ 475 Haftung fĂĽr Verlust oder BeschĂ¤digung)
     * 
     */
    @XmlEnumValue("11")
    HGB_LAGER("11"),

    /**
     * HGB Sonstige (FĂĽnfter Abschnitt SpeditionsgeschĂ¤ft Handelsgesetzbuch Â§ 461 Haftung des Spediteurs)
     * 
     */
    @XmlEnumValue("12")
    HGB_SONSTIGE("12"),

    /**
     * HGB Umzug (Vierter Abschnitt FrachtgeschĂ¤ft Handelsgesetzbuch BefĂ¶rderung von Umzugsgut Â§ 451e HaftungshĂ¶chstbetrag)
     * 
     */
    @XmlEnumValue("13")
    HGB_UMZUG("13"),

    /**
     * MĂś (Montrealer Ăśbereinkommen)
     * 
     */
    @XmlEnumValue("14")
    MUE("14"),

    /**
     * Multimodal (Vierter Abschnitt FrachtgeschĂ¤ft Handelsgesetzbuch BefĂ¶rderung mit verschiedenartigen BefĂ¶rderungsmitteln Â§ 452)
     * 
     */
    @XmlEnumValue("15")
    MULTIMODAL("15"),

    /**
     * NSAB (Allgemeinen Bestimmungen des Nordischen Spediteurverbands)
     * 
     */
    @XmlEnumValue("16")
    NSAB("16"),

    /**
     * Seerecht (Haager Regeln, Hague Visby Rules, Hamburg â€“ Regeln sowie anderer maĂźgeblicher internationaler Abkommen oder nationaler gesetzlicher Bestimmungen fĂĽr den Seeverkehr)
     * 
     */
    @XmlEnumValue("17")
    SEERECHT("17"),

    /**
     * VBGL (Vertragsbedingungen fĂĽr den GĂĽterkraftverkehrs-, Speditions- und Logistikunternehmer)
     * 
     */
    @XmlEnumValue("18")
    VBGL("18"),

    /**
     * Vertragliche Vereinbarung (Vertragliche- bzw. Individualvereinbarungen)
     * 
     */
    @XmlEnumValue("19")
    VERTRAGLICHE_VEREINBARUNG("19"),

    /**
     * WA (Warschauer Abkommen)
     * 
     */
    @XmlEnumValue("20")
    WA("20"),

    /**
     * BGB (BĂĽrgerliches Gesetzbuch)
     * 
     */
    @XmlEnumValue("21")
    BGB("21"),

    /**
     * Sonstige Haftungsgrundlage
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE_HAFTUNGSGRUNDLAGE("99");
    private final String value;

    STHaftungsgrundlage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STHaftungsgrundlage fromValue(String v) {
        for (STHaftungsgrundlage c: STHaftungsgrundlage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
