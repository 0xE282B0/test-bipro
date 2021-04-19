
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Incoterms.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Incoterms"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Incoterms")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STIncoterms {


    /**
     * Ex Works / Ab Werk
     * 
     */
    EXW,

    /**
     * Free Carrier / Frei Frachtführer
     * 
     */
    FCA,

    /**
     * Carriage Paid To / Frachtfrei
     * 
     */
    CPT,

    /**
     *  Carriage and Insurance Paid to / Frachtfrei versichert
     * 
     */
    CIP,

    /**
     * Delivered At Terminal / Geliefert Terminal
     * 
     */
    DAT,

    /**
     * Delivered At Place / Geliefert benannter Ort
     * 
     */
    DAP,

    /**
     * Delivered Duty Paid / Geliefert verzollt
     * 
     */
    DDP,

    /**
     * Free Alongside Ship / Frei Längsseite Schiff
     * 
     */
    FAS,

    /**
     *  Free On Board / Frei an Bord
     * 
     */
    FOB,

    /**
     * Cost and Freight / Kosten und Fracht
     * 
     */
    CFR,

    /**
     * Cost, Insurance and Freight / Kosten, Versicherung und Fracht
     * 
     */
    CIF;

    public String value() {
        return name();
    }

    public static STIncoterms fromValue(String v) {
        return valueOf(v);
    }

}
