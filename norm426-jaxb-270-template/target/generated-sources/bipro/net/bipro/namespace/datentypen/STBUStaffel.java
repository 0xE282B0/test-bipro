
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BUStaffel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BUStaffel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BUStaffel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBUStaffel {


    /**
     * default
     * 
     */
    @XmlEnumValue("0")
    DEFAULT("0"),

    /**
     *  50/50
     * 
     */
    @XmlEnumValue("1")
    BUSTAFFEL_50_50("1"),

    /**
     *  25/75
     * 
     */
    @XmlEnumValue("2")
    BUSTAFFEL_25_75("2"),

    /**
     *  33/66
     * 
     */
    @XmlEnumValue("3")
    BUSTAFFEL_33_66("3"),

    /**
     * siehe Besondere Vereinbarungen
     * 
     */
    @XmlEnumValue("9")
    SIEHE_BESONDERE_VEREINBARUNGEN("9");
    private final String value;

    STBUStaffel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBUStaffel fromValue(String v) {
        for (STBUStaffel c: STBUStaffel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
