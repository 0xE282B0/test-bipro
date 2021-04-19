
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_SteuerlicheFoerderung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_SteuerlicheFoerderung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_SteuerlicheFoerderung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSteuerlicheFoerderung {


    /**
     * irrelevant
     * 
     */
    @XmlEnumValue("0")
    IRRELEVANT("0"),

    /**
     * pauschal besteuerte Direktversicherung
     * nach §40b EStG
     * 
     */
    @XmlEnumValue("1")
    PAUSCHAL_BESTEUERTE_DIREKTVERSICHERUNG("1"),

    /**
     * Beiträge steuerfrei nach §3 Ziff.63
     * EStG
     * 
     */
    @XmlEnumValue("2")
    BEITRAEGE_STEUERFREI_63("2"),

    /**
     * zulagengeförderte Direktversicherung
     * nach §10a EStG
     * 
     */
    @XmlEnumValue("3")
    ZULAGENGEFOERDERTE_DIREKTVERSICHERUNG("3"),

    /**
     * Beiträge steuerfrei nach §3 Ziff.66
     * EstG
     * 
     */
    @XmlEnumValue("4")
    BEITRAEGE_STEUERFREI_66("4"),

    /**
     * keine
     * 
     */
    @XmlEnumValue("5")
    KEINE("5"),

    /**
     * Zulagegeförderte Privatversicherung
     * nach §10 a EStG
     * 
     */
    @XmlEnumValue("6")
    ZULAGENGEFOERDERTE_PRIVATVERSICHERUNG("6"),

    /**
     * Basis-/Rürup-Rente nach § 10 Abs. 1
     * Nr. 2 Buchstabe b EStG
     * 
     */
    @XmlEnumValue("7")
    BASIS_RUERUP_RENTE("7");
    private final String value;

    STSteuerlicheFoerderung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSteuerlicheFoerderung fromValue(String v) {
        for (STSteuerlicheFoerderung c: STSteuerlicheFoerderung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
