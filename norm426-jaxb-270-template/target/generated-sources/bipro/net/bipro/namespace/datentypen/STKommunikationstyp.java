
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Kommunikationstyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Kommunikationstyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="30"/&gt;
 *     &lt;enumeration value="31"/&gt;
 *     &lt;enumeration value="32"/&gt;
 *     &lt;enumeration value="40"/&gt;
 *     &lt;enumeration value="41"/&gt;
 *     &lt;enumeration value="42"/&gt;
 *     &lt;enumeration value="50"/&gt;
 *     &lt;enumeration value="51"/&gt;
 *     &lt;enumeration value="52"/&gt;
 *     &lt;enumeration value="60"/&gt;
 *     &lt;enumeration value="61"/&gt;
 *     &lt;enumeration value="62"/&gt;
 *     &lt;enumeration value="70"/&gt;
 *     &lt;enumeration value="71"/&gt;
 *     &lt;enumeration value="72"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Kommunikationstyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STKommunikationstyp {


    /**
     * Telefonnummer privat
     * 
     */
    @XmlEnumValue("10")
    TELEFONNUMMER_PRIVAT("10"),

    /**
     * Telefonnummer geschäftlich
     * 
     */
    @XmlEnumValue("20")
    TELEFONNUMMER_GESCHAEFTLICH("20"),

    /**
     * Telefonnummer mobil
     * 
     */
    @XmlEnumValue("30")
    TELEFONNUMMER_MOBIL("30"),

    /**
     * Telefonnummer mobil privat
     * 
     */
    @XmlEnumValue("31")
    TELEFONNUMMER_MOBIL_PRIVAT("31"),

    /**
     * Telefonnummer mobil geschäftlich
     * 
     */
    @XmlEnumValue("32")
    TELEFONNUMMER_MOBIL_GESCHAEFTLICH("32"),

    /**
     * Telefax
     * 
     */
    @XmlEnumValue("40")
    TELEFAX("40"),

    /**
     * Telefax privat
     * 
     */
    @XmlEnumValue("41")
    TELEFAX_PRIVAT("41"),

    /**
     * Telefax geschäftlich
     * 
     */
    @XmlEnumValue("42")
    TELEFAX_GESCHAEFTLICH("42"),

    /**
     * E-Mail
     * 
     */
    @XmlEnumValue("50")
    E_MAIL("50"),

    /**
     * E-Mail privat
     * 
     */
    @XmlEnumValue("51")
    E_MAIL_PRIVAT("51"),

    /**
     * E-Mail geschäftlich
     * 
     */
    @XmlEnumValue("52")
    E_MAIL_GESCHAEFTLICH("52"),

    /**
     * Website
     * 
     */
    @XmlEnumValue("60")
    WEBSITE("60"),

    /**
     * Website privat
     * 
     */
    @XmlEnumValue("61")
    WEBSITE_PRIVAT("61"),

    /**
     * Website geschäftlich
     * 
     */
    @XmlEnumValue("62")
    WEBSITE_GESCHAEFTLICH("62"),

    /**
     * Online-Dienst
     * 
     */
    @XmlEnumValue("70")
    ONLINE_DIENST("70"),

    /**
     * Online-Dienst privat
     * 
     */
    @XmlEnumValue("71")
    ONLINE_DIENST_PRIVAT("71"),

    /**
     * Online-Dienst geschäftlich
     * 
     */
    @XmlEnumValue("72")
    ONLINE_DIENST_GESCHAEFTLICH("72");
    private final String value;

    STKommunikationstyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKommunikationstyp fromValue(String v) {
        for (STKommunikationstyp c: STKommunikationstyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
