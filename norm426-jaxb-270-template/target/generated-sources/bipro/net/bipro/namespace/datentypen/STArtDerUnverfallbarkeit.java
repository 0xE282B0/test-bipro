
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtDerUnverfallbarkeit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtDerUnverfallbarkeit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gesetzlich"/&gt;
 *     &lt;enumeration value="vertraglich"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtDerUnverfallbarkeit")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtDerUnverfallbarkeit {


    /**
     * Gesetzliche Unverfallbarkeit.
     * 
     */
    @XmlEnumValue("gesetzlich")
    GESETZLICH("gesetzlich"),

    /**
     * Vertragliche Unverfallbarkeit.
     * 
     */
    @XmlEnumValue("vertraglich")
    VERTRAGLICH("vertraglich");
    private final String value;

    STArtDerUnverfallbarkeit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STArtDerUnverfallbarkeit fromValue(String v) {
        for (STArtDerUnverfallbarkeit c: STArtDerUnverfallbarkeit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}