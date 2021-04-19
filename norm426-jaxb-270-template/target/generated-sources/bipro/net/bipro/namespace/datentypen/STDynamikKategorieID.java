
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_DynamikKategorieID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_DynamikKategorieID"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Beitrag"/&gt;
 *     &lt;enumeration value="Leistung"/&gt;
 *     &lt;enumeration value="BeitragUndLeistung"/&gt;
 *     &lt;enumeration value="Einzahlungen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_DynamikKategorieID")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STDynamikKategorieID {


    /**
     * <<Beitragsdynamik>>
     * Hierbei wird die Dynamik auf den Beitrag gerechnet
     * 
     */
    @XmlEnumValue("Beitrag")
    BEITRAG("Beitrag"),

    /**
     * <<Leistungsdynamik>>
     * Hierbei wird die Dynamik auf die Leistung (z.B. Versicherungssumme) gerechnet.
     * 
     */
    @XmlEnumValue("Leistung")
    LEISTUNG("Leistung"),

    /**
     * <<Beitrags- und Leistungsdynamik>>
     * Regelmaessige Erhoehung der Beitraege bei gleichzeitiger Erhoehung der Leistungen im gleichen Umfang.
     * 
     */
    @XmlEnumValue("BeitragUndLeistung")
    BEITRAG_UND_LEISTUNG("BeitragUndLeistung"),

    /**
     * Regelmäßige Anpassung (Erhöhung, Verminderung) der Einzahlungen.
     * 
     */
    @XmlEnumValue("Einzahlungen")
    EINZAHLUNGEN("Einzahlungen");
    private final String value;

    STDynamikKategorieID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDynamikKategorieID fromValue(String v) {
        for (STDynamikKategorieID c: STDynamikKategorieID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
