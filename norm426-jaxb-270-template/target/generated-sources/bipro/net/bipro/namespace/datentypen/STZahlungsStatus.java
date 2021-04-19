
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ZahlungsStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ZahlungsStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bezahlt"/&gt;
 *     &lt;enumeration value="teilbezahlt"/&gt;
 *     &lt;enumeration value="unbezahlt"/&gt;
 *     &lt;enumeration value="inArbeit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ZahlungsStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STZahlungsStatus {

    @XmlEnumValue("bezahlt")
    BEZAHLT("bezahlt"),
    @XmlEnumValue("teilbezahlt")
    TEILBEZAHLT("teilbezahlt"),
    @XmlEnumValue("unbezahlt")
    UNBEZAHLT("unbezahlt"),

    /**
     * Die Zahlung befindet sich in Arbeit.
     * 
     */
    @XmlEnumValue("inArbeit")
    IN_ARBEIT("inArbeit");
    private final String value;

    STZahlungsStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZahlungsStatus fromValue(String v) {
        for (STZahlungsStatus c: STZahlungsStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
