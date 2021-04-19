
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Sicherungseinrichtung.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Sicherungseinrichtung"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="00010"/&gt;
 *     &lt;enumeration value="00011"/&gt;
 *     &lt;enumeration value="00020"/&gt;
 *     &lt;enumeration value="00021"/&gt;
 *     &lt;enumeration value="00022"/&gt;
 *     &lt;enumeration value="00030"/&gt;
 *     &lt;enumeration value="00031"/&gt;
 *     &lt;enumeration value="00032"/&gt;
 *     &lt;enumeration value="00040"/&gt;
 *     &lt;enumeration value="00041"/&gt;
 *     &lt;enumeration value="00042"/&gt;
 *     &lt;enumeration value="00043"/&gt;
 *     &lt;enumeration value="00100"/&gt;
 *     &lt;enumeration value="00101"/&gt;
 *     &lt;enumeration value="00102"/&gt;
 *     &lt;enumeration value="00103"/&gt;
 *     &lt;enumeration value="00104"/&gt;
 *     &lt;enumeration value="00105"/&gt;
 *     &lt;enumeration value="00106"/&gt;
 *     &lt;enumeration value="00107"/&gt;
 *     &lt;enumeration value="00108"/&gt;
 *     &lt;enumeration value="99999"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Sicherungseinrichtung")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STSicherungseinrichtung {


    /**
     * Alarmanlage (Einbruchmeldeanlage)
     * 
     */
    @XmlEnumValue("00010")
    ALARMANLAGE("00010"),

    /**
     * Ueberfallmeldeanlage
     * 
     */
    @XmlEnumValue("00011")
    UEBERFALLMELDEANLAGE("00011"),

    /**
     * Brandschutzmeldeanlage
     * 
     */
    @XmlEnumValue("00020")
    BRANDSCHUTZMELDEANLAGE("00020"),

    /**
     * Rauchmeldeanlage
     * 
     */
    @XmlEnumValue("00021")
    RAUCHMELDEANLAGE("00021"),

    /**
     * Feuerloeschanlage
     * 
     */
    @XmlEnumValue("00022")
    FEUERLOESCHANLAGE("00022"),

    /**
     * Fenster
     * 
     */
    @XmlEnumValue("00030")
    FENSTER("00030"),

    /**
     * Fenster gegen Aufhebeln geschützt
     * 
     */
    @XmlEnumValue("00031")
    FENSTER_GEGEN_AUSHEBELN_GESCHUETZT("00031"),

    /**
     * Lichtschächte und Kellerfenster geschützt
     * 
     */
    @XmlEnumValue("00032")
    LICHTSCHAECHTE_KELLERFENSTER_GESCHUETZT("00032"),

    /**
     * Tueren
     * 
     */
    @XmlEnumValue("00040")
    TUEREN("00040"),

    /**
     * Tore
     * 
     */
    @XmlEnumValue("00041")
    TORE("00041"),

    /**
     * Zyinderschloss außen nicht überstehend und mit mind. 5 Zuhaltungen
     * 
     */
    @XmlEnumValue("00042")
    ZYLINDERSCHLOSS("00042"),

    /**
     * Türen gegen Aufhebeln geschützt
     * 
     */
    @XmlEnumValue("00043")
    TUEREN_GEGEN_AUFHEBELN_GESCHUETZT("00043"),

    /**
     * Brandmeldeanlagen mit erhöhten Anforderungen
     * 
     */
    @XmlEnumValue("00100")
    BRANDMELDEANLAGE_ERHOEHTE_ANFORDERUNGEN("00100"),

    /**
     * Wasserlösch-, Sprinkleranlagen
     * 
     */
    @XmlEnumValue("00101")
    WASSERLOESCH_SPRINKLERANLAGE("00101"),

    /**
     * Sprühwasser-Löschanlagen
     * 
     */
    @XmlEnumValue("00102")
    SPRUEHWASSER_LOESCHANLAGE("00102"),

    /**
     * Löschanlagen mit gasförmigen Löschmitteln
     * 
     */
    @XmlEnumValue("00103")
    LOESCHANLAGE_GASFOERMIGE_LOESCHMITTEL("00103"),

    /**
     * Schaum-Löschanlagen
     * 
     */
    @XmlEnumValue("00104")
    SCHAUM_LOESCHANLAGEN("00104"),

    /**
     * Pulver-Löschanlagen
     * 
     */
    @XmlEnumValue("00105")
    PULVER_LOESCHANLAGEN("00105"),

    /**
     * Rauch- und Wärmeabzugsanlagen
     * 
     */
    @XmlEnumValue("00106")
    RAUCH_WAERMEABZUGSANLAGEN("00106"),

    /**
     * Funkenerkennungs-, Funkenausscheidungs- und Funkenlöschanlagen
     * 
     */
    @XmlEnumValue("00107")
    FUNKENERKENNUNGS_FUNKENAUSSCHEIDUNGS_FUNKENLOESCHANLAGEN("00107"),

    /**
     * Werkfeuerwehr
     * 
     */
    @XmlEnumValue("00108")
    WERKFEUERWEHR("00108"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("99999")
    SONSTIGE("99999");
    private final String value;

    STSicherungseinrichtung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STSicherungseinrichtung fromValue(String v) {
        for (STSicherungseinrichtung c: STSicherungseinrichtung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
