
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Schadenstelle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Schadenstelle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Schadenstelle")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STSchadenstelle {


    /**
     * innerhalb Gebäude
     * 
     */
    @XmlEnumValue("1")
    INNERHALB_GEBAEUDE("1"),

    /**
     * innerhalb Grundstück
     * 
     */
    @XmlEnumValue("2")
    INNERHALB_GRUNDSTUECK("2"),

    /**
     * außerhalb Grundstück
     * 
     */
    @XmlEnumValue("3")
    AUSSERHALB_GRUNDSTUECK("3");
    private final String value;

    STSchadenstelle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSchadenstelle fromValue(String v) {
        for (STSchadenstelle c: STSchadenstelle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
