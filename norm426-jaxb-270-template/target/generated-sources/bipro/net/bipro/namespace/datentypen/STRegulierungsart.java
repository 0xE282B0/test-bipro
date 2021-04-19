
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Regulierungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Regulierungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Regulierungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STRegulierungsart {


    /**
     * Versicherungsunternehmen
     * 
     */
    @XmlEnumValue("1")
    VERSICHERUNGSUNTERNEHMEN("1"),

    /**
     * Vermittler
     * 
     */
    @XmlEnumValue("2")
    VERMITTLER("2"),

    /**
     * bevollmächtigter Dienstleister
     * 
     */
    @XmlEnumValue("3")
    BEVOLLMAECHTIGTER_DIENSTLEISTER("3");
    private final String value;

    STRegulierungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRegulierungsart fromValue(String v) {
        for (STRegulierungsart c: STRegulierungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
