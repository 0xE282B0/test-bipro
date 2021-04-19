
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Unterschriftsverfahren.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Unterschriftsverfahren"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="00"/&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Unterschriftsverfahren")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STUnterschriftsverfahren {


    /**
     * Keine Unterschrift; Abgabe der Willenserklärung erfolgt z. B. mündlich
     * 
     */
    @XmlEnumValue("00")
    KEINE_UNTERSCHRIFT("00"),

    /**
     * Elektronische Unterzeichnung eines Dokumentes mittels fortgeschrittener elektronischer Signatur z. B. ePen oder DigiPad
     * 
     */
    @XmlEnumValue("01")
    ELEKTRONISCHE_UNTERZEICHNUNG_FORTGESCHRITTENE_SIGNATUR("01"),

    /**
     * Elektronische Unterzeichnung eines Dokumentes mittels qualifizierter elektronischer Signatur z. B. nPA
     * 
     */
    @XmlEnumValue("02")
    ELEKTRONISCHE_UNTERZEICHNUNG_QUALIFIZIERTE_SIGNATUR("02"),

    /**
     * Handschriftliche Unterzeichnung auf ausgedrucktem Papier
     * 
     */
    @XmlEnumValue("03")
    HANDSCHRIFTLICHE_UNTERZEICHNUNG("03");
    private final String value;

    STUnterschriftsverfahren(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STUnterschriftsverfahren fromValue(String v) {
        for (STUnterschriftsverfahren c: STUnterschriftsverfahren.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
