
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_PPVHoechstbeitrag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_PPVHoechstbeitrag"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_PPVHoechstbeitrag")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STPPVHoechstbeitrag {


    /**
     * Tarifbeitrag
     * 
     */
    @XmlEnumValue("0")
    TARIFBEITRAG("0"),

    /**
     * Beitragsfreie Sonstige (z. B. Arbeitssuchende, Behinderte)
     * 
     */
    @XmlEnumValue("5")
    BEITRAGSFREIE_SONSTIGE("5"),

    /**
     * Beitragsnachlass wegen Hilfebedürftigkeit
     * 
     */
    @XmlEnumValue("6")
    BEITRAGSNACHLASS_WEGEN_HILFSBEDUERFTIGKEIT("6"),

    /**
     * Hoechstbeitrag
     * 
     */
    @XmlEnumValue("1")
    HOECHSTBEITRAG("1"),

    /**
     * Beitragsfreies Kind
     * 
     */
    @XmlEnumValue("2")
    BEITRAGSFREIES_KIND("2"),

    /**
     * Ehepaarbegrenzung
     * 
     */
    @XmlEnumValue("3")
    EHEPAARBEGRENZUNG("3"),

    /**
     * Student
     * 
     */
    @XmlEnumValue("4")
    STUDENT("4");
    private final String value;

    STPPVHoechstbeitrag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STPPVHoechstbeitrag fromValue(String v) {
        for (STPPVHoechstbeitrag c: STPPVHoechstbeitrag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
