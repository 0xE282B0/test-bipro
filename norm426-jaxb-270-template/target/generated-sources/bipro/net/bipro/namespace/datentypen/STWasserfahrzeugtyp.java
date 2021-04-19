
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Wasserfahrzeugtyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Wasserfahrzeugtyp"&gt;
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
 *     &lt;enumeration value="13"/&gt;
 *     &lt;enumeration value="14"/&gt;
 *     &lt;enumeration value="15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Wasserfahrzeugtyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STWasserfahrzeugtyp {


    /**
     * Motorboote und Motorsegler (Ein Motorboot ist ein von einem oder mehreren Verbrennungsmotoren oder Elektromotoren angetriebenes Wasserfahrzeug.
     * Motorsegelschiffe, meistens kurz als Motorsegler oder Fifty-Fifty bezeichnet, sind Yachten, die sowohl mit Segeln als auch unter Motor zufriedenstellend angetrieben werden.)
     * 
     */
    @XmlEnumValue("01")
    MOTORBOOTE_MOTORSEGLER("01"),

    /**
     * Motor-Wasserfahrzeug (Ein Motor-Wasserfahrzeug ist ein von einem oder mehreren Verbrennungsmotoren oder Elektromotoren angetriebenes Wasserfahrzeug, welches z.B. als Fahrgastschiffe und Fährboote der Binnen Schifffahrt, Wattfahrt und kleinen Küstenfahrt genutzt wird.)
     * 
     */
    @XmlEnumValue("02")
    MOTOR_WASSERFAHRZEUG("02"),

    /**
     * Dampf- oder Motorgüterschiff (Ein Motor-Wasserfahrzeug ist ein von einem oder mehreren Verbrennungsmotoren oder Elektromotoren angetriebenes Wasserfahrzeug, welches vorrangig zum Gütertransport genutzt wird. Nicht dazu gehören Tankschiffe.)
     * 
     */
    @XmlEnumValue("03")
    DAMPF_MOTORGUETERSCHIFF("03"),

    /**
     * Tankschiff (Ein Tankschiff, oder kurz Tanker, ist ein Schiff zum Transport von flüssigen Stoffen, wie Wasser, Rohöl, Ölen, Kraftstoffen, Flüssiggas oder petrochemischen Erzeugnissen.)
     * 
     */
    @XmlEnumValue("04")
    TANKSCHIFF("04"),

    /**
     *  Schlepper (Schlepper, auch Schleppschiffe genannt,sind Schiffe mit leistungsstarker Antriebsanlage, die zum Ziehen und Schieben anderer Schiffe oder großer schwimmfähiger Objekte eingesetzt werden.)
     * 
     */
    @XmlEnumValue("05")
    SCHLEPPER("05"),

    /**
     * Schleppkahn (Ein Schleppkahn (oder auch Schute) ist ein Schiff ohne eigenen Antrieb, mit dem Frachtgut auf Flüssen und Kanälen transportiert werden.)
     * 
     */
    @XmlEnumValue("06")
    SCHLEPPERKAHN("06"),

    /**
     * Schubboot (Als Schubboot, umgangssprachlich auch Schuber / Schieber, bezeichnet man ein schiebendes Schiff in der Binnenschifffahrt, welches selbst keine Ladung befördert und ein oder mehrere Schubleichter schiebt.
     * Die sog. Schubleichter gehören zu der gleichen Klasse/Ausprägung wie Schubboote.)
     * 
     */
    @XmlEnumValue("07")
    SCHUBBOOT("07"),

    /**
     * Fischereifahrzeug für Binnenschifffahrt (Als Fischereifahrzeuge werden alle (Wasser-)Fahrzeuge bezeichnet, die auf den Fang von Wassertieren in Binnengewässern spezialisiert sind.)
     * 
     */
    @XmlEnumValue("08")
    FISCHEREIFAHRZEUG_BINNENSCHIFFFAHRT("08"),

    /**
     * Fischereifahrzeug für Wattfahrt oder kleine Küstenfahrt (Als Fischereifahrzeuge werden alle (Wasser-)Fahrzeuge bezeichnet, die auf den Fang von Wassertieren in Watt- oder Küstenfahrt spezialisiert sind.)
     * 
     */
    @XmlEnumValue("09")
    FISCHEREIFAHRZEUG_WATTFAHRT("09"),

    /**
     * Spezialschiffe mit eigenen Antrieb (Hierunter werden alle nicht klassifizierbaren Schiffe spezieller Funktion und/oder Ausführung gezählt, welche einen eigenen Antrieb besitzen.)
     * 
     */
    @XmlEnumValue("10")
    SPEZIALSCHIFFE_EIGENER_ANTRIEB("10"),

    /**
     * Spezialschiffe ohne eigenen Antrieb (Hierunter werden alle nicht klassifizierbaren Schiffe spezieller Funktion und/oder Ausführung gezählt, welche keinen eigenen Antrieb besitzen.)
     * 
     */
    @XmlEnumValue("11")
    SPEZIALSCHIFFE_OHNE_EIGENEN_ANTRIEB("11"),

    /**
     * Segelboot oder -jacht (Ein Segelboot ist ein Sportboot, das in erster Linie durch Windkraft betrieben wird. Vom Segelschiff unterscheidet es sich durch seine geringere Größe.
     * Der Begriff Segelyacht (auch Segeljacht) bezeichnet ein Segelschiff, das hauptsächlich für Freizeit- oder Sportaktivitäten verwendet wird oder gelegentlich auch repräsentativen Zwecken dient.)
     * 
     */
    @XmlEnumValue("12")
    SEGELBOOT_JACHT("12"),

    /**
     * Jetboot (Wassermotorräder, auch bekannt als Jet-Ski oder Jet-Boot, sind relativ kleine, aus glasfaserverstärktem Kunststoff bestehende Wasserfahrzeuge ohne Bordwand. Man unterscheidet Steher für eine Person von Sitzern, Modellen mit Sitzbank, für zwei bis vier Personen. Im Wettkampfbetrieb werden diese beiden Grundmodelle als Ski und Runabout bezeichnet.)
     * 
     */
    @XmlEnumValue("13")
    JETBOOT("13"),

    /**
     *  Ruderboot (Ruderboote sind Wasserfahrzeuge, die mit Hilfe von Riemen oder Skulls bewegt werden.
     * 
     */
    @XmlEnumValue("14")
    RUDERBOOT("14"),

    /**
     *  Surfbrett (Ein Surfbrett ist ein aus einem schwimmfähigen Material hergestelltes Brett, das als Sportgerät zum Wellenreiten oder zum Windsurfen dient.)
     * 
     */
    @XmlEnumValue("15")
    SURFBRETT("15");
    private final String value;

    STWasserfahrzeugtyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWasserfahrzeugtyp fromValue(String v) {
        for (STWasserfahrzeugtyp c: STWasserfahrzeugtyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
