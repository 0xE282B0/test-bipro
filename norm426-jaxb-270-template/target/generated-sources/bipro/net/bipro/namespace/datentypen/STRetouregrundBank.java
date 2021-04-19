
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_RetouregrundBank.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_RetouregrundBank"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_RetouregrundBank")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STRetouregrundBank {


    /**
     * Sonstige Gründe
     * 
     */
    @XmlEnumValue("0")
    SONSTIGE_GRUENDE("0"),

    /**
     * Konto erloschen
     * 
     */
    @XmlEnumValue("1")
    KONTO_ERLOSCHEN("1"),

    /**
     * Angaben unklar
     * 
     */
    @XmlEnumValue("2")
    ANGABEN_UNKLAR("2"),

    /**
     * Kein LEV-Auftrag
     * 
     */
    @XmlEnumValue("3")
    KEIN_LEV_AUFTRAG("3"),

    /**
     * Rückruf Produktgeber
     * 
     */
    @XmlEnumValue("4")
    RUECKRUF_PRODUKTGEBER("4"),

    /**
     * Widerspruch
     * 
     */
    @XmlEnumValue("5")
    WIDERSPRUCH("5"),

    /**
     * IBAN fehlerhaft (Incorrect Account Number)
     * 
     */
    @XmlEnumValue("10")
    IBAN_FEHLERHAFT("10"),

    /**
     * Konto aufgelöst (Closed Account Number)
     * 
     */
    @XmlEnumValue("11")
    KONTO_AUFGELOEST("11"),

    /**
     * Konto gesperrt (Blocked Account)
     * 
     */
    @XmlEnumValue("12")
    KONTO_GESPERRT("12"),

    /**
     * Die Begleichung der Transaktion ist fehlgeschlagen. (Settlement Failed)
     * 
     */
    @XmlEnumValue("13")
    BEGLEICHUNG_DER_TRANSAKTION_FEHLGESCHLAGEN("13"),

    /**
     * Kein gültiges Mandat (No Mandate)
     * 
     */
    @XmlEnumValue("14")
    KEIN_GUELTIGES_MANDAT("14"),

    /**
     * Die Daten zum Mandat fehlen oder sind nicht korrekt. (Missing Mandatory Information Mandate)
     * 
     */
    @XmlEnumValue("15")
    DATEN_ZUM_MANDAT_FEHLEN("15"),

    /**
     * Widerspruch durch den Zahler (Zahlungspflichtigen) (Refund Request By End Customer)
     * 
     */
    @XmlEnumValue("16")
    WIDERSPRUCH_DURCH_ZAHLER("16"),

    /**
     * Rückgabe durch den Zahler (Zahlungspflichtigen) vor Fälligkeit (Refusal) (Not Specified Reason Customer Generated)
     * 
     */
    @XmlEnumValue("17")
    RUECKGABE_DURCH_ZAHLER("17"),

    /**
     * BIC ungültig (Bank Identifier Incorrect)
     * 
     */
    @XmlEnumValue("18")
    BIC_UNGUELTIG("18"),

    /**
     * Sonstige externe Gründe
     * 
     */
    @XmlEnumValue("19")
    SONSTIGE_EXTERNE_GRUENDE("19");
    private final String value;

    STRetouregrundBank(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRetouregrundBank fromValue(String v) {
        for (STRetouregrundBank c: STRetouregrundBank.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
