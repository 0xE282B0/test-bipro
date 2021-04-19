
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Wartezeiterlass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Wartezeiterlass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Wartezeiterlass")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STWartezeiterlass {


    /**
     * nein
     * 
     */
    @XmlEnumValue("0")
    NEIN("0"),

    /**
     * Übertritt aus GKV
     * 
     */
    @XmlEnumValue("1")
    UEBERTRITT_GKV("1"),

    /**
     * ärztliche Untersuchung
     * 
     */
    @XmlEnumValue("2")
    AERZTLICHE_UNTERSUCHUNG("2"),

    /**
     * Kindernachversicherung
     * 
     */
    @XmlEnumValue("3")
    KINDERNACHVERSICHERUNG("3"),

    /**
     * Ehegattennachversicherung
     * 
     */
    @XmlEnumValue("4")
    EHEGATTENNACHVERSICHERUNG("4"),

    /**
     * Befreiungsversicherung
     * 
     */
    @XmlEnumValue("5")
    BEFREIUNGSVERSICHERUNG("5"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STWartezeiterlass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWartezeiterlass fromValue(String v) {
        for (STWartezeiterlass c: STWartezeiterlass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
