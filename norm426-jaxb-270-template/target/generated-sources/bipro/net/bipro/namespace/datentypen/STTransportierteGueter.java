
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TransportierteGueter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TransportierteGueter"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Eigene"/&gt;
 *     &lt;enumeration value="Fremde"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TransportierteGueter")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STTransportierteGueter {


    /**
     * Eigene Güter
     * 
     */
    @XmlEnumValue("Eigene")
    EIGENE("Eigene"),

    /**
     * Fremde Güter
     * 
     */
    @XmlEnumValue("Fremde")
    FREMDE("Fremde");
    private final String value;

    STTransportierteGueter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTransportierteGueter fromValue(String v) {
        for (STTransportierteGueter c: STTransportierteGueter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
