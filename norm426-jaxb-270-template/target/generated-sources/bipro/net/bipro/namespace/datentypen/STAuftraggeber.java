
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Auftraggeber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Auftraggeber"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "ST_Auftraggeber")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAuftraggeber {


    /**
     * Bauherr privat
     * 
     */
    @XmlEnumValue("01")
    BAUHERR_PRIVAT("01"),

    /**
     * Bauherr gewerblich
     * 
     */
    @XmlEnumValue("02")
    BAUHERR_GEWERBLICH("02"),

    /**
     * Architekt
     * 
     */
    @XmlEnumValue("03")
    ARCHITEKT("03"),

    /**
     * Bauträger
     * 
     */
    @XmlEnumValue("04")
    BAUTRAEGER("04"),

    /**
     * Generalunternehmer
     * 
     */
    @XmlEnumValue("05")
    GENERALUNTERNEHMER("05"),

    /**
     * Besteller
     * 
     */
    @XmlEnumValue("06")
    BESTELLER("06"),

    /**
     * Hersteller
     * 
     */
    @XmlEnumValue("07")
    HERSTELLER("07"),

    /**
     * Montagefirma
     * 
     */
    @XmlEnumValue("08")
    MONTAGEFIRMA("08");
    private final String value;

    STAuftraggeber(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAuftraggeber fromValue(String v) {
        for (STAuftraggeber c: STAuftraggeber.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
