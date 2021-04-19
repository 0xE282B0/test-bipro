
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TuerschlossArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TuerschlossArt"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TuerschlossArt")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STTuerschlossArt {


    /**
     * Bartschloss
     * 
     */
    @XmlEnumValue("01")
    BARTSCHLOSS("01"),

    /**
     * Zylinder, nicht bündig
     * 
     */
    @XmlEnumValue("02")
    ZYLINDER_NICHT_BUENDIG("02"),

    /**
     * Zylinder, bündig
     * 
     */
    @XmlEnumValue("03")
    ZYLINDER_BUENDIG("03"),

    /**
     * Sicherheitsschloss
     * 
     */
    @XmlEnumValue("04")
    SICHERHEITSSCHLOSS("04"),

    /**
     * Kastenschloss mit Sperrbügel
     * 
     */
    @XmlEnumValue("05")
    KASTENSCHLOSS_MIT_SPERRBUEGEL("05"),

    /**
     * Querriegelschloss
     * 
     */
    @XmlEnumValue("06")
    QUERRIEGELSCHLOSS("06"),

    /**
     * Fingerprintschloss
     * 
     */
    @XmlEnumValue("07")
    FINGERPRINTSCHLOSS("07"),

    /**
     * Kartenleserschloss
     * 
     */
    @XmlEnumValue("08")
    KARTENLESERSCHLOSS("08"),

    /**
     * Hakenschwenkriegelschloss
     * 
     */
    @XmlEnumValue("09")
    HAKENSCHWENKRIEGELSCHLOSS("09"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STTuerschlossArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTuerschlossArt fromValue(String v) {
        for (STTuerschlossArt c: STTuerschlossArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
