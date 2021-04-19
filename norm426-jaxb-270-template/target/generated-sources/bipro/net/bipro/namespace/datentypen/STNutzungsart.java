
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Nutzungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Nutzungsart"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Nutzungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STNutzungsart {


    /**
     * Überwiegend geschäftlich
     * 
     */
    @XmlEnumValue("01")
    UEBERWIEGEND_GESCHAEFTLICH("01"),

    /**
     * Überwiegend privat
     * 
     */
    @XmlEnumValue("02")
    UEBERWIEGEND_PRIVAT("02"),

    /**
     * Taxi
     * 
     */
    @XmlEnumValue("03")
    TAXI("03"),

    /**
     * Vermietung
     * 
     */
    @XmlEnumValue("04")
    VERMIETUNG("04"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("05")
    SONSTIGE("05"),

    /**
     * Ausschließlich geschäftlich
     * 
     */
    @XmlEnumValue("06")
    AUSSCHLIESSLICH_GESCHAEFTLICH("06"),

    /**
     * Ausschließlich privat
     * 
     */
    @XmlEnumValue("07")
    AUSSCHLIESSLICH_PRIVAT("07"),

    /**
     * Privat und geschäftlich
     * 
     */
    @XmlEnumValue("08")
    PRIVAT_UND_GESCHAEFTLCH("08"),

    /**
     * Landwirtschaft
     * 
     */
    @XmlEnumValue("09")
    LANDWIRTSCHAFT("09");
    private final String value;

    STNutzungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STNutzungsart fromValue(String v) {
        for (STNutzungsart c: STNutzungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
