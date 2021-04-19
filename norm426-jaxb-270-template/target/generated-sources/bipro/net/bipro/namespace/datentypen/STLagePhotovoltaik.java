
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LagePhotovoltaik.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LagePhotovoltaik"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fassade"/&gt;
 *     &lt;enumeration value="Dach"/&gt;
 *     &lt;enumeration value="FreiflaecheBodeninstallation"/&gt;
 *     &lt;enumeration value="Sonstiges"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_LagePhotovoltaik")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STLagePhotovoltaik {

    @XmlEnumValue("Fassade")
    FASSADE("Fassade"),
    @XmlEnumValue("Dach")
    DACH("Dach"),
    @XmlEnumValue("FreiflaecheBodeninstallation")
    FREIFLAECHE_BODENINSTALLATION("FreiflaecheBodeninstallation"),
    @XmlEnumValue("Sonstiges")
    SONSTIGES("Sonstiges");
    private final String value;

    STLagePhotovoltaik(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLagePhotovoltaik fromValue(String v) {
        for (STLagePhotovoltaik c: STLagePhotovoltaik.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
