
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Informationsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Informationsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Informationsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STInformationsart {


    /**
     * GrunddatenVertrag: skalare Vertragsdaten auf Vertrags- und Tarifebene, keine Stichtagswerte und keine Verläufe.
     * 
     */
    @XmlEnumValue("01")
    GRUNDDATEN_VERTRAG("01"),

    /**
     * Beitragsverlauf: kompletter Verlauf der vergangenen Beiträge.
     * 
     */
    @XmlEnumValue("02")
    BEITRAGSVERLAUF("02"),

    /**
     * InkassoExkasso: aktuelle Bankdaten und Beitragsrückstände.
     * 
     */
    @XmlEnumValue("03")
    INKASSO_EXKASSO("03"),

    /**
     * Stichtagswerte: Aktuelle Stichtagswerte, d.h. maximal 5 Werktage zurückliegend.
     * DARF NUR in der Sparte Leben verwendet werden. 
     * 
     */
    @XmlEnumValue("04")
    STICHTAGSWERTE("04"),

    /**
     * BeispielModellrechnung: Modellrechnung nach §154 VVG und/oder Beispielrechnung für hochgerechnete Ablaufleistungen.
     * DARF NUR in der Sparte Leben verwendet werden.
     * 
     */
    @XmlEnumValue("05")
    BEISPIEL_MODELLRECHNUNG("05"),

    /**
     * Fondskurse: aktuelle Fondskurse, d.h. Schlusskurs des letzten Börsentags.
     * DARF NUR in der Sparte Leben verwendet werden.
     * 
     */
    @XmlEnumValue("06")
    FONDSKURSE("06");
    private final String value;

    STInformationsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STInformationsart fromValue(String v) {
        for (STInformationsart c: STInformationsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
