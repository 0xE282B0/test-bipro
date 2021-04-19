
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtWohnungseigentuemergemeinschaft.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtWohnungseigentuemergemeinschaft"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtWohnungseigentuemergemeinschaft")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtWohnungseigentuemergemeinschaft {


    /**
     * Sondereigentum
     * 
     */
    @XmlEnumValue("1")
    SONDEREIGENTUM("1"),

    /**
     * Gemeinschaftseigentum
     * 
     */
    @XmlEnumValue("2")
    GEMEINSCHAFTSEIGENTUM("2");
    private final String value;

    STArtWohnungseigentuemergemeinschaft(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtWohnungseigentuemergemeinschaft fromValue(String v) {
        for (STArtWohnungseigentuemergemeinschaft c: STArtWohnungseigentuemergemeinschaft.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
