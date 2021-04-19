
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_RisikokennzifferHausrat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_RisikokennzifferHausrat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0010"/&gt;
 *     &lt;enumeration value="0011"/&gt;
 *     &lt;enumeration value="0012"/&gt;
 *     &lt;enumeration value="0013"/&gt;
 *     &lt;enumeration value="0020"/&gt;
 *     &lt;enumeration value="0021"/&gt;
 *     &lt;enumeration value="0023"/&gt;
 *     &lt;enumeration value="0029"/&gt;
 *     &lt;enumeration value="0030"/&gt;
 *     &lt;enumeration value="0037"/&gt;
 *     &lt;enumeration value="0038"/&gt;
 *     &lt;enumeration value="0000"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_RisikokennzifferHausrat")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STRisikokennzifferHausrat {


    /**
     * Hausrat in staendig bewohnter Wohnung
     * 
     */
    @XmlEnumValue("0010")
    HAUSRAT_IN_STAENDIG_BEWOHNTER_WOHNUNG("0010"),

    /**
     * Hausrat in staendig bewohnter Wohnung im Mehrfamilienhaus
     * 
     */
    @XmlEnumValue("0011")
    HAUSRAT_IN_STAENDIG_BEWOHNTER_WOHNUNG_MEHRFAMILIENHAUS("0011"),

    /**
     * Hausrat in staendig bewohnter Wohnung im Einfamilienhaus
     * 
     */
    @XmlEnumValue("0012")
    HAUSRAT_IN_STAENDIG_BEWOHNTER_WOHNUNG_EINFAMILIENHAUS("0012"),

    /**
     * Hausrat in staendig bewohnter Wohnung im Zweifamilienhaus
     * 
     */
    @XmlEnumValue("0013")
    HAUSRAT_IN_STAENDIG_BEWOHNTER_WOHNUNG_ZWEIFAMILIENHAUS("0013"),

    /**
     * Hausrat in nicht staendig bewohnter Wohnung.
     * 
     */
    @XmlEnumValue("0020")
    HAUSRAT_IN_NICHT_STAENDIG_BEWOHNTER_WOHNUNG("0020"),

    /**
     * Hausrat in nicht staendig bewohnter Wohnung in von Dritten staendig bewohntem Gebaeude.
     * 
     */
    @XmlEnumValue("0021")
    HAUSRAT_IN_NICHT_STAENDIG_BEWOHNTER_WOHNUNG_IN_VON_DRITTEN_BEWOHNTEM_GEBAEUDE("0021"),

    /**
     * Hausrat bei voruebergehendem Wohnsitz im Ausland
     * 
     */
    @XmlEnumValue("0023")
    HAUSRAT_BEI_VORUEBERGEHENDEM_WOHNSITZ_IM_AUSLAND("0023"),

    /**
     * Hausart eingelagert
     * 
     */
    @XmlEnumValue("0029")
    HAUSRAT_EINGELAGERT("0029"),

    /**
     * Hausrat in nicht staendig bewohntem Gebaeude
     * 
     */
    @XmlEnumValue("0030")
    HAUSRAT_IN_NICHT_STAENDIG_BEWOHNTEM_GEBAEUDE("0030"),

    /**
     * Hausrat in nicht staendig bewohntem Gebaeude innerhalb eines geschlossenen Wohngebietes
     * 
     */
    @XmlEnumValue("0037")
    HAUSRAT_IN_NICHT_STAENDIG_BEWOHNTEM_GEBAEUDE_GESCHLOSSENES_WOHNGEBIET("0037"),

    /**
     * Hausrat in nicht staendig bewohntem Gebaeude ausserhalb eines geschlossenen Wohngebietes
     * 
     */
    @XmlEnumValue("0038")
    HAUSRAT_IN_NICHT_STAENDIG_BEWOHNTEM_GEBAEUDE_AUSSERHALB_GESCHLOSSENEM_WOHNGEBIET("0038"),

    /**
     * Unbekannt, nicht geschluesselt
     * 
     */
    @XmlEnumValue("0000")
    UNBEKANNT("0000");
    private final String value;

    STRisikokennzifferHausrat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRisikokennzifferHausrat fromValue(String v) {
        for (STRisikokennzifferHausrat c: STRisikokennzifferHausrat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
