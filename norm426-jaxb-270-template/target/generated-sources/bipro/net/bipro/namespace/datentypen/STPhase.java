
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Phase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Phase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aufschubphase"/&gt;
 *     &lt;enumeration value="Ablaufphase"/&gt;
 *     &lt;enumeration value="Bezugsphase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Phase")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STPhase {


    /**
     * Portfoliomanagement in der Ansparphase eines Vertrages 
     * 
     */
    @XmlEnumValue("Aufschubphase")
    AUFSCHUBPHASE("Aufschubphase"),

    /**
     * Ablaufmanagement in der Ablaufphase
     * 
     */
    @XmlEnumValue("Ablaufphase")
    ABLAUFPHASE("Ablaufphase"),

    /**
     * Fontportfoliemanegenment während Bezugsphase z.B. Rentenbezugszeit 
     * 
     */
    @XmlEnumValue("Bezugsphase")
    BEZUGSPHASE("Bezugsphase");
    private final String value;

    STPhase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STPhase fromValue(String v) {
        for (STPhase c: STPhase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
