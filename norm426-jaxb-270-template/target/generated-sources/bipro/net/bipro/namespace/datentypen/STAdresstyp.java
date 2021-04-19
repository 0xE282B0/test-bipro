
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Adresstyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Adresstyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="geschaeftlich"/&gt;
 *     &lt;enumeration value="privat"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Adresstyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STAdresstyp {


    /**
     *  Bei der Adresse handelt es sich um eine geschaeftliche Adresse
     * 
     */
    @XmlEnumValue("geschaeftlich")
    GESCHAEFTLICH("geschaeftlich"),

    /**
     * Bei der Adresse handelt es sich um eine private Adresse
     * 
     */
    @XmlEnumValue("privat")
    PRIVAT("privat");
    private final String value;

    STAdresstyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAdresstyp fromValue(String v) {
        for (STAdresstyp c: STAdresstyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
