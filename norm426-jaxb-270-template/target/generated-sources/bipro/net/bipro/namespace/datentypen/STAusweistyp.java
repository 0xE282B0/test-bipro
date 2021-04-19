
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Ausweistyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Ausweistyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="13"/&gt;
 *     &lt;enumeration value="14"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Ausweistyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAusweistyp {


    /**
     * Personalausweis
     * 
     */
    @XmlEnumValue("1")
    PERSONALAUSWEIS("1"),

    /**
     * Reisepass
     * 
     */
    @XmlEnumValue("2")
    REISEPASS("2"),

    /**
     * Kinderausweis mit Lichtild
     * 
     */
    @XmlEnumValue("3")
    KINDERAUSWEIS("3"),

    /**
     * Geburtsurkunde (nur bei Kindern)
     * 
     */
    @XmlEnumValue("4")
    GEBURTSURKUNDE("4"),

    /**
     * Dienst-, Ministerial- oder Diplomatenpass
     * 
     */
    @XmlEnumValue("5")
    DIENST_MINISTERIAL_DIPLOMATENAUSWEIS("5"),

    /**
     * Aufenthaltsgestattung gemäß §63 Asylverfahrensgesetz
     * 
     */
    @XmlEnumValue("6")
    AUFENTHALTSGENEHMIGUNG("6"),

    /**
     * Bescheinigung über Aufenthaltsgenehmigung oder Duldung nach §39 Abs.1 AuslG
     * 
     */
    @XmlEnumValue("7")
    BESCHEINIGUNG_UEBER_AUFENTHALTSGENEHMIGUNG("7"),

    /**
     * Reisedokument gemäß §39 Abs.2 AuslG (§14 Abs.1 Nr.1 DV AuslG)
     * 
     */
    @XmlEnumValue("8")
    REISEDOKUMENT("8"),

    /**
     * Reiseausweis als Passersatz gemäß §39 Abs.2 AuslG (§14 Abs.1 Nr.3 DV AuslG)
     * 
     */
    @XmlEnumValue("9")
    REISEAUSWEIS_ALS_PASSERSATZ("9"),

    /**
     * Reiseausweis für Flüchtlinge gemäß §39 Abs.2 AuslG (§14 Abs.2 Nr.1 DV AuslG)
     * 
     */
    @XmlEnumValue("10")
    REISEAUSWEIS_ALS_FLUECHTLINGE("10"),

    /**
     * Reiseausweis für Staatenlose gemäß §39 Abs.2 AuslG (§14 Abs.2 Nr.2 DV AuslG)
     * 
     */
    @XmlEnumValue("11")
    REISEAUSWEIS_ALS_STAATENLOSE("11"),

    /**
     * Ausweis für Mitglieder und Bedienstete der Organe der Europäischen Gemeinschaften (§14 Abs.2 Nr.3 DV AuslG)
     * 
     */
    @XmlEnumValue("12")
    AUSWEIS_EUROPAEISCHE_GEMEINSCHAFT("12"),

    /**
     * Ausweis für Abgeordnete der Parlamentarischen Versammlung des Europarates (§14 Abs.2 Nr.4 DV AuslG)
     * 
     */
    @XmlEnumValue("13")
    AUSWEIS_ABGEORDNETE_EUROPAEISCHES_PARLAMENT("13"),

    /**
     * Geneva Convention Identification Card
     * 
     */
    @XmlEnumValue("14")
    GENEVA_CONVENTION_ID_CARD("14");
    private final String value;

    STAusweistyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAusweistyp fromValue(String v) {
        for (STAusweistyp c: STAusweistyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
