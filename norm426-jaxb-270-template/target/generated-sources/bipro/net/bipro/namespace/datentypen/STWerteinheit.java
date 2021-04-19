
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Werteinheit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Werteinheit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="21"/&gt;
 *     &lt;enumeration value="30"/&gt;
 *     &lt;enumeration value="31"/&gt;
 *     &lt;enumeration value="32"/&gt;
 *     &lt;enumeration value="33"/&gt;
 *     &lt;enumeration value="34"/&gt;
 *     &lt;enumeration value="40"/&gt;
 *     &lt;enumeration value="41"/&gt;
 *     &lt;enumeration value="50"/&gt;
 *     &lt;enumeration value="51"/&gt;
 *     &lt;enumeration value="52"/&gt;
 *     &lt;enumeration value="53"/&gt;
 *     &lt;enumeration value="54"/&gt;
 *     &lt;enumeration value="56"/&gt;
 *     &lt;enumeration value="60"/&gt;
 *     &lt;enumeration value="61"/&gt;
 *     &lt;enumeration value="62"/&gt;
 *     &lt;enumeration value="63"/&gt;
 *     &lt;enumeration value="70"/&gt;
 *     &lt;enumeration value="71"/&gt;
 *     &lt;enumeration value="80"/&gt;
 *     &lt;enumeration value="81"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Werteinheit")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STWerteinheit {


    /**
     * Stueck
     * 
     */
    @XmlEnumValue("01")
    STUECK("01"),

    /**
     * Plätze
     * 
     */
    @XmlEnumValue("02")
    PLAETZE("02"),

    /**
     * Prozent
     * 
     */
    @XmlEnumValue("10")
    PROZENT("10"),

    /**
     * Promille
     * 
     */
    @XmlEnumValue("11")
    PROMILLE("11"),

    /**
     * Waehrung gem. Waehrungsschluessel. Wenn diese Werteinheit genutzt wird, MUSS die Währung im zugehörigen Attribut Waehrung angegeben werden. 
     * 
     */
    @XmlEnumValue("20")
    WAEHRUNG("20"),

    /**
     * Mark 1914
     * 
     */
    @XmlEnumValue("21")
    MARK_1914("21"),

    /**
     * cm
     * 
     */
    @XmlEnumValue("30")
    CM("30"),

    /**
     * mm (Millimeter)
     * 
     */
    @XmlEnumValue("31")
    MM("31"),

    /**
     * m (Meter)
     * 
     */
    @XmlEnumValue("32")
    M("32"),

    /**
     * km (Kilometer)
     * 
     */
    @XmlEnumValue("33")
    KM("33"),

    /**
     * Meilen
     * 
     */
    @XmlEnumValue("34")
    MEILEN("34"),

    /**
     * qm
     * 
     */
    @XmlEnumValue("40")
    QM("40"),

    /**
     * ha (Hektar)
     * 
     */
    @XmlEnumValue("41")
    HEKTAR("41"),

    /**
     * Liter
     * 
     */
    @XmlEnumValue("50")
    LITER("50"),

    /**
     * ccm
     * 
     */
    @XmlEnumValue("51")
    CCM("51"),

    /**
     * qbm (Kubikmeter)
     * 
     */
    @XmlEnumValue("52")
    QBM("52"),

    /**
     * BRT (Bruttoregistertonnen)
     * 
     */
    @XmlEnumValue("53")
    BRT("53"),

    /**
     * BRZ (Bruttoraumzahl)
     * 
     */
    @XmlEnumValue("54")
    BRZ("54"),

    /**
     * ts (Ton Standard (Maßeinheit für die Standardverdrängung, zivil auch "ton long" genannt) 1ts = 1016 kg )
     * 
     */
    @XmlEnumValue("56")
    TS("56"),

    /**
     * Kalendertage
     * 
     */
    @XmlEnumValue("60")
    KALENDERTAGE("60"),

    /**
     * Arbeitstage
     * 
     */
    @XmlEnumValue("61")
    ARBEITSTAGE("61"),

    /**
     * Jahre
     * 
     */
    @XmlEnumValue("62")
    JAHRE("62"),

    /**
     * Stunden
     * 
     */
    @XmlEnumValue("63")
    STUNDEN("63"),

    /**
     * KW (Kilowatt)
     * 
     */
    @XmlEnumValue("70")
    KW("70"),

    /**
     * PS (Pferdestärke)
     * 
     */
    @XmlEnumValue("71")
    PS("71"),

    /**
     * kg (Kilogramm)
     * 
     */
    @XmlEnumValue("80")
    KG("80"),

    /**
     * t (Tonnen)
     * 
     */
    @XmlEnumValue("81")
    T("81");
    private final String value;

    STWerteinheit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWerteinheit fromValue(String v) {
        for (STWerteinheit c: STWerteinheit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
