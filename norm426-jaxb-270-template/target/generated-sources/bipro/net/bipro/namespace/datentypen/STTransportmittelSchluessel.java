
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TransportmittelSchluessel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TransportmittelSchluessel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *     &lt;enumeration value="08"/&gt;
 *     &lt;enumeration value="09"/&gt;
 *     &lt;enumeration value="10"/&gt;
 *     &lt;enumeration value="11"/&gt;
 *     &lt;enumeration value="12"/&gt;
 *     &lt;enumeration value="90"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TransportmittelSchluessel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STTransportmittelSchluessel {


    /**
     * Gewerbl. LKW-Verkehr, nicht WVK
     * 
     */
    @XmlEnumValue("01")
    GEWERBL_LKW_VERKEHR("01"),

    /**
     * Bahn
     * 
     */
    @XmlEnumValue("02")
    BAHN("02"),

    /**
     * Combined Transport, kein Spediteursammelgut. Transport des Transportgutes in einem Container (oder anderer verschlossener Transporteinheit) vom Sender zum Empfänger, ohne dass der Container auf der Reise ausgepackt wird. Dadurch wird die Gefahr für das Transportgut reduziert.
     * Hinweis: In der GDV-Anlage 57 werden die Schlüssel 03 Combined Transport und 90 multimodal fachlich synonym verwendet werden.
     * 
     */
    @XmlEnumValue("03")
    COMBINED_TRANSPORT("03"),

    /**
     * Messe, Ausstellung
     * 
     */
    @XmlEnumValue("04")
    MESSE_AUSSTELLUNG("04"),

    /**
     * Flussschiff, Lagerschiff, Leichter
     * 
     */
    @XmlEnumValue("05")
    FLUSSSCHIFF_LAGERSCHIFF_LEICHTER("05"),

    /**
     * PKW, private Verkehrsmittel
     * 
     */
    @XmlEnumValue("06")
    PKW("06"),

    /**
     * Kran und alle Hebevorgänge
     * 
     */
    @XmlEnumValue("07")
    KRAN_UND_ALLE_HEBEVORGAENGE("07"),

    /**
     * Flugzeuge
     * 
     */
    @XmlEnumValue("08")
    FLUGZEUG("08"),

    /**
     * Magazin, fremdes Lager
     * 
     */
    @XmlEnumValue("09")
    MAGAZIN_FREMDES_LAGER("09"),

    /**
     * Post
     * 
     */
    @XmlEnumValue("10")
    POST("10"),

    /**
     * Seeschiff, auch Kümo
     * 
     */
    @XmlEnumValue("11")
    SEESCHIFF("11"),

    /**
     * Träger, Bote, Mensch
     * 
     */
    @XmlEnumValue("12")
    TRAEGER_BOTE_MENSCH("12"),

    /**
     * "multimodal" (verschiedenartige Transportmittel). Multimodal bedeutet, dass mehrere Transportmittel und ein Umladen bei einem Transport vorkommen, also z.B. LKW zum Hafen, dann Umladen des Transportgutes in einen Container und Weitertransport auf einem Schiff, und am Zielhafen Ausladen aus dem Container und wieder mit dem LKW zum Empfänger.
     * Hinweis: Nicht in GDV-Anlage 57 enthalten, dort werden die Schlüssel 03 Combined Transport und 90 multimodal fachlich synonym verwendet werden.
     * 
     */
    @XmlEnumValue("90")
    MULTIMODAL("90"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("99")
    SONSTIGE("99");
    private final String value;

    STTransportmittelSchluessel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTransportmittelSchluessel fromValue(String v) {
        for (STTransportmittelSchluessel c: STTransportmittelSchluessel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
