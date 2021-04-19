
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Familienstand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Familienstand"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Familienstand")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STFamilienstand {


    /**
     * ledig
     * 
     */
    @XmlEnumValue("1")
    LEDIG("1"),

    /**
     * verheiratet
     * 
     */
    @XmlEnumValue("2")
    VERHEIRATET("2"),

    /**
     * geschieden
     * 
     */
    @XmlEnumValue("3")
    GESCHIEDEN("3"),

    /**
     * verwitwet
     * 
     */
    @XmlEnumValue("4")
    VERWITWET("4"),

    /**
     * getrennt lebend
     * 
     */
    @XmlEnumValue("5")
    GETRENNT_LEBEND("5"),

    /**
     * eheähnliche Gemeinschaft
     * 
     */
    @XmlEnumValue("6")
    EHEAEHNLICHE_GEMEINSCHAFT("6"),

    /**
     * eingetragene Lebenspartnerschaft
     * 
     */
    @XmlEnumValue("7")
    EINGETRAGENE_LEBENSPARTNERSCHAFT("7"),

    /**
     * sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STFamilienstand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFamilienstand fromValue(String v) {
        for (STFamilienstand c: STFamilienstand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
