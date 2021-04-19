
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_AusloeserDesGeschaeftsvorfalls.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_AusloeserDesGeschaeftsvorfalls"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="001"/&gt;
 *     &lt;enumeration value="002"/&gt;
 *     &lt;enumeration value="003"/&gt;
 *     &lt;enumeration value="004"/&gt;
 *     &lt;enumeration value="005"/&gt;
 *     &lt;enumeration value="006"/&gt;
 *     &lt;enumeration value="007"/&gt;
 *     &lt;enumeration value="008"/&gt;
 *     &lt;enumeration value="009"/&gt;
 *     &lt;enumeration value="010"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_AusloeserDesGeschaeftsvorfalls")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAusloeserDesGeschaeftsvorfalls {


    /**
     * Unternehmen
     * 
     */
    @XmlEnumValue("001")
    UNTERNEHMEN("001"),

    /**
     * Vertragspartner
     * 
     */
    @XmlEnumValue("002")
    VERTRAGSPARTNER("002"),

    /**
     * Versicherte Person
     * 
     */
    @XmlEnumValue("003")
    VERSICHERTE_PERSON("003"),

    /**
     * Vermittler
     * 
     */
    @XmlEnumValue("004")
    VERMITTLER("004"),

    /**
     * Beitragszahler
     * 
     */
    @XmlEnumValue("005")
    BEITRAGSZAHLER("005"),

    /**
     * Gläubiger
     * 
     */
    @XmlEnumValue("006")
    GLAEUBIGER("006"),

    /**
     * wirtschaftlich Berechtigter
     * 
     */
    @XmlEnumValue("007")
    WIRTSCHAFTLICH_BERECHTIGTER("007"),

    /**
     * Postempfänger
     * 
     */
    @XmlEnumValue("008")
    POSTEMPFAENGER("008"),

    /**
     * Bezugsberechtigter
     * 
     */
    @XmlEnumValue("009")
    BEZUGSBERECHTIGTER("009"),

    /**
     * Leistungsempfänger
     * 
     */
    @XmlEnumValue("010")
    LEISTUNGSEMPFAENGER("010");
    private final String value;

    STAusloeserDesGeschaeftsvorfalls(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAusloeserDesGeschaeftsvorfalls fromValue(String v) {
        for (STAusloeserDesGeschaeftsvorfalls c: STAusloeserDesGeschaeftsvorfalls.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
