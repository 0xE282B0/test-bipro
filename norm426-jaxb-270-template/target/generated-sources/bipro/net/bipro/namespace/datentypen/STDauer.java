
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Dauer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Dauer"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bisTodVP"/&gt;
 *     &lt;enumeration value="bisVertragsende"/&gt;
 *     &lt;enumeration value="unbekannt"/&gt;
 *     &lt;enumeration value="unbegrenzt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Dauer")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STDauer {

    @XmlEnumValue("bisTodVP")
    BIS_TOD_VP("bisTodVP"),
    @XmlEnumValue("bisVertragsende")
    BIS_VERTRAGSENDE("bisVertragsende"),
    @XmlEnumValue("unbekannt")
    UNBEKANNT("unbekannt"),
    @XmlEnumValue("unbegrenzt")
    UNBEGRENZT("unbegrenzt");
    private final String value;

    STDauer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDauer fromValue(String v) {
        for (STDauer c: STDauer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
