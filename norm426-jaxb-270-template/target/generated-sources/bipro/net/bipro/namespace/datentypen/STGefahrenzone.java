
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gefahrenzone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gefahrenzone"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="000"/&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="010"/&gt;
 *     &lt;enumeration value="011"/&gt;
 *     &lt;enumeration value="012"/&gt;
 *     &lt;enumeration value="013"/&gt;
 *     &lt;enumeration value="020"/&gt;
 *     &lt;enumeration value="021"/&gt;
 *     &lt;enumeration value="022"/&gt;
 *     &lt;enumeration value="030"/&gt;
 *     &lt;enumeration value="040"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gefahrenzone")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGefahrenzone {


    /**
     * Tarifzone allgemein
     * 
     */
    @XmlEnumValue("000")
    TARIFZONE_ALLGEMEIN("000"),

    /**
     * Tarifzone Hausrat
     * 
     */
    @XmlEnumValue("001")
    TARIFZONE_HAUSRAT("001"),

    /**
     * Tarifzone Wohngebaeude
     * 
     */
    @XmlEnumValue("002")
    TARIFZONE_WOHNGEBAEUDE("002"),

    /**
     * Leitungswasserzone
     * 
     */
    @XmlEnumValue("010")
    LEITUNGSWASSERZONE("010"),

    /**
     * ED-Zone
     * 
     */
    @XmlEnumValue("011")
    ED_ZONE("011"),

    /**
     * Sturmzone
     * 
     */
    @XmlEnumValue("012")
    STURMZONE("012"),

    /**
     * Feuerzone
     * 
     */
    @XmlEnumValue("013")
    FEUERZONE("013"),

    /**
     * Erdbebenzone
     * 
     */
    @XmlEnumValue("020")
    ERDBEBENZONE("020"),

    /**
     * Gefaehrdungsklasse Elementar
     * 
     */
    @XmlEnumValue("021")
    GEFAEHRDUNGSKLASSE_ELEMENTAR("021"),

    /**
     * Bach- und Inselzone
     * 
     */
    @XmlEnumValue("022")
    BACH_INSELZONE("022"),

    /**
     * Fahrradzone
     * 
     */
    @XmlEnumValue("030")
    FAHRRADZONE("030"),

    /**
     * Überspannung
     * 
     */
    @XmlEnumValue("040")
    UEBERSPANNUNG("040");
    private final String value;

    STGefahrenzone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGefahrenzone fromValue(String v) {
        for (STGefahrenzone c: STGefahrenzone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
