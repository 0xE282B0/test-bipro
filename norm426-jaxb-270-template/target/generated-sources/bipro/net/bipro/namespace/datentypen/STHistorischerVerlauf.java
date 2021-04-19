
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_HistorischerVerlauf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_HistorischerVerlauf"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_HistorischerVerlauf")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STHistorischerVerlauf {


    /**
     * Altbestandskunde im eigenen VU
     * 
     */
    @XmlEnumValue("01")
    ALTBESTANDSURKUNDE("01"),

    /**
     * Versicherter im Basistaif aus VU-Wechsel soweit kein Altbestandskunde
     * 
     */
    @XmlEnumValue("02")
    VERSICHERTER_IM_BASISTARIF("02");
    private final String value;

    STHistorischerVerlauf(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STHistorischerVerlauf fromValue(String v) {
        for (STHistorischerVerlauf c: STHistorischerVerlauf.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
