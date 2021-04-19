
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_InvestmentTransaktionsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_InvestmentTransaktionsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Kauf"/&gt;
 *     &lt;enumeration value="Verkauf"/&gt;
 *     &lt;enumeration value="Einlieferung"/&gt;
 *     &lt;enumeration value="Auslieferung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_InvestmentTransaktionsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STInvestmentTransaktionsart {


    /**
     * Kauf eines Investments
     * 
     */
    @XmlEnumValue("Kauf")
    KAUF("Kauf"),

    /**
     * Verkauf eines Investments
     * 
     */
    @XmlEnumValue("Verkauf")
    VERKAUF("Verkauf"),

    /**
     * Einlieferung eines Investments in ein Depot
     * 
     */
    @XmlEnumValue("Einlieferung")
    EINLIEFERUNG("Einlieferung"),

    /**
     * Auslieferung eines Investments aus einem Depot
     * 
     */
    @XmlEnumValue("Auslieferung")
    AUSLIEFERUNG("Auslieferung");
    private final String value;

    STInvestmentTransaktionsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STInvestmentTransaktionsart fromValue(String v) {
        for (STInvestmentTransaktionsart c: STInvestmentTransaktionsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
