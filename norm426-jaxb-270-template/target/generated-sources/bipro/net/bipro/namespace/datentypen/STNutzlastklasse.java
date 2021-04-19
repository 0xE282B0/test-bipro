
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Nutzlastklasse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Nutzlastklasse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Leicht"/&gt;
 *     &lt;enumeration value="Mittelschwer"/&gt;
 *     &lt;enumeration value="Schwer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Nutzlastklasse")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STNutzlastklasse {


    /**
     * Nutzlast bis 2 t
     * 
     */
    @XmlEnumValue("Leicht")
    LEICHT("Leicht"),

    /**
     *  Nutzlast über 2 bis 4 t
     * 
     */
    @XmlEnumValue("Mittelschwer")
    MITTELSCHWER("Mittelschwer"),

    /**
     *  Nutzlast über 4 t
     * 
     */
    @XmlEnumValue("Schwer")
    SCHWER("Schwer");
    private final String value;

    STNutzlastklasse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STNutzlastklasse fromValue(String v) {
        for (STNutzlastklasse c: STNutzlastklasse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
