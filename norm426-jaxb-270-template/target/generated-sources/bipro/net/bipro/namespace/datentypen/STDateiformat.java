
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Dateiformat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Dateiformat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pdf"/&gt;
 *     &lt;enumeration value="xml"/&gt;
 *     &lt;enumeration value="doc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Dateiformat")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STDateiformat {


    /**
     * pdf
     * 
     */
    @XmlEnumValue("pdf")
    PDF("pdf"),

    /**
     * xml
     * 
     */
    @XmlEnumValue("xml")
    XML("xml"),

    /**
     * doc
     * 
     */
    @XmlEnumValue("doc")
    DOC("doc");
    private final String value;

    STDateiformat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDateiformat fromValue(String v) {
        for (STDateiformat c: STDateiformat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
