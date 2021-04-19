
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LageDerWohnung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LageDerWohnung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Erdgeschoss"/&gt;
 *     &lt;enumeration value="Obergeschoss"/&gt;
 *     &lt;enumeration value="Untergeschoss"/&gt;
 *     &lt;enumeration value="Dachgeschoss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_LageDerWohnung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLageDerWohnung {

    @XmlEnumValue("Erdgeschoss")
    ERDGESCHOSS("Erdgeschoss"),
    @XmlEnumValue("Obergeschoss")
    OBERGESCHOSS("Obergeschoss"),
    @XmlEnumValue("Untergeschoss")
    UNTERGESCHOSS("Untergeschoss"),
    @XmlEnumValue("Dachgeschoss")
    DACHGESCHOSS("Dachgeschoss");
    private final String value;

    STLageDerWohnung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLageDerWohnung fromValue(String v) {
        for (STLageDerWohnung c: STLageDerWohnung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
