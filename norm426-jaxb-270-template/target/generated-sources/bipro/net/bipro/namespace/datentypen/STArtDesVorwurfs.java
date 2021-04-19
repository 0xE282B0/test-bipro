
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtDesVorwurfs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtDesVorwurfs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtDesVorwurfs")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtDesVorwurfs {


    /**
     * Vergehen
     * 
     */
    @XmlEnumValue("1")
    VERGEHEN("1"),

    /**
     * Verbrechen
     * 
     */
    @XmlEnumValue("2")
    VERBRECHEN("2"),

    /**
     * Sonstiges
     * 
     */
    @XmlEnumValue("9")
    SONSTIGES("9");
    private final String value;

    STArtDesVorwurfs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtDesVorwurfs fromValue(String v) {
        for (STArtDesVorwurfs c: STArtDesVorwurfs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
