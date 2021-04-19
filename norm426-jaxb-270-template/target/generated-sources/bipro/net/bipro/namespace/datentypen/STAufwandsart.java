
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Aufwandsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Aufwandsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Aufwandsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAufwandsart {


    /**
     * Versicherungsleistung
     * 
     */
    @XmlEnumValue("01")
    VERSICHERUNGSLEISTUNG("01"),

    /**
     * Zinsen
     * 
     */
    @XmlEnumValue("02")
    ZINSEN("02"),

    /**
     * Rentenzahlung
     * 
     */
    @XmlEnumValue("03")
    RENTENZAHLUNG("03"),

    /**
     * Regress
     * 
     */
    @XmlEnumValue("04")
    REGRESS("04"),

    /**
     * Rückzahlung aus Kfz-Schaden
     * 
     */
    @XmlEnumValue("05")
    RUECKZAHLUNG_AUS_KFZ_SCHADEN("05"),

    /**
     * Verkaufserlös
     * 
     */
    @XmlEnumValue("06")
    VERKAEUFERLOS("06"),

    /**
     * Kulanzzahlung
     * 
     */
    @XmlEnumValue("07")
    KULANZZAHLUNG("07"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STAufwandsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAufwandsart fromValue(String v) {
        for (STAufwandsart c: STAufwandsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
