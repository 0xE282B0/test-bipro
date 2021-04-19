
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_VorfahrzeugVersichertFuer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VorfahrzeugVersichertFuer"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Antragsteller"/&gt;
 *     &lt;enumeration value="Ehegatte"/&gt;
 *     &lt;enumeration value="Eltern"/&gt;
 *     &lt;enumeration value="Sonstiger"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_VorfahrzeugVersichertFuer")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STVorfahrzeugVersichertFuer {

    @XmlEnumValue("Antragsteller")
    ANTRAGSTELLER("Antragsteller"),
    @XmlEnumValue("Ehegatte")
    EHEGATTE("Ehegatte"),
    @XmlEnumValue("Eltern")
    ELTERN("Eltern"),
    @XmlEnumValue("Sonstiger")
    SONSTIGER("Sonstiger");
    private final String value;

    STVorfahrzeugVersichertFuer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVorfahrzeugVersichertFuer fromValue(String v) {
        for (STVorfahrzeugVersichertFuer c: STVorfahrzeugVersichertFuer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
