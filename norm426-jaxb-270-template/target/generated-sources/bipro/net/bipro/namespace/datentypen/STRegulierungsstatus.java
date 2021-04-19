
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Regulierungsstatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Regulierungsstatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Regulierungsstatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STRegulierungsstatus {


    /**
     * Regulierung gewünscht.
     * 
     */
    @XmlEnumValue("1")
    REGULIERUNG_GEWUENSCHT("1"),

    /**
     * Regulierung erfolgt.
     * 
     */
    @XmlEnumValue("2")
    REGULIERUNG_ERFOLGT("2");
    private final String value;

    STRegulierungsstatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STRegulierungsstatus fromValue(String v) {
        for (STRegulierungsstatus c: STRegulierungsstatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
