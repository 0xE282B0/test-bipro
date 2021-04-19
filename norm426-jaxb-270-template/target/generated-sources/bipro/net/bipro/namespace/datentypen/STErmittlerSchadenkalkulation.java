
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ErmittlerSchadenkalkulation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ErmittlerSchadenkalkulation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ErmittlerSchadenkalkulation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STErmittlerSchadenkalkulation {


    /**
     * durch Schadenschnelldienst
     * 
     */
    @XmlEnumValue("1")
    DURCH_SCHADENSCHNELLDIENST("1"),

    /**
     * durch Schadenaußendienst
     * 
     */
    @XmlEnumValue("2")
    DURCH_SCHADENAUSSENDIENST("2"),

    /**
     * durch freien Sachverständigen
     * 
     */
    @XmlEnumValue("3")
    DURCH_FREIE_SACHVERSTAENDIGE("3"),

    /**
     * durch Handwerker / Werkstatt
     * 
     */
    @XmlEnumValue("4")
    DURCH_HANDWERKER("4");
    private final String value;

    STErmittlerSchadenkalkulation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STErmittlerSchadenkalkulation fromValue(String v) {
        for (STErmittlerSchadenkalkulation c: STErmittlerSchadenkalkulation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
