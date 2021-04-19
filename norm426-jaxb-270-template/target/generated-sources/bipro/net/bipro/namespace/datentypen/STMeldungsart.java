
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Meldungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Meldungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fehler"/&gt;
 *     &lt;enumeration value="Hinweis"/&gt;
 *     &lt;enumeration value="Warnung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Meldungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMeldungsart {


    /**
     * Fehler: Die Verarbeitung ist nicht durchgeführt worden. Es liegt ein fachlicher oder technischer Fehler vor. Weitere Informationen siehe MeldungID
     * 
     */
    @XmlEnumValue("Fehler")
    FEHLER("Fehler"),

    /**
     * Hinweis bedeutet kein Fehler, aber weitere Informationen. z.B. Standard OK Meldung.
     * Weitere Informationen siehe MeldungID
     * 
     */
    @XmlEnumValue("Hinweis")
    HINWEIS("Hinweis"),

    /**
     * Warnung wiegt schwerer als ein Hinweis und erfordert besondere Aufmerksamkeit.
     * Weitere Informationen siehe MeldungID
     * 
     */
    @XmlEnumValue("Warnung")
    WARNUNG("Warnung");
    private final String value;

    STMeldungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMeldungsart fromValue(String v) {
        for (STMeldungsart c: STMeldungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
