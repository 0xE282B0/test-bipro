
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Praxisform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Praxisform"&gt;
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
@XmlType(name = "ST_Praxisform")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STPraxisform {


    /**
     * Einzelpraxis
     * 
     */
    @XmlEnumValue("01")
    EINZELPRAXIS("01"),

    /**
     * fachgleiche Berufsausübungsgemeinschaft
     * 
     */
    @XmlEnumValue("02")
    FACHGLEICHE_BERUFSAUSUEBUNGSGEMEINSCHAFT("02"),

    /**
     *  fachgleiche überörtliche Berufsausübungsgemeinschaft
     * 
     */
    @XmlEnumValue("03")
    FACHGLEICHE_UEBEROERTLICHE_BERUFSAUSUEBUNGSGEMEINSCHAFT("03"),

    /**
     *  fachgebietsübergreifende Berufsausübungsgemeinschaft
     * 
     */
    @XmlEnumValue("04")
    FACHGEBIETSUEBERGREIFENDE_BERUFSAUSUEBUNGSGEMEINSCHAFT("04"),

    /**
     * fachgebietsübergreifende überörtliche Berufsausübungsgemeinschaft
     * 
     */
    @XmlEnumValue("05")
    FACHGEBIETSUEBERGREIFENDE_UEBEROERTLICHE_BERUFSAUSUEBUNGSGEMEINSCHAFT("05");
    private final String value;

    STPraxisform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STPraxisform fromValue(String v) {
        for (STPraxisform c: STPraxisform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
