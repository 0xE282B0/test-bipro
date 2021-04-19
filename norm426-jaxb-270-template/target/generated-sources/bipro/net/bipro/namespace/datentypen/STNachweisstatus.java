
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Nachweisstatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Nachweisstatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="kommt"/&gt;
 *     &lt;enumeration value="anfordern"/&gt;
 *     &lt;enumeration value="beigefuegt"/&gt;
 *     &lt;enumeration value="geprueft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Nachweisstatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STNachweisstatus {


    /**
     * Der Vermittler hat den Nachweis vom Antragsteller angefordert und übermittelt den Nachweis an den Versicherer unabhängig von der elektronischen Nachricht.
     * 
     */
    @XmlEnumValue("kommt")
    KOMMT("kommt"),

    /**
     * Der Versicherer soll den Nachweis vom Antragsteller angefordern.
     * 
     */
    @XmlEnumValue("anfordern")
    ANFORDERN("anfordern"),

    /**
     * Der Vermittler hat den Nachweis vom Antragsteller angefordert und übermittelt den Nachweis an den Versicherer innerhalb der elektronischen Nachricht.
     * 
     */
    @XmlEnumValue("beigefuegt")
    BEIGEFUEGT("beigefuegt"),

    /**
     * Der Vermittler hat den Nachweis geprüft.
     * 
     */
    @XmlEnumValue("geprueft")
    GEPRUEFT("geprueft");
    private final String value;

    STNachweisstatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STNachweisstatus fromValue(String v) {
        for (STNachweisstatus c: STNachweisstatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
