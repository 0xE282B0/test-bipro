
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_MandatArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_MandatArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Einmalmandat"/&gt;
 *     &lt;enumeration value="Einzelmandat"/&gt;
 *     &lt;enumeration value="Rahmenmandat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_MandatArt")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STMandatArt {


    /**
     * Mandat zur einmaligen Nutzung
     * 
     */
    @XmlEnumValue("Einmalmandat")
    EINMALMANDAT("Einmalmandat"),

    /**
     * Mandat über das nur ein Vertrag inkassiert werden kann.
     * 
     */
    @XmlEnumValue("Einzelmandat")
    EINZELMANDAT("Einzelmandat"),

    /**
     * Mandat, über das mehrere/alle Verträge eines Gläubigers inkassiert werden können.
     * 
     */
    @XmlEnumValue("Rahmenmandat")
    RAHMENMANDAT("Rahmenmandat");
    private final String value;

    STMandatArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMandatArt fromValue(String v) {
        for (STMandatArt c: STMandatArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
