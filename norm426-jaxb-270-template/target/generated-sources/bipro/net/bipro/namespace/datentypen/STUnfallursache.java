
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Unfallursache.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Unfallursache"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="09"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="13"/&gt;
 *     &lt;enumeration value="14"/&gt;
 *     &lt;enumeration value="15"/&gt;
 *     &lt;enumeration value="16"/&gt;
 *     &lt;enumeration value="17"/&gt;
 *     &lt;enumeration value="18"/&gt;
 *     &lt;enumeration value="19"/&gt;
 *     &lt;enumeration value="20"/&gt;
 *     &lt;enumeration value="21"/&gt;
 *     &lt;enumeration value="22"/&gt;
 *     &lt;enumeration value="23"/&gt;
 *     &lt;enumeration value="24"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Unfallursache")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STUnfallursache {


    /**
     * Sportunfall
     * 
     */
    @XmlEnumValue("01")
    SPORTUNFALL("01"),

    /**
     * Verkehrsunfall
     * 
     */
    @XmlEnumValue("02")
    VERKEHRSUNFALL("02"),

    /**
     * Fall/Sturz infolge Glatteis
     * 
     */
    @XmlEnumValue("03")
    FALL_STURZ_INFOLGE_GLATTEIS("03"),

    /**
     * Fall/Sturz wegen sonstiger Ursachen
     * 
     */
    @XmlEnumValue("04")
    FALL_STURZ_SONSTIGE_URSACHEN("04"),

    /**
     * Elektrischer Strom
     * 
     */
    @XmlEnumValue("05")
    ELEKTRISCHER_STROM("05"),

    /**
     * Brand
     * 
     */
    @XmlEnumValue("06")
    BRAND("06"),

    /**
     * Explosion
     * 
     */
    @XmlEnumValue("07")
    EXPLOSION("07"),

    /**
     * Dämpfe, Flüssigkeiten, Gase
     * 
     */
    @XmlEnumValue("08")
    DAEMPFE_FLUESSIGKEITEN_GASE("08"),

    /**
     * Naturereignis: Blitzschlag
     * 
     */
    @XmlEnumValue("09")
    BLITZSCHLAG("09"),

    /**
     * Naturereignis: Erdbeben
     * 
     */
    @XmlEnumValue("10")
    ERDBEBEN("10"),

    /**
     * Naturereignis: Flutkatastrophe
     * 
     */
    @XmlEnumValue("11")
    FLUTKATASTROPHE("11"),

    /**
     * Unfälle durch Tiere
     * 
     */
    @XmlEnumValue("12")
    UNFAELLE_DURCH_TIERE("12"),

    /**
     * Feuer-/Schusswaffen
     * 
     */
    @XmlEnumValue("13")
    FEUER_SCHUSSWAFEN("13"),

    /**
     * Maschinen
     * 
     */
    @XmlEnumValue("14")
    MASCHINEN("14"),

    /**
     * Werkzeug: schneidende Werkzeuge
     * 
     */
    @XmlEnumValue("15")
    SCHNEIDENDE_WERKZEUGE("15"),

    /**
     * Werkzeug: stechende Werkzeuge
     * 
     */
    @XmlEnumValue("16")
    STECHENDE_WERKZEUGE("16"),

    /**
     * sonstige Werkzeuge
     * 
     */
    @XmlEnumValue("17")
    SONSTIGE_WERKZEUGE("17"),

    /**
     * Kraftanstrengung
     * 
     */
    @XmlEnumValue("18")
    KRAFTANSTRENGUNG("18"),

    /**
     * Stoß an Gegenständen
     * 
     */
    @XmlEnumValue("19")
    STOSS_AN_GEGENSTAENDEN("19"),

    /**
     * Röntgenstrahlen im Rahmen der Röntgenklausel
     * 
     */
    @XmlEnumValue("20")
    ROENTGENSTRAHLEN("20"),

    /**
     * Infektionen im Rahmen der Infektionsklausel
     * 
     */
    @XmlEnumValue("21")
    INFEKTIONEN("21"),

    /**
     * Strahlung von außen durch Geräte
     * 
     */
    @XmlEnumValue("22")
    STRAHLUNG_VON_AUSSEN_DURCH_GERAETE("22"),

    /**
     * Strahlung von außen durch Stoffe
     * 
     */
    @XmlEnumValue("23")
    STRAHLUNG_VON_AUSSEN_DURCH_STOFFE("23"),

    /**
     * Inkorporation strahlender Stoffe
     * 
     */
    @XmlEnumValue("24")
    INKORPORATION_STRAHLENDER_STOFFE("24"),

    /**
     * sonstige Unfallursachen
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE_UNFALLURSACHEN("99");
    private final String value;

    STUnfallursache(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STUnfallursache fromValue(String v) {
        for (STUnfallursache c: STUnfallursache.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
