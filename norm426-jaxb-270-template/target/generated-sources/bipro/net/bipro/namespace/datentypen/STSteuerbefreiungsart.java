
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Steuerbefreiungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Steuerbefreiungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Steuerbefreiungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSteuerbefreiungsart {


    /**
     * Nichtveranlagungsbescheinigung NV-Art 01A
     * 
     */
    @XmlEnumValue("01")
    NICHTVERANLAGUNGSBESCHEINIGUNG_01A("01"),

    /**
     * Nichtveranlagungsbescheinigung NV-Art 02A
     * 
     */
    @XmlEnumValue("02")
    NICHTVERANLAGUNGSBESCHEINIGUNG_02A("02"),

    /**
     * Nichtveranlagungsbescheinigung NV-Art 03A
     * 
     */
    @XmlEnumValue("03")
    NICHTVERANLAGUNGSBESCHEINIGUNG_03A("03"),

    /**
     * Freistellungsauftrag
     * 
     */
    @XmlEnumValue("04")
    FREISTELLUNGSANTRAG("04");
    private final String value;

    STSteuerbefreiungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSteuerbefreiungsart fromValue(String v) {
        for (STSteuerbefreiungsart c: STSteuerbefreiungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
