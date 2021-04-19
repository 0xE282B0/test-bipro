
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gebaeudeeigentum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gebaeudeeigentum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gebaeudeeigentum")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGebaeudeeigentum {


    /**
     * Allein-Eigentum
     * 
     */
    @XmlEnumValue("01")
    ALLEIN_EIGENTUM("01"),

    /**
     * Teil-Eigentum
     * 
     */
    @XmlEnumValue("02")
    TEIL_EIGENTUM("02"),

    /**
     * Eigentumsgemeinschaft
     * 
     */
    @XmlEnumValue("03")
    EIGENTUMSGEMEINSCHAFT("03"),

    /**
     * Miete
     * 
     */
    @XmlEnumValue("04")
    MIETE("04"),

    /**
     * Nießbrauch
     * 
     */
    @XmlEnumValue("05")
    NIESSBRAUCH("05");
    private final String value;

    STGebaeudeeigentum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGebaeudeeigentum fromValue(String v) {
        for (STGebaeudeeigentum c: STGebaeudeeigentum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
