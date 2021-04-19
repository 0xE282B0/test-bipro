
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Fremdversicherungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Fremdversicherungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Fremdversicherungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFremdversicherungsart {


    /**
     * Vorversicherung
     * 
     */
    @XmlEnumValue("1")
    VORVERSICHERUNG("1"),

    /**
     * Nebenversicherung
     * 
     */
    @XmlEnumValue("2")
    NEBENVERSICHERUNG("2"),

    /**
     * Referenzvertrag
     * 
     */
    @XmlEnumValue("3")
    REFERENZVERTRAG("3"),

    /**
     * Grundvertrag bei Excedentenabschluss
     * 
     */
    @XmlEnumValue("4")
    GRUNDVERTRAG_EXCEDENTENABSCHLUSS("4"),

    /**
     * sonstiger anzurechnender Vertrag
     * 
     */
    @XmlEnumValue("5")
    SONSTIGER_ANZURECHNENDER_VERTRAG("5"),

    /**
     * abgelehnter Antrag
     * 
     */
    @XmlEnumValue("6")
    ABGELEHNTER_VERTRAG("6"),

    /**
     * Erstfahrzeug
     * 
     */
    @XmlEnumValue("7")
    ERSTFAHRZEUG("7");
    private final String value;

    STFremdversicherungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFremdversicherungsart fromValue(String v) {
        for (STFremdversicherungsart c: STFremdversicherungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
