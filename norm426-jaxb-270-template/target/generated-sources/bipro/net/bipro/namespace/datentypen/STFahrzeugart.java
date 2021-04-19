
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Fahrzeugart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Fahrzeugart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "ST_Fahrzeugart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STFahrzeugart {


    /**
     * Zwei- oder dreiraedriges oder leichtes vierraedriges Kraftfahrzeug
     * 
     */
    @XmlEnumValue("1")
    ZWEI_DREIRAEDRIG_LEICHT_VIERRAEDRIG("1"),

    /**
     * Personenkraftwagen
     * 
     */
    @XmlEnumValue("2")
    PKW("2"),

    /**
     * Kraftomnibus
     * 
     */
    @XmlEnumValue("3")
    KRAFTOMNIBUS("3"),

    /**
     * Lastkraftwagen
     * 
     */
    @XmlEnumValue("4")
    LKW("4"),

    /**
     * Zugmaschine
     * 
     */
    @XmlEnumValue("5")
    ZUGMASCHINE("5"),

    /**
     * Selbstfahrende Arbeitsmaschine
     * 
     */
    @XmlEnumValue("6")
    SELBSTFAHRENDE_ARBEITSMASCHINE("6"),

    /**
     * Anhaenger
     * 
     */
    @XmlEnumValue("7")
    ANHAENGER("7"),

    /**
     * sonstiges Kraftfahrzeug
     * 
     */
    @XmlEnumValue("8")
    SONSTIGES_KRAFTFAHRZEUG("8");
    private final String value;

    STFahrzeugart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFahrzeugart fromValue(String v) {
        for (STFahrzeugart c: STFahrzeugart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
