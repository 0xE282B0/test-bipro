
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LeistungsartBereich.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LeistungsartBereich"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Privat"/&gt;
 *     &lt;enumeration value="Verkehr"/&gt;
 *     &lt;enumeration value="Immobilie"/&gt;
 *     &lt;enumeration value="Beruf"/&gt;
 *     &lt;enumeration value="Gewerbe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_LeistungsartBereich")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STLeistungsartBereich {

    @XmlEnumValue("Privat")
    PRIVAT("Privat"),
    @XmlEnumValue("Verkehr")
    VERKEHR("Verkehr"),
    @XmlEnumValue("Immobilie")
    IMMOBILIE("Immobilie"),
    @XmlEnumValue("Beruf")
    BERUF("Beruf"),

    /**
     * Enthält auch Sonder und Spezial
     * 
     */
    @XmlEnumValue("Gewerbe")
    GEWERBE("Gewerbe");
    private final String value;

    STLeistungsartBereich(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLeistungsartBereich fromValue(String v) {
        for (STLeistungsartBereich c: STLeistungsartBereich.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
