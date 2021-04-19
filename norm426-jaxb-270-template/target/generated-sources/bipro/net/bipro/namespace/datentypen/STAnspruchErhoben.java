
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_AnspruchErhoben.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_AnspruchErhoben"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="0"/&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_AnspruchErhoben")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STAnspruchErhoben {


    /**
     * nein
     * 
     */
    @XmlEnumValue("0")
    NEIN("0"),

    /**
     * ja, mündlich
     * 
     */
    @XmlEnumValue("1")
    JA_MUENDLICH("1"),

    /**
     * ja, schriftlich
     * 
     */
    @XmlEnumValue("2")
    JA_SCHRIFTLICH("2");
    private final String value;

    STAnspruchErhoben(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STAnspruchErhoben fromValue(String v) {
        for (STAnspruchErhoben c: STAnspruchErhoben.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
