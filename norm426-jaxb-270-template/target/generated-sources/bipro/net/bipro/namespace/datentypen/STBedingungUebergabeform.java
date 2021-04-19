
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BedingungUebergabeform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BedingungUebergabeform"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="00"/&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_BedingungUebergabeform")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBedingungUebergabeform {


    /**
     * keine Angabe
     * 
     */
    @XmlEnumValue("00")
    KEINE_ANGABE("00"),

    /**
     * Original-Druckstück
     * 
     */
    @XmlEnumValue("01")
    ORIGINAL_DRUCKSTUECK("01"),

    /**
     * Ausdruck
     * 
     */
    @XmlEnumValue("02")
    AUSDRUCK("02"),

    /**
     * E-Mail
     * 
     */
    @XmlEnumValue("03")
    E_MAIL("03"),

    /**
     * Download
     * 
     */
    @XmlEnumValue("04")
    DOWNLOAD("04"),

    /**
     * Datenträger
     * 
     */
    @XmlEnumValue("05")
    DATENTRAEGER("05"),

    /**
     * vom Kunden nicht gewünscht
     * 
     */
    @XmlEnumValue("06")
    VOM_KUNDEN_NICHT_GEWUENSCHT("06"),

    /**
     * Aushändigung nicht erfolgt
     * 
     */
    @XmlEnumValue("07")
    AUSHAENDIGUNG_NICHT_ERFOLGT("07"),

    /**
     * Kundeninformations-CD
     * 
     */
    @XmlEnumValue("08")
    KUNDENINFORMATIONS_CD("08");
    private final String value;

    STBedingungUebergabeform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBedingungUebergabeform fromValue(String v) {
        for (STBedingungUebergabeform c: STBedingungUebergabeform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
