
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_WagniskennzifferSpezifizierung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_WagniskennzifferSpezifizierung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="542001"/&gt;
 *     &lt;enumeration value="542002"/&gt;
 *     &lt;enumeration value="561001"/&gt;
 *     &lt;enumeration value="651001"/&gt;
 *     &lt;enumeration value="651002"/&gt;
 *     &lt;enumeration value="705001"/&gt;
 *     &lt;enumeration value="705002"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_WagniskennzifferSpezifizierung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STWagniskennzifferSpezifizierung {


    /**
     * Straßenreinigungsanhänger
     * 
     */
    @XmlEnumValue("542001")
    STRASSENREINIGUNGSANHAENGER("542001"),

    /**
     * Streudienstanhänger
     * 
     */
    @XmlEnumValue("542002")
    STREUDIENSTANHAENGER("542002"),

    /**
     * Katastrophenschutzanhänger
     * 
     */
    @XmlEnumValue("561001")
    KATASTROPHENSCHUTZANHAENGER("561001"),

    /**
     * Bus im Linienverkehr
     * 
     */
    @XmlEnumValue("651001")
    BUS_LINIENVERKEHR("651001"),

    /**
     * Bus im Fernlinienverkehr
     * 
     */
    @XmlEnumValue("651002")
    BUS_FERNLINIENVERKEHR("651002"),

    /**
     * Müllwagen
     * 
     */
    @XmlEnumValue("705001")
    MUELLWAGEN("705001"),

    /**
     * Fäkalienabfuhrwagen
     * 
     */
    @XmlEnumValue("705002")
    FAEKALIENABFUHRWAGEN("705002");
    private final String value;

    STWagniskennzifferSpezifizierung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWagniskennzifferSpezifizierung fromValue(String v) {
        for (STWagniskennzifferSpezifizierung c: STWagniskennzifferSpezifizierung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
