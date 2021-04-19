
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Gebaeudeoeffnung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Gebaeudeoeffnung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Gebaeudeoeffnung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STGebaeudeoeffnung {


    /**
     * Gebäudeschädigung
     * 
     */
    @XmlEnumValue("1")
    GEBAEUDESCHAEDIGUNG("1"),

    /**
     * gekipptes Fenster
     * 
     */
    @XmlEnumValue("2")
    GEKIPPTES_FENSTER("2"),

    /**
     * offenes Fenster
     * 
     */
    @XmlEnumValue("3")
    OFFENES_FENSTER("3"),

    /**
     * gekippte Tür
     * 
     */
    @XmlEnumValue("4")
    GEKIPPTE_TUER("4"),

    /**
     * offene Tür
     * 
     */
    @XmlEnumValue("5")
    OFFENE_TUER("5");
    private final String value;

    STGebaeudeoeffnung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGebaeudeoeffnung fromValue(String v) {
        for (STGebaeudeoeffnung c: STGebaeudeoeffnung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
