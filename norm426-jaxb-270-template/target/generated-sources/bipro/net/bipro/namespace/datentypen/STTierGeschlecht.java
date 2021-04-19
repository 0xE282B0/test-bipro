
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TierGeschlecht.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TierGeschlecht"&gt;
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
@XmlType(name = "ST_TierGeschlecht")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STTierGeschlecht {


    /**
     * männlich
     * 
     */
    @XmlEnumValue("1")
    MAENNLICH("1"),

    /**
     * weiblich
     * 
     */
    @XmlEnumValue("2")
    WEIBLICH("2"),

    /**
     * männlich kastriert
     * 
     */
    @XmlEnumValue("3")
    MAENNLICH_KASTRIERT("3"),

    /**
     * weiblich kastriert
     * 
     */
    @XmlEnumValue("4")
    WEIBLICH_KASTRIERT("4");
    private final String value;

    STTierGeschlecht(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTierGeschlecht fromValue(String v) {
        for (STTierGeschlecht c: STTierGeschlecht.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
