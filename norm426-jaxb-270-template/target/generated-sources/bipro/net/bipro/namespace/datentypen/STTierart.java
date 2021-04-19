
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Tierart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Tierart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="003"/&gt;
 *     &lt;enumeration value="004"/&gt;
 *     &lt;enumeration value="005"/&gt;
 *     &lt;enumeration value="006"/&gt;
 *     &lt;enumeration value="007"/&gt;
 *     &lt;enumeration value="008"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Tierart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STTierart {


    /**
     * Hund
     * 
     */
    @XmlEnumValue("001")
    HUND("001"),

    /**
     * Pferd
     * 
     */
    @XmlEnumValue("002")
    PFERD("002"),

    /**
     * Pony
     * 
     */
    @XmlEnumValue("003")
    PONY("003"),

    /**
     * Esel
     * 
     */
    @XmlEnumValue("004")
    ESEL("004"),

    /**
     * Maultier
     * 
     */
    @XmlEnumValue("005")
    MAULTIER("005"),

    /**
     * Maulesel
     * 
     */
    @XmlEnumValue("006")
    MAULESEL("006"),

    /**
     * Frettchen
     * 
     */
    @XmlEnumValue("007")
    FRETTCHEN("007"),

    /**
     * Vogel
     * 
     */
    @XmlEnumValue("008")
    VOGEL("008");
    private final String value;

    STTierart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTierart fromValue(String v) {
        for (STTierart c: STTierart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
