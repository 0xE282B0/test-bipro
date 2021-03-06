
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_AufbautenCampingKfz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_AufbautenCampingKfz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_AufbautenCampingKfz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAufbautenCampingKfz {


    /**
     * Alkoven
     * 
     */
    @XmlEnumValue("01")
    ALKOVEN("01"),

    /**
     * Vollintegriert
     * 
     */
    @XmlEnumValue("02")
    VOLLINTEGRIERT("02"),

    /**
     * Teilintegriert
     * 
     */
    @XmlEnumValue("03")
    TEILINTEGRIERT("03"),

    /**
     * Kasten
     * 
     */
    @XmlEnumValue("04")
    KASTEN("04");
    private final String value;

    STAufbautenCampingKfz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAufbautenCampingKfz fromValue(String v) {
        for (STAufbautenCampingKfz c: STAufbautenCampingKfz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
