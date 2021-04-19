
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gefahrgut.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gefahrgut"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="00"/&gt;
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
@XmlType(name = "ST_Gefahrgut")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGefahrgut {


    /**
     * ohne Angabe
     * 
     */
    @XmlEnumValue("00")
    OHNE_ANGABE("00"),

    /**
     * kein Gefahrgut
     * 
     */
    @XmlEnumValue("01")
    KEIN_GEFAHRGUT("01"),

    /**
     * Gefahrguttransport ohne Genehmigungspflicht
     * 
     */
    @XmlEnumValue("02")
    GEFAHRGUT_OHNE_GENEHMIGUNGSPFLICHT("02"),

    /**
     * Gefahrguttransport mit Genehmigungspflicht
     * 
     */
    @XmlEnumValue("03")
    GEFAHRGUT_MIT_GENEHMIGUNGSPFLICHT("03"),

    /**
     * Beförderung von Treibstoff und leichtem Heizöl
     * 
     */
    @XmlEnumValue("04")
    BEFOERDERUNG_VON_TREIBSTOFF("04"),

    /**
     * sonstige Gefahrguttransporte
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE_GEFAHRGUTTRANSPORTE("99");
    private final String value;

    STGefahrgut(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGefahrgut fromValue(String v) {
        for (STGefahrgut c: STGefahrgut.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
