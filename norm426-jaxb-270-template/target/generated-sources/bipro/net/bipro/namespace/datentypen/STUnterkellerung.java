
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Unterkellerung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Unterkellerung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="voll"/&gt;
 *     &lt;enumeration value="keine"/&gt;
 *     &lt;enumeration value="teilweise"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Unterkellerung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STUnterkellerung {

    @XmlEnumValue("voll")
    VOLL("voll"),
    @XmlEnumValue("keine")
    KEINE("keine"),
    @XmlEnumValue("teilweise")
    TEILWEISE("teilweise");
    private final String value;

    STUnterkellerung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STUnterkellerung fromValue(String v) {
        for (STUnterkellerung c: STUnterkellerung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
