
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_MandatStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_MandatStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Schwebe"/&gt;
 *     &lt;enumeration value="Aktiv"/&gt;
 *     &lt;enumeration value="Ruhend"/&gt;
 *     &lt;enumeration value="Ungueltig"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_MandatStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMandatStatus {


    /**
     * Ein Mandat ist dann in Schwebe, wenn noch nicht alle notwendigen Daten vorliegen (z.B. die Unterschrift).
     * 
     */
    @XmlEnumValue("Schwebe")
    SCHWEBE("Schwebe"),

    /**
     * Ein unterschriebenes Mandat liegt vor und das Mandat wird genutzt.
     * 
     */
    @XmlEnumValue("Aktiv")
    AKTIV("Aktiv"),

    /**
     * Ein derzeit nicht genutztes, aber gültiges Mandat. 
     * Innerhalb von 36 Monaten nach der letzten Nutzung kann ein ruhend gestelltes Mandat in Abstimmung mit dem Zahler wieder verwendet (aktiv) werden.
     * 
     */
    @XmlEnumValue("Ruhend")
    RUHEND("Ruhend"),

    /**
     * Das Mandat wurde vom Zahler explizit gekündigt oder das Mandat wurde 36 Monate nicht mehr aktiv genutzt. Es kann nicht wieder reaktiviert werden.
     * 
     */
    @XmlEnumValue("Ungueltig")
    UNGUELTIG("Ungueltig");
    private final String value;

    STMandatStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMandatStatus fromValue(String v) {
        for (STMandatStatus c: STMandatStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
