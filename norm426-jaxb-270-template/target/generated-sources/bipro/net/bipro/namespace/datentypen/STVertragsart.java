
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vertragsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vertragsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vertragsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVertragsart {


    /**
     * Kaufvertrag
     * 
     */
    @XmlEnumValue("01")
    KAUFVERTRAG("01"),

    /**
     * Werkvertrag
     * 
     */
    @XmlEnumValue("02")
    WERKVERTRAG("02"),

    /**
     * Dienstvertrag
     * 
     */
    @XmlEnumValue("03")
    DIENSTVERTRAG("03"),

    /**
     * Arbeitsvertrag
     * 
     */
    @XmlEnumValue("04")
    ARBEITSVERTRAG("04"),

    /**
     * Mietvertrag
     * 
     */
    @XmlEnumValue("05")
    MIETVERTRAG("05"),

    /**
     * Pachtvertrag
     * 
     */
    @XmlEnumValue("06")
    PACHTVERTRAG("06"),

    /**
     * Leasingvertrag
     * 
     */
    @XmlEnumValue("07")
    LEASINGVERTRAG("07"),

    /**
     * Sonstiger Vertrag
     * 
     */
    @XmlEnumValue("99")
    SONSTIGER_VERTRAG("99");
    private final String value;

    STVertragsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVertragsart fromValue(String v) {
        for (STVertragsart c: STVertragsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
