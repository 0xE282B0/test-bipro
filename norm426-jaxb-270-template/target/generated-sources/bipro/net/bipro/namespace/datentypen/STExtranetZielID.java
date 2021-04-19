
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ExtranetZielID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ExtranetZielID"&gt;
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
 *     &lt;enumeration value="999"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ExtranetZielID")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STExtranetZielID {


    /**
     * Hauptmenü
     * 
     */
    @XmlEnumValue("001")
    HAUPTMENUE("001"),

    /**
     * Stammdaten
     * 
     */
    @XmlEnumValue("002")
    STAMMDATEN("002"),

    /**
     * Bearbeiten
     * 
     */
    @XmlEnumValue("003")
    BEARBEITEN("003"),

    /**
     * Verträge
     * 
     */
    @XmlEnumValue("004")
    VERTRAEGE("004"),

    /**
     * Dokumente
     * 
     */
    @XmlEnumValue("005")
    DOKUMENTE("005"),

    /**
     * Vorgänge
     * 
     */
    @XmlEnumValue("006")
    VORGAENGE("006"),

    /**
     * Schäden
     * 
     */
    @XmlEnumValue("007")
    SCHAEDEN("007"),

    /**
     * Inkassostand
     * 
     */
    @XmlEnumValue("008")
    INKASSOSTAND("008"),

    /**
     * Angebot
     * 
     */
    @XmlEnumValue("009")
    ANGEBOT("009"),

    /**
     * Anfrage
     * 
     */
    @XmlEnumValue("010")
    ANFRAGE("010"),

    /**
     * Schadenmeldung
     * 
     */
    @XmlEnumValue("011")
    SCHADENMELDUNG("011"),

    /**
     * Rückkaufwert
     * 
     */
    @XmlEnumValue("012")
    RUECKKAUFWERT("012"),

    /**
     * Rabattretter
     * 
     */
    @XmlEnumValue("013")
    RABATTRETTER("013"),

    /**
     * Vereinbarungen
     * 
     */
    @XmlEnumValue("014")
    VEREINBARUNGEN("014"),

    /**
     * Produktion
     * 
     */
    @XmlEnumValue("015")
    PRODUKTION("015"),

    /**
     * Provision
     * 
     */
    @XmlEnumValue("016")
    PROVISION("016"),

    /**
     * Ranking
     * 
     */
    @XmlEnumValue("017")
    RANKING("017"),

    /**
     * Posteingang
     * 
     */
    @XmlEnumValue("018")
    POSTEINGANG("018"),

    /**
     * Postausgang
     * 
     */
    @XmlEnumValue("019")
    POSTAUSGANG("019"),

    /**
     * Störfälle
     * 
     */
    @XmlEnumValue("020")
    STOERFAELLE("020"),

    /**
     * Auswertungen
     * 
     */
    @XmlEnumValue("021")
    AUSWERTUNG("021"),

    /**
     * Rundschreiben
     * 
     */
    @XmlEnumValue("022")
    RUNDSCHREIBEN("022"),

    /**
     * Bestellen
     * 
     */
    @XmlEnumValue("023")
    BESTELLEN("023"),

    /**
     * Download
     * 
     */
    @XmlEnumValue("024")
    DOWNLOAD("024"),

    /**
     * Kontakt
     * 
     */
    @XmlEnumValue("025")
    KONTAKT("025"),

    /**
     * GDV
     * 
     */
    @XmlEnumValue("026")
    GDV("026"),

    /**
     * Partnersuche
     * 
     */
    @XmlEnumValue("027")
    PARTNERSUCHE("027"),

    /**
     * Vetragsuche
     * 
     */
    @XmlEnumValue("028")
    VERTRAGSUCHE("028"),

    /**
     * Schadensuche
     * 
     */
    @XmlEnumValue("029")
    SCHADENSUCHE("029"),

    /**
     * sonstige
     * 
     */
    @XmlEnumValue("999")
    SONSTIGE("999");
    private final String value;

    STExtranetZielID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STExtranetZielID fromValue(String v) {
        for (STExtranetZielID c: STExtranetZielID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
