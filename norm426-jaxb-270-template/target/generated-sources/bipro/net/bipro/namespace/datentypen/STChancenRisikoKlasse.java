
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ChancenRisikoKlasse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ChancenRisikoKlasse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ChancenRisikoKlasse")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STChancenRisikoKlasse {


    /**
     * Chancen-Risiko-Klasse 1 (geringe Chancen/geringes Risiko)
     * 
     */
    @XmlEnumValue("01")
    CHANCEN_RISIKO_KLASSE_1("01"),

    /**
     * Chancen-Risiko-Klasse 2
     * 
     */
    @XmlEnumValue("02")
    CHANCEN_RISIKO_KLASSE_2("02"),

    /**
     * Chancen-Risiko-Klasse 3
     * 
     */
    @XmlEnumValue("03")
    CHANCEN_RISIKO_KLASSE_3("03"),

    /**
     * Chancen-Risiko-Klasse 4
     * 
     */
    @XmlEnumValue("04")
    CHANCEN_RISIKO_KLASSE_4("04"),

    /**
     * Chancen-Risiko-Klasse 5 (hohe Chancen/hohes Risiko)
     * 
     */
    @XmlEnumValue("05")
    CHANCEN_RISIKO_KLASSE_5("05");
    private final String value;

    STChancenRisikoKlasse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STChancenRisikoKlasse fromValue(String v) {
        for (STChancenRisikoKlasse c: STChancenRisikoKlasse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
