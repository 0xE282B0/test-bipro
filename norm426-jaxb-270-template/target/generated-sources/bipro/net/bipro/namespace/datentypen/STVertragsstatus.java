
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vertragsstatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vertragsstatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vertragsstatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVertragsstatus {


    /**
     * lebend
     * 
     */
    @XmlEnumValue("1")
    LEBEND("1"),

    /**
     * lebend / kurzfristig / unterjährig
     * 
     */
    @XmlEnumValue("2")
    LEBEND_KURZFRISTIG_UNTERJAEHRIG("2"),

    /**
     * ruhend / Anwartschaft
     * 
     */
    @XmlEnumValue("3")
    RUHEND_ANWARTSCHAFT("3"),

    /**
     * storniert
     * 
     */
    @XmlEnumValue("4")
    STORNIERT("4"),

    /**
     * ruhend / beitragsfrei
     * 
     */
    @XmlEnumValue("5")
    RUHEND_BEITRAGSFREI("5"),

    /**
     * beitragsfrei
     * 
     */
    @XmlEnumValue("6")
    BEITRAGSFREI("6"),

    /**
     * "beitragsfrei durch Leistung": Vertrag/Vertragsbestandteil ist durch einen eingetretenen Leistungsfall beitragsfrei. 
     * 
     */
    @XmlEnumValue("7")
    BEITRAGSFREI_DURCH_LEISTUNG("7"),

    /**
     * Beitragsstundung
     * 
     */
    @XmlEnumValue("8")
    BEITRAGSSTUNDUNG("8"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9"),

    /**
     * "in Leistung": Vertrag/Vertragsbestandteil befindet final sich in der Leistungsphase, z.B. Rentenphase.
     * 
     */
    @XmlEnumValue("A")
    IN_LEISTUNG("A"),

    /**
     * in Abrufphase
     * 
     */
    @XmlEnumValue("B")
    IN_ABRUFPHASE("B");
    private final String value;

    STVertragsstatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVertragsstatus fromValue(String v) {
        for (STVertragsstatus c: STVertragsstatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
