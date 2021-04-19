
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Antragsstatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Antragsstatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Antragsstatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAntragsstatus {


    /**
     * in Bearbeitung (Das vertragsführende Unternehmen bearbeitet den Antrag.)
     * 
     */
    @XmlEnumValue("1")
    IN_BEARBEITUNG("1"),

    /**
     * dokumentiert (Das vertragsführende Unternehmen hat den Antrag dokumentiert.)
     * 
     */
    @XmlEnumValue("2")
    DOKUMENTIERT("2"),

    /**
     * abgelehnt (Das vertragsführende Unternehmen hat den Antrag abgelehnt.)
     * 
     */
    @XmlEnumValue("3")
    ABGELEHNT("3"),

    /**
     * Warten auf Information (Das vertragsführende Unternehmen wartet auf eine Information vom Antragsteller oder Vermittler, um den Antrag weiter bearbeiten zu können.)
     * 
     */
    @XmlEnumValue("4")
    WARTET_AUF_INFORMATION("4"),

    /**
     * geparkt zur späteren Bearbeitung/Neuprüfung (Das vertragsführende Unternehmen hat den Antrag geparkt. Der Antrag wird später erneut geprüft und bearbeitet.)
     * 
     */
    @XmlEnumValue("5")
    GEPARKT_ZUR_SPAETEREN_BEARBEITUNG("5"),

    /**
     * widerrufen (Der Antragsteller hat den Antrag widerrufen.)
     * 
     */
    @XmlEnumValue("6")
    WIDERRUFEN("6"),

    /**
     * angenommen, wartet auf Dokumentierung (Das vertragsführende Unternehmen hat die Bearbeitung abgeschlossen und den Antrag angenommen. Die Dokumentierung erfolgt zu gegebener Zeit.)
     * 
     */
    @XmlEnumValue("7")
    ANGENOMMEN("7");
    private final String value;

    STAntragsstatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAntragsstatus fromValue(String v) {
        for (STAntragsstatus c: STAntragsstatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
