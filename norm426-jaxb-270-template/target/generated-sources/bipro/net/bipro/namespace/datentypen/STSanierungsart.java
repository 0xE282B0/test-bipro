
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Sanierungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Sanierungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dach"/&gt;
 *     &lt;enumeration value="Elektrik"/&gt;
 *     &lt;enumeration value="Leitungswassernetz"/&gt;
 *     &lt;enumeration value="Heizungsanlage"/&gt;
 *     &lt;enumeration value="Heizungsrohre"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Sanierungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSanierungsart {


    /**
     * Dachsanierung
     * 
     */
    @XmlEnumValue("Dach")
    DACH("Dach"),

    /**
     * Erneuerung der Elektroinstallation
     * 
     */
    @XmlEnumValue("Elektrik")
    ELEKTRIK("Elektrik"),

    /**
     * Sanierung des Leitungswassernetzes
     * 
     */
    @XmlEnumValue("Leitungswassernetz")
    LEITUNGSWASSERNETZ("Leitungswassernetz"),

    /**
     * Sanierung der Heizungsanlage
     * 
     */
    @XmlEnumValue("Heizungsanlage")
    HEIZUNGSANLAGE("Heizungsanlage"),

    /**
     * Sanierung der Heizungsrohre
     * 
     */
    @XmlEnumValue("Heizungsrohre")
    HEIZUNGSROHRE("Heizungsrohre");
    private final String value;

    STSanierungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSanierungsart fromValue(String v) {
        for (STSanierungsart c: STSanierungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
