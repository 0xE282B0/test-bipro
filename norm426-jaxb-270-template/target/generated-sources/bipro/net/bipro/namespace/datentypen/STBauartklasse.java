
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Bauartklasse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Bauartklasse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Bauartklasse")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBauartklasse {


    /**
     * sonstiges / nicht aufgeteilt / Sachen im Freien
     * 
     */
    @XmlEnumValue("0")
    SONSTIGES("0"),

    /**
     * Bauartklasse I
     * 
     */
    @XmlEnumValue("1")
    BAUARTKLASSE_I("1"),

    /**
     * Bauartklasse II
     * 
     */
    @XmlEnumValue("2")
    BAUARTKLASSE_II("2"),

    /**
     * Bauartklasse III
     * 
     */
    @XmlEnumValue("3")
    BAUARTKLASSE_III("3"),

    /**
     * Bauartklasse IV
     * 
     */
    @XmlEnumValue("4")
    BAUARTKLASSE_IV("4"),

    /**
     * Bauartklasse V
     * 
     */
    @XmlEnumValue("5")
    BAUARTKLASSE_V("5"),

    /**
     * Fertighausgruppe 1
     * 
     */
    @XmlEnumValue("6")
    FERTIGHAUSGRUPPE_I("6"),

    /**
     * Fertighausgruppe 2
     * 
     */
    @XmlEnumValue("7")
    FERTIGHAUSGRUPPE_II("7"),

    /**
     * Fertighausgruppe 3
     * 
     */
    @XmlEnumValue("8")
    FERTIGHAUSGRUPPE_III("8");
    private final String value;

    STBauartklasse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBauartklasse fromValue(String v) {
        for (STBauartklasse c: STBauartklasse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
