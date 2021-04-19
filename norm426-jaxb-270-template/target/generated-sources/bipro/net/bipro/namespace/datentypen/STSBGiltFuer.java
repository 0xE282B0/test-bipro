
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_SBGiltFuer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_SBGiltFuer"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="003"/&gt;
 *     &lt;enumeration value="004"/&gt;
 *     &lt;enumeration value="005"/&gt;
 *     &lt;enumeration value="006"/&gt;
 *     &lt;enumeration value="007"/&gt;
 *     &lt;enumeration value="008"/&gt;
 *     &lt;enumeration value="009"/&gt;
 *     &lt;enumeration value="010"/&gt;
 *     &lt;enumeration value="011"/&gt;
 *     &lt;enumeration value="012"/&gt;
 *     &lt;enumeration value="013"/&gt;
 *     &lt;enumeration value="014"/&gt;
 *     &lt;enumeration value="015"/&gt;
 *     &lt;enumeration value="016"/&gt;
 *     &lt;enumeration value="017"/&gt;
 *     &lt;enumeration value="018"/&gt;
 *     &lt;enumeration value="019"/&gt;
 *     &lt;enumeration value="020"/&gt;
 *     &lt;enumeration value="021"/&gt;
 *     &lt;enumeration value="022"/&gt;
 *     &lt;enumeration value="023"/&gt;
 *     &lt;enumeration value="024"/&gt;
 *     &lt;enumeration value="025"/&gt;
 *     &lt;enumeration value="026"/&gt;
 *     &lt;enumeration value="027"/&gt;
 *     &lt;enumeration value="028"/&gt;
 *     &lt;enumeration value="029"/&gt;
 *     &lt;enumeration value="030"/&gt;
 *     &lt;enumeration value="031"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_SBGiltFuer")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STSBGiltFuer {


    /**
     * Abschreibedeckungssumme für Personenschäden
     * 
     */
    @XmlEnumValue("001")
    ABSCHREIBEDECKUNGSSUMME_FUER_PERSONENSCHAEDEN("001"),

    /**
     * Abschreibedeckungssumme für sonstige Schäden
     * 
     */
    @XmlEnumValue("002")
    ABSCHREIBEDECKUNGSSUMME_FUER_SONSTIGE_SCHAEDEN("002"),

    /**
     * Abhandenkommen / Vermögensschäden
     * 
     */
    @XmlEnumValue("003")
    ABHANDENKOMMEN("003"),

    /**
     * Brand/Explosion
     * 
     */
    @XmlEnumValue("004")
    BRAND_EXPLOSION("004"),

    /**
     * Brand/Explosion Personen
     * 
     */
    @XmlEnumValue("005")
    BRAND_EXPLOSION_PERSONEN("005"),

    /**
     * Brand/Explosion Sach
     * 
     */
    @XmlEnumValue("006")
    BRAND_EXPLOSION_SACH("006"),

    /**
     * Brillenschäden (Augenarzt)
     * 
     */
    @XmlEnumValue("007")
    BRILLENSCHAEDEN("007"),

    /**
     * Erfüllungsschäden (Zahnarzt)
     * 
     */
    @XmlEnumValue("008")
    ERFUELLUNGSSCHAEDEN("008"),

    /**
     * Feuerhaftung
     * 
     */
    @XmlEnumValue("009")
    FEUERHAFTUNG("009"),

    /**
     * Selbstbeteiligung auf alle Deckungssummen
     * 
     */
    @XmlEnumValue("010")
    SELBSTBETEILIGUNG_AUF_ALLE_DECKUNGSSUMMEN("010"),
    @XmlEnumValue("011")
    SBGILT_FUER_11("011"),
    @XmlEnumValue("012")
    SBGILT_FUER_12("012"),

    /**
     * UHV pauschale Störfalldeckungssumme
     * 
     */
    @XmlEnumValue("013")
    UHV_PAUSCHALE("013"),

    /**
     * UHV Rettungskosten
     * 
     */
    @XmlEnumValue("014")
    UHV_RETTUNGSKOSTEN("014"),

    /**
     * Selbstbeteiligung auf alle Deckungssummen außer Personen
     * 
     */
    @XmlEnumValue("015")
    SELBSTBETEILIGUNG_AUF_ALLE_DECKUNGSSUMMEN_AUSSER_PERSONEN("015"),

    /**
     * Selbstbeteiligung auf alle Summenbegrenzungen
     * 
     */
    @XmlEnumValue("016")
    SELBSTBETEILIGUNG_AUF_ALLE_SUMMENBEGRENZUNGEN("016"),

    /**
     * Störfalldeckung
     * 
     */
    @XmlEnumValue("017")
    STOERFALLDECKUNG("017"),

    /**
     * sonstige Summenarten
     * 
     */
    @XmlEnumValue("018")
    SONSTIGE_SUMMENARTEN("018"),

    /**
     * sonstige Schäden (Sach- und Vermögensschäden)
     * 
     */
    @XmlEnumValue("019")
    SONSTIGE_SCHAEDEN("019"),

    /**
     * Schäden an fremden Kfz
     * 
     */
    @XmlEnumValue("020")
    SCHAEDEN_AN_FREMDEN_KFZ("020"),

    /**
     * Schäden an fremden Hilfsmitteln
     * 
     */
    @XmlEnumValue("021")
    SCHAEDEN_AN_FREMDEN_HILFSMITTELN("021"),

    /**
     * Abhandenkommen von fremden Schlüsseln und Codekarten
     * 
     */
    @XmlEnumValue("022")
    ABHANDENKOMMEN_VON_SCHLUESSELN("022"),

    /**
     * Mietsachschäden
     * 
     */
    @XmlEnumValue("023")
    MIETSACHSCHAEDEN("023"),

    /**
     * Tätigkeitsschäden an fremden Hilfsmitteln
     * 
     */
    @XmlEnumValue("024")
    TAETIGKEITSCHAEDEN_AN_FREMDEN_HILFSMITTELN("024"),

    /**
     * Mietsachschäden durch sonstige Ursachen (außer Brand und Explosion)
     * 
     */
    @XmlEnumValue("025")
    MIETSACHSCHAEDEN_DURCH_SONSTIGE_URSACHEN("025"),

    /**
     * Be- und Entladeschäden
     * 
     */
    @XmlEnumValue("026")
    BE_ENTLADESCHAEDEN("026"),

    /**
     * erweiterte Produkthaftpflicht
     * 
     */
    @XmlEnumValue("027")
    ERWEITERTE_PRODUKTHAFTPFLICHT("027"),

    /**
     * Nachbesserungsschäden
     * 
     */
    @XmlEnumValue("028")
    NACHBESSERUNGSSCHAEDEN("028"),

    /**
     * Personenschäden
     * 
     */
    @XmlEnumValue("029")
    PERSONENSCHAEDEN("029"),

    /**
     * Sachschäden
     * 
     */
    @XmlEnumValue("030")
    SACHSCHAEDEN("030"),

    /**
     * Vermögensschäden
     * 
     */
    @XmlEnumValue("031")
    VERMOEGENSSCHAEDEN("031");
    private final String value;

    STSBGiltFuer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSBGiltFuer fromValue(String v) {
        for (STSBGiltFuer c: STSBGiltFuer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
