
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Durchfuehrungsweg.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Durchfuehrungsweg"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Direktversicherung"/&gt;
 *     &lt;enumeration value="Pensionsfonds"/&gt;
 *     &lt;enumeration value="Pensionskasse"/&gt;
 *     &lt;enumeration value="Pensionszusage"/&gt;
 *     &lt;enumeration value="PrivateRiesterversicherung"/&gt;
 *     &lt;enumeration value="Unterstuetzungskasse"/&gt;
 *     &lt;enumeration value="Privat"/&gt;
 *     &lt;enumeration value="Riesterdirektversicherung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Durchfuehrungsweg")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STDurchfuehrungsweg {

    @XmlEnumValue("Direktversicherung")
    DIREKTVERSICHERUNG("Direktversicherung"),
    @XmlEnumValue("Pensionsfonds")
    PENSIONSFONDS("Pensionsfonds"),
    @XmlEnumValue("Pensionskasse")
    PENSIONSKASSE("Pensionskasse"),
    @XmlEnumValue("Pensionszusage")
    PENSIONSZUSAGE("Pensionszusage"),
    @XmlEnumValue("PrivateRiesterversicherung")
    PRIVATE_RIESTERVERSICHERUNG("PrivateRiesterversicherung"),
    @XmlEnumValue("Unterstuetzungskasse")
    UNTERSTUETZUNGSKASSE("Unterstuetzungskasse"),
    @XmlEnumValue("Privat")
    PRIVAT("Privat"),
    @XmlEnumValue("Riesterdirektversicherung")
    RIESTERDIREKTVERSICHERUNG("Riesterdirektversicherung");
    private final String value;

    STDurchfuehrungsweg(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDurchfuehrungsweg fromValue(String v) {
        for (STDurchfuehrungsweg c: STDurchfuehrungsweg.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
