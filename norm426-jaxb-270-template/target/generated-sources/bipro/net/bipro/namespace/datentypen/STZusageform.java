
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Zusageform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Zusageform"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Zusageform")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STZusageform {


    /**
     * Beitragszusage mit Mindestleistung
     * 
     */
    @XmlEnumValue("01")
    BEITRAGSZUSAGE_MINDESTLEISTUNG("01"),

    /**
     * Beitragsorientierte Leistungszusage
     * 
     */
    @XmlEnumValue("02")
    BEITRAGSORIENTIERTE_LEISTUNGSZUSAGE("02"),

    /**
     * Leistungszusage
     * 
     */
    @XmlEnumValue("03")
    LEISTUNGSZUSAGE("03");
    private final String value;

    STZusageform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZusageform fromValue(String v) {
        for (STZusageform c: STZusageform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
