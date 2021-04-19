
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Fahrzeugdachmaterial.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Fahrzeugdachmaterial"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Fahrzeugdachmaterial")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFahrzeugdachmaterial {


    /**
     * Glasfaserverstärkter Kunststoff
     * 
     */
    @XmlEnumValue("01")
    GLASFASERVERSTAERKTER_KUNSTSTOFF("01"),

    /**
     * Aluminium
     * 
     */
    @XmlEnumValue("02")
    ALUMINIUM("02"),

    /**
     * Stahlblech
     * 
     */
    @XmlEnumValue("03")
    STAHLBLECH("03"),

    /**
     * Hagelschutzbeschichtung
     * 
     */
    @XmlEnumValue("04")
    HAGELSCHUTZBESCHICHTUNG("04"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE("99");
    private final String value;

    STFahrzeugdachmaterial(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFahrzeugdachmaterial fromValue(String v) {
        for (STFahrzeugdachmaterial c: STFahrzeugdachmaterial.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
