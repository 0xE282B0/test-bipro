
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Provisionsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Provisionsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Provisionsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STProvisionsart {


    /**
     * Abschlussprovision
     * 
     */
    @XmlEnumValue("01")
    ABSCHLUSSPROVISION("01"),

    /**
     * Bestands- / Folgeprovision
     * 
     */
    @XmlEnumValue("02")
    BESTANDS_FOLGEPROVISION("02");
    private final String value;

    STProvisionsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STProvisionsart fromValue(String v) {
        for (STProvisionsart c: STProvisionsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
