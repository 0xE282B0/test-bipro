
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Mandatsablageort.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Mandatsablageort"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Mandatsablageort")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STMandatsablageort {


    /**
     * Das SEPA-Lastschriftmandat liegt dem Vermittler vor
     * Dem Vermittler liegt das vom Kontoinhaber unterschriebene SEPA-Lastschriftmandat vor. Der Vermittler MUSS dem Gläubiger das Mandat NICHT zur Verfügung stellen, wenn er dieses entsprechend verwahrt. Im Falle einer Vorlageverpflichtung (auf Anforderung der einlösenden Bank!) wird der Gläubiger sich mit dem Vermittler in Verbindung setzen und um eine Übermittlung des Mandates bitten.
     * 
     */
    @XmlEnumValue("1")
    SEPA_LASTSCHRIFTMANDAT_LIEGT_VERMITTLER_VOR("1"),

    /**
     * Der Vermittler verfügt über eine Bankvollmacht des Kontoinhabers
     * Der Kontoinhaber hat dem Vermittler, im Rahmen einer Maklervollmacht oder auch separat, schriftlich eine Bankvollmacht erteilt und den Vermittler damit legitimiert dem Gläubiger gegenüber das SEPA Mandat zu unterzeichnen. Der Vermittler MUSS dem Gläubiger das Mandat NICHT zur Verfügung stellen, wenn er dieses entsprechend verwahrt. Im Falle einer Vorlageverpflichtung (auf Anforderung der einlösenden Bank!) wird der Gläubiger sich mit dem Vermittler in Verbindung setzen und um eine Übermittlung des Mandates bitten.
     * 
     */
    @XmlEnumValue("2")
    VERMITTLER_VERFUEGT_UEBER_BANKVOLLMACHT("2"),

    /**
     * SEPA-Lastschriftmandat ist beigefügt, wird nachgereicht oder liegt dem Gläubiger vor. SEPA-Lastschriftmandat ist im Original mit Unterschrift des Kontoinhabers beigefügt, wird nachgereicht oder liegt dem Gläubiger vor.
     * 
     */
    @XmlEnumValue("3")
    SEPA_LASTSCHRIFTMANDAT_BEIGEFUEGT("3");
    private final String value;

    STMandatsablageort(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMandatsablageort fromValue(String v) {
        for (STMandatsablageort c: STMandatsablageort.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
