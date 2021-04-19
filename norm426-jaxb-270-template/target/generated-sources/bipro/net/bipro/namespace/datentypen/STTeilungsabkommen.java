
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Teilungsabkommen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Teilungsabkommen"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Teilungsabkommen")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STTeilungsabkommen {


    /**
     * kein Teilungsabkommen
     * 
     */
    @XmlEnumValue("0")
    KEIN_TEILUNGSABKOMMEN("0"),

    /**
     * Teilungsabkommen nicht vertragsbelastend 
     * 
     */
    @XmlEnumValue("1")
    TEILUNGSABKOMMEN_NICHT_VERTRAGSBELASTEND("1"),

    /**
     * Teilungsabkommen vertragsbelastend
     * 
     */
    @XmlEnumValue("2")
    TEILUNGSABKOMMEN_VERTRAGSBELASTEND("2");
    private final String value;

    STTeilungsabkommen(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTeilungsabkommen fromValue(String v) {
        for (STTeilungsabkommen c: STTeilungsabkommen.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
