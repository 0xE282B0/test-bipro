
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Produktgruppe.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Produktgruppe"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Kapitallebensversicherung"/&gt;
 *     &lt;enumeration value="Rentenversicherung"/&gt;
 *     &lt;enumeration value="Risikoversicherung"/&gt;
 *     &lt;enumeration value="Berufsunfaehigkeitsversicherung"/&gt;
 *     &lt;enumeration value="Pflegeversicherung"/&gt;
 *     &lt;enumeration value="Dread disease"/&gt;
 *     &lt;enumeration value="Taetigkeitsunfaehigkeitsversicherung"/&gt;
 *     &lt;enumeration value="Unfallversicherung"/&gt;
 *     &lt;enumeration value="Todesfallversicherung"/&gt;
 *     &lt;enumeration value="Hinterbliebenenversicherung"/&gt;
 *     &lt;enumeration value="Waisenrenteversicherung"/&gt;
 *     &lt;enumeration value="Kapitalisierungsprodukt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Produktgruppe")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STProduktgruppe {


    /**
     * Kapitallebensversicherung
     * 
     */
    @XmlEnumValue("Kapitallebensversicherung")
    KAPITALLEBENSVERSICHERUNG("Kapitallebensversicherung"),

    /**
     * Rentenversicherung
     * 
     */
    @XmlEnumValue("Rentenversicherung")
    RENTENVERSICHERUNG("Rentenversicherung"),

    /**
     * Risikoversicherung
     * 
     */
    @XmlEnumValue("Risikoversicherung")
    RISIKOVERSICHERUNG("Risikoversicherung"),

    /**
     * BU
     * 
     */
    @XmlEnumValue("Berufsunfaehigkeitsversicherung")
    BERUFSUNFAEHIGKEITSVERSICHERUNG("Berufsunfaehigkeitsversicherung"),

    /**
     * Pflegeversicherung
     * 
     */
    @XmlEnumValue("Pflegeversicherung")
    PFLEGEVERSICHERUNG("Pflegeversicherung"),

    /**
     * Dread Disease
     * 
     */
    @XmlEnumValue("Dread disease")
    DREAD_DISEASE("Dread disease"),

    /**
     * Taetigkeitsunfaehigkeitsversicherung
     * 
     */
    @XmlEnumValue("Taetigkeitsunfaehigkeitsversicherung")
    TAETIGKEITSUNFAEHIGKEITSVERSICHERUNG("Taetigkeitsunfaehigkeitsversicherung"),

    /**
     * Unfallversicherung
     * 
     */
    @XmlEnumValue("Unfallversicherung")
    UNFALLVERSICHERUNG("Unfallversicherung"),

    /**
     * Todesfallversicherung
     * 
     */
    @XmlEnumValue("Todesfallversicherung")
    TODESFALLVERSICHERUNG("Todesfallversicherung"),

    /**
     * Hinterbliebenenversicherung
     * 
     */
    @XmlEnumValue("Hinterbliebenenversicherung")
    HINTERBLIEBENENVERSICHERUNG("Hinterbliebenenversicherung"),

    /**
     * Waisenrenteversicherung
     * 
     */
    @XmlEnumValue("Waisenrenteversicherung")
    WAISENRENTEVERSICHERUNG("Waisenrenteversicherung"),

    /**
     * Kapitalisierungsprodukt
     * 
     */
    @XmlEnumValue("Kapitalisierungsprodukt")
    KAPITALISIERUNGSPRODUKT("Kapitalisierungsprodukt");
    private final String value;

    STProduktgruppe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STProduktgruppe fromValue(String v) {
        for (STProduktgruppe c: STProduktgruppe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
