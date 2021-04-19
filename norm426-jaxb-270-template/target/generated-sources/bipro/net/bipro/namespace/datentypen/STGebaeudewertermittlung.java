
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gebaeudewertermittlung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gebaeudewertermittlung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gebaeudewertermittlung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGebaeudewertermittlung {


    /**
     * Wertermittlungsbogen
     * 
     */
    @XmlEnumValue("01")
    WERTERMITTLUNGSBOGEN("01"),

    /**
     * Gutachten
     * 
     */
    @XmlEnumValue("02")
    GUTACHTEN("02"),

    /**
     * Kaufpreis
     * 
     */
    @XmlEnumValue("03")
    KAUFPREIS("03"),

    /**
     * Brandkasse
     * 
     */
    @XmlEnumValue("04")
    BRANDKASSE("04"),

    /**
     * Umrechnung des Gebäudeneubauwertes
     * 
     */
    @XmlEnumValue("05")
    UMRECHNUNG_DES_GEBAEUDEBAUWERTES("05"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE("99");
    private final String value;

    STGebaeudewertermittlung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGebaeudewertermittlung fromValue(String v) {
        for (STGebaeudewertermittlung c: STGebaeudewertermittlung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
