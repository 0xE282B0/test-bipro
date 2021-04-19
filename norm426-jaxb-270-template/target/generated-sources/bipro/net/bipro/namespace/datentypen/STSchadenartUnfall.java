
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_SchadenartUnfall.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_SchadenartUnfall"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_SchadenartUnfall")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSchadenartUnfall {


    /**
     * Wegeunfall (Unfall auf dem Weg zur oder von der Arbeitsstätte/Schule)
     * 
     */
    @XmlEnumValue("01")
    WEGEUNFALL("01"),

    /**
     * Berufs-/Schulunfall (ohne Wegeunfall) im privaten häuslichen Bereich
     * 
     */
    @XmlEnumValue("02")
    BERUFS_SCHULUNFALL_PRIVATER_HAEUSLICHER_BEREICH("02"),

    /**
     * Berufs-/Schulunfall (ohne Wegeunfall) außerhalb des privaten häuslichen Bereiches
     * 
     */
    @XmlEnumValue("03")
    BERUFS_SCHULUNFALL_AUSSERHALB_PRIVATER_HAEUSLICHER_BEREICH("03"),

    /**
     * Unfall bei Tätigkeit für den Haushalt und Einkäufen - im privaten häusllichen Bereich
     * 
     */
    @XmlEnumValue("04")
    UNFALL_BEI_TAETIGKEITEN_HAUSHALT_PRIVATER_HAEUSLICHER_BEREICH("04"),

    /**
     * Unfall bei Tätigkeit für den Haushalt und Einkäufen - außerhalb des privaten häuslichen Bereiches
     * 
     */
    @XmlEnumValue("05")
    UNFALL_BEI_TAETIGKEITEN_HAUSHALT_AUSSERHALB_PRIVATER_HAEUSLICHER_BEREICH("05"),

    /**
     * Sonstige Unfälle im privaten häuslichen Bereich ohne Beziehung zur Tätigkeit für Haushalt
     * 
     */
    @XmlEnumValue("06")
    SONSTIGE_UNFAELLE_PRIVATER_HAEUSLICHER_BEREICH("06"),

    /**
     * Sonstige Unfälle außerhalb des privaten häuslichen Bereichs ohne Beziehung zur Tätigkeit für Haushalt
     * 
     */
    @XmlEnumValue("07")
    SONSTIGE_UNFAELLE_AUSSERHALB_PRIVATER_HAEUSLICHER_BEREICH("07"),

    /**
     * Unfallart noch nicht bekannt
     * 
     */
    @XmlEnumValue("08")
    UNFALLART_NOCH_NICHT_BEKANNT("08"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STSchadenartUnfall(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSchadenartUnfall fromValue(String v) {
        for (STSchadenartUnfall c: STSchadenartUnfall.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
