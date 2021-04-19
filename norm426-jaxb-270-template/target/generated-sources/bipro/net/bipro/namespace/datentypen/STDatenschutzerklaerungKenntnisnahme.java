
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_DatenschutzerklaerungKenntnisnahme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_DatenschutzerklaerungKenntnisnahme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aushaendigung"/&gt;
 *     &lt;enumeration value="Einsicht"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_DatenschutzerklaerungKenntnisnahme")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STDatenschutzerklaerungKenntnisnahme {

    @XmlEnumValue("Aushaendigung")
    AUSHAENDIGUNG("Aushaendigung"),
    @XmlEnumValue("Einsicht")
    EINSICHT("Einsicht");
    private final String value;

    STDatenschutzerklaerungKenntnisnahme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDatenschutzerklaerungKenntnisnahme fromValue(String v) {
        for (STDatenschutzerklaerungKenntnisnahme c: STDatenschutzerklaerungKenntnisnahme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
