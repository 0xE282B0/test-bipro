
package net.bipro.namespace.partner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTPartnernummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STAnredeschluessel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Basis-Objekt fuer Partnerdaten, das die Gemeinsamkeiten von natuerlichen und juristischen Personen abbildet. Unterklassen duerfen nicht projektspezifisch abgeleitet werden um die Kombination der Ergebnisse verschiedener Projekte der BiPRO innerhalb eines Services und insbesondere die spartenuebergreifende Produktbuendelung in Tarifierungsprojekten nicht zu gefaehrden. Fuer solche Erweiterungen steht - falls notwendig - der Datentyp ZusaetzlichePartnerdaten zur Verfuegung.
 * 
 * Partner werden in einer Liste unterhalb des Wurzelelements (i.d.R. abgeleitet von Geschaeftsvorgang) jeder Nachricht uebertragen. Die Referenzierung aus dem jeweiligen lokalen Kontext erfolgt ueber die Partnerrolle in Kombination mit dem Attribut PartnerID dieses Datentyps.
 * 
 * Die Attribute BezugZuVN (ST_BezugZuVN) und PartnerID (ST_PartnerID) fehlen, da die entsprechenden einfachen Datentypen nicht definiert sind.
 * 
 * <p>Java class for CT_Partner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Partner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Anrede" type="{http://www.bipro.net/namespace/datentypen}ST_Anredeschluessel" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Namenszusatz1" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Namenszusatz2" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="PartnernummerVM" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Partnernummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Vorsteuerabzugsberechtigt" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="PartnerID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="Anschrift" type="{http://www.bipro.net/namespace/partner}CT_Partneranschrift" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZusaetzlichePartnerdaten" type="{http://www.bipro.net/namespace/partner}CT_ZusaetzlichePartnerdaten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kommunikationsverbindung" type="{http://www.bipro.net/namespace/partner}CT_Kommunikationsverbindung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Bankverbindung" type="{http://www.bipro.net/namespace/partner}CT_BankverbindungBasis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HandeltAufRechnungVon" type="{http://www.bipro.net/namespace/partner}CT_HandeltAufRechnungVon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gruppenvertragspartner" type="{http://www.bipro.net/namespace/partner}CT_Gruppenvertragspartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Partnerbeziehung" type="{http://www.bipro.net/namespace/partner}CT_Partnerbeziehung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vertrauensperson" type="{http://www.bipro.net/namespace/partner}CT_Vertrauensperson" minOccurs="0"/&gt;
 *         &lt;element name="Kreditkarte" type="{http://www.bipro.net/namespace/partner}CT_Kreditkarte" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UmsatzsteuerIdentifikationsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_UmsatzsteuerIdentifikationsnummer" minOccurs="0"/&gt;
 *         &lt;element name="AltePartnernummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Besteuerung" type="{http://www.bipro.net/namespace/partner}CT_Besteuerung" minOccurs="0"/&gt;
 *         &lt;element name="Direktmarketing" type="{http://www.bipro.net/namespace/partner}CT_Werbeerlaubnis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Finanzamt" type="{http://www.bipro.net/namespace/datentypen}ST_Finanzamt" minOccurs="0"/&gt;
 *         &lt;element name="Partneranmerkung" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Briefanrede" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Kommunikationspartner" type="{http://www.bipro.net/namespace/partner}CT_Kommunikationspartner" minOccurs="0"/&gt;
 *         &lt;element name="PartnernummerExtern" type="{http://www.bipro.net/namespace/allgemein}CT_Partnernummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vollmachtgeber" type="{http://www.bipro.net/namespace/partner}CT_Vollmachtgeber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Partner", propOrder = {
    "anrede",
    "name",
    "namenszusatz1",
    "namenszusatz2",
    "partnernummerVM",
    "partnernummer",
    "vorsteuerabzugsberechtigt",
    "partnerID",
    "anschrift",
    "zusaetzlichePartnerdaten",
    "kommunikationsverbindung",
    "bankverbindung",
    "handeltAufRechnungVon",
    "gruppenvertragspartner",
    "partnerbeziehung",
    "vertrauensperson",
    "kreditkarte",
    "umsatzsteuerIdentifikationsnummer",
    "altePartnernummer",
    "besteuerung",
    "direktmarketing",
    "finanzamt",
    "partneranmerkung",
    "briefanrede",
    "kommunikationspartner",
    "partnernummerExtern",
    "vollmachtgeber"
})
@XmlSeeAlso({
    CTJuristischePerson.class,
    CTPerson.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTPartner
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Anrede")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAnredeschluessel anrede;
    @XmlElement(name = "Name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String name;
    @XmlElement(name = "Namenszusatz1")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String namenszusatz1;
    @XmlElement(name = "Namenszusatz2")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String namenszusatz2;
    @XmlElement(name = "PartnernummerVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partnernummerVM;
    @XmlElement(name = "Partnernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partnernummer;
    @XmlElement(name = "Vorsteuerabzugsberechtigt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean vorsteuerabzugsberechtigt;
    @XmlElement(name = "PartnerID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partnerID;
    @XmlElement(name = "Anschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPartneranschrift> anschrift;
    @XmlElement(name = "ZusaetzlichePartnerdaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTZusaetzlichePartnerdaten> zusaetzlichePartnerdaten;
    @XmlElement(name = "Kommunikationsverbindung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTKommunikationsverbindung> kommunikationsverbindung;
    @XmlElement(name = "Bankverbindung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTBankverbindungBasis> bankverbindung;
    @XmlElement(name = "HandeltAufRechnungVon")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTHandeltAufRechnungVon> handeltAufRechnungVon;
    @XmlElement(name = "Gruppenvertragspartner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTGruppenvertragspartner> gruppenvertragspartner;
    @XmlElement(name = "Partnerbeziehung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPartnerbeziehung> partnerbeziehung;
    @XmlElement(name = "Vertrauensperson")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertrauensperson vertrauensperson;
    @XmlElement(name = "Kreditkarte")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTKreditkarte> kreditkarte;
    @XmlElement(name = "UmsatzsteuerIdentifikationsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String umsatzsteuerIdentifikationsnummer;
    @XmlElement(name = "AltePartnernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String altePartnernummer;
    @XmlElement(name = "Besteuerung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBesteuerung besteuerung;
    @XmlElement(name = "Direktmarketing")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTWerbeerlaubnis> direktmarketing;
    @XmlElement(name = "Finanzamt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String finanzamt;
    @XmlElement(name = "Partneranmerkung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partneranmerkung;
    @XmlElement(name = "Briefanrede")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String briefanrede;
    @XmlElement(name = "Kommunikationspartner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTKommunikationspartner kommunikationspartner;
    @XmlElement(name = "PartnernummerExtern")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPartnernummer> partnernummerExtern;
    @XmlElement(name = "Vollmachtgeber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVollmachtgeber vollmachtgeber;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link STAnredeschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAnredeschluessel getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAnredeschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnrede(STAnredeschluessel value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the namenszusatz1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getNamenszusatz1() {
        return namenszusatz1;
    }

    /**
     * Sets the value of the namenszusatz1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNamenszusatz1(String value) {
        this.namenszusatz1 = value;
    }

    /**
     * Gets the value of the namenszusatz2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getNamenszusatz2() {
        return namenszusatz2;
    }

    /**
     * Sets the value of the namenszusatz2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNamenszusatz2(String value) {
        this.namenszusatz2 = value;
    }

    /**
     * Gets the value of the partnernummerVM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPartnernummerVM() {
        return partnernummerVM;
    }

    /**
     * Sets the value of the partnernummerVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartnernummerVM(String value) {
        this.partnernummerVM = value;
    }

    /**
     * Gets the value of the partnernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPartnernummer() {
        return partnernummer;
    }

    /**
     * Sets the value of the partnernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartnernummer(String value) {
        this.partnernummer = value;
    }

    /**
     * Gets the value of the vorsteuerabzugsberechtigt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isVorsteuerabzugsberechtigt() {
        return vorsteuerabzugsberechtigt;
    }

    /**
     * Sets the value of the vorsteuerabzugsberechtigt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVorsteuerabzugsberechtigt(Boolean value) {
        this.vorsteuerabzugsberechtigt = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the anschrift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anschrift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnschrift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPartneranschrift }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTPartneranschrift> getAnschrift() {
        if (anschrift == null) {
            anschrift = new ArrayList<CTPartneranschrift>();
        }
        return this.anschrift;
    }

    /**
     * Gets the value of the zusaetzlichePartnerdaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zusaetzlichePartnerdaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZusaetzlichePartnerdaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZusaetzlichePartnerdaten }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTZusaetzlichePartnerdaten> getZusaetzlichePartnerdaten() {
        if (zusaetzlichePartnerdaten == null) {
            zusaetzlichePartnerdaten = new ArrayList<CTZusaetzlichePartnerdaten>();
        }
        return this.zusaetzlichePartnerdaten;
    }

    /**
     * Gets the value of the kommunikationsverbindung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommunikationsverbindung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommunikationsverbindung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKommunikationsverbindung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTKommunikationsverbindung> getKommunikationsverbindung() {
        if (kommunikationsverbindung == null) {
            kommunikationsverbindung = new ArrayList<CTKommunikationsverbindung>();
        }
        return this.kommunikationsverbindung;
    }

    /**
     * Gets the value of the bankverbindung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankverbindung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankverbindung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBankverbindungBasis }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTBankverbindungBasis> getBankverbindung() {
        if (bankverbindung == null) {
            bankverbindung = new ArrayList<CTBankverbindungBasis>();
        }
        return this.bankverbindung;
    }

    /**
     * Gets the value of the handeltAufRechnungVon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handeltAufRechnungVon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandeltAufRechnungVon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTHandeltAufRechnungVon }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTHandeltAufRechnungVon> getHandeltAufRechnungVon() {
        if (handeltAufRechnungVon == null) {
            handeltAufRechnungVon = new ArrayList<CTHandeltAufRechnungVon>();
        }
        return this.handeltAufRechnungVon;
    }

    /**
     * Gets the value of the gruppenvertragspartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gruppenvertragspartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGruppenvertragspartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTGruppenvertragspartner }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTGruppenvertragspartner> getGruppenvertragspartner() {
        if (gruppenvertragspartner == null) {
            gruppenvertragspartner = new ArrayList<CTGruppenvertragspartner>();
        }
        return this.gruppenvertragspartner;
    }

    /**
     * Gets the value of the partnerbeziehung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerbeziehung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerbeziehung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPartnerbeziehung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTPartnerbeziehung> getPartnerbeziehung() {
        if (partnerbeziehung == null) {
            partnerbeziehung = new ArrayList<CTPartnerbeziehung>();
        }
        return this.partnerbeziehung;
    }

    /**
     * Gets the value of the vertrauensperson property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertrauensperson }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrauensperson getVertrauensperson() {
        return vertrauensperson;
    }

    /**
     * Sets the value of the vertrauensperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertrauensperson }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertrauensperson(CTVertrauensperson value) {
        this.vertrauensperson = value;
    }

    /**
     * Gets the value of the kreditkarte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kreditkarte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKreditkarte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKreditkarte }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTKreditkarte> getKreditkarte() {
        if (kreditkarte == null) {
            kreditkarte = new ArrayList<CTKreditkarte>();
        }
        return this.kreditkarte;
    }

    /**
     * Gets the value of the umsatzsteuerIdentifikationsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getUmsatzsteuerIdentifikationsnummer() {
        return umsatzsteuerIdentifikationsnummer;
    }

    /**
     * Sets the value of the umsatzsteuerIdentifikationsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUmsatzsteuerIdentifikationsnummer(String value) {
        this.umsatzsteuerIdentifikationsnummer = value;
    }

    /**
     * Gets the value of the altePartnernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAltePartnernummer() {
        return altePartnernummer;
    }

    /**
     * Sets the value of the altePartnernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAltePartnernummer(String value) {
        this.altePartnernummer = value;
    }

    /**
     * Gets the value of the besteuerung property.
     * 
     * @return
     *     possible object is
     *     {@link CTBesteuerung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBesteuerung getBesteuerung() {
        return besteuerung;
    }

    /**
     * Sets the value of the besteuerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBesteuerung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBesteuerung(CTBesteuerung value) {
        this.besteuerung = value;
    }

    /**
     * Gets the value of the direktmarketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direktmarketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirektmarketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTWerbeerlaubnis }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTWerbeerlaubnis> getDirektmarketing() {
        if (direktmarketing == null) {
            direktmarketing = new ArrayList<CTWerbeerlaubnis>();
        }
        return this.direktmarketing;
    }

    /**
     * Gets the value of the finanzamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFinanzamt() {
        return finanzamt;
    }

    /**
     * Sets the value of the finanzamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFinanzamt(String value) {
        this.finanzamt = value;
    }

    /**
     * Gets the value of the partneranmerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPartneranmerkung() {
        return partneranmerkung;
    }

    /**
     * Sets the value of the partneranmerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartneranmerkung(String value) {
        this.partneranmerkung = value;
    }

    /**
     * Gets the value of the briefanrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBriefanrede() {
        return briefanrede;
    }

    /**
     * Sets the value of the briefanrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBriefanrede(String value) {
        this.briefanrede = value;
    }

    /**
     * Gets the value of the kommunikationspartner property.
     * 
     * @return
     *     possible object is
     *     {@link CTKommunikationspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationspartner getKommunikationspartner() {
        return kommunikationspartner;
    }

    /**
     * Sets the value of the kommunikationspartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTKommunikationspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKommunikationspartner(CTKommunikationspartner value) {
        this.kommunikationspartner = value;
    }

    /**
     * Gets the value of the partnernummerExtern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnernummerExtern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnernummerExtern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPartnernummer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTPartnernummer> getPartnernummerExtern() {
        if (partnernummerExtern == null) {
            partnernummerExtern = new ArrayList<CTPartnernummer>();
        }
        return this.partnernummerExtern;
    }

    /**
     * Gets the value of the vollmachtgeber property.
     * 
     * @return
     *     possible object is
     *     {@link CTVollmachtgeber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVollmachtgeber getVollmachtgeber() {
        return vollmachtgeber;
    }

    /**
     * Sets the value of the vollmachtgeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVollmachtgeber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVollmachtgeber(CTVollmachtgeber value) {
        this.vollmachtgeber = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CTPartner that = ((CTPartner) object);
        {
            STAnredeschluessel lhsAnrede;
            lhsAnrede = this.getAnrede();
            STAnredeschluessel rhsAnrede;
            rhsAnrede = that.getAnrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anrede", lhsAnrede), LocatorUtils.property(thatLocator, "anrede", rhsAnrede), lhsAnrede, rhsAnrede, (this.anrede!= null), (that.anrede!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsNamenszusatz1;
            lhsNamenszusatz1 = this.getNamenszusatz1();
            String rhsNamenszusatz1;
            rhsNamenszusatz1 = that.getNamenszusatz1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namenszusatz1", lhsNamenszusatz1), LocatorUtils.property(thatLocator, "namenszusatz1", rhsNamenszusatz1), lhsNamenszusatz1, rhsNamenszusatz1, (this.namenszusatz1 != null), (that.namenszusatz1 != null))) {
                return false;
            }
        }
        {
            String lhsNamenszusatz2;
            lhsNamenszusatz2 = this.getNamenszusatz2();
            String rhsNamenszusatz2;
            rhsNamenszusatz2 = that.getNamenszusatz2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namenszusatz2", lhsNamenszusatz2), LocatorUtils.property(thatLocator, "namenszusatz2", rhsNamenszusatz2), lhsNamenszusatz2, rhsNamenszusatz2, (this.namenszusatz2 != null), (that.namenszusatz2 != null))) {
                return false;
            }
        }
        {
            String lhsPartnernummerVM;
            lhsPartnernummerVM = this.getPartnernummerVM();
            String rhsPartnernummerVM;
            rhsPartnernummerVM = that.getPartnernummerVM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnernummerVM", lhsPartnernummerVM), LocatorUtils.property(thatLocator, "partnernummerVM", rhsPartnernummerVM), lhsPartnernummerVM, rhsPartnernummerVM, (this.partnernummerVM!= null), (that.partnernummerVM!= null))) {
                return false;
            }
        }
        {
            String lhsPartnernummer;
            lhsPartnernummer = this.getPartnernummer();
            String rhsPartnernummer;
            rhsPartnernummer = that.getPartnernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnernummer", lhsPartnernummer), LocatorUtils.property(thatLocator, "partnernummer", rhsPartnernummer), lhsPartnernummer, rhsPartnernummer, (this.partnernummer!= null), (that.partnernummer!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVorsteuerabzugsberechtigt;
            lhsVorsteuerabzugsberechtigt = this.isVorsteuerabzugsberechtigt();
            Boolean rhsVorsteuerabzugsberechtigt;
            rhsVorsteuerabzugsberechtigt = that.isVorsteuerabzugsberechtigt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorsteuerabzugsberechtigt", lhsVorsteuerabzugsberechtigt), LocatorUtils.property(thatLocator, "vorsteuerabzugsberechtigt", rhsVorsteuerabzugsberechtigt), lhsVorsteuerabzugsberechtigt, rhsVorsteuerabzugsberechtigt, (this.vorsteuerabzugsberechtigt!= null), (that.vorsteuerabzugsberechtigt!= null))) {
                return false;
            }
        }
        {
            String lhsPartnerID;
            lhsPartnerID = this.getPartnerID();
            String rhsPartnerID;
            rhsPartnerID = that.getPartnerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerID", lhsPartnerID), LocatorUtils.property(thatLocator, "partnerID", rhsPartnerID), lhsPartnerID, rhsPartnerID, (this.partnerID!= null), (that.partnerID!= null))) {
                return false;
            }
        }
        {
            List<CTPartneranschrift> lhsAnschrift;
            lhsAnschrift = (((this.anschrift!= null)&&(!this.anschrift.isEmpty()))?this.getAnschrift():null);
            List<CTPartneranschrift> rhsAnschrift;
            rhsAnschrift = (((that.anschrift!= null)&&(!that.anschrift.isEmpty()))?that.getAnschrift():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anschrift", lhsAnschrift), LocatorUtils.property(thatLocator, "anschrift", rhsAnschrift), lhsAnschrift, rhsAnschrift, ((this.anschrift!= null)&&(!this.anschrift.isEmpty())), ((that.anschrift!= null)&&(!that.anschrift.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTZusaetzlichePartnerdaten> lhsZusaetzlichePartnerdaten;
            lhsZusaetzlichePartnerdaten = (((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty()))?this.getZusaetzlichePartnerdaten():null);
            List<CTZusaetzlichePartnerdaten> rhsZusaetzlichePartnerdaten;
            rhsZusaetzlichePartnerdaten = (((that.zusaetzlichePartnerdaten!= null)&&(!that.zusaetzlichePartnerdaten.isEmpty()))?that.getZusaetzlichePartnerdaten():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusaetzlichePartnerdaten", lhsZusaetzlichePartnerdaten), LocatorUtils.property(thatLocator, "zusaetzlichePartnerdaten", rhsZusaetzlichePartnerdaten), lhsZusaetzlichePartnerdaten, rhsZusaetzlichePartnerdaten, ((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty())), ((that.zusaetzlichePartnerdaten!= null)&&(!that.zusaetzlichePartnerdaten.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTKommunikationsverbindung> lhsKommunikationsverbindung;
            lhsKommunikationsverbindung = (((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))?this.getKommunikationsverbindung():null);
            List<CTKommunikationsverbindung> rhsKommunikationsverbindung;
            rhsKommunikationsverbindung = (((that.kommunikationsverbindung!= null)&&(!that.kommunikationsverbindung.isEmpty()))?that.getKommunikationsverbindung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunikationsverbindung", lhsKommunikationsverbindung), LocatorUtils.property(thatLocator, "kommunikationsverbindung", rhsKommunikationsverbindung), lhsKommunikationsverbindung, rhsKommunikationsverbindung, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty())), ((that.kommunikationsverbindung!= null)&&(!that.kommunikationsverbindung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTBankverbindungBasis> lhsBankverbindung;
            lhsBankverbindung = (((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty()))?this.getBankverbindung():null);
            List<CTBankverbindungBasis> rhsBankverbindung;
            rhsBankverbindung = (((that.bankverbindung!= null)&&(!that.bankverbindung.isEmpty()))?that.getBankverbindung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankverbindung", lhsBankverbindung), LocatorUtils.property(thatLocator, "bankverbindung", rhsBankverbindung), lhsBankverbindung, rhsBankverbindung, ((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty())), ((that.bankverbindung!= null)&&(!that.bankverbindung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTHandeltAufRechnungVon> lhsHandeltAufRechnungVon;
            lhsHandeltAufRechnungVon = (((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty()))?this.getHandeltAufRechnungVon():null);
            List<CTHandeltAufRechnungVon> rhsHandeltAufRechnungVon;
            rhsHandeltAufRechnungVon = (((that.handeltAufRechnungVon!= null)&&(!that.handeltAufRechnungVon.isEmpty()))?that.getHandeltAufRechnungVon():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handeltAufRechnungVon", lhsHandeltAufRechnungVon), LocatorUtils.property(thatLocator, "handeltAufRechnungVon", rhsHandeltAufRechnungVon), lhsHandeltAufRechnungVon, rhsHandeltAufRechnungVon, ((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty())), ((that.handeltAufRechnungVon!= null)&&(!that.handeltAufRechnungVon.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTGruppenvertragspartner> lhsGruppenvertragspartner;
            lhsGruppenvertragspartner = (((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty()))?this.getGruppenvertragspartner():null);
            List<CTGruppenvertragspartner> rhsGruppenvertragspartner;
            rhsGruppenvertragspartner = (((that.gruppenvertragspartner!= null)&&(!that.gruppenvertragspartner.isEmpty()))?that.getGruppenvertragspartner():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppenvertragspartner", lhsGruppenvertragspartner), LocatorUtils.property(thatLocator, "gruppenvertragspartner", rhsGruppenvertragspartner), lhsGruppenvertragspartner, rhsGruppenvertragspartner, ((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty())), ((that.gruppenvertragspartner!= null)&&(!that.gruppenvertragspartner.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTPartnerbeziehung> lhsPartnerbeziehung;
            lhsPartnerbeziehung = (((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty()))?this.getPartnerbeziehung():null);
            List<CTPartnerbeziehung> rhsPartnerbeziehung;
            rhsPartnerbeziehung = (((that.partnerbeziehung!= null)&&(!that.partnerbeziehung.isEmpty()))?that.getPartnerbeziehung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerbeziehung", lhsPartnerbeziehung), LocatorUtils.property(thatLocator, "partnerbeziehung", rhsPartnerbeziehung), lhsPartnerbeziehung, rhsPartnerbeziehung, ((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty())), ((that.partnerbeziehung!= null)&&(!that.partnerbeziehung.isEmpty())))) {
                return false;
            }
        }
        {
            CTVertrauensperson lhsVertrauensperson;
            lhsVertrauensperson = this.getVertrauensperson();
            CTVertrauensperson rhsVertrauensperson;
            rhsVertrauensperson = that.getVertrauensperson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertrauensperson", lhsVertrauensperson), LocatorUtils.property(thatLocator, "vertrauensperson", rhsVertrauensperson), lhsVertrauensperson, rhsVertrauensperson, (this.vertrauensperson!= null), (that.vertrauensperson!= null))) {
                return false;
            }
        }
        {
            List<CTKreditkarte> lhsKreditkarte;
            lhsKreditkarte = (((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty()))?this.getKreditkarte():null);
            List<CTKreditkarte> rhsKreditkarte;
            rhsKreditkarte = (((that.kreditkarte!= null)&&(!that.kreditkarte.isEmpty()))?that.getKreditkarte():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kreditkarte", lhsKreditkarte), LocatorUtils.property(thatLocator, "kreditkarte", rhsKreditkarte), lhsKreditkarte, rhsKreditkarte, ((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty())), ((that.kreditkarte!= null)&&(!that.kreditkarte.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsUmsatzsteuerIdentifikationsnummer;
            lhsUmsatzsteuerIdentifikationsnummer = this.getUmsatzsteuerIdentifikationsnummer();
            String rhsUmsatzsteuerIdentifikationsnummer;
            rhsUmsatzsteuerIdentifikationsnummer = that.getUmsatzsteuerIdentifikationsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umsatzsteuerIdentifikationsnummer", lhsUmsatzsteuerIdentifikationsnummer), LocatorUtils.property(thatLocator, "umsatzsteuerIdentifikationsnummer", rhsUmsatzsteuerIdentifikationsnummer), lhsUmsatzsteuerIdentifikationsnummer, rhsUmsatzsteuerIdentifikationsnummer, (this.umsatzsteuerIdentifikationsnummer!= null), (that.umsatzsteuerIdentifikationsnummer!= null))) {
                return false;
            }
        }
        {
            String lhsAltePartnernummer;
            lhsAltePartnernummer = this.getAltePartnernummer();
            String rhsAltePartnernummer;
            rhsAltePartnernummer = that.getAltePartnernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altePartnernummer", lhsAltePartnernummer), LocatorUtils.property(thatLocator, "altePartnernummer", rhsAltePartnernummer), lhsAltePartnernummer, rhsAltePartnernummer, (this.altePartnernummer!= null), (that.altePartnernummer!= null))) {
                return false;
            }
        }
        {
            CTBesteuerung lhsBesteuerung;
            lhsBesteuerung = this.getBesteuerung();
            CTBesteuerung rhsBesteuerung;
            rhsBesteuerung = that.getBesteuerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besteuerung", lhsBesteuerung), LocatorUtils.property(thatLocator, "besteuerung", rhsBesteuerung), lhsBesteuerung, rhsBesteuerung, (this.besteuerung!= null), (that.besteuerung!= null))) {
                return false;
            }
        }
        {
            List<CTWerbeerlaubnis> lhsDirektmarketing;
            lhsDirektmarketing = (((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty()))?this.getDirektmarketing():null);
            List<CTWerbeerlaubnis> rhsDirektmarketing;
            rhsDirektmarketing = (((that.direktmarketing!= null)&&(!that.direktmarketing.isEmpty()))?that.getDirektmarketing():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "direktmarketing", lhsDirektmarketing), LocatorUtils.property(thatLocator, "direktmarketing", rhsDirektmarketing), lhsDirektmarketing, rhsDirektmarketing, ((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty())), ((that.direktmarketing!= null)&&(!that.direktmarketing.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsFinanzamt;
            lhsFinanzamt = this.getFinanzamt();
            String rhsFinanzamt;
            rhsFinanzamt = that.getFinanzamt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finanzamt", lhsFinanzamt), LocatorUtils.property(thatLocator, "finanzamt", rhsFinanzamt), lhsFinanzamt, rhsFinanzamt, (this.finanzamt!= null), (that.finanzamt!= null))) {
                return false;
            }
        }
        {
            String lhsPartneranmerkung;
            lhsPartneranmerkung = this.getPartneranmerkung();
            String rhsPartneranmerkung;
            rhsPartneranmerkung = that.getPartneranmerkung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partneranmerkung", lhsPartneranmerkung), LocatorUtils.property(thatLocator, "partneranmerkung", rhsPartneranmerkung), lhsPartneranmerkung, rhsPartneranmerkung, (this.partneranmerkung!= null), (that.partneranmerkung!= null))) {
                return false;
            }
        }
        {
            String lhsBriefanrede;
            lhsBriefanrede = this.getBriefanrede();
            String rhsBriefanrede;
            rhsBriefanrede = that.getBriefanrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "briefanrede", lhsBriefanrede), LocatorUtils.property(thatLocator, "briefanrede", rhsBriefanrede), lhsBriefanrede, rhsBriefanrede, (this.briefanrede!= null), (that.briefanrede!= null))) {
                return false;
            }
        }
        {
            CTKommunikationspartner lhsKommunikationspartner;
            lhsKommunikationspartner = this.getKommunikationspartner();
            CTKommunikationspartner rhsKommunikationspartner;
            rhsKommunikationspartner = that.getKommunikationspartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunikationspartner", lhsKommunikationspartner), LocatorUtils.property(thatLocator, "kommunikationspartner", rhsKommunikationspartner), lhsKommunikationspartner, rhsKommunikationspartner, (this.kommunikationspartner!= null), (that.kommunikationspartner!= null))) {
                return false;
            }
        }
        {
            List<CTPartnernummer> lhsPartnernummerExtern;
            lhsPartnernummerExtern = (((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty()))?this.getPartnernummerExtern():null);
            List<CTPartnernummer> rhsPartnernummerExtern;
            rhsPartnernummerExtern = (((that.partnernummerExtern!= null)&&(!that.partnernummerExtern.isEmpty()))?that.getPartnernummerExtern():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnernummerExtern", lhsPartnernummerExtern), LocatorUtils.property(thatLocator, "partnernummerExtern", rhsPartnernummerExtern), lhsPartnernummerExtern, rhsPartnernummerExtern, ((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty())), ((that.partnernummerExtern!= null)&&(!that.partnernummerExtern.isEmpty())))) {
                return false;
            }
        }
        {
            CTVollmachtgeber lhsVollmachtgeber;
            lhsVollmachtgeber = this.getVollmachtgeber();
            CTVollmachtgeber rhsVollmachtgeber;
            rhsVollmachtgeber = that.getVollmachtgeber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vollmachtgeber", lhsVollmachtgeber), LocatorUtils.property(thatLocator, "vollmachtgeber", rhsVollmachtgeber), lhsVollmachtgeber, rhsVollmachtgeber, (this.vollmachtgeber!= null), (that.vollmachtgeber!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            STAnredeschluessel theAnrede;
            theAnrede = this.getAnrede();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anrede", theAnrede), currentHashCode, theAnrede, (this.anrede!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theNamenszusatz1;
            theNamenszusatz1 = this.getNamenszusatz1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namenszusatz1", theNamenszusatz1), currentHashCode, theNamenszusatz1, (this.namenszusatz1 != null));
        }
        {
            String theNamenszusatz2;
            theNamenszusatz2 = this.getNamenszusatz2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namenszusatz2", theNamenszusatz2), currentHashCode, theNamenszusatz2, (this.namenszusatz2 != null));
        }
        {
            String thePartnernummerVM;
            thePartnernummerVM = this.getPartnernummerVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnernummerVM", thePartnernummerVM), currentHashCode, thePartnernummerVM, (this.partnernummerVM!= null));
        }
        {
            String thePartnernummer;
            thePartnernummer = this.getPartnernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnernummer", thePartnernummer), currentHashCode, thePartnernummer, (this.partnernummer!= null));
        }
        {
            Boolean theVorsteuerabzugsberechtigt;
            theVorsteuerabzugsberechtigt = this.isVorsteuerabzugsberechtigt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorsteuerabzugsberechtigt", theVorsteuerabzugsberechtigt), currentHashCode, theVorsteuerabzugsberechtigt, (this.vorsteuerabzugsberechtigt!= null));
        }
        {
            String thePartnerID;
            thePartnerID = this.getPartnerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerID", thePartnerID), currentHashCode, thePartnerID, (this.partnerID!= null));
        }
        {
            List<CTPartneranschrift> theAnschrift;
            theAnschrift = (((this.anschrift!= null)&&(!this.anschrift.isEmpty()))?this.getAnschrift():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anschrift", theAnschrift), currentHashCode, theAnschrift, ((this.anschrift!= null)&&(!this.anschrift.isEmpty())));
        }
        {
            List<CTZusaetzlichePartnerdaten> theZusaetzlichePartnerdaten;
            theZusaetzlichePartnerdaten = (((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty()))?this.getZusaetzlichePartnerdaten():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusaetzlichePartnerdaten", theZusaetzlichePartnerdaten), currentHashCode, theZusaetzlichePartnerdaten, ((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty())));
        }
        {
            List<CTKommunikationsverbindung> theKommunikationsverbindung;
            theKommunikationsverbindung = (((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))?this.getKommunikationsverbindung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kommunikationsverbindung", theKommunikationsverbindung), currentHashCode, theKommunikationsverbindung, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty())));
        }
        {
            List<CTBankverbindungBasis> theBankverbindung;
            theBankverbindung = (((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty()))?this.getBankverbindung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankverbindung", theBankverbindung), currentHashCode, theBankverbindung, ((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty())));
        }
        {
            List<CTHandeltAufRechnungVon> theHandeltAufRechnungVon;
            theHandeltAufRechnungVon = (((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty()))?this.getHandeltAufRechnungVon():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handeltAufRechnungVon", theHandeltAufRechnungVon), currentHashCode, theHandeltAufRechnungVon, ((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty())));
        }
        {
            List<CTGruppenvertragspartner> theGruppenvertragspartner;
            theGruppenvertragspartner = (((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty()))?this.getGruppenvertragspartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gruppenvertragspartner", theGruppenvertragspartner), currentHashCode, theGruppenvertragspartner, ((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty())));
        }
        {
            List<CTPartnerbeziehung> thePartnerbeziehung;
            thePartnerbeziehung = (((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty()))?this.getPartnerbeziehung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerbeziehung", thePartnerbeziehung), currentHashCode, thePartnerbeziehung, ((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty())));
        }
        {
            CTVertrauensperson theVertrauensperson;
            theVertrauensperson = this.getVertrauensperson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertrauensperson", theVertrauensperson), currentHashCode, theVertrauensperson, (this.vertrauensperson!= null));
        }
        {
            List<CTKreditkarte> theKreditkarte;
            theKreditkarte = (((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty()))?this.getKreditkarte():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kreditkarte", theKreditkarte), currentHashCode, theKreditkarte, ((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty())));
        }
        {
            String theUmsatzsteuerIdentifikationsnummer;
            theUmsatzsteuerIdentifikationsnummer = this.getUmsatzsteuerIdentifikationsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "umsatzsteuerIdentifikationsnummer", theUmsatzsteuerIdentifikationsnummer), currentHashCode, theUmsatzsteuerIdentifikationsnummer, (this.umsatzsteuerIdentifikationsnummer!= null));
        }
        {
            String theAltePartnernummer;
            theAltePartnernummer = this.getAltePartnernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altePartnernummer", theAltePartnernummer), currentHashCode, theAltePartnernummer, (this.altePartnernummer!= null));
        }
        {
            CTBesteuerung theBesteuerung;
            theBesteuerung = this.getBesteuerung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "besteuerung", theBesteuerung), currentHashCode, theBesteuerung, (this.besteuerung!= null));
        }
        {
            List<CTWerbeerlaubnis> theDirektmarketing;
            theDirektmarketing = (((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty()))?this.getDirektmarketing():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "direktmarketing", theDirektmarketing), currentHashCode, theDirektmarketing, ((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty())));
        }
        {
            String theFinanzamt;
            theFinanzamt = this.getFinanzamt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finanzamt", theFinanzamt), currentHashCode, theFinanzamt, (this.finanzamt!= null));
        }
        {
            String thePartneranmerkung;
            thePartneranmerkung = this.getPartneranmerkung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partneranmerkung", thePartneranmerkung), currentHashCode, thePartneranmerkung, (this.partneranmerkung!= null));
        }
        {
            String theBriefanrede;
            theBriefanrede = this.getBriefanrede();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "briefanrede", theBriefanrede), currentHashCode, theBriefanrede, (this.briefanrede!= null));
        }
        {
            CTKommunikationspartner theKommunikationspartner;
            theKommunikationspartner = this.getKommunikationspartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kommunikationspartner", theKommunikationspartner), currentHashCode, theKommunikationspartner, (this.kommunikationspartner!= null));
        }
        {
            List<CTPartnernummer> thePartnernummerExtern;
            thePartnernummerExtern = (((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty()))?this.getPartnernummerExtern():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnernummerExtern", thePartnernummerExtern), currentHashCode, thePartnernummerExtern, ((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty())));
        }
        {
            CTVollmachtgeber theVollmachtgeber;
            theVollmachtgeber = this.getVollmachtgeber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vollmachtgeber", theVollmachtgeber), currentHashCode, theVollmachtgeber, (this.vollmachtgeber!= null));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTPartner) {
            final CTPartner copy = ((CTPartner) target);
            {
                Boolean anredeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anrede!= null));
                if (anredeShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAnredeschluessel sourceAnrede;
                    sourceAnrede = this.getAnrede();
                    STAnredeschluessel copyAnrede = ((STAnredeschluessel) strategy.copy(LocatorUtils.property(locator, "anrede", sourceAnrede), sourceAnrede, (this.anrede!= null)));
                    copy.setAnrede(copyAnrede);
                } else {
                    if (anredeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anrede = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean namenszusatz1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.namenszusatz1 != null));
                if (namenszusatz1ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNamenszusatz1;
                    sourceNamenszusatz1 = this.getNamenszusatz1();
                    String copyNamenszusatz1 = ((String) strategy.copy(LocatorUtils.property(locator, "namenszusatz1", sourceNamenszusatz1), sourceNamenszusatz1, (this.namenszusatz1 != null)));
                    copy.setNamenszusatz1(copyNamenszusatz1);
                } else {
                    if (namenszusatz1ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.namenszusatz1 = null;
                    }
                }
            }
            {
                Boolean namenszusatz2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.namenszusatz2 != null));
                if (namenszusatz2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNamenszusatz2;
                    sourceNamenszusatz2 = this.getNamenszusatz2();
                    String copyNamenszusatz2 = ((String) strategy.copy(LocatorUtils.property(locator, "namenszusatz2", sourceNamenszusatz2), sourceNamenszusatz2, (this.namenszusatz2 != null)));
                    copy.setNamenszusatz2(copyNamenszusatz2);
                } else {
                    if (namenszusatz2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.namenszusatz2 = null;
                    }
                }
            }
            {
                Boolean partnernummerVMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partnernummerVM!= null));
                if (partnernummerVMShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartnernummerVM;
                    sourcePartnernummerVM = this.getPartnernummerVM();
                    String copyPartnernummerVM = ((String) strategy.copy(LocatorUtils.property(locator, "partnernummerVM", sourcePartnernummerVM), sourcePartnernummerVM, (this.partnernummerVM!= null)));
                    copy.setPartnernummerVM(copyPartnernummerVM);
                } else {
                    if (partnernummerVMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnernummerVM = null;
                    }
                }
            }
            {
                Boolean partnernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partnernummer!= null));
                if (partnernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartnernummer;
                    sourcePartnernummer = this.getPartnernummer();
                    String copyPartnernummer = ((String) strategy.copy(LocatorUtils.property(locator, "partnernummer", sourcePartnernummer), sourcePartnernummer, (this.partnernummer!= null)));
                    copy.setPartnernummer(copyPartnernummer);
                } else {
                    if (partnernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnernummer = null;
                    }
                }
            }
            {
                Boolean vorsteuerabzugsberechtigtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorsteuerabzugsberechtigt!= null));
                if (vorsteuerabzugsberechtigtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVorsteuerabzugsberechtigt;
                    sourceVorsteuerabzugsberechtigt = this.isVorsteuerabzugsberechtigt();
                    Boolean copyVorsteuerabzugsberechtigt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vorsteuerabzugsberechtigt", sourceVorsteuerabzugsberechtigt), sourceVorsteuerabzugsberechtigt, (this.vorsteuerabzugsberechtigt!= null)));
                    copy.setVorsteuerabzugsberechtigt(copyVorsteuerabzugsberechtigt);
                } else {
                    if (vorsteuerabzugsberechtigtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorsteuerabzugsberechtigt = null;
                    }
                }
            }
            {
                Boolean partnerIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partnerID!= null));
                if (partnerIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartnerID;
                    sourcePartnerID = this.getPartnerID();
                    String copyPartnerID = ((String) strategy.copy(LocatorUtils.property(locator, "partnerID", sourcePartnerID), sourcePartnerID, (this.partnerID!= null)));
                    copy.setPartnerID(copyPartnerID);
                } else {
                    if (partnerIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnerID = null;
                    }
                }
            }
            {
                Boolean anschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.anschrift!= null)&&(!this.anschrift.isEmpty())));
                if (anschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTPartneranschrift> sourceAnschrift;
                    sourceAnschrift = (((this.anschrift!= null)&&(!this.anschrift.isEmpty()))?this.getAnschrift():null);
                    @SuppressWarnings("unchecked")
                    List<CTPartneranschrift> copyAnschrift = ((List<CTPartneranschrift> ) strategy.copy(LocatorUtils.property(locator, "anschrift", sourceAnschrift), sourceAnschrift, ((this.anschrift!= null)&&(!this.anschrift.isEmpty()))));
                    copy.anschrift = null;
                    if (copyAnschrift!= null) {
                        List<CTPartneranschrift> uniqueAnschriftl = copy.getAnschrift();
                        uniqueAnschriftl.addAll(copyAnschrift);
                    }
                } else {
                    if (anschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anschrift = null;
                    }
                }
            }
            {
                Boolean zusaetzlichePartnerdatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty())));
                if (zusaetzlichePartnerdatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZusaetzlichePartnerdaten> sourceZusaetzlichePartnerdaten;
                    sourceZusaetzlichePartnerdaten = (((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty()))?this.getZusaetzlichePartnerdaten():null);
                    @SuppressWarnings("unchecked")
                    List<CTZusaetzlichePartnerdaten> copyZusaetzlichePartnerdaten = ((List<CTZusaetzlichePartnerdaten> ) strategy.copy(LocatorUtils.property(locator, "zusaetzlichePartnerdaten", sourceZusaetzlichePartnerdaten), sourceZusaetzlichePartnerdaten, ((this.zusaetzlichePartnerdaten!= null)&&(!this.zusaetzlichePartnerdaten.isEmpty()))));
                    copy.zusaetzlichePartnerdaten = null;
                    if (copyZusaetzlichePartnerdaten!= null) {
                        List<CTZusaetzlichePartnerdaten> uniqueZusaetzlichePartnerdatenl = copy.getZusaetzlichePartnerdaten();
                        uniqueZusaetzlichePartnerdatenl.addAll(copyZusaetzlichePartnerdaten);
                    }
                } else {
                    if (zusaetzlichePartnerdatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusaetzlichePartnerdaten = null;
                    }
                }
            }
            {
                Boolean kommunikationsverbindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty())));
                if (kommunikationsverbindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKommunikationsverbindung> sourceKommunikationsverbindung;
                    sourceKommunikationsverbindung = (((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))?this.getKommunikationsverbindung():null);
                    @SuppressWarnings("unchecked")
                    List<CTKommunikationsverbindung> copyKommunikationsverbindung = ((List<CTKommunikationsverbindung> ) strategy.copy(LocatorUtils.property(locator, "kommunikationsverbindung", sourceKommunikationsverbindung), sourceKommunikationsverbindung, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))));
                    copy.kommunikationsverbindung = null;
                    if (copyKommunikationsverbindung!= null) {
                        List<CTKommunikationsverbindung> uniqueKommunikationsverbindungl = copy.getKommunikationsverbindung();
                        uniqueKommunikationsverbindungl.addAll(copyKommunikationsverbindung);
                    }
                } else {
                    if (kommunikationsverbindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kommunikationsverbindung = null;
                    }
                }
            }
            {
                Boolean bankverbindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty())));
                if (bankverbindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBankverbindungBasis> sourceBankverbindung;
                    sourceBankverbindung = (((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty()))?this.getBankverbindung():null);
                    @SuppressWarnings("unchecked")
                    List<CTBankverbindungBasis> copyBankverbindung = ((List<CTBankverbindungBasis> ) strategy.copy(LocatorUtils.property(locator, "bankverbindung", sourceBankverbindung), sourceBankverbindung, ((this.bankverbindung!= null)&&(!this.bankverbindung.isEmpty()))));
                    copy.bankverbindung = null;
                    if (copyBankverbindung!= null) {
                        List<CTBankverbindungBasis> uniqueBankverbindungl = copy.getBankverbindung();
                        uniqueBankverbindungl.addAll(copyBankverbindung);
                    }
                } else {
                    if (bankverbindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bankverbindung = null;
                    }
                }
            }
            {
                Boolean handeltAufRechnungVonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty())));
                if (handeltAufRechnungVonShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTHandeltAufRechnungVon> sourceHandeltAufRechnungVon;
                    sourceHandeltAufRechnungVon = (((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty()))?this.getHandeltAufRechnungVon():null);
                    @SuppressWarnings("unchecked")
                    List<CTHandeltAufRechnungVon> copyHandeltAufRechnungVon = ((List<CTHandeltAufRechnungVon> ) strategy.copy(LocatorUtils.property(locator, "handeltAufRechnungVon", sourceHandeltAufRechnungVon), sourceHandeltAufRechnungVon, ((this.handeltAufRechnungVon!= null)&&(!this.handeltAufRechnungVon.isEmpty()))));
                    copy.handeltAufRechnungVon = null;
                    if (copyHandeltAufRechnungVon!= null) {
                        List<CTHandeltAufRechnungVon> uniqueHandeltAufRechnungVonl = copy.getHandeltAufRechnungVon();
                        uniqueHandeltAufRechnungVonl.addAll(copyHandeltAufRechnungVon);
                    }
                } else {
                    if (handeltAufRechnungVonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handeltAufRechnungVon = null;
                    }
                }
            }
            {
                Boolean gruppenvertragspartnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty())));
                if (gruppenvertragspartnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTGruppenvertragspartner> sourceGruppenvertragspartner;
                    sourceGruppenvertragspartner = (((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty()))?this.getGruppenvertragspartner():null);
                    @SuppressWarnings("unchecked")
                    List<CTGruppenvertragspartner> copyGruppenvertragspartner = ((List<CTGruppenvertragspartner> ) strategy.copy(LocatorUtils.property(locator, "gruppenvertragspartner", sourceGruppenvertragspartner), sourceGruppenvertragspartner, ((this.gruppenvertragspartner!= null)&&(!this.gruppenvertragspartner.isEmpty()))));
                    copy.gruppenvertragspartner = null;
                    if (copyGruppenvertragspartner!= null) {
                        List<CTGruppenvertragspartner> uniqueGruppenvertragspartnerl = copy.getGruppenvertragspartner();
                        uniqueGruppenvertragspartnerl.addAll(copyGruppenvertragspartner);
                    }
                } else {
                    if (gruppenvertragspartnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruppenvertragspartner = null;
                    }
                }
            }
            {
                Boolean partnerbeziehungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty())));
                if (partnerbeziehungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTPartnerbeziehung> sourcePartnerbeziehung;
                    sourcePartnerbeziehung = (((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty()))?this.getPartnerbeziehung():null);
                    @SuppressWarnings("unchecked")
                    List<CTPartnerbeziehung> copyPartnerbeziehung = ((List<CTPartnerbeziehung> ) strategy.copy(LocatorUtils.property(locator, "partnerbeziehung", sourcePartnerbeziehung), sourcePartnerbeziehung, ((this.partnerbeziehung!= null)&&(!this.partnerbeziehung.isEmpty()))));
                    copy.partnerbeziehung = null;
                    if (copyPartnerbeziehung!= null) {
                        List<CTPartnerbeziehung> uniquePartnerbeziehungl = copy.getPartnerbeziehung();
                        uniquePartnerbeziehungl.addAll(copyPartnerbeziehung);
                    }
                } else {
                    if (partnerbeziehungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnerbeziehung = null;
                    }
                }
            }
            {
                Boolean vertrauenspersonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertrauensperson!= null));
                if (vertrauenspersonShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertrauensperson sourceVertrauensperson;
                    sourceVertrauensperson = this.getVertrauensperson();
                    CTVertrauensperson copyVertrauensperson = ((CTVertrauensperson) strategy.copy(LocatorUtils.property(locator, "vertrauensperson", sourceVertrauensperson), sourceVertrauensperson, (this.vertrauensperson!= null)));
                    copy.setVertrauensperson(copyVertrauensperson);
                } else {
                    if (vertrauenspersonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertrauensperson = null;
                    }
                }
            }
            {
                Boolean kreditkarteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty())));
                if (kreditkarteShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKreditkarte> sourceKreditkarte;
                    sourceKreditkarte = (((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty()))?this.getKreditkarte():null);
                    @SuppressWarnings("unchecked")
                    List<CTKreditkarte> copyKreditkarte = ((List<CTKreditkarte> ) strategy.copy(LocatorUtils.property(locator, "kreditkarte", sourceKreditkarte), sourceKreditkarte, ((this.kreditkarte!= null)&&(!this.kreditkarte.isEmpty()))));
                    copy.kreditkarte = null;
                    if (copyKreditkarte!= null) {
                        List<CTKreditkarte> uniqueKreditkartel = copy.getKreditkarte();
                        uniqueKreditkartel.addAll(copyKreditkarte);
                    }
                } else {
                    if (kreditkarteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kreditkarte = null;
                    }
                }
            }
            {
                Boolean umsatzsteuerIdentifikationsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umsatzsteuerIdentifikationsnummer!= null));
                if (umsatzsteuerIdentifikationsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUmsatzsteuerIdentifikationsnummer;
                    sourceUmsatzsteuerIdentifikationsnummer = this.getUmsatzsteuerIdentifikationsnummer();
                    String copyUmsatzsteuerIdentifikationsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "umsatzsteuerIdentifikationsnummer", sourceUmsatzsteuerIdentifikationsnummer), sourceUmsatzsteuerIdentifikationsnummer, (this.umsatzsteuerIdentifikationsnummer!= null)));
                    copy.setUmsatzsteuerIdentifikationsnummer(copyUmsatzsteuerIdentifikationsnummer);
                } else {
                    if (umsatzsteuerIdentifikationsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umsatzsteuerIdentifikationsnummer = null;
                    }
                }
            }
            {
                Boolean altePartnernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.altePartnernummer!= null));
                if (altePartnernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAltePartnernummer;
                    sourceAltePartnernummer = this.getAltePartnernummer();
                    String copyAltePartnernummer = ((String) strategy.copy(LocatorUtils.property(locator, "altePartnernummer", sourceAltePartnernummer), sourceAltePartnernummer, (this.altePartnernummer!= null)));
                    copy.setAltePartnernummer(copyAltePartnernummer);
                } else {
                    if (altePartnernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.altePartnernummer = null;
                    }
                }
            }
            {
                Boolean besteuerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.besteuerung!= null));
                if (besteuerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBesteuerung sourceBesteuerung;
                    sourceBesteuerung = this.getBesteuerung();
                    CTBesteuerung copyBesteuerung = ((CTBesteuerung) strategy.copy(LocatorUtils.property(locator, "besteuerung", sourceBesteuerung), sourceBesteuerung, (this.besteuerung!= null)));
                    copy.setBesteuerung(copyBesteuerung);
                } else {
                    if (besteuerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.besteuerung = null;
                    }
                }
            }
            {
                Boolean direktmarketingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty())));
                if (direktmarketingShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTWerbeerlaubnis> sourceDirektmarketing;
                    sourceDirektmarketing = (((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty()))?this.getDirektmarketing():null);
                    @SuppressWarnings("unchecked")
                    List<CTWerbeerlaubnis> copyDirektmarketing = ((List<CTWerbeerlaubnis> ) strategy.copy(LocatorUtils.property(locator, "direktmarketing", sourceDirektmarketing), sourceDirektmarketing, ((this.direktmarketing!= null)&&(!this.direktmarketing.isEmpty()))));
                    copy.direktmarketing = null;
                    if (copyDirektmarketing!= null) {
                        List<CTWerbeerlaubnis> uniqueDirektmarketingl = copy.getDirektmarketing();
                        uniqueDirektmarketingl.addAll(copyDirektmarketing);
                    }
                } else {
                    if (direktmarketingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.direktmarketing = null;
                    }
                }
            }
            {
                Boolean finanzamtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.finanzamt!= null));
                if (finanzamtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFinanzamt;
                    sourceFinanzamt = this.getFinanzamt();
                    String copyFinanzamt = ((String) strategy.copy(LocatorUtils.property(locator, "finanzamt", sourceFinanzamt), sourceFinanzamt, (this.finanzamt!= null)));
                    copy.setFinanzamt(copyFinanzamt);
                } else {
                    if (finanzamtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.finanzamt = null;
                    }
                }
            }
            {
                Boolean partneranmerkungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partneranmerkung!= null));
                if (partneranmerkungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartneranmerkung;
                    sourcePartneranmerkung = this.getPartneranmerkung();
                    String copyPartneranmerkung = ((String) strategy.copy(LocatorUtils.property(locator, "partneranmerkung", sourcePartneranmerkung), sourcePartneranmerkung, (this.partneranmerkung!= null)));
                    copy.setPartneranmerkung(copyPartneranmerkung);
                } else {
                    if (partneranmerkungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partneranmerkung = null;
                    }
                }
            }
            {
                Boolean briefanredeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.briefanrede!= null));
                if (briefanredeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBriefanrede;
                    sourceBriefanrede = this.getBriefanrede();
                    String copyBriefanrede = ((String) strategy.copy(LocatorUtils.property(locator, "briefanrede", sourceBriefanrede), sourceBriefanrede, (this.briefanrede!= null)));
                    copy.setBriefanrede(copyBriefanrede);
                } else {
                    if (briefanredeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.briefanrede = null;
                    }
                }
            }
            {
                Boolean kommunikationspartnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kommunikationspartner!= null));
                if (kommunikationspartnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTKommunikationspartner sourceKommunikationspartner;
                    sourceKommunikationspartner = this.getKommunikationspartner();
                    CTKommunikationspartner copyKommunikationspartner = ((CTKommunikationspartner) strategy.copy(LocatorUtils.property(locator, "kommunikationspartner", sourceKommunikationspartner), sourceKommunikationspartner, (this.kommunikationspartner!= null)));
                    copy.setKommunikationspartner(copyKommunikationspartner);
                } else {
                    if (kommunikationspartnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kommunikationspartner = null;
                    }
                }
            }
            {
                Boolean partnernummerExternShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty())));
                if (partnernummerExternShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTPartnernummer> sourcePartnernummerExtern;
                    sourcePartnernummerExtern = (((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty()))?this.getPartnernummerExtern():null);
                    @SuppressWarnings("unchecked")
                    List<CTPartnernummer> copyPartnernummerExtern = ((List<CTPartnernummer> ) strategy.copy(LocatorUtils.property(locator, "partnernummerExtern", sourcePartnernummerExtern), sourcePartnernummerExtern, ((this.partnernummerExtern!= null)&&(!this.partnernummerExtern.isEmpty()))));
                    copy.partnernummerExtern = null;
                    if (copyPartnernummerExtern!= null) {
                        List<CTPartnernummer> uniquePartnernummerExternl = copy.getPartnernummerExtern();
                        uniquePartnernummerExternl.addAll(copyPartnernummerExtern);
                    }
                } else {
                    if (partnernummerExternShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnernummerExtern = null;
                    }
                }
            }
            {
                Boolean vollmachtgeberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vollmachtgeber!= null));
                if (vollmachtgeberShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVollmachtgeber sourceVollmachtgeber;
                    sourceVollmachtgeber = this.getVollmachtgeber();
                    CTVollmachtgeber copyVollmachtgeber = ((CTVollmachtgeber) strategy.copy(LocatorUtils.property(locator, "vollmachtgeber", sourceVollmachtgeber), sourceVollmachtgeber, (this.vollmachtgeber!= null)));
                    copy.setVollmachtgeber(copyVollmachtgeber);
                } else {
                    if (vollmachtgeberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vollmachtgeber = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withAnrede(STAnredeschluessel value) {
        setAnrede(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withName(String value) {
        setName(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withNamenszusatz1(String value) {
        setNamenszusatz1(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withNamenszusatz2(String value) {
        setNamenszusatz2(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnernummerVM(String value) {
        setPartnernummerVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnernummer(String value) {
        setPartnernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withVorsteuerabzugsberechtigt(Boolean value) {
        setVorsteuerabzugsberechtigt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withAnschrift(CTPartneranschrift... values) {
        if (values!= null) {
            for (CTPartneranschrift value: values) {
                getAnschrift().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withAnschrift(Collection<CTPartneranschrift> values) {
        if (values!= null) {
            getAnschrift().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withZusaetzlichePartnerdaten(CTZusaetzlichePartnerdaten... values) {
        if (values!= null) {
            for (CTZusaetzlichePartnerdaten value: values) {
                getZusaetzlichePartnerdaten().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withZusaetzlichePartnerdaten(Collection<CTZusaetzlichePartnerdaten> values) {
        if (values!= null) {
            getZusaetzlichePartnerdaten().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withKommunikationsverbindung(CTKommunikationsverbindung... values) {
        if (values!= null) {
            for (CTKommunikationsverbindung value: values) {
                getKommunikationsverbindung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withKommunikationsverbindung(Collection<CTKommunikationsverbindung> values) {
        if (values!= null) {
            getKommunikationsverbindung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withBankverbindung(CTBankverbindungBasis... values) {
        if (values!= null) {
            for (CTBankverbindungBasis value: values) {
                getBankverbindung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withBankverbindung(Collection<CTBankverbindungBasis> values) {
        if (values!= null) {
            getBankverbindung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withHandeltAufRechnungVon(CTHandeltAufRechnungVon... values) {
        if (values!= null) {
            for (CTHandeltAufRechnungVon value: values) {
                getHandeltAufRechnungVon().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withHandeltAufRechnungVon(Collection<CTHandeltAufRechnungVon> values) {
        if (values!= null) {
            getHandeltAufRechnungVon().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withGruppenvertragspartner(CTGruppenvertragspartner... values) {
        if (values!= null) {
            for (CTGruppenvertragspartner value: values) {
                getGruppenvertragspartner().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withGruppenvertragspartner(Collection<CTGruppenvertragspartner> values) {
        if (values!= null) {
            getGruppenvertragspartner().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnerbeziehung(CTPartnerbeziehung... values) {
        if (values!= null) {
            for (CTPartnerbeziehung value: values) {
                getPartnerbeziehung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnerbeziehung(Collection<CTPartnerbeziehung> values) {
        if (values!= null) {
            getPartnerbeziehung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withVertrauensperson(CTVertrauensperson value) {
        setVertrauensperson(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withKreditkarte(CTKreditkarte... values) {
        if (values!= null) {
            for (CTKreditkarte value: values) {
                getKreditkarte().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withKreditkarte(Collection<CTKreditkarte> values) {
        if (values!= null) {
            getKreditkarte().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withUmsatzsteuerIdentifikationsnummer(String value) {
        setUmsatzsteuerIdentifikationsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withAltePartnernummer(String value) {
        setAltePartnernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withBesteuerung(CTBesteuerung value) {
        setBesteuerung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withDirektmarketing(CTWerbeerlaubnis... values) {
        if (values!= null) {
            for (CTWerbeerlaubnis value: values) {
                getDirektmarketing().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withDirektmarketing(Collection<CTWerbeerlaubnis> values) {
        if (values!= null) {
            getDirektmarketing().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withFinanzamt(String value) {
        setFinanzamt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartneranmerkung(String value) {
        setPartneranmerkung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withBriefanrede(String value) {
        setBriefanrede(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withKommunikationspartner(CTKommunikationspartner value) {
        setKommunikationspartner(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnernummerExtern(CTPartnernummer... values) {
        if (values!= null) {
            for (CTPartnernummer value: values) {
                getPartnernummerExtern().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withPartnernummerExtern(Collection<CTPartnernummer> values) {
        if (values!= null) {
            getPartnernummerExtern().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withVollmachtgeber(CTVollmachtgeber value) {
        setVollmachtgeber(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartner withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
