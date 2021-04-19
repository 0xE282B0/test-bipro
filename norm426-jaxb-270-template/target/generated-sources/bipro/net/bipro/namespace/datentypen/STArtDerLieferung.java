
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtDerLieferung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtDerLieferung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1001"/&gt;
 *     &lt;enumeration value="1002"/&gt;
 *     &lt;enumeration value="1003"/&gt;
 *     &lt;enumeration value="1004"/&gt;
 *     &lt;enumeration value="1005"/&gt;
 *     &lt;enumeration value="1006"/&gt;
 *     &lt;enumeration value="1103"/&gt;
 *     &lt;enumeration value="1104"/&gt;
 *     &lt;enumeration value="1105"/&gt;
 *     &lt;enumeration value="1203"/&gt;
 *     &lt;enumeration value="1204"/&gt;
 *     &lt;enumeration value="1205"/&gt;
 *     &lt;enumeration value="1303"/&gt;
 *     &lt;enumeration value="1304"/&gt;
 *     &lt;enumeration value="1305"/&gt;
 *     &lt;enumeration value="2001"/&gt;
 *     &lt;enumeration value="2002"/&gt;
 *     &lt;enumeration value="2101"/&gt;
 *     &lt;enumeration value="2102"/&gt;
 *     &lt;enumeration value="2104"/&gt;
 *     &lt;enumeration value="2105"/&gt;
 *     &lt;enumeration value="2106"/&gt;
 *     &lt;enumeration value="2304"/&gt;
 *     &lt;enumeration value="2305"/&gt;
 *     &lt;enumeration value="2401"/&gt;
 *     &lt;enumeration value="2402"/&gt;
 *     &lt;enumeration value="2403"/&gt;
 *     &lt;enumeration value="2404"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtDerLieferung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STArtDerLieferung {


    /**
     * UC-1 Vertrag
     * 
     */
    @XmlEnumValue("1001")
    UC_1("1001"),

    /**
     * UC-2 Vertrag
     * 
     */
    @XmlEnumValue("1002")
    UC_2("1002"),

    /**
     * UC-3 Vertrag
     * 
     */
    @XmlEnumValue("1003")
    UC_3("1003"),

    /**
     * UC-4 Vertrag
     * 
     */
    @XmlEnumValue("1004")
    UC_4("1004"),

    /**
     * UC-5 Vertrag
     * 
     */
    @XmlEnumValue("1005")
    UC_5("1005"),

    /**
     * UC-6 Vertrag
     * 
     */
    @XmlEnumValue("1006")
    UC_6("1006"),

    /**
     * UC-3 Vertrag + Inkasso
     * 
     */
    @XmlEnumValue("1103")
    UC_3_INKASSO("1103"),

    /**
     * UC-4 Vertrag + Inkasso
     * 
     */
    @XmlEnumValue("1104")
    UC_4_INKASSO("1104"),

    /**
     * UC-5 Vertrag + Inkasso
     * 
     */
    @XmlEnumValue("1105")
    UC_5_INKASSO("1105"),

    /**
     * UC-3 nur Inkasso
     * 
     */
    @XmlEnumValue("1203")
    UC_3_NUR_INKASSO("1203"),

    /**
     * UC-4 nur Inkasso
     * 
     */
    @XmlEnumValue("1204")
    UC_4_NUR_INKASSO("1204"),

    /**
     * UC-5 nur Inkasso
     * 
     */
    @XmlEnumValue("1205")
    UC_5_NUR_INKASSO("1205"),

    /**
     * UC-3 Prämienabrechnung
     * 
     */
    @XmlEnumValue("1303")
    UC_3_PRAEMIENABRECHNUNG("1303"),

    /**
     * UC-4 Prämienabrechnung
     * 
     */
    @XmlEnumValue("1304")
    UC_4_PRAEMIENABRECHNUNG("1304"),

    /**
     * UC-5 Prämienabrechnung
     * 
     */
    @XmlEnumValue("1305")
    UC_5_PRAEMIENABRECHNUNG("1305"),

    /**
     * UC-1 Schaden mit kumulierten Schadenbeträgen
     * 
     */
    @XmlEnumValue("2001")
    UC_1_KUMMULIERTE_SCHADENBETRAEGE("2001"),

    /**
     * UC-2 Schaden mit kumulierten Schadenbeträgen
     * 
     */
    @XmlEnumValue("2002")
    UC_2_KUMMULIERTE_SCHADENBETRAEGE("2002"),

    /**
     * UC-1 Schaden mit einzelnen Regulierungen
     * 
     */
    @XmlEnumValue("2101")
    UC_1_EINZELNE_REGULIERUNGEN("2101"),

    /**
     * UC-2 Schaden mit einzelnen Regulierungen
     * 
     */
    @XmlEnumValue("2102")
    UC_2_EINZELNE_REGULIERUNGEN("2102"),

    /**
     * UC-4 Schaden
     * 
     */
    @XmlEnumValue("2104")
    UC_4_SCHADEN("2104"),

    /**
     * UC-5 Schaden
     * 
     */
    @XmlEnumValue("2105")
    UC_5_SCHADEN("2105"),

    /**
     * UC-6 Schaden
     * 
     */
    @XmlEnumValue("2106")
    UC_6_SCHADEN("2106"),

    /**
     * UC-4 Schadenabrechnung
     * 
     */
    @XmlEnumValue("2304")
    UC_4_SCHADENABRECHNUNG("2304"),

    /**
     * UC-5 Schadenabrechnung
     * 
     */
    @XmlEnumValue("2305")
    UC_5_SCHADENABRECHNUNG("2305"),

    /**
     * VA Abrechnung
     * 
     */
    @XmlEnumValue("2401")
    VA_ABRECHNUNG("2401"),

    /**
     * VA Klärungsanfrage
     * 
     */
    @XmlEnumValue("2402")
    VA_KLAERUNGSANFRAGE("2402"),

    /**
     * VA Klärungsantwort
     * 
     */
    @XmlEnumValue("2403")
    VA_KLAERUNGSANTWORT("2403"),

    /**
     * VA Abrechnung anfordern
     * 
     */
    @XmlEnumValue("2404")
    VA_ABRECHNUNG_ANFORDERN("2404");
    private final String value;

    STArtDerLieferung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtDerLieferung fromValue(String v) {
        for (STArtDerLieferung c: STArtDerLieferung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
