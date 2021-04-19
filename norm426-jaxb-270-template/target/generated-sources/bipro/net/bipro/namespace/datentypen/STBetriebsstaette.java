
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Betriebsstaette.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Betriebsstaette"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hauptbetrieb"/&gt;
 *     &lt;enumeration value="Nebenbetrieb"/&gt;
 *     &lt;enumeration value="Filiale"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Betriebsstaette")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBetriebsstaette {

    @XmlEnumValue("Hauptbetrieb")
    HAUPTBETRIEB("Hauptbetrieb"),
    @XmlEnumValue("Nebenbetrieb")
    NEBENBETRIEB("Nebenbetrieb"),
    @XmlEnumValue("Filiale")
    FILIALE("Filiale");
    private final String value;

    STBetriebsstaette(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBetriebsstaette fromValue(String v) {
        for (STBetriebsstaette c: STBetriebsstaette.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
