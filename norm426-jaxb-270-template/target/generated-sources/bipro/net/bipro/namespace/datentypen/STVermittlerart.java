
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vermittlerart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vermittlerart"&gt;
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
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vermittlerart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVermittlerart {


    /**
     * Angestellter im Innendienst des Produktgebers
     * 
     */
    @XmlEnumValue("01")
    ANGESTELLTER_IM_INNENDIENST("01"),

    /**
     * Generalagent
     * 
     */
    @XmlEnumValue("02")
    GENERALAGENT("02"),

    /**
     * Hauptagent
     * 
     */
    @XmlEnumValue("03")
    HAUPTAGENT("03"),

    /**
     * Makler
     * 
     */
    @XmlEnumValue("04")
    MAKLER("04"),

    /**
     * Mehrfachagent
     * 
     */
    @XmlEnumValue("05")
    MEHRFACHAGENT("05"),

    /**
     * Vertriebsorganisation
     * 
     */
    @XmlEnumValue("06")
    VERTRIEBSORGANISATION("06"),

    /**
     * Agentur
     * 
     */
    @XmlEnumValue("07")
    AGENTUR("07"),

    /**
     * Assekuradeur
     * 
     */
    @XmlEnumValue("08")
    ASSEKURADEUR("08"),

    /**
     * Vermittelndes Unternehmen, das ein  Produkt an einen anderen Risikoträger weitergibt.
     * 
     */
    @XmlEnumValue("09")
    VERMITTELNDES_UNTERNEHMEN("09"),

    /**
     * Sonstiger Vermittler
     * 
     */
    @XmlEnumValue("99")
    SONSTIGER_VERMITTLER("99");
    private final String value;

    STVermittlerart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVermittlerart fromValue(String v) {
        for (STVermittlerart c: STVermittlerart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
