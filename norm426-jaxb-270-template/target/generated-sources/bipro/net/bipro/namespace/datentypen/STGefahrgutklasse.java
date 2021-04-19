
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gefahrgutklasse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gefahrgutklasse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="30"/&gt;
 *     &lt;enumeration value="40"/&gt;
 *     &lt;enumeration value="41"/&gt;
 *     &lt;enumeration value="42"/&gt;
 *     &lt;enumeration value="43"/&gt;
 *     &lt;enumeration value="50"/&gt;
 *     &lt;enumeration value="51"/&gt;
 *     &lt;enumeration value="52"/&gt;
 *     &lt;enumeration value="60"/&gt;
 *     &lt;enumeration value="61"/&gt;
 *     &lt;enumeration value="62"/&gt;
 *     &lt;enumeration value="70"/&gt;
 *     &lt;enumeration value="80"/&gt;
 *     &lt;enumeration value="90"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gefahrgutklasse")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGefahrgutklasse {


    /**
     * Klasse 1 – Explosive Stoffe
     * 
     */
    @XmlEnumValue("10")
    KLASSE_1_EXPLOSIV("10"),

    /**
     * Klasse 2 – Gase und gasförmige Stoffe
     * 
     */
    @XmlEnumValue("20")
    KLASEE_2_GASE("20"),

    /**
     * Klasse 3 – Entzündbare flüssige Stoffe
     * 
     */
    @XmlEnumValue("30")
    KLASSE_3_ENTZUENDBAR_FLUESSIG("30"),

    /**
     * Klasse 4 – Entzündbare feste Stoffe
     * 
     */
    @XmlEnumValue("40")
    KLASSE_4_ENTZUENDBAR_FEST("40"),

    /**
     * Klasse 4.1 – Entzündbare feste Stoffe, selbstzersetzliche Stoffe und desensibilisierte explosive Stoffe
     * 
     */
    @XmlEnumValue("41")
    KLASSE_41_ENTZUENDBAR_FEST_SELBSTZERSETZLICH("41"),

    /**
     * Klasse 4.2 – Selbstentzündliche Stoffe
     * 
     */
    @XmlEnumValue("42")
    KLASSE_42_SELBSTENTZUENDLICH("42"),

    /**
     * Klasse 4.3 – Stoffe, die in Berührung mit Wasser entzündliche Gase bilden
     * 
     */
    @XmlEnumValue("43")
    KLASSE_43_MIT_WASSER_ENTZUENDLICH("43"),

    /**
     * Klasse 5 – Entzündend (oxidierend) wirkende Stoffe
     * 
     */
    @XmlEnumValue("50")
    KLASSE_5_ENTZUENDEND_OXIDIEREND("50"),

    /**
     * Klasse 5.1 – Entzündend wirkende Stoffe
     * 
     */
    @XmlEnumValue("51")
    KLASSE_51_ENTZUENDEND("51"),

    /**
     * Klasse 5.2 – Organische Peroxide
     * 
     */
    @XmlEnumValue("52")
    KLASSE_52_ORGANISCHE_PEROXIDE("52"),

    /**
     * Klasse 6 – Giftige Stoffe
     * 
     */
    @XmlEnumValue("60")
    KLASSE_6_GIFTIG("60"),

    /**
     * Klasse 6.1 – Giftige Stoffe
     * 
     */
    @XmlEnumValue("61")
    KLASSE_61_GIFTIG("61"),

    /**
     * Klasse 6.2 – Ansteckungsgefährliche Stoffe
     * 
     */
    @XmlEnumValue("62")
    KLASSE_62_ANSTECKUNGSGEFAEHRLICH("62"),

    /**
     * Klasse 7 – Radioaktive Stoffe
     * 
     */
    @XmlEnumValue("70")
    KLASSE_7_RADIOAKTIV("70"),

    /**
     * Klasse 8 – Ätzende Stoffe
     * 
     */
    @XmlEnumValue("80")
    KLASSE_8_AETZEND("80"),

    /**
     *  Klasse 9 – Verschiedene gefährliche Stoffe und Gegenstände
     * 
     */
    @XmlEnumValue("90")
    KLASSE_9_VERSCHIEDENE("90");
    private final String value;

    STGefahrgutklasse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGefahrgutklasse fromValue(String v) {
        for (STGefahrgutklasse c: STGefahrgutklasse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
