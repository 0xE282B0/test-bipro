
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Saldoart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Saldoart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Anfangssaldo"/&gt;
 *     &lt;enumeration value="Endsaldo"/&gt;
 *     &lt;enumeration value="Abrechnungssaldo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Saldoart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STSaldoart {

    @XmlEnumValue("Anfangssaldo")
    ANFANGSSALDO("Anfangssaldo"),
    @XmlEnumValue("Endsaldo")
    ENDSALDO("Endsaldo"),
    @XmlEnumValue("Abrechnungssaldo")
    ABRECHNUNGSSALDO("Abrechnungssaldo");
    private final String value;

    STSaldoart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSaldoart fromValue(String v) {
        for (STSaldoart c: STSaldoart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
