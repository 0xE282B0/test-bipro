
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_BasisDerWerbeerlaubnis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_BasisDerWerbeerlaubnis"&gt;
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
@XmlType(name = "ST_BasisDerWerbeerlaubnis")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STBasisDerWerbeerlaubnis {


    /**
     *  Beim Vermittler im Antrag erteilt.
     * 
     */
    @XmlEnumValue("01")
    VERMITTLER_ANTRAG_ERTEILT("01"),

    /**
     *  Beim Unternehmen während der Vertragslaufzeit erteilt.
     * 
     */
    @XmlEnumValue("02")
    UNTERNEHMEN_WAEHREND_VERTRAGSLAUFZEIT_ERTEILT("02"),

    /**
     * Beim Vermittler während der Vertragslaufzeit erteilt.
     * 
     */
    @XmlEnumValue("03")
    VERMITTLER_WAEHREND_VERTRAGSLAUFZEIT_ERTEILT("03"),

    /**
     * Widerruf innerhalb der Widerrufsfrist.
     * 
     */
    @XmlEnumValue("04")
    WIDERRUF("04"),

    /**
     * Werbeverbotsliste (z.B. Robinson)
     * 
     */
    @XmlEnumValue("05")
    WERBEVERBOTSLISTE("05");
    private final String value;

    STBasisDerWerbeerlaubnis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STBasisDerWerbeerlaubnis fromValue(String v) {
        for (STBasisDerWerbeerlaubnis c: STBasisDerWerbeerlaubnis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
