
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gefahrengruppe.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gefahrengruppe"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gefahrengruppe")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGefahrengruppe {


    /**
     * Gefahrengruppe A
     * 
     */
    @XmlEnumValue("A")
    GEFAHRENGRUPPE_A("A"),

    /**
     * Gefahrengruppe B
     * 
     */
    @XmlEnumValue("B")
    GEFAHRENGRUPPE_B("B"),

    /**
     * Einheitsgefahren
     * 
     */
    @XmlEnumValue("E")
    EINHEITSGEFAHREN("E"),

    /**
     * Frauen, unabhängig davon welche Berufstätigkeit sie ausüben.
     * 
     */
    @XmlEnumValue("F")
    FRAUEN("F"),

    /**
     * Kind
     * 
     */
    @XmlEnumValue("K")
    KIND("K"),

    /**
     * Senioren
     * 
     */
    @XmlEnumValue("S")
    SENIOREN("S"),

    /**
     * Freizeitunfallversicherung, bei der die berufliche Tätigkeit nicht versichert ist
     * 
     */
    @XmlEnumValue("Z")
    FREIZEITUNFALLVERSICHERUNG("Z");
    private final String value;

    STGefahrengruppe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGefahrengruppe fromValue(String v) {
        for (STGefahrengruppe c: STGefahrengruppe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
