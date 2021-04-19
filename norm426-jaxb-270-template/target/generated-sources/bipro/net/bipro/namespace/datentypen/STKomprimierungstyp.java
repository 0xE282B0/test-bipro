
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Komprimierungstyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Komprimierungstyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZIP"/&gt;
 *     &lt;enumeration value="KEINE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Komprimierungstyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STKomprimierungstyp {


    /**
     * ZIP
     * 
     */
    ZIP,

    /**
     * Keine Komprimierung
     * 
     */
    KEINE;

    public String value() {
        return name();
    }

    public static STKomprimierungstyp fromValue(String v) {
        return valueOf(v);
    }

}
