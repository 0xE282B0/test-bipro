
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Zinstyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Zinstyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fix"/&gt;
 *     &lt;enumeration value="variabel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Zinstyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STZinstyp {

    @XmlEnumValue("fix")
    FIX("fix"),
    @XmlEnumValue("variabel")
    VARIABEL("variabel");
    private final String value;

    STZinstyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZinstyp fromValue(String v) {
        for (STZinstyp c: STZinstyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
