
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Schadenverursacher.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Schadenverursacher"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="8"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Schadenverursacher")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STSchadenverursacher {


    /**
     * unbekannt
     * 
     */
    @XmlEnumValue("0")
    UNBEKANNT("0"),

    /**
     * Versicherungsnehmer
     * 
     */
    @XmlEnumValue("1")
    VERSICHERUNGSNEHMER("1"),

    /**
     * Anspruchsteller
     * 
     */
    @XmlEnumValue("2")
    ANSPRUCHSTELLER("2"),

    /**
     * Mitarbeiter
     * 
     */
    @XmlEnumValue("3")
    MITARBEITER("3"),

    /**
     * Ehegatte
     * 
     */
    @XmlEnumValue("4")
    EHEGATTE("4"),

    /**
     * eingetragener Lebenspartner
     * 
     */
    @XmlEnumValue("5")
    EINGETRAGENER_LEBENSPARTNER("5"),

    /**
     * Kind, ohne Altersangabe
     * 
     */
    @XmlEnumValue("6")
    KIND_OHNE_ALTERSANGABE("6"),

    /**
     * Kind kleiner 7 Jahre
     * 
     */
    @XmlEnumValue("7")
    KIND_KLEINER_7_JAHRE("7"),

    /**
     * Kind größer/gleich 7 Jahre und kleiner 10 Jahre
     * 
     */
    @XmlEnumValue("8")
    KIND_7_BIS_10_JAHRE("8"),

    /**
     * Kind größer/gleich 10 Jahre
     * 
     */
    @XmlEnumValue("9")
    KIND_AB_10_JAHREN("9"),

    /**
     * Subunternehmer
     * 
     */
    @XmlEnumValue("10")
    SUBUNTERNEHMER("10"),

    /**
     * Berechtigter Fahrer
     * 
     */
    @XmlEnumValue("11")
    BERECHTIGTER_FAHRER("11"),

    /**
     * Sonstiger
     * 
     */
    @XmlEnumValue("99")
    SONSTIGER("99");
    private final String value;

    STSchadenverursacher(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSchadenverursacher fromValue(String v) {
        for (STSchadenverursacher c: STSchadenverursacher.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
