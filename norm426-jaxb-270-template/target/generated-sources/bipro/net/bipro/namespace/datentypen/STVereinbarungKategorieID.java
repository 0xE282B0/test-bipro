
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_VereinbarungKategorieID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_VereinbarungKategorieID"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bonus"/&gt;
 *     &lt;enumeration value="Gebuehr"/&gt;
 *     &lt;enumeration value="Zins"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_VereinbarungKategorieID")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVereinbarungKategorieID {

    @XmlEnumValue("Bonus")
    BONUS("Bonus"),
    @XmlEnumValue("Gebuehr")
    GEBUEHR("Gebuehr"),
    @XmlEnumValue("Zins")
    ZINS("Zins");
    private final String value;

    STVereinbarungKategorieID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVereinbarungKategorieID fromValue(String v) {
        for (STVereinbarungKategorieID c: STVereinbarungKategorieID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
