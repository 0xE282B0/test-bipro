
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Leistungsstatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Leistungsstatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Leistungsstatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STLeistungsstatus {


    /**
     * keine Leistung gewünscht/vereinbart/möglich
     * 
     */
    @XmlEnumValue("1")
    KEINE_LEISTUNG_GEWUENSCHT_VEREINBART_MOEGLICH("1"),

    /**
     * Leistung gewünscht
     * 
     */
    @XmlEnumValue("2")
    LEISTUNG_GEWUENSCHT("2"),

    /**
     *  Leistung erforderlich
     * 
     */
    @XmlEnumValue("3")
    LEISTUNG_ERFORDERLICH("3"),

    /**
     * Leistung vereinbart
     * 
     */
    @XmlEnumValue("4")
    LEISTUNG_VEREINBART("4"),

    /**
     * Auftrag zur Leistungserbringung erteilt
     * 
     */
    @XmlEnumValue("5")
    AUFTRAG_ZUR_LEISTUNGSERBRINGUNG_ERTEILT("5"),

    /**
     * Leistung durchgeführt
     * 
     */
    @XmlEnumValue("6")
    LEISTUNG_DURCHGEFUEHRT("6");
    private final String value;

    STLeistungsstatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLeistungsstatus fromValue(String v) {
        for (STLeistungsstatus c: STLeistungsstatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
