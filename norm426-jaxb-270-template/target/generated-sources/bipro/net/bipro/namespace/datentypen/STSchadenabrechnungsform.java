
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Schadenabrechnungsform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Schadenabrechnungsform"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Schadenabrechnungsform")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STSchadenabrechnungsform {


    /**
     * konkrete Schadenregulierung
     * 
     */
    @XmlEnumValue("1")
    KONKRETE_SCHADENSREGULIERUNG("1"),

    /**
     * fiktive Schadenregulierung
     * 
     */
    @XmlEnumValue("2")
    FIKTIVE_SCHADENSREGULIERUNG("2"),

    /**
     * Regulierung als Totalschaden
     * 
     */
    @XmlEnumValue("3")
    REGULIERUNG_ALS_TOTALSCHADEN("3");
    private final String value;

    STSchadenabrechnungsform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSchadenabrechnungsform fromValue(String v) {
        for (STSchadenabrechnungsform c: STSchadenabrechnungsform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
