
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Fahrzeugdachart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Fahrzeugdachart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Fahrzeugdachart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFahrzeugdachart {


    /**
     * geschlossen
     * 
     */
    @XmlEnumValue("0")
    GESCHLOSSEN("0"),

    /**
     * manuelles Schiebedach
     * 
     */
    @XmlEnumValue("1")
    MANUELLES_SCHIEBEDACH("1"),

    /**
     * elektrisches Schiebedach
     * 
     */
    @XmlEnumValue("2")
    ELEKTRISCHES_SCHIEBEDACH("2"),

    /**
     * manuelles Faltdach
     * 
     */
    @XmlEnumValue("3")
    MANUELLES_FALTDACH("3"),

    /**
     * elektrisches Faltdach
     * 
     */
    @XmlEnumValue("4")
    ELEKTRISCHES_FALTDACH("4"),

    /**
     * Hardtop
     * 
     */
    @XmlEnumValue("5")
    HARDTOP("5");
    private final String value;

    STFahrzeugdachart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFahrzeugdachart fromValue(String v) {
        for (STFahrzeugdachart c: STFahrzeugdachart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
