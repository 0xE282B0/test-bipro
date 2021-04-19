
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Kapitalanlageart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Kapitalanlageart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Kapitalanlageart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STKapitalanlageart {


    /**
     * Darlehen
     * 
     */
    @XmlEnumValue("01")
    DARLEHEN("01"),

    /**
     * Depot
     * 
     */
    @XmlEnumValue("02")
    DEPOT("02"),

    /**
     * Geschäftsanteile
     * 
     */
    @XmlEnumValue("03")
    GESCHAEFTSANTEILE("03"),

    /**
     * Kontokorrent
     * 
     */
    @XmlEnumValue("04")
    KONTOKORRENT("04"),

    /**
     * Spar
     * 
     */
    @XmlEnumValue("05")
    SPAR("05"),

    /**
     * Termineinlage Festgeld
     * 
     */
    @XmlEnumValue("06")
    TERMINEINLAGE_FESTGELD("06"),

    /**
     * Termineinlage Sparbrief
     * 
     */
    @XmlEnumValue("07")
    TERMINEINLAGE_SPARGELD("07");
    private final String value;

    STKapitalanlageart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKapitalanlageart fromValue(String v) {
        for (STKapitalanlageart c: STKapitalanlageart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
