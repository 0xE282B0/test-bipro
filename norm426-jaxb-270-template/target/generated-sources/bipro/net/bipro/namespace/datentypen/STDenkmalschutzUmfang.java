
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_DenkmalschutzUmfang.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_DenkmalschutzUmfang"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_DenkmalschutzUmfang")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STDenkmalschutzUmfang {


    /**
     * Gesamtes Gebäude
     * 
     */
    @XmlEnumValue("01")
    GESAMTES_GEBAEUDE("01"),

    /**
     * Dach
     * 
     */
    @XmlEnumValue("02")
    DACH("02"),

    /**
     * Fassade
     * 
     */
    @XmlEnumValue("03")
    FASSADE("03"),

    /**
     * Fenster
     * 
     */
    @XmlEnumValue("04")
    FENSTER("04"),

    /**
     * Haustür
     * 
     */
    @XmlEnumValue("05")
    HAUSTUER("05"),

    /**
     * Innenliegende Gebäudeteile
     * 
     */
    @XmlEnumValue("06")
    INNENLIEGENDE_GEBAEUDETEILE("06");
    private final String value;

    STDenkmalschutzUmfang(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDenkmalschutzUmfang fromValue(String v) {
        for (STDenkmalschutzUmfang c: STDenkmalschutzUmfang.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
