
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Antragsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Antragsart"&gt;
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
@XmlType(name = "ST_Antragsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAntragsart {


    /**
     * Neuantrag
     * 
     */
    @XmlEnumValue("01")
    NEUANTRAG("01"),

    /**
     * Ersatzantrag
     * 
     */
    @XmlEnumValue("02")
    ERSATZANTRAG("02"),

    /**
     * Versichererwechsel
     * 
     */
    @XmlEnumValue("03")
    VERSICHERERWECHSEL("03"),

    /**
     * Umstellungsantrag / Tarifwechsel
     * 
     */
    @XmlEnumValue("04")
    UMSTELLUNGSANTRAG("04"),

    /**
     * Fahrzeugwechsel
     * 
     */
    @XmlEnumValue("05")
    FAHRZEUGWECHSEL("05"),

    /**
     * Überführung in eine andere Schicht. 
     * (Schicht 1 = Basisversorgung (z.B. Rürup-Rente), 
     * Schicht 2 = kapitalgedeckte Zusatzversorgung (bAV, Riester-Rente), 
     * Schicht 3 = Kapitalanlage (z.B. private Rentenversicherung)) 
     * 
     */
    @XmlEnumValue("06")
    UEBERFUEHRUNG_IN_ANDERE_SCHICHT("06");
    private final String value;

    STAntragsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAntragsart fromValue(String v) {
        for (STAntragsart c: STAntragsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
