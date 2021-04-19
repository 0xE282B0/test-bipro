
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LeistungsartTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LeistungsartTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Versicherungsleistung"/&gt;
 *     &lt;enumeration value="Serviceleistung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_LeistungsartTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STLeistungsartTyp {


    /**
     * Vertraglich zugesicherte, einklagbare Leistung gemäß §2 ARB. Verwendung nur im Kontext BiPRO Rechtsschutz.
     * 
     */
    @XmlEnumValue("Versicherungsleistung")
    VERSICHERUNGSLEISTUNG("Versicherungsleistung"),

    /**
     * Zusätzliche Leistungen in Ergänzung zu §2 ARB.
     * 
     */
    @XmlEnumValue("Serviceleistung")
    SERVICELEISTUNG("Serviceleistung");
    private final String value;

    STLeistungsartTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLeistungsartTyp fromValue(String v) {
        for (STLeistungsartTyp c: STLeistungsartTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
