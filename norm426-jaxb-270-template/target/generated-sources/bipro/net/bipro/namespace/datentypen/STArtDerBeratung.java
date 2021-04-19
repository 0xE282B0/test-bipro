
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtDerBeratung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtDerBeratung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="00"/&gt;
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
@XmlType(name = "ST_ArtDerBeratung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtDerBeratung {


    /**
     * keine Angabe
     * 
     */
    @XmlEnumValue("00")
    KEINE_ANGABE("00"),

    /**
     * persönliches Gespräch
     * 
     */
    @XmlEnumValue("01")
    PERSOENLICHES_GESPRAECH("01"),

    /**
     * telefonisch
     * 
     */
    @XmlEnumValue("02")
    TELEFONISCH("02"),

    /**
     * per Fax
     * 
     */
    @XmlEnumValue("03")
    FAX("03"),

    /**
     * per E-Mail
     * 
     */
    @XmlEnumValue("04")
    E_MAIL("04"),

    /**
     * postalisch / per Brief
     * 
     */
    @XmlEnumValue("05")
    BRIEF("05"),

    /**
     * per Internet
     * 
     */
    @XmlEnumValue("06")
    INTERNET("06"),

    /**
     * ohne Beratung
     * 
     */
    @XmlEnumValue("07")
    OHNE_BERATUNG("07");
    private final String value;

    STArtDerBeratung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtDerBeratung fromValue(String v) {
        for (STArtDerBeratung c: STArtDerBeratung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
