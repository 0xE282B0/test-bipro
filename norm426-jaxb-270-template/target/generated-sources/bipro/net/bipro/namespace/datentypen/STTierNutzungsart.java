
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TierNutzungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TierNutzungsart"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TierNutzungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STTierNutzungsart {


    /**
     * Fohlen
     * 
     */
    @XmlEnumValue("01")
    FOHLEN("01"),

    /**
     * Gnadenbrotpferd
     * 
     */
    @XmlEnumValue("02")
    GNADENBROTPFERD("02"),

    /**
     * Zuchttier
     * 
     */
    @XmlEnumValue("03")
    ZUCHTTIER("03"),

    /**
     * Turnierpferd
     * 
     */
    @XmlEnumValue("04")
    TURNIERPFERD("04"),

    /**
     * Dienstpferd
     * 
     */
    @XmlEnumValue("05")
    DIENSTPFERD("05"),

    /**
     * Zugpferd
     * 
     */
    @XmlEnumValue("06")
    ZUGPFERD("06"),

    /**
     * Jagdhund mit Hundeprüfung
     * 
     */
    @XmlEnumValue("07")
    JAGDHUND_MIT_HUNDEPRUEFUNG("07"),

    /**
     * Blindenhund
     * 
     */
    @XmlEnumValue("08")
    BLINDENHUND("08"),

    /**
     * Wachhund
     * 
     */
    @XmlEnumValue("09")
    WACHHUND("09"),

    /**
     * Beizvogel
     * 
     */
    @XmlEnumValue("10")
    BEIZVOGEL("10");
    private final String value;

    STTierNutzungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTierNutzungsart fromValue(String v) {
        for (STTierNutzungsart c: STTierNutzungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
