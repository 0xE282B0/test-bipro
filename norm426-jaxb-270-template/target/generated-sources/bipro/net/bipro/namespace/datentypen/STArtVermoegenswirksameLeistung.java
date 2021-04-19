
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ArtVermoegenswirksameLeistung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ArtVermoegenswirksameLeistung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVWL"/&gt;
 *     &lt;enumeration value="VWL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_ArtVermoegenswirksameLeistung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STArtVermoegenswirksameLeistung {


    /**
     * Altersvorsorgewirksame Leistung
     * 
     */
    AVWL,

    /**
     * Vermögenswirksame Leistung
     * 
     */
    VWL;

    public String value() {
        return name();
    }

    public static STArtVermoegenswirksameLeistung fromValue(String v) {
        return valueOf(v);
    }

}
