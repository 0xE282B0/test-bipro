
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ZertifizierungsArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ZertifizierungsArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ZertifizierungsArt")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STZertifizierungsArt {


    /**
     * Riester-Zertifizierungsnummer der ZfA
     * 
     */
    @XmlEnumValue("1")
    RIESTER_ZERTIFIZIERUNGSNUMMER_ZFA("1");
    private final String value;

    STZertifizierungsArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZertifizierungsArt fromValue(String v) {
        for (STZertifizierungsArt c: STZertifizierungsArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
