
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Bewegungsrisiko.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Bewegungsrisiko"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Bewegungsrisiko")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBewegungsrisiko {


    /**
     * nein
     * 
     */
    @XmlEnumValue("0")
    NEIN("0"),

    /**
     * innerhalb des Versicherungsgrundstücks
     * 
     */
    @XmlEnumValue("1")
    INNERHALB_VERSICHERUNGSGRUNDSTUECK("1"),

    /**
     * außerhalb des Versicherungsgrundstücks
     * 
     */
    @XmlEnumValue("2")
    AUSSERHALB_VERSICHERUNGSGRUNDSTUECK("2");
    private final String value;

    STBewegungsrisiko(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBewegungsrisiko fromValue(String v) {
        for (STBewegungsrisiko c: STBewegungsrisiko.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
