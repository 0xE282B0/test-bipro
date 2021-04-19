
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Lastschriftart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Lastschriftart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Basislastschrift"/&gt;
 *     &lt;enumeration value="Firmenlastschrift"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Lastschriftart")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STLastschriftart {


    /**
     * Alle SEPA-Lastschriften, sofern es sich nicht um eine Firmenlastschrift handelt.
     * 
     */
    @XmlEnumValue("Basislastschrift")
    BASISLASTSCHRIFT("Basislastschrift"),

    /**
     * Die SEPA-Firmenlastschrift (SEPA Business to Business Direct Debit) ist auf den Zahlungsverkehr zwischen Unternehmen ausgelegt. Dementsprechend darf es sich beim Debitor nicht um einen privaten Endkunden handeln, sondern ausschließlich um einen Geschäfts- oder Firmenkunden. Nach der Einlösung der SEPA-Firmenlastschrift ist keine Rückbuchung durch den Zahlungspflichtigen mehr möglich.
     * 
     */
    @XmlEnumValue("Firmenlastschrift")
    FIRMENLASTSCHRIFT("Firmenlastschrift");
    private final String value;

    STLastschriftart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STLastschriftart fromValue(String v) {
        for (STLastschriftart c: STLastschriftart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
