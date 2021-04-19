
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Bewertungsschluessel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Bewertungsschluessel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Bewertungsschluessel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBewertungsschluessel {


    /**
     * DAT-EDV-Code
     * 
     */
    @XmlEnumValue("1")
    DAT_EDV_CODE("1"),

    /**
     * Schwacke-Schlüssel-Nr.
     * 
     */
    @XmlEnumValue("2")
    SCHWACKE_SCHLUESSEL_NR("2"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("9")
    SONSTIGE("9");
    private final String value;

    STBewertungsschluessel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBewertungsschluessel fromValue(String v) {
        for (STBewertungsschluessel c: STBewertungsschluessel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
