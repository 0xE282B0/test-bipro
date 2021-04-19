
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Luftfahrzeugtyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Luftfahrzeugtyp"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Luftfahrzeugtyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLuftfahrzeugtyp {


    /**
     * Motorflugzeug (Ein Flugzeug bzw. Motorflugzeug ist ein Luftfahrzeug, das schwerer als Luft ist. Für den zum Fliegen erforderlichen Auftrieb und für die Steuerung werden aerodynamische Effekte genutzt.)
     * 
     */
    @XmlEnumValue("01")
    MOTORFLUGZEUG("01"),

    /**
     * Drehflügler (Zu der Luftfahrzeugklasse Drehflügler gehören Tragschrauber, Hubschrauber und Flugschrauber.)
     * 
     */
    @XmlEnumValue("02")
    DREHFLUEGLER("02"),

    /**
     * Luftschiff (Ein Luftschiff ist ein lenkbares Luftfahrzeug, dessen Auftrieb auf aerostatischen Kräften beruht und das über einen eigenen Antrieb verfügt.)
     * 
     */
    @XmlEnumValue("03")
    LUFTSCHIFF("03"),

    /**
     * Segelflugzeug (Ein Segelflugzeug ist ein für den Segelflug, also für motorloses Fliegen (Steigen im Aufwind beziehungsweise Gleiten mit geringem Höhenverlust) konstruiertes Luftfahrzeug. In Deutschland werden Segelflugzeuge luftrechtlich als eigene Luftfahrzeugklasse gewertet und dürfen bis zu 850 kg wiegen.)
     * 
     */
    @XmlEnumValue("04")
    SEGELFLUGZEUG("04"),

    /**
     * Motorsegler (Motorsegelflugzeuge, oft auch kurz Motorsegler genannt, sind Flugzeuge, denen grundsätzlich alternativ die Betriebsarten Motorflug und Segelflug möglich sind. Sie stellen in Deutschland, Österreich und der Schweiz eine eigene Luftfahrzeugklasse dar. Entsprechende Maschinen tragen Kennungen, die mit D-K&hellip;, OE-9&hellip; oder HB-2&hellip; beginnen.)
     * 
     */
    @XmlEnumValue("05")
    MOTORSEGLER("05"),

    /**
     * Frei- und Fesselballon (Ein Freiballon ist ein freifliegender Ballon. Er muss als Gasballon mit einem Traggas, welches leichter als Luft ist, gefüllt werden oder als Heißluftballon ausgeführt sein. Freiballone werden zusammen mit Fesselballonen (welche durch eine Leine eine ständige Verbindung zum Boden haben) in Deutschland luftrechtlich als eigene Luftfahrzeugklasse angesehen.)
     * 
     */
    @XmlEnumValue("06")
    FREI_FESSELBALLON("06"),

    /**
     * Drachen (Ein Drachen ist ein Spiel- und Sportgerät, das mit Wind betrieben wird. Er besteht in der einfachsten Ausführung aus einem Segel, das in der Regel durch ein Gestänge aufgespannt wird und einer am Gestänge befestigten Leine, die vom Drachensteigenden (im Drachensport oft: Pilot) gehalten wird.)
     * 
     */
    @XmlEnumValue("07")
    DRACHEN("07"),

    /**
     * Flugmodell (Ein Flugmodell ist meist eine verkleinerte Nachbildung eines Luftfahrzeuges (Flugzeug, Hubschrauber, Rakete), wobei es weder eine scharfe Abgrenzung zum Spielzeug oder Sportgerät, noch zu kommerziellen, wissenschaftlichen oder militärischen Anwendungen gibt, wie zum Beispiel ferngelenkten Drohnen.)
     * 
     */
    @XmlEnumValue("08")
    FLUGMODELL("08"),

    /**
     * Luftsportgerät (Die Luftsportgeräte umfassen eine Gruppe von Fluggeräten, bei denen die Sportausübung als Hauptverwendungsszweck angesehen werden kann.)
     * 
     */
    @XmlEnumValue("09")
    LUFTSPORTGERAET("09");
    private final String value;

    STLuftfahrzeugtyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLuftfahrzeugtyp fromValue(String v) {
        for (STLuftfahrzeugtyp c: STLuftfahrzeugtyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
