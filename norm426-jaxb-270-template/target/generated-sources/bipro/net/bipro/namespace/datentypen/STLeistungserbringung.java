
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Leistungserbringung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Leistungserbringung"&gt;
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
@XmlType(name = "ST_Leistungserbringung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLeistungserbringung {


    /**
     * Kapital
     * 
     */
    @XmlEnumValue("01")
    KAPITAL("01"),

    /**
     * Rente
     * 
     */
    @XmlEnumValue("02")
    RENTE("02"),

    /**
     * Sachleistung
     * 
     */
    @XmlEnumValue("03")
    SACHLEISTUNG("03"),

    /**
     * Beitragsfreistellung
     * 
     */
    @XmlEnumValue("04")
    BEITRAGSFREISTELLUNG("04"),

    /**
     * Assistanceleistung
     * 
     */
    @XmlEnumValue("05")
    ASSISTANCELEISTUNG("05");
    private final String value;

    STLeistungserbringung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLeistungserbringung fromValue(String v) {
        for (STLeistungserbringung c: STLeistungserbringung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
