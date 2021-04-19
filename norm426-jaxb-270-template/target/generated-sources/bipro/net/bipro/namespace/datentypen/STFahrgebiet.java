
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Fahrgebiet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Fahrgebiet"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="00"/&gt;
 *     &lt;enumeration value="01"/&gt;
 *     &lt;enumeration value="02"/&gt;
 *     &lt;enumeration value="03"/&gt;
 *     &lt;enumeration value="04"/&gt;
 *     &lt;enumeration value="99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Fahrgebiet")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STFahrgebiet {


    /**
     * keine Angabe
     * 
     */
    @XmlEnumValue("00")
    KEINE_ANGABE("00"),

    /**
     * Inland, überwiegend bis 100 km Umkreis
     * 
     */
    @XmlEnumValue("01")
    INLAND_100KM("01"),

    /**
     * ausschließlich im Inland
     * 
     */
    @XmlEnumValue("02")
    AUSSCHLIESSLICH_INLAND("02"),

    /**
     * In- und Ausland
     * 
     */
    @XmlEnumValue("03")
    IN_AUSLAND("03"),

    /**
     * In- und Ausland innerhalb der EU
     * 
     */
    @XmlEnumValue("04")
    IN_AUSLAND_EU("04"),

    /**
     * unbekannt / sonstige
     * 
     */
    @XmlEnumValue("99")
    UNBEKANNT_SONSTIGE("99");
    private final String value;

    STFahrgebiet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STFahrgebiet fromValue(String v) {
        for (STFahrgebiet c: STFahrgebiet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
