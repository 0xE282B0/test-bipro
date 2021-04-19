
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Fahrerassistenzsystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Fahrerassistenzsystem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="003"/&gt;
 *     &lt;enumeration value="004"/&gt;
 *     &lt;enumeration value="005"/&gt;
 *     &lt;enumeration value="006"/&gt;
 *     &lt;enumeration value="007"/&gt;
 *     &lt;enumeration value="008"/&gt;
 *     &lt;enumeration value="009"/&gt;
 *     &lt;enumeration value="010"/&gt;
 *     &lt;enumeration value="011"/&gt;
 *     &lt;enumeration value="012"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Fahrerassistenzsystem")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFahrerassistenzsystem {


    /**
     * Antiblockiersystem (ABS)
     * 
     */
    @XmlEnumValue("001")
    ANTIBLOCKIERSYSTEM("001"),

    /**
     * Tempomat (Geschwindigkeitsregelanlage) in Kraftfahrzeugen, der bei der Regelung den Abstand zu einem vorausfahrenden Fahrzeug als zusätzliche Rückführ- und Stellgröße einbezieht.
     * 
     */
    @XmlEnumValue("002")
    TEMPOMAT("002"),

    /**
     * Einparkhilfe
     * 
     */
    @XmlEnumValue("003")
    EINPARKHILFE("003"),

    /**
     * Spurwechselassistent
     * 
     */
    @XmlEnumValue("004")
    SPURWECHSELASSISTENT("004"),

    /**
     * Totwinkel-Überwachung
     * 
     */
    @XmlEnumValue("005")
    TOTWINKEL_UEBERWACHUNG("005"),

    /**
     * Spurassistent (warnt den Fahrer eines Fahrzeuges vor dem Verlassen der Fahrspur auf einer Straße)
     * 
     */
    @XmlEnumValue("006")
    SPURASSISTENT("006"),

    /**
     * Abstand-/Bremsassistent (erkennt die Entfernung des Fahrzeugs von Hindernissen und leitet bei zu geringem Abstand eine Geschwindigkeitsreduktion oder Bremsung ein)
     * 
     */
    @XmlEnumValue("007")
    ABSTAND_BREMSASSISTENT("007"),

    /**
     * Nachtsichtassistent (ein optisches System, das Kraftfahrzeugführern eine größere Sichtweite in der Dunkelheit bietet)
     * 
     */
    @XmlEnumValue("008")
    NACHTSICHTASSISTENT("008"),

    /**
     * Head-up-Display (ein Anzeigesystem, bei dem der Nutzer seine Kopfhaltung bzw. Blickrichtung beibehalten kann, weil die Informationen in sein Sichtfeld projiziert werden)
     * 
     */
    @XmlEnumValue("009")
    HEAD_UP_DISPLAY("009"),

    /**
     * Fahrstabilitäts-System (z.B. ESP)
     * 
     */
    @XmlEnumValue("010")
    FAHRSTABILITAETS_SYSTEM("010"),

    /**
     * Antischlupfregelung (ASR)
     * 
     */
    @XmlEnumValue("011")
    ANTISCHLUPFREGELUNG("011"),

    /**
     * Rückfahrkamera
     * 
     */
    @XmlEnumValue("012")
    RUECKFAHRKAMERA("012");
    private final String value;

    STFahrerassistenzsystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFahrerassistenzsystem fromValue(String v) {
        for (STFahrerassistenzsystem c: STFahrerassistenzsystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
