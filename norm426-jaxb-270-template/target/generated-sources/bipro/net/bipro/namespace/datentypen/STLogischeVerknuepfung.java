
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_LogischeVerknuepfung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_LogischeVerknuepfung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UND"/&gt;
 *     &lt;enumeration value="ODER"/&gt;
 *     &lt;enumeration value="NICHT"/&gt;
 *     &lt;enumeration value="UND NICHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_LogischeVerknuepfung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLogischeVerknuepfung {

    UND("UND"),
    ODER("ODER"),
    NICHT("NICHT"),
    @XmlEnumValue("UND NICHT")
    UND_NICHT("UND NICHT");
    private final String value;

    STLogischeVerknuepfung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLogischeVerknuepfung fromValue(String v) {
        for (STLogischeVerknuepfung c: STLogischeVerknuepfung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
