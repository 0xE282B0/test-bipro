
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Zulagenberechtigungsart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Zulagenberechtigungsart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mittelbar"/&gt;
 *     &lt;enumeration value="unmittelbar"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Zulagenberechtigungsart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STZulagenberechtigungsart {


    /**
     * mittelbar zulagenberechtigt
     * 
     */
    @XmlEnumValue("mittelbar")
    MITTELBAR("mittelbar"),

    /**
     * unmittelbar zulagenberechtigt
     * 
     */
    @XmlEnumValue("unmittelbar")
    UNMITTELBAR("unmittelbar");
    private final String value;

    STZulagenberechtigungsart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STZulagenberechtigungsart fromValue(String v) {
        for (STZulagenberechtigungsart c: STZulagenberechtigungsart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
