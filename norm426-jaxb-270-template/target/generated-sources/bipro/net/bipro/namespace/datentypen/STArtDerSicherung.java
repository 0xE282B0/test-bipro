
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtDerSicherung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtDerSicherung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtDerSicherung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STArtDerSicherung {


    /**
     * Fahrradschloss
     * 
     */
    @XmlEnumValue("01")
    FAHRRADSCHLOSS("01"),

    /**
     * Behältnis
     * 
     */
    @XmlEnumValue("02")
    BEHAELTNIS("02"),

    /**
     * Raum
     * 
     */
    @XmlEnumValue("03")
    RAUM("03"),

    /**
     * Behältnis in Tresor / Schrank
     * 
     */
    @XmlEnumValue("04")
    BEHAELTNIS_IN_TRESOR("04"),

    /**
     * in verschlossenem Kfz
     * 
     */
    @XmlEnumValue("05")
    IN_VERSCHLOSSENEM_KFZ("05"),

    /**
     * in verschlossenem Kfz in Tief- oder Einzelgarage
     * 
     */
    @XmlEnumValue("06")
    IN_VERSCHLOSSENEM_KFZ_IN_GARAGE("06");
    private final String value;

    STArtDerSicherung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtDerSicherung fromValue(String v) {
        for (STArtDerSicherung c: STArtDerSicherung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
