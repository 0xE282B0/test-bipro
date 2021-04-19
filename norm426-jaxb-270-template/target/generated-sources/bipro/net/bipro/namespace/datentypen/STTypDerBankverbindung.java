
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TypDerBankverbindung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TypDerBankverbindung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TypDerBankverbindung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STTypDerBankverbindung {


    /**
     * Praemienzahlungskonto
     * 
     */
    @XmlEnumValue("01")
    PRAEMIENZAHLUNGSKONTO("01"),

    /**
     * Auszahlungskonto (Schaden, Leistung)
     * 
     */
    @XmlEnumValue("02")
    AUSZAHLUNGSKONTO("02"),

    /**
     * ohne Spezifikation
     * 
     */
    @XmlEnumValue("03")
    OHNE_SPEZIFIKATION("03");
    private final String value;

    STTypDerBankverbindung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTypDerBankverbindung fromValue(String v) {
        for (STTypDerBankverbindung c: STTypDerBankverbindung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
