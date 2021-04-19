
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Kennzeichenart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Kennzeichenart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="RK"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="VR"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="ZS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Kennzeichenart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STKennzeichenart {


    /**
     * Ausfuhrkennzeichen
     * 
     */
    A,

    /**
     * Behoerdenkennzeichen
     * 
     */
    B,

    /**
     * behoerdliches Saisonkennzeichen
     * 
     */
    BS,

    /**
     * Rotes Kennzeichen
     * 
     */
    R,

    /**
     * Kurzzeitkennzeichen
     * 
     */
    RK,

    /**
     * Versicherungskennzeichen
     * 
     */
    V,

    /**
     * Rotes Versicherungskennzeichen
     * 
     */
    VR,

    /**
     * Amtliches Kennzeichen
     * 
     */
    Z,

    /**
     * Amtliches Saisonkennzeichen
     * 
     */
    ZS;

    public String value() {
        return name();
    }

    public static STKennzeichenart fromValue(String v) {
        return valueOf(v);
    }

}
