
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_JaNeinKeineAntwort.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_JaNeinKeineAntwort"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_JaNeinKeineAntwort")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STJaNeinKeineAntwort {


    /**
     * Ja
     * 
     */
    @XmlEnumValue("0")
    JA("0"),

    /**
     * Nein
     * 
     */
    @XmlEnumValue("1")
    NEIN("1"),

    /**
     * KeineAntwort
     * 
     */
    @XmlEnumValue("2")
    KEINE_ANTWORT("2"),

    /**
     * Unbekannt
     * 
     */
    @XmlEnumValue("3")
    UNBEKANNT("3"),

    /**
     * Vermutlich ja
     * 
     */
    @XmlEnumValue("4")
    VERMUTLICH_JA("4");
    private final String value;

    STJaNeinKeineAntwort(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STJaNeinKeineAntwort fromValue(String v) {
        for (STJaNeinKeineAntwort c: STJaNeinKeineAntwort.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
