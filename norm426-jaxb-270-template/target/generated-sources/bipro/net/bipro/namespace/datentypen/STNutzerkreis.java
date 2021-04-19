
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Nutzerkreis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Nutzerkreis"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Versicherungsnehmer"/&gt;
 *     &lt;enumeration value="Partner"/&gt;
 *     &lt;enumeration value="beliebig"/&gt;
 *     &lt;enumeration value="Familienfahrer"/&gt;
 *     &lt;enumeration value="Sohn"/&gt;
 *     &lt;enumeration value="Tochter"/&gt;
 *     &lt;enumeration value="unbekannt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Nutzerkreis")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STNutzerkreis {

    @XmlEnumValue("Versicherungsnehmer")
    VERSICHERUNGSNEHMER("Versicherungsnehmer"),

    /**
     * Ehe- / Lebenspartner
     * 
     */
    @XmlEnumValue("Partner")
    PARTNER("Partner"),

    /**
     * undefinierter Nutzerkreis
     * 
     */
    @XmlEnumValue("beliebig")
    BELIEBIG("beliebig"),
    @XmlEnumValue("Familienfahrer")
    FAMILIENFAHRER("Familienfahrer"),
    @XmlEnumValue("Sohn")
    SOHN("Sohn"),
    @XmlEnumValue("Tochter")
    TOCHTER("Tochter"),

    /**
     * sonstige
     * 
     */
    @XmlEnumValue("unbekannt")
    UNBEKANNT("unbekannt");
    private final String value;

    STNutzerkreis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STNutzerkreis fromValue(String v) {
        for (STNutzerkreis c: STNutzerkreis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
