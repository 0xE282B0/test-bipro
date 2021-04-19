
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_MaterialLeitungswassernetz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_MaterialLeitungswassernetz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Blei"/&gt;
 *     &lt;enumeration value="Edelstahl"/&gt;
 *     &lt;enumeration value="Eisen"/&gt;
 *     &lt;enumeration value="Kunststoff"/&gt;
 *     &lt;enumeration value="Kupfer"/&gt;
 *     &lt;enumeration value="Tec"/&gt;
 *     &lt;enumeration value="Sonstiges"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_MaterialLeitungswassernetz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STMaterialLeitungswassernetz {

    @XmlEnumValue("Blei")
    BLEI("Blei"),
    @XmlEnumValue("Edelstahl")
    EDELSTAHL("Edelstahl"),
    @XmlEnumValue("Eisen")
    EISEN("Eisen"),
    @XmlEnumValue("Kunststoff")
    KUNSTSTOFF("Kunststoff"),
    @XmlEnumValue("Kupfer")
    KUPFER("Kupfer"),
    @XmlEnumValue("Tec")
    TEC("Tec"),
    @XmlEnumValue("Sonstiges")
    SONSTIGES("Sonstiges");
    private final String value;

    STMaterialLeitungswassernetz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STMaterialLeitungswassernetz fromValue(String v) {
        for (STMaterialLeitungswassernetz c: STMaterialLeitungswassernetz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
