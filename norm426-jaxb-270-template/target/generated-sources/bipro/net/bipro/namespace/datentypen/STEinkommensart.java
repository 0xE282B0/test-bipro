
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Einkommensart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Einkommensart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *     &lt;enumeration value="7a"/&gt;
 *     &lt;enumeration value="7b"/&gt;
 *     &lt;enumeration value="7c"/&gt;
 *     &lt;enumeration value="7d"/&gt;
 *     &lt;enumeration value="7e"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Einkommensart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STEinkommensart {


    /**
     * Einkünfte aus Land- und Forstwirtschaft
     * 
     */
    @XmlEnumValue("1")
    LAND_FORSTWIRTSCHAFT("1"),

    /**
     * Einkünfte aus Gewerbebetrieb
     * 
     */
    @XmlEnumValue("2")
    GEWERBEBETRIEB("2"),

    /**
     * Einkünfte aus selbstständiger Arbeit
     * 
     */
    @XmlEnumValue("3")
    SELBSTSTAENDIGE_ARBEIT("3"),

    /**
     * Einkünfte aus nichtselbstständiger Arbeit
     * 
     */
    @XmlEnumValue("4")
    NICHTSELBSTSTAENDIGE_ARBEIT("4"),

    /**
     * Einkünfte aus Kapitalvermögen
     * 
     */
    @XmlEnumValue("5")
    KAPITALVERMOEGEN("5"),

    /**
     * Einkünfte aus Vermietung und Verpachtung
     * 
     */
    @XmlEnumValue("6")
    VERMIETUNG_VERPACHTUNG("6"),

    /**
     * Sonstige Einkünfte
     * 
     */
    @XmlEnumValue("7")
    SONSTIGE_EINKUENFTE("7"),

    /**
     * wiederkehrende Bezüge (z.B. Renten)
     * 
     */
    @XmlEnumValue("7a")
    WIEDERKEHRENDE_BEZUEGE("7a"),

    /**
     * Unterhaltsleistungen Geschiedener und getrennt Lebender
     * 
     */
    @XmlEnumValue("7b")
    UNTERHALTSLEISTUNGEN_GESCHIEDENER("7b"),

    /**
     * Spekulationsgeschäfte
     * 
     */
    @XmlEnumValue("7c")
    SPEKULATIONSGESCHAEFTE("7c"),

    /**
     *  Leistungen (z.B. gelegentliche Vermietung körperlicher Gegenstände)
     * 
     */
    @XmlEnumValue("7d")
    LEISTUNGEN("7d"),

    /**
     * Abgeordnetenbezüge
     * 
     */
    @XmlEnumValue("7e")
    ABGEORDNETENBEZUEGE("7e");
    private final String value;

    STEinkommensart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STEinkommensart fromValue(String v) {
        for (STEinkommensart c: STEinkommensart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
