
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Berechnungsgrundlage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Berechnungsgrundlage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Berechnungsgrundlage")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STBerechnungsgrundlage {


    /**
     * Einzel
     * 
     */
    @XmlEnumValue("0")
    EINZEL("0"),

    /**
     * Gruppe
     * 
     */
    @XmlEnumValue("1")
    GRUPPE("1"),

    /**
     * Mitarbeiter
     * 
     */
    @XmlEnumValue("2")
    MITARBEITER("2");
    private final String value;

    STBerechnungsgrundlage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBerechnungsgrundlage fromValue(String v) {
        for (STBerechnungsgrundlage c: STBerechnungsgrundlage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
