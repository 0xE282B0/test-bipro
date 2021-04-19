
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Abrechnungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Abrechnungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Abrechnungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAbrechnungsart {


    /**
     * Vermittlerabrechnung Gesamtbeitrag (Der Vermittler zieht den Beitrag ein und überweist ohne Abzug der Provision an den Produktgeber)
     * 
     */
    @XmlEnumValue("01")
    VERMITTLERABRECHNUNG_GESAMTBEITRAG("01"),

    /**
     * Vermittlerabrechnung Abrechnungsbetrag (Der Vermittler zieht den Beitrag ein und überweist abzüglich der Provision an den Produktgeber)
     * 
     */
    @XmlEnumValue("02")
    VERMITTLERABRECHNUNG_ABRECHNUNGSBETRAG("02"),

    /**
     * Abrechnung
     * In der Abrechnung sind die Posten des Abrechnenden enthalten, die entweder zu einer Forderung oder einer Verbindlichkeit gegenüber dem Abrechnungsempfänger führen und in deren Folge in der Regel eine Finanztransaktion steht. In der Regel werden Abrechnungen turnusmäßig erstellt.
     * 
     */
    @XmlEnumValue("03")
    ABRECHNUNG("03"),

    /**
     * Buchungsnote
     * Die Buchungsnote informiert den Abrechnungsempfänger über die beim Abrechnenden getätigten Buchungen des Abrechnenden (in der Regel Provisionen und Kostenübernahmen, bei Vermittlerinkasso auch Beiträge und ggf. Schadenzahlungen) seit der vorherigen Buchungsnote, die noch nicht abgerechnet wurden. In Abgrenzung zur Abrechnung folgt der Buchungsnote keine Finanztransaktion.
     * 
     */
    @XmlEnumValue("04")
    BUCHUNGSNOTE("04"),

    /**
     * Kontoauszug
     * Der Kontoauszug enthält aus Sicht des Abrechnenden ausschließlich Abrechnungsposten für ein benanntes Konto der Versicherungsnebenbuchhaltung und einen benannten Zeitraum (ggf. eingeschränkt auf bestimmte Postenarten). Darin können sowohl bereits abgerechnete, sowie noch nicht abgerechnete Posten enthalten sein.
     * 
     */
    @XmlEnumValue("05")
    KONTOAUSZUG("05"),

    /**
     * OP-Liste
     * Die OP-Liste enthält nur Abrechnungsposten die aus Sicht des Abrechnenden seitens des Abrechnungsempfängers noch zu begleichen sind, in der Regel ist die vertraglich vereinbarte Frist für die Abrechnung überschritten.
     * 
     */
    @XmlEnumValue("06")
    OP_LISTE("06");
    private final String value;

    STAbrechnungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAbrechnungsart fromValue(String v) {
        for (STAbrechnungsart c: STAbrechnungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
