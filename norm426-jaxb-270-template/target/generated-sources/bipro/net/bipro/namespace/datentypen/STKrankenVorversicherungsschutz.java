
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_KrankenVorversicherungsschutz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_KrankenVorversicherungsschutz"&gt;
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
@XmlType(name = "ST_KrankenVorversicherungsschutz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STKrankenVorversicherungsschutz {


    /**
     * gesetzlich freiwillig krankenversichert
     * 
     */
    @XmlEnumValue("01")
    GESETZLICH_FREIWILLIG_KRANKENVERSICHERT("01"),

    /**
     * gesetzlich pflichtig krankenversichert
     * 
     */
    @XmlEnumValue("02")
    GESETZLICH_PFLICHTIG_KRANKENVERSICHERT("02"),

    /**
     * gesetzlich krankenversichert (ohne nähere Zuordnung)
     * 
     */
    @XmlEnumValue("03")
    GESETZLICH_KRANKENVERSICHERT("03"),

    /**
     * privat krankenversichert
     * 
     */
    @XmlEnumValue("04")
    PRIVAT_KRANKENVERSICHERT("04"),

    /**
     * freie Heilfürsorge
     * 
     */
    @XmlEnumValue("05")
    PRIVAT_HEILFUERSORGE("05"),

    /**
     * ausländisch gesetzlich krankenversichert
     * 
     */
    @XmlEnumValue("06")
    AUSLAENDISCH_GESETZLICH_KRANKENVERSICHERT("06"),

    /**
     * ausländisch privat krankenversichert
     * 
     */
    @XmlEnumValue("07")
    AUSLAENDISCH_PRIVAT_KRANKENVERSICHERT("07"),

    /**
     * keine Vorversicherung
     * 
     */
    @XmlEnumValue("99")
    KEINE_VORVERSICHERUNG("99");
    private final String value;

    STKrankenVorversicherungsschutz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STKrankenVorversicherungsschutz fromValue(String v) {
        for (STKrankenVorversicherungsschutz c: STKrankenVorversicherungsschutz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
