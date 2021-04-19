
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Ausfallvereinbarung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Ausfallvereinbarung"&gt;
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
@XmlType(name = "ST_Ausfallvereinbarung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAusfallvereinbarung {


    /**
     * Keine Ausfallleistung
     * 
     */
    @XmlEnumValue("01")
    KEINE("01"),

    /**
     * Mietwagen
     * 
     */
    @XmlEnumValue("02")
    MIETWAGEN("02"),

    /**
     * Nutzungsausfall
     * 
     */
    @XmlEnumValue("03")
    NUTZUNGSAUSFALL("03"),

    /**
     * Mietwagen und Nutzungsausfall
     * 
     */
    @XmlEnumValue("04")
    MIETWAGEN_UND_NUTZUNGSAUSFALL("04"),

    /**
     * Vorhaltekosten
     * 
     */
    @XmlEnumValue("05")
    VORHALTEKOSTEN("05");
    private final String value;

    STAusfallvereinbarung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAusfallvereinbarung fromValue(String v) {
        for (STAusfallvereinbarung c: STAusfallvereinbarung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
