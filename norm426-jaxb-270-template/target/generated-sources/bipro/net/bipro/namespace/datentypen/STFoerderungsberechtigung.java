
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Foerderungsberechtigung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Foerderungsberechtigung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="selbst"/&gt;
 *     &lt;enumeration value="partner"/&gt;
 *     &lt;enumeration value="keine"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Foerderungsberechtigung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFoerderungsberechtigung {


    /**
     * Antragsteller ist selbst foerderungsberechtigt
     * 
     */
    @XmlEnumValue("selbst")
    SELBST("selbst"),

    /**
     * Antragsteller ist ueber Ehepartner foerderungsberechtigt
     * 
     */
    @XmlEnumValue("partner")
    PARTNER("partner"),

    /**
     * Antragsteller ist nicht foerderungsberechtigt
     * 
     */
    @XmlEnumValue("keine")
    KEINE("keine");
    private final String value;

    STFoerderungsberechtigung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFoerderungsberechtigung fromValue(String v) {
        for (STFoerderungsberechtigung c: STFoerderungsberechtigung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
