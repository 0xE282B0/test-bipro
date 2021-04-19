
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ZustandSchadenobjekt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ZustandSchadenobjekt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ZustandSchadenobjekt")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STZustandSchadenobjekt {


    /**
     * abhanden
     * 
     */
    @XmlEnumValue("1")
    ABHANDEN("1"),

    /**
     * beschädigt (Reparatur möglich)
     * 
     */
    @XmlEnumValue("2")
    BESCHAEDIGT("2"),

    /**
     * zerstört (Reparatur nicht möglich)
     * 
     */
    @XmlEnumValue("3")
    ZERSTOERT("3"),

    /**
     * bereits entsorgt
     * 
     */
    @XmlEnumValue("4")
    BEREITS_ENTSORGT("4");
    private final String value;

    STZustandSchadenobjekt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZustandSchadenobjekt fromValue(String v) {
        for (STZustandSchadenobjekt c: STZustandSchadenobjekt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
