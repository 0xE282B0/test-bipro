
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Anstossbereich.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Anstossbereich"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Anstossbereich")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAnstossbereich {


    /**
     * vorn Mitte
     * 
     */
    @XmlEnumValue("01")
    VORNE_MITTE("01"),

    /**
     * vorn rechts
     * 
     */
    @XmlEnumValue("02")
    VORNE_RECHTS("02"),

    /**
     * rechte Seite Mitte
     * 
     */
    @XmlEnumValue("03")
    RECHTE_SEITE_MITTE("03"),

    /**
     * hinten rechts
     * 
     */
    @XmlEnumValue("04")
    HINTEN_RECHTS("04"),

    /**
     * hinten Mitte
     * 
     */
    @XmlEnumValue("05")
    HINTEN_MITTE("05"),

    /**
     * hinten links
     * 
     */
    @XmlEnumValue("06")
    HINTEN_LINKS("06"),

    /**
     *  linke Seite Mitte
     * 
     */
    @XmlEnumValue("07")
    LINKE_SEITE_MITTE("07"),

    /**
     * vorn links
     * 
     */
    @XmlEnumValue("08")
    VORNE_LINKS("08"),

    /**
     * Dach
     * 
     */
    @XmlEnumValue("09")
    DACH("09"),

    /**
     * Boden
     * 
     */
    @XmlEnumValue("10")
    BODEN("10"),

    /**
     * rundum
     * 
     */
    @XmlEnumValue("11")
    RUNDUM("11");
    private final String value;

    STAnstossbereich(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAnstossbereich fromValue(String v) {
        for (STAnstossbereich c: STAnstossbereich.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
