
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Versicherungsbestaetigung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Versicherungsbestaetigung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Versicherungsbestaetigung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVersicherungsbestaetigung {


    /**
     * Sicherungsschein
     * 
     */
    @XmlEnumValue("01")
    SICHERUNGSSCHEIN("01"),

    /**
     * Deckungsbestätigung
     * 
     */
    @XmlEnumValue("02")
    DECKUNGSBESTAETIGUNG("02"),

    /**
     * Versicherungsbestätigung für Leasinggesellschaften
     * 
     */
    @XmlEnumValue("03")
    VERSICHERUNGSBESTAETIGUNG("03"),

    /**
     * Pflichtversicherungsbestätigung
     * 
     */
    @XmlEnumValue("04")
    PFLICHTVERSICHERUNGSBESTAETIGUNG("04"),

    /**
     * Sicherungsbestätigung
     * 
     */
    @XmlEnumValue("05")
    SICHERUNGSBESTAETIGUNG("05"),

    /**
     * Grundstücksbelastung
     * 
     */
    @XmlEnumValue("06")
    GRUNDSTUECKSBELASTUNG("06"),

    /**
     * Hypothekengläubigersicherungsschein
     * 
     */
    @XmlEnumValue("07")
    HYPOTHEKENGLAEUBIGERSICHERUNGSSCHEIN("07"),

    /**
     * Zertifikat
     * 
     */
    @XmlEnumValue("08")
    ZERTIFIKAT("08"),

    /**
     * Sonstige Bestätigung
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE_BESTAETIGUNG("99");
    private final String value;

    STVersicherungsbestaetigung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVersicherungsbestaetigung fromValue(String v) {
        for (STVersicherungsbestaetigung c: STVersicherungsbestaetigung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
