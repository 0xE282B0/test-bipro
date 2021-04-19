
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Verbleib.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Verbleib"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Verbleib")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVerbleib {


    /**
     * Vorfahrzeug ist abgemeldet und verkauft
     * 
     */
    @XmlEnumValue("01")
    VORFAHRZEUG_IST_ABGEMELDET_VERKAUFT("01"),

    /**
     * Vorfahrzeug wird abgemeldet und verkauft
     * 
     */
    @XmlEnumValue("02")
    VORFAHRZEUG_WIRD_ABGEMELDET_VERKAUFT("02"),

    /**
     * Vorfahrzeug wird Zweitfahrzeug
     * 
     */
    @XmlEnumValue("03")
    VORFAHRZEUG_WIRD_ZWEITFAHRZEUG("03");
    private final String value;

    STVerbleib(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVerbleib fromValue(String v) {
        for (STVerbleib c: STVerbleib.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
