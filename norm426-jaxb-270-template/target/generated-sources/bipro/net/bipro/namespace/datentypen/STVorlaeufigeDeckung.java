
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_VorlaeufigeDeckung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VorlaeufigeDeckung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_VorlaeufigeDeckung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVorlaeufigeDeckung {


    /**
     * durch VM erteilt
     * 
     */
    @XmlEnumValue("01")
    DURCH_VM_ERTEILT("01"),

    /**
     * bei VU angefordert
     * 
     */
    @XmlEnumValue("02")
    BEI_VU_ANGEFORDERT("02"),

    /**
     * durch VU ohne Aenderung erteilt
     * 
     */
    @XmlEnumValue("03")
    DURCH_VU_OHNE_AENDERUNG_ERTEILT("03"),

    /**
     * durch VU mit Aenderung erteilt
     * 
     */
    @XmlEnumValue("04")
    DURCH_VU_MIT_AENDERUNG_ERTEILT("04"),

    /**
     * durch VU abgelehnt
     * 
     */
    @XmlEnumValue("05")
    DURCH_VU_ABGELEHNT("05");
    private final String value;

    STVorlaeufigeDeckung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVorlaeufigeDeckung fromValue(String v) {
        for (STVorlaeufigeDeckung c: STVorlaeufigeDeckung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
