
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Vertragsentstehung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Vertragsentstehung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="1"/&gt;
 *     &lt;enumeration value="2"/&gt;
 *     &lt;enumeration value="3"/&gt;
 *     &lt;enumeration value="4"/&gt;
 *     &lt;enumeration value="5"/&gt;
 *     &lt;enumeration value="6"/&gt;
 *     &lt;enumeration value="7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Vertragsentstehung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STVertragsentstehung {


    /**
     * Neuantrag
     * 
     */
    @XmlEnumValue("1")
    NEUANTRAG("1"),

    /**
     * Zuwachsgarantie
     * 
     */
    @XmlEnumValue("2")
    ZUWACHSGARANTIE("2"),

    /**
     * Abtrennung Gruppenversicherung
     * 
     */
    @XmlEnumValue("3")
    ABTRENNUNG_GRUPPENVERSICHERUNG("3"),

    /**
     * Umtausch Risiko
     * 
     */
    @XmlEnumValue("4")
    UMTAUSCH_RISIKO("4"),

    /**
     * Übernahme von anderer Gesellschaft
     * 
     */
    @XmlEnumValue("5")
    UEBERNAHME_ANDERER_GESELLSCHAFT("5"),

    /**
     * Nachträglicher Einschluss
     * 
     */
    @XmlEnumValue("6")
    NACHTRAEGLICHER_EINSCHLUSS("6"),

    /**
     * Änderungen bzw. Anpassungen des alten Vertrags führen zu einem neuen Vertrag (gehört zur neuen Ausprägung 43 von ST_Abgangsgrund)
     * 
     */
    @XmlEnumValue("7")
    AENDERUNG_DES_ALTEN_VERTRAGS("7");
    private final String value;

    STVertragsentstehung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STVertragsentstehung fromValue(String v) {
        for (STVertragsentstehung c: STVertragsentstehung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
