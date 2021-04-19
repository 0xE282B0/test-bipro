
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtVPBeruecksichtigung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtVPBeruecksichtigung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtVPBeruecksichtigung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtVPBeruecksichtigung {


    /**
     * Keine besondere Beruecksichtigung
     * 
     */
    @XmlEnumValue("0")
    KEINE("0"),

    /**
     * Arzt-Kind
     * 
     */
    @XmlEnumValue("1")
    ARZT_KIND("1"),

    /**
     * Arzt-Ehegatte
     * 
     */
    @XmlEnumValue("2")
    ARZT_EHEGATTE("2"),

    /**
     * Beamten-Kind
     * 
     */
    @XmlEnumValue("3")
    BEAMTEN_KIND("3"),

    /**
     * Beamten-Ehegatte
     * 
     */
    @XmlEnumValue("4")
    BEAMTEN_EHEGATTE("4");
    private final String value;

    STArtVPBeruecksichtigung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtVPBeruecksichtigung fromValue(String v) {
        for (STArtVPBeruecksichtigung c: STArtVPBeruecksichtigung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
