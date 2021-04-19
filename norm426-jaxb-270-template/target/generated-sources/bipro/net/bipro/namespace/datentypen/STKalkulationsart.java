
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Kalkulationsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Kalkulationsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
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
@XmlType(name = "ST_Kalkulationsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STKalkulationsart {


    /**
     * Schätzung
     * 
     */
    @XmlEnumValue("0")
    SCHAETZUNG("0"),

    /**
     * Detaillierte Kalkulation
     * 
     */
    @XmlEnumValue("1")
    DETAILLIERTE_KALKULATION("1"),

    /**
     * Reparaturrechnung
     * 
     */
    @XmlEnumValue("2")
    REPARATURRECHNUNG("2"),

    /**
     * Kostenvoranschlag
     * 
     */
    @XmlEnumValue("3")
    KOSTENVORANSCHLAG("3"),

    /**
     * Glasreparatur (kein Austausch)
     * 
     */
    @XmlEnumValue("4")
    GLASREPARATUR("4"),

    /**
     * Gutachten
     * 
     */
    @XmlEnumValue("5")
    GUTACHTEN("5"),

    /**
     * Prüfergebnis
     * 
     */
    @XmlEnumValue("6")
    PRUEFERGEBNIS("6"),

    /**
     * Glasersatz (Austausch)
     * 
     */
    @XmlEnumValue("7")
    GLASERSATZ("7");
    private final String value;

    STKalkulationsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKalkulationsart fromValue(String v) {
        for (STKalkulationsart c: STKalkulationsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
