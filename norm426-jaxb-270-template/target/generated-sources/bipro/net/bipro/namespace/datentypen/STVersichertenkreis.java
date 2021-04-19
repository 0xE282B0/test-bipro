
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Versichertenkreis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Versichertenkreis"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Familie"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Versichertenkreis")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVersichertenkreis {


    /**
     * Versichert ist eine Einzelperson
     * 
     */
    @XmlEnumValue("Single")
    SINGLE("Single"),

    /**
     * Versichert ist eine Familie
     * 
     */
    @XmlEnumValue("Familie")
    FAMILIE("Familie");
    private final String value;

    STVersichertenkreis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVersichertenkreis fromValue(String v) {
        for (STVersichertenkreis c: STVersichertenkreis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
