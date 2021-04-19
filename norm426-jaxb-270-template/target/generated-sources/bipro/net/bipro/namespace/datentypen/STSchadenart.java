
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Schadenart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Schadenart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="401"/&gt;
 *     &lt;enumeration value="402"/&gt;
 *     &lt;enumeration value="403"/&gt;
 *     &lt;enumeration value="404"/&gt;
 *     &lt;enumeration value="405"/&gt;
 *     &lt;enumeration value="406"/&gt;
 *     &lt;enumeration value="407"/&gt;
 *     &lt;enumeration value="408"/&gt;
 *     &lt;enumeration value="409"/&gt;
 *     &lt;enumeration value="410"/&gt;
 *     &lt;enumeration value="411"/&gt;
 *     &lt;enumeration value="451"/&gt;
 *     &lt;enumeration value="452"/&gt;
 *     &lt;enumeration value="453"/&gt;
 *     &lt;enumeration value="454"/&gt;
 *     &lt;enumeration value="455"/&gt;
 *     &lt;enumeration value="456"/&gt;
 *     &lt;enumeration value="457"/&gt;
 *     &lt;enumeration value="458"/&gt;
 *     &lt;enumeration value="459"/&gt;
 *     &lt;enumeration value="460"/&gt;
 *     &lt;enumeration value="461"/&gt;
 *     &lt;enumeration value="462"/&gt;
 *     &lt;enumeration value="463"/&gt;
 *     &lt;enumeration value="510"/&gt;
 *     &lt;enumeration value="520"/&gt;
 *     &lt;enumeration value="580"/&gt;
 *     &lt;enumeration value="590"/&gt;
 *     &lt;enumeration value="610"/&gt;
 *     &lt;enumeration value="620"/&gt;
 *     &lt;enumeration value="710"/&gt;
 *     &lt;enumeration value="720"/&gt;
 *     &lt;enumeration value="800"/&gt;
 *     &lt;enumeration value="801"/&gt;
 *     &lt;enumeration value="810"/&gt;
 *     &lt;enumeration value="850"/&gt;
 *     &lt;enumeration value="860"/&gt;
 *     &lt;enumeration value="861"/&gt;
 *     &lt;enumeration value="862"/&gt;
 *     &lt;enumeration value="863"/&gt;
 *     &lt;enumeration value="870"/&gt;
 *     &lt;enumeration value="871"/&gt;
 *     &lt;enumeration value="872"/&gt;
 *     &lt;enumeration value="875"/&gt;
 *     &lt;enumeration value="900"/&gt;
 *     &lt;enumeration value="901"/&gt;
 *     &lt;enumeration value="911"/&gt;
 *     &lt;enumeration value="912"/&gt;
 *     &lt;enumeration value="913"/&gt;
 *     &lt;enumeration value="914"/&gt;
 *     &lt;enumeration value="915"/&gt;
 *     &lt;enumeration value="916"/&gt;
 *     &lt;enumeration value="917"/&gt;
 *     &lt;enumeration value="918"/&gt;
 *     &lt;enumeration value="919"/&gt;
 *     &lt;enumeration value="920"/&gt;
 *     &lt;enumeration value="921"/&gt;
 *     &lt;enumeration value="922"/&gt;
 *     &lt;enumeration value="930"/&gt;
 *     &lt;enumeration value="950"/&gt;
 *     &lt;enumeration value="951"/&gt;
 *     &lt;enumeration value="962"/&gt;
 *     &lt;enumeration value="963"/&gt;
 *     &lt;enumeration value="970"/&gt;
 *     &lt;enumeration value="980"/&gt;
 *     &lt;enumeration value="981"/&gt;
 *     &lt;enumeration value="990"/&gt;
 *     &lt;enumeration value="999"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Schadenart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSchadenart {


    /**
     * Bauherrenhaftpflicht
     * 
     */
    @XmlEnumValue("401")
    BAUHERRENHAFTPFLICHT("401"),

    /**
     * Berufshaftpflicht
     * 
     */
    @XmlEnumValue("402")
    BERUFSHAFTPFLICHT("402"),

    /**
     * Betriebshaftpflicht
     * 
     */
    @XmlEnumValue("403")
    BETRIEBSHAFTPFLICHT("403"),

    /**
     * Heilwesenhaftpflicht
     * 
     */
    @XmlEnumValue("404")
    HEILWESENHAFTPFLICHT("404"),

    /**
     * Planungshaftpflicht
     * 
     */
    @XmlEnumValue("405")
    PLANUNGSHAFTPFLICHT("405"),

    /**
     * Privatrisiko
     * 
     */
    @XmlEnumValue("406")
    PRIVATRISIKO("406"),

    /**
     * Produkthaftpflicht
     * 
     */
    @XmlEnumValue("407")
    PRODUKTHAFTPFLICHT("407"),

    /**
     * Tierhalterhaftpflicht
     * 
     */
    @XmlEnumValue("408")
    TIERHALTERHAFTPFLICHT("408"),

    /**
     * Umwelthaftpflicht
     * 
     */
    @XmlEnumValue("409")
    UMWELTHAFTPFLICHT("409"),

    /**
     * Vermögenshaftpflicht
     * 
     */
    @XmlEnumValue("410")
    VERMOEGENSHAFTPFLICHT("410"),

    /**
     * Haus- und Grundbesitzerhaftpflicht
     * 
     */
    @XmlEnumValue("411")
    HAUS_GRUNDBESITZERHAFTPFLICHT("411"),

    /**
     * Sozialgerichtsrechtsschutz
     * 
     */
    @XmlEnumValue("451")
    SOZIALGERICHTSRECHTSSCHUTZ("451"),

    /**
     * Arbeitsrechtsschutz
     * 
     */
    @XmlEnumValue("452")
    ARBEITSRECHTSSCHUTZ("452"),

    /**
     * Familien- und Erbrechtsschutz / Beratungsrechtsschutz
     * 
     */
    @XmlEnumValue("453")
    FAMILIEN_ERBRECHTSSCHUTZ_BERATUNGSRECHTSSCHUTZ("453"),

    /**
     * Mietrechtsschutz
     * 
     */
    @XmlEnumValue("454")
    MIETERECHTSSCHUTZ("454"),

    /**
     * Steuergerichtsrechtsschutz
     * 
     */
    @XmlEnumValue("455")
    STEUERGERICHTSRECHTSSCHUTZ("455"),

    /**
     * Ordnungswidrigkeitenrechtsschutz (ohne Verkehrsbereich)
     * 
     */
    @XmlEnumValue("456")
    ORDNUNGSWIDRIGKEITENRECHTSSCHUTZ_OHNE_VERKEHRSBEREICH("456"),

    /**
     * Ordnungswidrigkeitenrechtsschutz (Verkehrsbereich)
     * 
     */
    @XmlEnumValue("457")
    ORDNUNGSWIDRIGKEITENRECHTSSCHUTZ_VERKEHRSBEREICH("457"),

    /**
     * Schadenersatzrechtsschutz (Verkehrsbereich)
     * 
     */
    @XmlEnumValue("458")
    SCHADENERSATZRECHTSSCHUTZ_VERKEHRSBEREICH("458"),

    /**
     * Strafrechtsschutz (ohne Verkehrsbereich)
     * 
     */
    @XmlEnumValue("459")
    STRAFRECHTSSCHUTZ_OHNE_VERKEHRSBEREICH("459"),

    /**
     * Strafrechtsschutz (Verkehrsbereich)
     * 
     */
    @XmlEnumValue("460")
    STRAFRECHTSSCHUTZ_VERKEHRSBEREICH("460"),

    /**
     * Vertragsrechtsschutz (ohne Verkehrsbereich)
     * 
     */
    @XmlEnumValue("461")
    VERTRAGSRECHTSSCHUTZ_OHNE_VERKEHRSBEREICH("461"),

    /**
     * Vertragsrechtsschutz (Verkehrsbereich)
     * 
     */
    @XmlEnumValue("462")
    VERTRAGSRECHTSSCHUTZ_VERKEHRSBEREICH("462"),

    /**
     * Rechtsschutz für Grundstücks- und Wohneigentum
     * 
     */
    @XmlEnumValue("463")
    RECHTSSCHUTZ_GRUNDSTUECK_WOHNEIGENTUM("463"),

    /**
     * Kfz-Schaden mit/ohne sonstigem Sachschaden
     * 
     */
    @XmlEnumValue("510")
    KFZ_SCHADEN("510"),

    /**
     * Sachschaden ohne Kfz-Schaden
     * 
     */
    @XmlEnumValue("520")
    SACHSCHADEN_OHNE_KFZ_SCHADEN("520"),

    /**
     * Ladungsschaden Fernverkehr
     * 
     */
    @XmlEnumValue("580")
    LADUNGSSCHADEN_FERNVERKEHR("580"),

    /**
     * Ladungsschaden Nahverkehr
     * 
     */
    @XmlEnumValue("590")
    LADUNGSSCHADEN_NAHVERKEHR("590"),

    /**
     * Todesfall mit Kfz-Schaden und Sachschaden
     * 
     */
    @XmlEnumValue("610")
    TODESFALL_KFZ_SACHSCHADEN("610"),

    /**
     * Todesfall ohne Kfz-Schaden jedoch mit Sachschaden
     * 
     */
    @XmlEnumValue("620")
    TODESFALL_OHNE_KFZ_MIT_SACHSCHADEN("620"),

    /**
     * Verletztenfall mit Kfz-Schaden und Sachschaden
     * 
     */
    @XmlEnumValue("710")
    VERLETZTENFALL_KFZ_SACHSCHADEN("710"),

    /**
     * Verletztenfall ohne Kfz-Schaden jedoch mit Sachschaden
     * 
     */
    @XmlEnumValue("720")
    VERLETZTENFALL_OHNE_KFZ_MIT_SACHSCHADEN("720"),

    /**
     * Passives Beteiligungsgeschäft Vollkasko
     * 
     */
    @XmlEnumValue("800")
    PASSIVES_BETEILIGUNGSGESCHAEFT_VOLLKASKO("800"),

    /**
     * Aktives Beteiligungsgeschäft Vollkasko
     * 
     */
    @XmlEnumValue("801")
    AKTIVES_BETEILIGUNGSGESCHAEFT_VOLLKASKO("801"),

    /**
     * Unfall/Kollision mit anderen KFZ (VK-Tatbestand)
     * 
     */
    @XmlEnumValue("810")
    UNFALL_MIT_ANDEREM_KFZ("810"),

    /**
     * Unfall ohne Berührung mit anderen KFZ (VK-Tatbestand)
     * 
     */
    @XmlEnumValue("850")
    UNFALL_OHNE_ANDERES_KFZ("850"),

    /**
     * Mut- und böswillige Beschädigung
     * 
     */
    @XmlEnumValue("860")
    MUT_BOESWILLIGE_BESCHAEDIGUNG("860"),

    /**
     * Einbruchdiebstahl
     * 
     */
    @XmlEnumValue("861")
    EINBRUCHDIEBSTAHL("861"),

    /**
     * Kfz-Einbruch mit Diebstahl persönlicher Gegenstände
     * 
     */
    @XmlEnumValue("862")
    KFZ_EINBRUCH_MIT_DIEBSTAHL_PERSOENLICHER_GEGENSTAENDE("862"),

    /**
     * Fahrraddiebstahl
     * 
     */
    @XmlEnumValue("863")
    FAHRRADDIEBSTAHL("863"),

    /**
     * Garantiefall (Reparaturkostenversicherung)
     * 
     */
    @XmlEnumValue("870")
    GARANTIEFALL("870"),

    /**
     * Passives Beteiligungsgeschäft Rep.kostenversicherung
     * 
     */
    @XmlEnumValue("871")
    PASSIVES_BETEILIGUNGSGESCHAEFT("871"),

    /**
     * Aktives Beteiligungsgeschäft Rep.kostenversicherung
     * 
     */
    @XmlEnumValue("872")
    AKTIVES_BETEILIGUNGSGESCHAEFT("872"),

    /**
     * Zusatzhaftpflichtversicherung für Handel/Handwerk
     * 
     */
    @XmlEnumValue("875")
    ZUSATZHAFTPFLICHTVERSICHERUNG_HANDEL_HANDWERK("875"),

    /**
     * Passives Beteiligungsgeschäft Teilkasko
     * 
     */
    @XmlEnumValue("900")
    PASSIVES_BETEILIGUNGSGESCHAEFT_TEILKASKO("900"),

    /**
     * Aktives Beteiligungsgeschäft Teilkasko
     * 
     */
    @XmlEnumValue("901")
    AKTIVES_BETEILIGUNGSGESCHAEFT_TEILKASKO("901"),

    /**
     * Brand
     * 
     */
    @XmlEnumValue("911")
    BRAND("911"),

    /**
     * Explosion
     * 
     */
    @XmlEnumValue("912")
    EXPLOSION("912"),

    /**
     * Seng- und Schmorschäden, auch Schäden an Verkabelung
     * 
     */
    @XmlEnumValue("913")
    SENG_SCHMORSCHAEDEN("913"),

    /**
     * Leitungswasser
     * 
     */
    @XmlEnumValue("914")
    LEITUNGSWASSER("914"),

    /**
     * Elementarschaden
     * 
     */
    @XmlEnumValue("915")
    ELEMENTARSCHADEN("915"),

    /**
     * Vermögensschaden
     * 
     */
    @XmlEnumValue("916")
    VERMOEGENSSCHADEN("916"),

    /**
     * Mietverlustschaden
     * 
     */
    @XmlEnumValue("917")
    MIETVERLUSTSCHADEN("917"),

    /**
     * Brems-, Betriebs- und Bruchschäden
     * 
     */
    @XmlEnumValue("918")
    BREMS_BETRIEBS_BRUCHSCHAEDEN("918"),

    /**
     * IT-Schäden
     * 
     */
    @XmlEnumValue("919")
    IT_SCHAEDEN("919"),

    /**
     * Diebstahl von Fahrzeuginnenteilen
     * 
     */
    @XmlEnumValue("920")
    DIEBSTAHL_FAHRZEUGINNENTEILE("920"),

    /**
     * versuchter Totaldiebstahl
     * 
     */
    @XmlEnumValue("921")
    VERSUCHTER_TOTALDIEBSTAHL("921"),

    /**
     * Diebstahl von Fahrzeugaußenteilen
     * 
     */
    @XmlEnumValue("922")
    DIEBSTAHL_FAHRZEUGAUSSENTEILE("922"),

    /**
     * Totaldiebstahl
     * 
     */
    @XmlEnumValue("930")
    TOTALDIEBSTAHL("930"),

    /**
     * Glasschaden
     * 
     */
    @XmlEnumValue("950")
    GLASSCHADEN("950"),

    /**
     * Sturmschaden
     * 
     */
    @XmlEnumValue("951")
    STURMSCHADEN("951"),

    /**
     * Hagelschaden
     * 
     */
    @XmlEnumValue("962")
    HAGELSCHADEN("962"),

    /**
     * Blitz
     * 
     */
    @XmlEnumValue("963")
    BLITZ("963"),

    /**
     * Überschwemmungsschaden
     * 
     */
    @XmlEnumValue("970")
    UEBERSCHWEMMUNGSSCHADEN("970"),

    /**
     * Wildschaden
     * 
     */
    @XmlEnumValue("980")
    WILDSCHADEN("980"),

    /**
     * Marderbiss
     * 
     */
    @XmlEnumValue("981")
    MARDERBISS("981"),

    /**
     * Ladungsschaden ohne Fahrzeugschaden
     * 
     */
    @XmlEnumValue("990")
    LADUNGSSCHADEN_OHNE_FAHRZEUGSCHADEN("990"),

    /**
     * Sonstige Schadenart
     * 
     */
    @XmlEnumValue("999")
    SONSTIGE_SCHADENART("999");
    private final String value;

    STSchadenart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSchadenart fromValue(String v) {
        for (STSchadenart c: STSchadenart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
