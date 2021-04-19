
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Abschlussmodell.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Abschlussmodell"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Antragsmodell"/&gt;
 *     &lt;enumeration value="AntragsmodellMitStellvertreter"/&gt;
 *     &lt;enumeration value="Invitatiomodell"/&gt;
 *     &lt;enumeration value="InvitatiomodellMitStellvertreter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Abschlussmodell")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAbschlussmodell {


    /**
     * Der VN muss rechtzeitig vor Vertragsabschluss umfangreich über die vertraglichen Bestimmungen informiert werden. Es müssen alle relevanten Vertragsinformationen inkl. AVB, Produkt- und Verbraucherinformationen vorliegen.
     * 
     */
    @XmlEnumValue("Antragsmodell")
    ANTRAGSMODELL("Antragsmodell"),
    @XmlEnumValue("AntragsmodellMitStellvertreter")
    ANTRAGSMODELL_MIT_STELLVERTRETER("AntragsmodellMitStellvertreter"),

    /**
     * VN fordert VU zur Abgabe eines verbindlichen Angebotes inkl. der vertraglichen Bestimmungen auf. Ein Vertrag kommt erst mit Unterzeichnung des Angebotes zustande.
     * 
     */
    @XmlEnumValue("Invitatiomodell")
    INVITATIOMODELL("Invitatiomodell"),
    @XmlEnumValue("InvitatiomodellMitStellvertreter")
    INVITATIOMODELL_MIT_STELLVERTRETER("InvitatiomodellMitStellvertreter");
    private final String value;

    STAbschlussmodell(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAbschlussmodell fromValue(String v) {
        for (STAbschlussmodell c: STAbschlussmodell.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
