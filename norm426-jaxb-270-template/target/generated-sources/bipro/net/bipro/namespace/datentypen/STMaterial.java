
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Material.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Material"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Material")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMaterial {


    /**
     * Stein
     * 
     */
    @XmlEnumValue("01")
    STEIN("01"),

    /**
     * Beton
     * 
     */
    @XmlEnumValue("02")
    BETON("02"),

    /**
     * Holz
     * 
     */
    @XmlEnumValue("03")
    HOLZ("03"),

    /**
     * Metall
     * 
     */
    @XmlEnumValue("04")
    METALL("04"),

    /**
     * Trockenbaukonstruktion
     * 
     */
    @XmlEnumValue("05")
    TROCKENBAUKONSTRUKTION("05"),

    /**
     * Dämmschicht
     * 
     */
    @XmlEnumValue("06")
    DAEMMSCHICHT("06"),

    /**
     * Fliesen
     * 
     */
    @XmlEnumValue("07")
    FLIESEN("07"),

    /**
     * Estrich
     * 
     */
    @XmlEnumValue("08")
    ESTRICH("08"),

    /**
     * Parkett / Laminat
     * 
     */
    @XmlEnumValue("09")
    PARKETT_LAMINAT("09"),

    /**
     * Holzdielen
     * 
     */
    @XmlEnumValue("10")
    HOLZDIELEN("10"),

    /**
     * PVC
     * 
     */
    @XmlEnumValue("11")
    PVC("11"),

    /**
     * Ziegel / Pfanne
     * 
     */
    @XmlEnumValue("12")
    ZIEGEL_PFANNE("12"),

    /**
     * Schiefer
     * 
     */
    @XmlEnumValue("13")
    SCHIEFER("13"),

    /**
     * Blech
     * 
     */
    @XmlEnumValue("14")
    BLECH("14"),

    /**
     * Kunststoff
     * 
     */
    @XmlEnumValue("15")
    KUNSTSTOFF("15"),

    /**
     * Glas
     * 
     */
    @XmlEnumValue("16")
    GLAS("16"),

    /**
     * Glaskeramik
     * 
     */
    @XmlEnumValue("17")
    GLASKERAMIK("17"),

    /**
     * Glasbaustein
     * 
     */
    @XmlEnumValue("18")
    GLASBAUSTEIN("18"),

    /**
     * Kupfer
     * 
     */
    @XmlEnumValue("19")
    KUPFER("19"),

    /**
     * Ried, Schilf, Stroh
     * 
     */
    @XmlEnumValue("20")
    RIED_SCHILF_STROH("20"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("99")
    SONSTIGES("99");
    private final String value;

    STMaterial(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMaterial fromValue(String v) {
        for (STMaterial c: STMaterial.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
