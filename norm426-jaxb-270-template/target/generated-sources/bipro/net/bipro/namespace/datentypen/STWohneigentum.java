
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Wohneigentum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Wohneigentum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Wohneigentum")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STWohneigentum {


    /**
     * Selbstgenutzes Ein-/Zweifamilienhaus
     * 
     */
    @XmlEnumValue("1")
    SELBSTGENUTZTES_EIN_ZWEIFAMILIENHAUS("1"),

    /**
     * Mehrfamilienhaus
     * 
     */
    @XmlEnumValue("2")
    MEHRFAMILIENHAUS("2"),

    /**
     * Eigentumswohnung
     * 
     */
    @XmlEnumValue("3")
    EIGENTUMSWOHNUNG("3"),

    /**
     * sonstiges
     * 
     */
    @XmlEnumValue("4")
    SONSTIGES("4"),

    /**
     * kein Wohneigentum
     * 
     */
    @XmlEnumValue("5")
    KEIN_WOHNEIGENTUM("5"),

    /**
     * Fremdgenutzes Ein-/Zweifamilienhaus
     * 
     */
    @XmlEnumValue("6")
    FREMDGENUTZTES_EIN_ZWEIFAMILIENHAUS("6"),

    /**
     * Reihenhaus/Doppelhaushälfte
     * 
     */
    @XmlEnumValue("7")
    REIHENHAUS_DOPPELHAUSHAELFTE("7");
    private final String value;

    STWohneigentum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWohneigentum fromValue(String v) {
        for (STWohneigentum c: STWohneigentum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
