
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Grundstueckart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Grundstueckart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnbebautesGrundstueck"/&gt;
 *     &lt;enumeration value="LandwirtschaftlichesGrundstueck"/&gt;
 *     &lt;enumeration value="Gewerbegrundstueck"/&gt;
 *     &lt;enumeration value="Bootsliegeplatz"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Grundstueckart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGrundstueckart {


    /**
     * unbebautes Grundstück
     * 
     */
    @XmlEnumValue("UnbebautesGrundstueck")
    UNBEBAUTES_GRUNDSTUECK("UnbebautesGrundstueck"),

    /**
     * landwirtschaftliches Grundstück
     * 
     */
    @XmlEnumValue("LandwirtschaftlichesGrundstueck")
    LANDWIRTSCHAFTLICHES_GRUNDSTUECK("LandwirtschaftlichesGrundstueck"),

    /**
     * Gewerbegrundstück
     * 
     */
    @XmlEnumValue("Gewerbegrundstueck")
    GEWERBEGRUNDSTUECK("Gewerbegrundstueck"),
    @XmlEnumValue("Bootsliegeplatz")
    BOOTSLIEGEPLATZ("Bootsliegeplatz");
    private final String value;

    STGrundstueckart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGrundstueckart fromValue(String v) {
        for (STGrundstueckart c: STGrundstueckart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
