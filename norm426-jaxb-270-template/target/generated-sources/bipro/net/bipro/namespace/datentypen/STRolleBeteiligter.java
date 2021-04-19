
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_RolleBeteiligter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_RolleBeteiligter"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_RolleBeteiligter")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STRolleBeteiligter {


    /**
     * Versicherungsnehmer
     * 
     */
    @XmlEnumValue("01")
    VERSICHERUNGSNEHMER("01"),

    /**
     * versicherte Person
     * 
     */
    @XmlEnumValue("02")
    VERSICHERTE_PERSON("02"),

    /**
     * Anspruchsteller
     * 
     */
    @XmlEnumValue("03")
    ANSPRUCHSTELLER("03"),

    /**
     * Reparaturfirma
     * 
     */
    @XmlEnumValue("04")
    REPARATURFIRMA("04"),

    /**
     * Sachverständiger
     * 
     */
    @XmlEnumValue("05")
    SACHVERSTAENDIGER("05"),

    /**
     * Zeuge
     * 
     */
    @XmlEnumValue("06")
    ZEUGE("06"),

    /**
     * Rechtsanwalt
     * 
     */
    @XmlEnumValue("07")
    RECHTSANWALT("07"),

    /**
     * Sicherungsgläubiger
     * 
     */
    @XmlEnumValue("08")
    SICHERUNGSGLAEUBIGER("08"),

    /**
     * Versicherungsunternehmen
     * 
     */
    @XmlEnumValue("09")
    VERSICHERUNGSUNTERNEHMEN("09"),

    /**
     * Dienstleister
     * 
     */
    @XmlEnumValue("10")
    DIENSTLEITER("10"),

    /**
     * Arzt
     * 
     */
    @XmlEnumValue("11")
    ARZT("11"),

    /**
     * Krankenhaus
     * 
     */
    @XmlEnumValue("12")
    KRANKENHAUS("12");
    private final String value;

    STRolleBeteiligter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRolleBeteiligter fromValue(String v) {
        for (STRolleBeteiligter c: STRolleBeteiligter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
