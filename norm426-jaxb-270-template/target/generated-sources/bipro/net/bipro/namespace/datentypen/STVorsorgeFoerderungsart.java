
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_VorsorgeFoerderungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VorsorgeFoerderungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Keine"/&gt;
 *     &lt;enumeration value="BasisRente"/&gt;
 *     &lt;enumeration value="PauschalversteuerteBAV"/&gt;
 *     &lt;enumeration value="Riester"/&gt;
 *     &lt;enumeration value="SteuerfreieBAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_VorsorgeFoerderungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVorsorgeFoerderungsart {

    @XmlEnumValue("Keine")
    KEINE("Keine"),
    @XmlEnumValue("BasisRente")
    BASIS_RENTE("BasisRente"),
    @XmlEnumValue("PauschalversteuerteBAV")
    PAUSCHALVERSTEUERTE_BAV("PauschalversteuerteBAV"),
    @XmlEnumValue("Riester")
    RIESTER("Riester"),
    @XmlEnumValue("SteuerfreieBAV")
    STEUERFREIE_BAV("SteuerfreieBAV");
    private final String value;

    STVorsorgeFoerderungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVorsorgeFoerderungsart fromValue(String v) {
        for (STVorsorgeFoerderungsart c: STVorsorgeFoerderungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
