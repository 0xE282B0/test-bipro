
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_GarantiezeitArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_GarantiezeitArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="min"/&gt;
 *     &lt;enumeration value="max"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_GarantiezeitArt")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGarantiezeitArt {

    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("max")
    MAX("max");
    private final String value;

    STGarantiezeitArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGarantiezeitArt fromValue(String v) {
        for (STGarantiezeitArt c: STGarantiezeitArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
