
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Rueckzahlungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Rueckzahlungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Einmalzahlung"/&gt;
 *     &lt;enumeration value="Herabsetzung"/&gt;
 *     &lt;enumeration value="Ratenzahlung"/&gt;
 *     &lt;enumeration value="Ueberschussanteile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Rueckzahlungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STRueckzahlungsart {

    @XmlEnumValue("Einmalzahlung")
    EINMALZAHLUNG("Einmalzahlung"),
    @XmlEnumValue("Herabsetzung")
    HERABSETZUNG("Herabsetzung"),
    @XmlEnumValue("Ratenzahlung")
    RATENZAHLUNG("Ratenzahlung"),
    @XmlEnumValue("Ueberschussanteile")
    UEBERSCHUSSANTEILE("Ueberschussanteile");
    private final String value;

    STRueckzahlungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRueckzahlungsart fromValue(String v) {
        for (STRueckzahlungsart c: STRueckzahlungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
