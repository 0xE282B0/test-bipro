
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Versandart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Versandart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="003"/&gt;
 *     &lt;enumeration value="004"/&gt;
 *     &lt;enumeration value="010"/&gt;
 *     &lt;enumeration value="011"/&gt;
 *     &lt;enumeration value="999"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Versandart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVersandart {


    /**
     * Brief
     * 
     */
    @XmlEnumValue("001")
    BRIEF("001"),

    /**
     * Telefax
     * 
     */
    @XmlEnumValue("002")
    TELEFAX("002"),

    /**
     * E-Mail
     * 
     */
    @XmlEnumValue("003")
    E_MAIL("003"),

    /**
     * SMS
     * 
     */
    @XmlEnumValue("004")
    SMS("004"),

    /**
     * Download
     * 
     */
    @XmlEnumValue("010")
    DOWNLOAD("010"),

    /**
     * Datensatz
     * 
     */
    @XmlEnumValue("011")
    DATENSATZ("011"),

    /**
     * kein Versand (Dokument im Response erwartet bzw. geliefert)
     * 
     */
    @XmlEnumValue("999")
    KEIN_VERSAND("999");
    private final String value;

    STVersandart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVersandart fromValue(String v) {
        for (STVersandart c: STVersandart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
