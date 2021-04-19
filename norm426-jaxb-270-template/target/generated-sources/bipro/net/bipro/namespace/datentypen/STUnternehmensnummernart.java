
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Unternehmensnummernart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Unternehmensnummernart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AGIK"/&gt;
 *     &lt;enumeration value="BaFin"/&gt;
 *     &lt;enumeration value="AnbNr"/&gt;
 *     &lt;enumeration value="IHK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Unternehmensnummernart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STUnternehmensnummernart {


    /**
     * Identifikation gem. der Nummer der Arbeitsgemeinschaft Institutionskennzeichen.
     * Für folgende Träger und Einrichtungen gibt es diese IK-Nummer: KV-Träger; RV-Träger; UV-Träger; Sozialhilfeträger; Bundesagentur für Arbeit, Versorgungsämter; Gesundheitsämter; Pflegekassen;Träger der Gemeinschaftsaufgaben und Medizinischer Dienst der Krankenkassen, Medizinischer Dienst der Sozialversicherungsträger; Rehabilitationseinrichtungen der Rentenversicherungsträger einschließlich der Knappschaft-Bahn-See; Krankenversicherungsträger außerhalb der GKV; Behörden des Bundes und der Länder, Gerichte.
     * 
     */
    AGIK("AGIK"),

    /**
     * Identifikation gem. der Nummer der Bundesanstalt für Finanzdienstleistungsaufsicht
     * 
     */
    @XmlEnumValue("BaFin")
    BA_FIN("BaFin"),

    /**
     * Riesteranbieternummer der ZfA
     * 
     */
    @XmlEnumValue("AnbNr")
    ANB_NR("AnbNr"),

    /**
     * IHK-Nummer des Vermittlers bzw. Assekuradeurs.
     * 
     */
    IHK("IHK");
    private final String value;

    STUnternehmensnummernart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STUnternehmensnummernart fromValue(String v) {
        for (STUnternehmensnummernart c: STUnternehmensnummernart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
