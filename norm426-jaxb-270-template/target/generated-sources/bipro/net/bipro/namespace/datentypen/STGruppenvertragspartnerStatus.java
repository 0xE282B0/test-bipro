
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_GruppenvertragspartnerStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_GruppenvertragspartnerStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_GruppenvertragspartnerStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGruppenvertragspartnerStatus {


    /**
     * bereits Mitglied
     * 
     */
    @XmlEnumValue("01")
    BEREITS_MITGLIED("01"),

    /**
     * neues Mitglied
     * 
     */
    @XmlEnumValue("02")
    NEUES_MITGLIED("02");
    private final String value;

    STGruppenvertragspartnerStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGruppenvertragspartnerStatus fromValue(String v) {
        for (STGruppenvertragspartnerStatus c: STGruppenvertragspartnerStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
