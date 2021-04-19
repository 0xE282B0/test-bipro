
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_AusloesungDerLeistung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_AusloesungDerLeistung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_AusloesungDerLeistung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAusloesungDerLeistung {


    /**
     * Tod
     * 
     */
    @XmlEnumValue("1")
    TOD("1"),

    /**
     * Endalter
     * 
     */
    @XmlEnumValue("2")
    ENDALTER("2"),

    /**
     * Beitragsrückgewähr
     * 
     */
    @XmlEnumValue("3")
    BEITRAGSRUECKGEWAEHR("3"),

    /**
     * Rückkauf
     * 
     */
    @XmlEnumValue("4")
    RUECKRUF("4"),

    /**
     * BU/EU
     * 
     */
    @XmlEnumValue("5")
    BU_EU("5"),

    /**
     * Unfall
     * 
     */
    @XmlEnumValue("6")
    UNFALL("6"),

    /**
     * Krankheit (DD)
     * 
     */
    @XmlEnumValue("7")
    KRANKHEIT("7"),

    /**
     * Pflegefall
     * 
     */
    @XmlEnumValue("8")
    PFLEGEFALL("8");
    private final String value;

    STAusloesungDerLeistung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAusloesungDerLeistung fromValue(String v) {
        for (STAusloesungDerLeistung c: STAusloesungDerLeistung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
