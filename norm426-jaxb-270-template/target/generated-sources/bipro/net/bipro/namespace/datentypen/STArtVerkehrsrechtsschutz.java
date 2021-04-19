
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtVerkehrsrechtsschutz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtVerkehrsrechtsschutz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fahrer"/&gt;
 *     &lt;enumeration value="Fahrzeug"/&gt;
 *     &lt;enumeration value="Verkehr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtVerkehrsrechtsschutz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STArtVerkehrsrechtsschutz {

    @XmlEnumValue("Fahrer")
    FAHRER("Fahrer"),
    @XmlEnumValue("Fahrzeug")
    FAHRZEUG("Fahrzeug"),
    @XmlEnumValue("Verkehr")
    VERKEHR("Verkehr");
    private final String value;

    STArtVerkehrsrechtsschutz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtVerkehrsrechtsschutz fromValue(String v) {
        for (STArtVerkehrsrechtsschutz c: STArtVerkehrsrechtsschutz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
