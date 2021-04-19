
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_GesamtrisikoIndikator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_GesamtrisikoIndikator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="05"/&gt;
 *     &lt;enumeration value="06"/&gt;
 *     &lt;enumeration value="07"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_GesamtrisikoIndikator")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STGesamtrisikoIndikator {


    /**
     * GesamtrisikoIndikator 1 (geringes Risiko)
     * 
     */
    @XmlEnumValue("01")
    GESAMTRISIKOINDIKATOR_1("01"),

    /**
     * GesamtrisikoIndikator 2
     * 
     */
    @XmlEnumValue("02")
    GESAMTRISIKOINDIKATOR_2("02"),

    /**
     * GesamtrisikoIndikator 3
     * 
     */
    @XmlEnumValue("03")
    GESAMTRISIKOINDIKATOR_3("03"),

    /**
     * GesamtrisikoIndikator 4
     * 
     */
    @XmlEnumValue("04")
    GESAMTRISIKOINDIKATOR_4("04"),

    /**
     * GesamtrisikoIndikator 5
     * 
     */
    @XmlEnumValue("05")
    GESAMTRISIKOINDIKATOR_5("05"),

    /**
     * GesamtrisikoIndikator 6
     * 
     */
    @XmlEnumValue("06")
    GESAMTRISIKOINDIKATOR_6("06"),

    /**
     * GesamtrisikoIndikator 7 (hohes Risiko)
     * 
     */
    @XmlEnumValue("07")
    GESAMTRISIKOINDIKATOR_7("07");
    private final String value;

    STGesamtrisikoIndikator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGesamtrisikoIndikator fromValue(String v) {
        for (STGesamtrisikoIndikator c: STGesamtrisikoIndikator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
