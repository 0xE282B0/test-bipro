
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Zahlungsweise.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Zahlungsweise"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Zahlungsweise")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STZahlungsweise {


    /**
     * jaehrlich
     * 
     */
    @XmlEnumValue("1")
    JAEHRLICH("1"),

    /**
     * halbjaehrlich
     * 
     */
    @XmlEnumValue("2")
    HALBJAEHRLICH("2"),

    /**
     * dreijaehrig
     * 
     */
    @XmlEnumValue("3")
    DREIJAEHRIG("3"),

    /**
     * vierteljaehrlich
     * 
     */
    @XmlEnumValue("4")
    VIERTELJAEHRLICH("4"),

    /**
     * sonstiges
     * 
     */
    @XmlEnumValue("5")
    SONSTIGES("5"),

    /**
     * einmalig
     * 
     */
    @XmlEnumValue("6")
    EINMALIG("6"),

    /**
     * monatlich
     * 
     */
    @XmlEnumValue("8")
    MONATLICH("8"),

    /**
     * beitragsfrei
     * 
     */
    @XmlEnumValue("9")
    BEITRAGSFREI("9"),

    /**
     * taeglich
     * 
     */
    @XmlEnumValue("7")
    TAEGLICH("7");
    private final String value;

    STZahlungsweise(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZahlungsweise fromValue(String v) {
        for (STZahlungsweise c: STZahlungsweise.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
