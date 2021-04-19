
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_AnderweitigerVersicherungsschutz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_AnderweitigerVersicherungsschutz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_AnderweitigerVersicherungsschutz")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAnderweitigerVersicherungsschutz {


    /**
     * Es besteht kein anderweitiger Versicherungsschutz
     * 
     */
    @XmlEnumValue("1")
    ANDERWEITIGER_VERSICHERUNGSSCHUTZ("1"),

    /**
     * Es besteht ein anderweitiger Versicherungsschutz
     * 
     */
    @XmlEnumValue("2")
    KEIN_ANDERWEITIGER_VERSICHERUNGSSCHUTZ("2"),

    /**
     * Es besteht ein anderweitiger Versicherungsschutz durch den Versicherungsnehmer
     * 
     */
    @XmlEnumValue("3")
    ANDERWEITIGER_VERSICHERUNGSSCHUTZ_VERSICHERUNGSNEHMER("3"),

    /**
     * Es besteht ein anderweitiger Versicherungsschutz durch den Eigentümer
     * 
     */
    @XmlEnumValue("4")
    ANDERWEITIGER_VERSICHERUNGSSCHUTZ_EIGENTUEMER("4"),

    /**
     * Es besteht ein anderweitiger Versicherungsschutz durch den Vermieter
     * 
     */
    @XmlEnumValue("5")
    ANDERWEITIGER_VERSICHERUNGSSCHUTZ_VERMIETER("5");
    private final String value;

    STAnderweitigerVersicherungsschutz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAnderweitigerVersicherungsschutz fromValue(String v) {
        for (STAnderweitigerVersicherungsschutz c: STAnderweitigerVersicherungsschutz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
