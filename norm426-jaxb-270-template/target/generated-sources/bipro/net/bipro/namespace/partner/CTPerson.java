
package net.bipro.namespace.partner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTPartnernummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAnredeschluessel;
import net.bipro.namespace.datentypen.STFamilienstand;
import net.bipro.namespace.datentypen.STGeschlecht;
import net.bipro.namespace.datentypen.STLaenderkennzeichen;
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
 * Natuerliche Person. Darf nicht Projekt-spezifisch abgeleitet werden (vgl. Kommentar zu Partner). Kann Vertretungsberechtigter einer juristischen Person sein.
 * 
 * <p>Java class for CT_Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_Partner"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vorname" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Geburtsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Geschlecht" type="{http://www.bipro.net/namespace/datentypen}ST_Geschlecht" minOccurs="0"/&gt;
 *         &lt;element name="Titel" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Geburtsort" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Staatsangehoerigkeit" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="Familienstand" type="{http://www.bipro.net/namespace/datentypen}ST_Familienstand" minOccurs="0"/&gt;
 *         &lt;element name="Adelspraedikat" type="{http://www.bipro.net/namespace/datentypen}ST_Text017" minOccurs="0"/&gt;
 *         &lt;element name="Geburtsname" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Geburtsland" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="InDeutschlandAnsaessigSeit" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Steueridentifikationsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Steueridentifikationsnummer" minOccurs="0"/&gt;
 *         &lt;element name="Ausweis" type="{http://www.bipro.net/namespace/partner}CT_Ausweis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GesetzlicheKrankenversicherung" type="{http://www.bipro.net/namespace/partner}CT_GesetzlicheKrankenversicherung" minOccurs="0"/&gt;
 *         &lt;element name="Einkommenssteuer" type="{http://www.bipro.net/namespace/partner}CT_Einkommenssteuer" minOccurs="0"/&gt;
 *         &lt;element name="Berufstaetigkeit" type="{http://www.bipro.net/namespace/partner}CT_Berufstaetigkeit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Einkommen" type="{http://www.bipro.net/namespace/partner}CT_Einkommensart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Haushalt" type="{http://www.bipro.net/namespace/partner}CT_Haushalt" minOccurs="0"/&gt;
 *         &lt;element name="Ausbildung" type="{http://www.bipro.net/namespace/partner}CT_Ausbildung" minOccurs="0"/&gt;
 *         &lt;element name="Gesundheitsdaten" type="{http://www.bipro.net/namespace/partner}CT_Gesundheitsdaten" minOccurs="0"/&gt;
 *         &lt;element name="KuenstlernameOrdensname" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Sozialversicherungsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Sozialversicherungsnummer" minOccurs="0"/&gt;
 *         &lt;element name="AlteSteuernummer" type="{http://www.bipro.net/namespace/datentypen}ST_Steuernummer" minOccurs="0"/&gt;
 *         &lt;element name="Fuehrerschein" type="{http://www.bipro.net/namespace/partner}CT_Fuehrerschein" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Person", propOrder = {
    "vorname",
    "geburtsdatum",
    "geschlecht",
    "titel",
    "geburtsort",
    "staatsangehoerigkeit",
    "familienstand",
    "adelspraedikat",
    "geburtsname",
    "geburtsland",
    "inDeutschlandAnsaessigSeit",
    "steueridentifikationsnummer",
    "ausweis",
    "gesetzlicheKrankenversicherung",
    "einkommenssteuer",
    "berufstaetigkeit",
    "einkommen",
    "haushalt",
    "ausbildung",
    "gesundheitsdaten",
    "kuenstlernameOrdensname",
    "sozialversicherungsnummer",
    "alteSteuernummer",
    "fuehrerschein"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTPerson
    extends CTPartner
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Vorname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String vorname;
    @XmlElement(name = "Geburtsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String geburtsdatum;
    @XmlElement(name = "Geschlecht")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STGeschlecht geschlecht;
    @XmlElement(name = "Titel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String titel;
    @XmlElement(name = "Geburtsort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String geburtsort;
    @XmlElement(name = "Staatsangehoerigkeit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen staatsangehoerigkeit;
    @XmlElement(name = "Familienstand")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STFamilienstand familienstand;
    @XmlElement(name = "Adelspraedikat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String adelspraedikat;
    @XmlElement(name = "Geburtsname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String geburtsname;
    @XmlElement(name = "Geburtsland")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen geburtsland;
    @XmlElement(name = "InDeutschlandAnsaessigSeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String inDeutschlandAnsaessigSeit;
    @XmlElement(name = "Steueridentifikationsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String steueridentifikationsnummer;
    @XmlElement(name = "Ausweis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAusweis> ausweis;
    @XmlElement(name = "GesetzlicheKrankenversicherung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTGesetzlicheKrankenversicherung gesetzlicheKrankenversicherung;
    @XmlElement(name = "Einkommenssteuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTEinkommenssteuer einkommenssteuer;
    @XmlElement(name = "Berufstaetigkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTBerufstaetigkeit> berufstaetigkeit;
    @XmlElement(name = "Einkommen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTEinkommensart> einkommen;
    @XmlElement(name = "Haushalt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTHaushalt haushalt;
    @XmlElement(name = "Ausbildung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTAusbildung ausbildung;
    @XmlElement(name = "Gesundheitsdaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTGesundheitsdaten gesundheitsdaten;
    @XmlElement(name = "KuenstlernameOrdensname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String kuenstlernameOrdensname;
    @XmlElement(name = "Sozialversicherungsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String sozialversicherungsnummer;
    @XmlElement(name = "AlteSteuernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String alteSteuernummer;
    @XmlElement(name = "Fuehrerschein")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTFuehrerschein> fuehrerschein;

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the geburtsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * Sets the value of the geburtsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsdatum(String value) {
        this.geburtsdatum = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link STGeschlecht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STGeschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGeschlecht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeschlecht(STGeschlecht value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the geburtsort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGeburtsort() {
        return geburtsort;
    }

    /**
     * Sets the value of the geburtsort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsort(String value) {
        this.geburtsort = value;
    }

    /**
     * Gets the value of the staatsangehoerigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getStaatsangehoerigkeit() {
        return staatsangehoerigkeit;
    }

    /**
     * Sets the value of the staatsangehoerigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setStaatsangehoerigkeit(STLaenderkennzeichen value) {
        this.staatsangehoerigkeit = value;
    }

    /**
     * Gets the value of the familienstand property.
     * 
     * @return
     *     possible object is
     *     {@link STFamilienstand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STFamilienstand getFamilienstand() {
        return familienstand;
    }

    /**
     * Sets the value of the familienstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link STFamilienstand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFamilienstand(STFamilienstand value) {
        this.familienstand = value;
    }

    /**
     * Gets the value of the adelspraedikat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAdelspraedikat() {
        return adelspraedikat;
    }

    /**
     * Sets the value of the adelspraedikat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAdelspraedikat(String value) {
        this.adelspraedikat = value;
    }

    /**
     * Gets the value of the geburtsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGeburtsname() {
        return geburtsname;
    }

    /**
     * Sets the value of the geburtsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsname(String value) {
        this.geburtsname = value;
    }

    /**
     * Gets the value of the geburtsland property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getGeburtsland() {
        return geburtsland;
    }

    /**
     * Sets the value of the geburtsland property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsland(STLaenderkennzeichen value) {
        this.geburtsland = value;
    }

    /**
     * Gets the value of the inDeutschlandAnsaessigSeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getInDeutschlandAnsaessigSeit() {
        return inDeutschlandAnsaessigSeit;
    }

    /**
     * Sets the value of the inDeutschlandAnsaessigSeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setInDeutschlandAnsaessigSeit(String value) {
        this.inDeutschlandAnsaessigSeit = value;
    }

    /**
     * Gets the value of the steueridentifikationsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSteueridentifikationsnummer() {
        return steueridentifikationsnummer;
    }

    /**
     * Sets the value of the steueridentifikationsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSteueridentifikationsnummer(String value) {
        this.steueridentifikationsnummer = value;
    }

    /**
     * Gets the value of the ausweis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausweis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusweis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAusweis }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTAusweis> getAusweis() {
        if (ausweis == null) {
            ausweis = new ArrayList<CTAusweis>();
        }
        return this.ausweis;
    }

    /**
     * Gets the value of the gesetzlicheKrankenversicherung property.
     * 
     * @return
     *     possible object is
     *     {@link CTGesetzlicheKrankenversicherung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung getGesetzlicheKrankenversicherung() {
        return gesetzlicheKrankenversicherung;
    }

    /**
     * Sets the value of the gesetzlicheKrankenversicherung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGesetzlicheKrankenversicherung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGesetzlicheKrankenversicherung(CTGesetzlicheKrankenversicherung value) {
        this.gesetzlicheKrankenversicherung = value;
    }

    /**
     * Gets the value of the einkommenssteuer property.
     * 
     * @return
     *     possible object is
     *     {@link CTEinkommenssteuer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommenssteuer getEinkommenssteuer() {
        return einkommenssteuer;
    }

    /**
     * Sets the value of the einkommenssteuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEinkommenssteuer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinkommenssteuer(CTEinkommenssteuer value) {
        this.einkommenssteuer = value;
    }

    /**
     * Gets the value of the berufstaetigkeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the berufstaetigkeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBerufstaetigkeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBerufstaetigkeit }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTBerufstaetigkeit> getBerufstaetigkeit() {
        if (berufstaetigkeit == null) {
            berufstaetigkeit = new ArrayList<CTBerufstaetigkeit>();
        }
        return this.berufstaetigkeit;
    }

    /**
     * Gets the value of the einkommen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the einkommen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEinkommen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEinkommensart }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTEinkommensart> getEinkommen() {
        if (einkommen == null) {
            einkommen = new ArrayList<CTEinkommensart>();
        }
        return this.einkommen;
    }

    /**
     * Gets the value of the haushalt property.
     * 
     * @return
     *     possible object is
     *     {@link CTHaushalt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt getHaushalt() {
        return haushalt;
    }

    /**
     * Sets the value of the haushalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTHaushalt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHaushalt(CTHaushalt value) {
        this.haushalt = value;
    }

    /**
     * Gets the value of the ausbildung property.
     * 
     * @return
     *     possible object is
     *     {@link CTAusbildung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung getAusbildung() {
        return ausbildung;
    }

    /**
     * Sets the value of the ausbildung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAusbildung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAusbildung(CTAusbildung value) {
        this.ausbildung = value;
    }

    /**
     * Gets the value of the gesundheitsdaten property.
     * 
     * @return
     *     possible object is
     *     {@link CTGesundheitsdaten }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten getGesundheitsdaten() {
        return gesundheitsdaten;
    }

    /**
     * Sets the value of the gesundheitsdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGesundheitsdaten }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGesundheitsdaten(CTGesundheitsdaten value) {
        this.gesundheitsdaten = value;
    }

    /**
     * Gets the value of the kuenstlernameOrdensname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getKuenstlernameOrdensname() {
        return kuenstlernameOrdensname;
    }

    /**
     * Sets the value of the kuenstlernameOrdensname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKuenstlernameOrdensname(String value) {
        this.kuenstlernameOrdensname = value;
    }

    /**
     * Gets the value of the sozialversicherungsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSozialversicherungsnummer() {
        return sozialversicherungsnummer;
    }

    /**
     * Sets the value of the sozialversicherungsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSozialversicherungsnummer(String value) {
        this.sozialversicherungsnummer = value;
    }

    /**
     * Gets the value of the alteSteuernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAlteSteuernummer() {
        return alteSteuernummer;
    }

    /**
     * Sets the value of the alteSteuernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAlteSteuernummer(String value) {
        this.alteSteuernummer = value;
    }

    /**
     * Gets the value of the fuehrerschein property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuehrerschein property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuehrerschein().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTFuehrerschein }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTFuehrerschein> getFuehrerschein() {
        if (fuehrerschein == null) {
            fuehrerschein = new ArrayList<CTFuehrerschein>();
        }
        return this.fuehrerschein;
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
        final CTPerson that = ((CTPerson) object);
        {
            String lhsVorname;
            lhsVorname = this.getVorname();
            String rhsVorname;
            rhsVorname = that.getVorname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorname", lhsVorname), LocatorUtils.property(thatLocator, "vorname", rhsVorname), lhsVorname, rhsVorname, (this.vorname!= null), (that.vorname!= null))) {
                return false;
            }
        }
        {
            String lhsGeburtsdatum;
            lhsGeburtsdatum = this.getGeburtsdatum();
            String rhsGeburtsdatum;
            rhsGeburtsdatum = that.getGeburtsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsdatum", lhsGeburtsdatum), LocatorUtils.property(thatLocator, "geburtsdatum", rhsGeburtsdatum), lhsGeburtsdatum, rhsGeburtsdatum, (this.geburtsdatum!= null), (that.geburtsdatum!= null))) {
                return false;
            }
        }
        {
            STGeschlecht lhsGeschlecht;
            lhsGeschlecht = this.getGeschlecht();
            STGeschlecht rhsGeschlecht;
            rhsGeschlecht = that.getGeschlecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlecht", lhsGeschlecht), LocatorUtils.property(thatLocator, "geschlecht", rhsGeschlecht), lhsGeschlecht, rhsGeschlecht, (this.geschlecht!= null), (that.geschlecht!= null))) {
                return false;
            }
        }
        {
            String lhsTitel;
            lhsTitel = this.getTitel();
            String rhsTitel;
            rhsTitel = that.getTitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titel", lhsTitel), LocatorUtils.property(thatLocator, "titel", rhsTitel), lhsTitel, rhsTitel, (this.titel!= null), (that.titel!= null))) {
                return false;
            }
        }
        {
            String lhsGeburtsort;
            lhsGeburtsort = this.getGeburtsort();
            String rhsGeburtsort;
            rhsGeburtsort = that.getGeburtsort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsort", lhsGeburtsort), LocatorUtils.property(thatLocator, "geburtsort", rhsGeburtsort), lhsGeburtsort, rhsGeburtsort, (this.geburtsort!= null), (that.geburtsort!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsStaatsangehoerigkeit;
            lhsStaatsangehoerigkeit = this.getStaatsangehoerigkeit();
            STLaenderkennzeichen rhsStaatsangehoerigkeit;
            rhsStaatsangehoerigkeit = that.getStaatsangehoerigkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staatsangehoerigkeit", lhsStaatsangehoerigkeit), LocatorUtils.property(thatLocator, "staatsangehoerigkeit", rhsStaatsangehoerigkeit), lhsStaatsangehoerigkeit, rhsStaatsangehoerigkeit, (this.staatsangehoerigkeit!= null), (that.staatsangehoerigkeit!= null))) {
                return false;
            }
        }
        {
            STFamilienstand lhsFamilienstand;
            lhsFamilienstand = this.getFamilienstand();
            STFamilienstand rhsFamilienstand;
            rhsFamilienstand = that.getFamilienstand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "familienstand", lhsFamilienstand), LocatorUtils.property(thatLocator, "familienstand", rhsFamilienstand), lhsFamilienstand, rhsFamilienstand, (this.familienstand!= null), (that.familienstand!= null))) {
                return false;
            }
        }
        {
            String lhsAdelspraedikat;
            lhsAdelspraedikat = this.getAdelspraedikat();
            String rhsAdelspraedikat;
            rhsAdelspraedikat = that.getAdelspraedikat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adelspraedikat", lhsAdelspraedikat), LocatorUtils.property(thatLocator, "adelspraedikat", rhsAdelspraedikat), lhsAdelspraedikat, rhsAdelspraedikat, (this.adelspraedikat!= null), (that.adelspraedikat!= null))) {
                return false;
            }
        }
        {
            String lhsGeburtsname;
            lhsGeburtsname = this.getGeburtsname();
            String rhsGeburtsname;
            rhsGeburtsname = that.getGeburtsname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsname", lhsGeburtsname), LocatorUtils.property(thatLocator, "geburtsname", rhsGeburtsname), lhsGeburtsname, rhsGeburtsname, (this.geburtsname!= null), (that.geburtsname!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsGeburtsland;
            lhsGeburtsland = this.getGeburtsland();
            STLaenderkennzeichen rhsGeburtsland;
            rhsGeburtsland = that.getGeburtsland();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsland", lhsGeburtsland), LocatorUtils.property(thatLocator, "geburtsland", rhsGeburtsland), lhsGeburtsland, rhsGeburtsland, (this.geburtsland!= null), (that.geburtsland!= null))) {
                return false;
            }
        }
        {
            String lhsInDeutschlandAnsaessigSeit;
            lhsInDeutschlandAnsaessigSeit = this.getInDeutschlandAnsaessigSeit();
            String rhsInDeutschlandAnsaessigSeit;
            rhsInDeutschlandAnsaessigSeit = that.getInDeutschlandAnsaessigSeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inDeutschlandAnsaessigSeit", lhsInDeutschlandAnsaessigSeit), LocatorUtils.property(thatLocator, "inDeutschlandAnsaessigSeit", rhsInDeutschlandAnsaessigSeit), lhsInDeutschlandAnsaessigSeit, rhsInDeutschlandAnsaessigSeit, (this.inDeutschlandAnsaessigSeit!= null), (that.inDeutschlandAnsaessigSeit!= null))) {
                return false;
            }
        }
        {
            String lhsSteueridentifikationsnummer;
            lhsSteueridentifikationsnummer = this.getSteueridentifikationsnummer();
            String rhsSteueridentifikationsnummer;
            rhsSteueridentifikationsnummer = that.getSteueridentifikationsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steueridentifikationsnummer", lhsSteueridentifikationsnummer), LocatorUtils.property(thatLocator, "steueridentifikationsnummer", rhsSteueridentifikationsnummer), lhsSteueridentifikationsnummer, rhsSteueridentifikationsnummer, (this.steueridentifikationsnummer!= null), (that.steueridentifikationsnummer!= null))) {
                return false;
            }
        }
        {
            List<CTAusweis> lhsAusweis;
            lhsAusweis = (((this.ausweis!= null)&&(!this.ausweis.isEmpty()))?this.getAusweis():null);
            List<CTAusweis> rhsAusweis;
            rhsAusweis = (((that.ausweis!= null)&&(!that.ausweis.isEmpty()))?that.getAusweis():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausweis", lhsAusweis), LocatorUtils.property(thatLocator, "ausweis", rhsAusweis), lhsAusweis, rhsAusweis, ((this.ausweis!= null)&&(!this.ausweis.isEmpty())), ((that.ausweis!= null)&&(!that.ausweis.isEmpty())))) {
                return false;
            }
        }
        {
            CTGesetzlicheKrankenversicherung lhsGesetzlicheKrankenversicherung;
            lhsGesetzlicheKrankenversicherung = this.getGesetzlicheKrankenversicherung();
            CTGesetzlicheKrankenversicherung rhsGesetzlicheKrankenversicherung;
            rhsGesetzlicheKrankenversicherung = that.getGesetzlicheKrankenversicherung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesetzlicheKrankenversicherung", lhsGesetzlicheKrankenversicherung), LocatorUtils.property(thatLocator, "gesetzlicheKrankenversicherung", rhsGesetzlicheKrankenversicherung), lhsGesetzlicheKrankenversicherung, rhsGesetzlicheKrankenversicherung, (this.gesetzlicheKrankenversicherung!= null), (that.gesetzlicheKrankenversicherung!= null))) {
                return false;
            }
        }
        {
            CTEinkommenssteuer lhsEinkommenssteuer;
            lhsEinkommenssteuer = this.getEinkommenssteuer();
            CTEinkommenssteuer rhsEinkommenssteuer;
            rhsEinkommenssteuer = that.getEinkommenssteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkommenssteuer", lhsEinkommenssteuer), LocatorUtils.property(thatLocator, "einkommenssteuer", rhsEinkommenssteuer), lhsEinkommenssteuer, rhsEinkommenssteuer, (this.einkommenssteuer!= null), (that.einkommenssteuer!= null))) {
                return false;
            }
        }
        {
            List<CTBerufstaetigkeit> lhsBerufstaetigkeit;
            lhsBerufstaetigkeit = (((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty()))?this.getBerufstaetigkeit():null);
            List<CTBerufstaetigkeit> rhsBerufstaetigkeit;
            rhsBerufstaetigkeit = (((that.berufstaetigkeit!= null)&&(!that.berufstaetigkeit.isEmpty()))?that.getBerufstaetigkeit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berufstaetigkeit", lhsBerufstaetigkeit), LocatorUtils.property(thatLocator, "berufstaetigkeit", rhsBerufstaetigkeit), lhsBerufstaetigkeit, rhsBerufstaetigkeit, ((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty())), ((that.berufstaetigkeit!= null)&&(!that.berufstaetigkeit.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTEinkommensart> lhsEinkommen;
            lhsEinkommen = (((this.einkommen!= null)&&(!this.einkommen.isEmpty()))?this.getEinkommen():null);
            List<CTEinkommensart> rhsEinkommen;
            rhsEinkommen = (((that.einkommen!= null)&&(!that.einkommen.isEmpty()))?that.getEinkommen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkommen", lhsEinkommen), LocatorUtils.property(thatLocator, "einkommen", rhsEinkommen), lhsEinkommen, rhsEinkommen, ((this.einkommen!= null)&&(!this.einkommen.isEmpty())), ((that.einkommen!= null)&&(!that.einkommen.isEmpty())))) {
                return false;
            }
        }
        {
            CTHaushalt lhsHaushalt;
            lhsHaushalt = this.getHaushalt();
            CTHaushalt rhsHaushalt;
            rhsHaushalt = that.getHaushalt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haushalt", lhsHaushalt), LocatorUtils.property(thatLocator, "haushalt", rhsHaushalt), lhsHaushalt, rhsHaushalt, (this.haushalt!= null), (that.haushalt!= null))) {
                return false;
            }
        }
        {
            CTAusbildung lhsAusbildung;
            lhsAusbildung = this.getAusbildung();
            CTAusbildung rhsAusbildung;
            rhsAusbildung = that.getAusbildung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausbildung", lhsAusbildung), LocatorUtils.property(thatLocator, "ausbildung", rhsAusbildung), lhsAusbildung, rhsAusbildung, (this.ausbildung!= null), (that.ausbildung!= null))) {
                return false;
            }
        }
        {
            CTGesundheitsdaten lhsGesundheitsdaten;
            lhsGesundheitsdaten = this.getGesundheitsdaten();
            CTGesundheitsdaten rhsGesundheitsdaten;
            rhsGesundheitsdaten = that.getGesundheitsdaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesundheitsdaten", lhsGesundheitsdaten), LocatorUtils.property(thatLocator, "gesundheitsdaten", rhsGesundheitsdaten), lhsGesundheitsdaten, rhsGesundheitsdaten, (this.gesundheitsdaten!= null), (that.gesundheitsdaten!= null))) {
                return false;
            }
        }
        {
            String lhsKuenstlernameOrdensname;
            lhsKuenstlernameOrdensname = this.getKuenstlernameOrdensname();
            String rhsKuenstlernameOrdensname;
            rhsKuenstlernameOrdensname = that.getKuenstlernameOrdensname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kuenstlernameOrdensname", lhsKuenstlernameOrdensname), LocatorUtils.property(thatLocator, "kuenstlernameOrdensname", rhsKuenstlernameOrdensname), lhsKuenstlernameOrdensname, rhsKuenstlernameOrdensname, (this.kuenstlernameOrdensname!= null), (that.kuenstlernameOrdensname!= null))) {
                return false;
            }
        }
        {
            String lhsSozialversicherungsnummer;
            lhsSozialversicherungsnummer = this.getSozialversicherungsnummer();
            String rhsSozialversicherungsnummer;
            rhsSozialversicherungsnummer = that.getSozialversicherungsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sozialversicherungsnummer", lhsSozialversicherungsnummer), LocatorUtils.property(thatLocator, "sozialversicherungsnummer", rhsSozialversicherungsnummer), lhsSozialversicherungsnummer, rhsSozialversicherungsnummer, (this.sozialversicherungsnummer!= null), (that.sozialversicherungsnummer!= null))) {
                return false;
            }
        }
        {
            String lhsAlteSteuernummer;
            lhsAlteSteuernummer = this.getAlteSteuernummer();
            String rhsAlteSteuernummer;
            rhsAlteSteuernummer = that.getAlteSteuernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alteSteuernummer", lhsAlteSteuernummer), LocatorUtils.property(thatLocator, "alteSteuernummer", rhsAlteSteuernummer), lhsAlteSteuernummer, rhsAlteSteuernummer, (this.alteSteuernummer!= null), (that.alteSteuernummer!= null))) {
                return false;
            }
        }
        {
            List<CTFuehrerschein> lhsFuehrerschein;
            lhsFuehrerschein = (((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty()))?this.getFuehrerschein():null);
            List<CTFuehrerschein> rhsFuehrerschein;
            rhsFuehrerschein = (((that.fuehrerschein!= null)&&(!that.fuehrerschein.isEmpty()))?that.getFuehrerschein():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fuehrerschein", lhsFuehrerschein), LocatorUtils.property(thatLocator, "fuehrerschein", rhsFuehrerschein), lhsFuehrerschein, rhsFuehrerschein, ((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty())), ((that.fuehrerschein!= null)&&(!that.fuehrerschein.isEmpty())))) {
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
            String theVorname;
            theVorname = this.getVorname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorname", theVorname), currentHashCode, theVorname, (this.vorname!= null));
        }
        {
            String theGeburtsdatum;
            theGeburtsdatum = this.getGeburtsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsdatum", theGeburtsdatum), currentHashCode, theGeburtsdatum, (this.geburtsdatum!= null));
        }
        {
            STGeschlecht theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geschlecht", theGeschlecht), currentHashCode, theGeschlecht, (this.geschlecht!= null));
        }
        {
            String theTitel;
            theTitel = this.getTitel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "titel", theTitel), currentHashCode, theTitel, (this.titel!= null));
        }
        {
            String theGeburtsort;
            theGeburtsort = this.getGeburtsort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsort", theGeburtsort), currentHashCode, theGeburtsort, (this.geburtsort!= null));
        }
        {
            STLaenderkennzeichen theStaatsangehoerigkeit;
            theStaatsangehoerigkeit = this.getStaatsangehoerigkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staatsangehoerigkeit", theStaatsangehoerigkeit), currentHashCode, theStaatsangehoerigkeit, (this.staatsangehoerigkeit!= null));
        }
        {
            STFamilienstand theFamilienstand;
            theFamilienstand = this.getFamilienstand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "familienstand", theFamilienstand), currentHashCode, theFamilienstand, (this.familienstand!= null));
        }
        {
            String theAdelspraedikat;
            theAdelspraedikat = this.getAdelspraedikat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adelspraedikat", theAdelspraedikat), currentHashCode, theAdelspraedikat, (this.adelspraedikat!= null));
        }
        {
            String theGeburtsname;
            theGeburtsname = this.getGeburtsname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsname", theGeburtsname), currentHashCode, theGeburtsname, (this.geburtsname!= null));
        }
        {
            STLaenderkennzeichen theGeburtsland;
            theGeburtsland = this.getGeburtsland();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsland", theGeburtsland), currentHashCode, theGeburtsland, (this.geburtsland!= null));
        }
        {
            String theInDeutschlandAnsaessigSeit;
            theInDeutschlandAnsaessigSeit = this.getInDeutschlandAnsaessigSeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inDeutschlandAnsaessigSeit", theInDeutschlandAnsaessigSeit), currentHashCode, theInDeutschlandAnsaessigSeit, (this.inDeutschlandAnsaessigSeit!= null));
        }
        {
            String theSteueridentifikationsnummer;
            theSteueridentifikationsnummer = this.getSteueridentifikationsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steueridentifikationsnummer", theSteueridentifikationsnummer), currentHashCode, theSteueridentifikationsnummer, (this.steueridentifikationsnummer!= null));
        }
        {
            List<CTAusweis> theAusweis;
            theAusweis = (((this.ausweis!= null)&&(!this.ausweis.isEmpty()))?this.getAusweis():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausweis", theAusweis), currentHashCode, theAusweis, ((this.ausweis!= null)&&(!this.ausweis.isEmpty())));
        }
        {
            CTGesetzlicheKrankenversicherung theGesetzlicheKrankenversicherung;
            theGesetzlicheKrankenversicherung = this.getGesetzlicheKrankenversicherung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gesetzlicheKrankenversicherung", theGesetzlicheKrankenversicherung), currentHashCode, theGesetzlicheKrankenversicherung, (this.gesetzlicheKrankenversicherung!= null));
        }
        {
            CTEinkommenssteuer theEinkommenssteuer;
            theEinkommenssteuer = this.getEinkommenssteuer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einkommenssteuer", theEinkommenssteuer), currentHashCode, theEinkommenssteuer, (this.einkommenssteuer!= null));
        }
        {
            List<CTBerufstaetigkeit> theBerufstaetigkeit;
            theBerufstaetigkeit = (((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty()))?this.getBerufstaetigkeit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berufstaetigkeit", theBerufstaetigkeit), currentHashCode, theBerufstaetigkeit, ((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty())));
        }
        {
            List<CTEinkommensart> theEinkommen;
            theEinkommen = (((this.einkommen!= null)&&(!this.einkommen.isEmpty()))?this.getEinkommen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einkommen", theEinkommen), currentHashCode, theEinkommen, ((this.einkommen!= null)&&(!this.einkommen.isEmpty())));
        }
        {
            CTHaushalt theHaushalt;
            theHaushalt = this.getHaushalt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haushalt", theHaushalt), currentHashCode, theHaushalt, (this.haushalt!= null));
        }
        {
            CTAusbildung theAusbildung;
            theAusbildung = this.getAusbildung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausbildung", theAusbildung), currentHashCode, theAusbildung, (this.ausbildung!= null));
        }
        {
            CTGesundheitsdaten theGesundheitsdaten;
            theGesundheitsdaten = this.getGesundheitsdaten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gesundheitsdaten", theGesundheitsdaten), currentHashCode, theGesundheitsdaten, (this.gesundheitsdaten!= null));
        }
        {
            String theKuenstlernameOrdensname;
            theKuenstlernameOrdensname = this.getKuenstlernameOrdensname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kuenstlernameOrdensname", theKuenstlernameOrdensname), currentHashCode, theKuenstlernameOrdensname, (this.kuenstlernameOrdensname!= null));
        }
        {
            String theSozialversicherungsnummer;
            theSozialversicherungsnummer = this.getSozialversicherungsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sozialversicherungsnummer", theSozialversicherungsnummer), currentHashCode, theSozialversicherungsnummer, (this.sozialversicherungsnummer!= null));
        }
        {
            String theAlteSteuernummer;
            theAlteSteuernummer = this.getAlteSteuernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alteSteuernummer", theAlteSteuernummer), currentHashCode, theAlteSteuernummer, (this.alteSteuernummer!= null));
        }
        {
            List<CTFuehrerschein> theFuehrerschein;
            theFuehrerschein = (((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty()))?this.getFuehrerschein():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fuehrerschein", theFuehrerschein), currentHashCode, theFuehrerschein, ((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty())));
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
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof CTPerson) {
            final CTPerson copy = ((CTPerson) draftCopy);
            {
                Boolean vornameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorname!= null));
                if (vornameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVorname;
                    sourceVorname = this.getVorname();
                    String copyVorname = ((String) strategy.copy(LocatorUtils.property(locator, "vorname", sourceVorname), sourceVorname, (this.vorname!= null)));
                    copy.setVorname(copyVorname);
                } else {
                    if (vornameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorname = null;
                    }
                }
            }
            {
                Boolean geburtsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsdatum!= null));
                if (geburtsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeburtsdatum;
                    sourceGeburtsdatum = this.getGeburtsdatum();
                    String copyGeburtsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "geburtsdatum", sourceGeburtsdatum), sourceGeburtsdatum, (this.geburtsdatum!= null)));
                    copy.setGeburtsdatum(copyGeburtsdatum);
                } else {
                    if (geburtsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsdatum = null;
                    }
                }
            }
            {
                Boolean geschlechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlecht!= null));
                if (geschlechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGeschlecht sourceGeschlecht;
                    sourceGeschlecht = this.getGeschlecht();
                    STGeschlecht copyGeschlecht = ((STGeschlecht) strategy.copy(LocatorUtils.property(locator, "geschlecht", sourceGeschlecht), sourceGeschlecht, (this.geschlecht!= null)));
                    copy.setGeschlecht(copyGeschlecht);
                } else {
                    if (geschlechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschlecht = null;
                    }
                }
            }
            {
                Boolean titelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.titel!= null));
                if (titelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitel;
                    sourceTitel = this.getTitel();
                    String copyTitel = ((String) strategy.copy(LocatorUtils.property(locator, "titel", sourceTitel), sourceTitel, (this.titel!= null)));
                    copy.setTitel(copyTitel);
                } else {
                    if (titelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.titel = null;
                    }
                }
            }
            {
                Boolean geburtsortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsort!= null));
                if (geburtsortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeburtsort;
                    sourceGeburtsort = this.getGeburtsort();
                    String copyGeburtsort = ((String) strategy.copy(LocatorUtils.property(locator, "geburtsort", sourceGeburtsort), sourceGeburtsort, (this.geburtsort!= null)));
                    copy.setGeburtsort(copyGeburtsort);
                } else {
                    if (geburtsortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsort = null;
                    }
                }
            }
            {
                Boolean staatsangehoerigkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.staatsangehoerigkeit!= null));
                if (staatsangehoerigkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceStaatsangehoerigkeit;
                    sourceStaatsangehoerigkeit = this.getStaatsangehoerigkeit();
                    STLaenderkennzeichen copyStaatsangehoerigkeit = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "staatsangehoerigkeit", sourceStaatsangehoerigkeit), sourceStaatsangehoerigkeit, (this.staatsangehoerigkeit!= null)));
                    copy.setStaatsangehoerigkeit(copyStaatsangehoerigkeit);
                } else {
                    if (staatsangehoerigkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.staatsangehoerigkeit = null;
                    }
                }
            }
            {
                Boolean familienstandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.familienstand!= null));
                if (familienstandShouldBeCopiedAndSet == Boolean.TRUE) {
                    STFamilienstand sourceFamilienstand;
                    sourceFamilienstand = this.getFamilienstand();
                    STFamilienstand copyFamilienstand = ((STFamilienstand) strategy.copy(LocatorUtils.property(locator, "familienstand", sourceFamilienstand), sourceFamilienstand, (this.familienstand!= null)));
                    copy.setFamilienstand(copyFamilienstand);
                } else {
                    if (familienstandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.familienstand = null;
                    }
                }
            }
            {
                Boolean adelspraedikatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adelspraedikat!= null));
                if (adelspraedikatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAdelspraedikat;
                    sourceAdelspraedikat = this.getAdelspraedikat();
                    String copyAdelspraedikat = ((String) strategy.copy(LocatorUtils.property(locator, "adelspraedikat", sourceAdelspraedikat), sourceAdelspraedikat, (this.adelspraedikat!= null)));
                    copy.setAdelspraedikat(copyAdelspraedikat);
                } else {
                    if (adelspraedikatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adelspraedikat = null;
                    }
                }
            }
            {
                Boolean geburtsnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsname!= null));
                if (geburtsnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeburtsname;
                    sourceGeburtsname = this.getGeburtsname();
                    String copyGeburtsname = ((String) strategy.copy(LocatorUtils.property(locator, "geburtsname", sourceGeburtsname), sourceGeburtsname, (this.geburtsname!= null)));
                    copy.setGeburtsname(copyGeburtsname);
                } else {
                    if (geburtsnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsname = null;
                    }
                }
            }
            {
                Boolean geburtslandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsland!= null));
                if (geburtslandShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceGeburtsland;
                    sourceGeburtsland = this.getGeburtsland();
                    STLaenderkennzeichen copyGeburtsland = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "geburtsland", sourceGeburtsland), sourceGeburtsland, (this.geburtsland!= null)));
                    copy.setGeburtsland(copyGeburtsland);
                } else {
                    if (geburtslandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsland = null;
                    }
                }
            }
            {
                Boolean inDeutschlandAnsaessigSeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inDeutschlandAnsaessigSeit!= null));
                if (inDeutschlandAnsaessigSeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInDeutschlandAnsaessigSeit;
                    sourceInDeutschlandAnsaessigSeit = this.getInDeutschlandAnsaessigSeit();
                    String copyInDeutschlandAnsaessigSeit = ((String) strategy.copy(LocatorUtils.property(locator, "inDeutschlandAnsaessigSeit", sourceInDeutschlandAnsaessigSeit), sourceInDeutschlandAnsaessigSeit, (this.inDeutschlandAnsaessigSeit!= null)));
                    copy.setInDeutschlandAnsaessigSeit(copyInDeutschlandAnsaessigSeit);
                } else {
                    if (inDeutschlandAnsaessigSeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inDeutschlandAnsaessigSeit = null;
                    }
                }
            }
            {
                Boolean steueridentifikationsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.steueridentifikationsnummer!= null));
                if (steueridentifikationsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSteueridentifikationsnummer;
                    sourceSteueridentifikationsnummer = this.getSteueridentifikationsnummer();
                    String copySteueridentifikationsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "steueridentifikationsnummer", sourceSteueridentifikationsnummer), sourceSteueridentifikationsnummer, (this.steueridentifikationsnummer!= null)));
                    copy.setSteueridentifikationsnummer(copySteueridentifikationsnummer);
                } else {
                    if (steueridentifikationsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.steueridentifikationsnummer = null;
                    }
                }
            }
            {
                Boolean ausweisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.ausweis!= null)&&(!this.ausweis.isEmpty())));
                if (ausweisShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTAusweis> sourceAusweis;
                    sourceAusweis = (((this.ausweis!= null)&&(!this.ausweis.isEmpty()))?this.getAusweis():null);
                    @SuppressWarnings("unchecked")
                    List<CTAusweis> copyAusweis = ((List<CTAusweis> ) strategy.copy(LocatorUtils.property(locator, "ausweis", sourceAusweis), sourceAusweis, ((this.ausweis!= null)&&(!this.ausweis.isEmpty()))));
                    copy.ausweis = null;
                    if (copyAusweis!= null) {
                        List<CTAusweis> uniqueAusweisl = copy.getAusweis();
                        uniqueAusweisl.addAll(copyAusweis);
                    }
                } else {
                    if (ausweisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausweis = null;
                    }
                }
            }
            {
                Boolean gesetzlicheKrankenversicherungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gesetzlicheKrankenversicherung!= null));
                if (gesetzlicheKrankenversicherungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGesetzlicheKrankenversicherung sourceGesetzlicheKrankenversicherung;
                    sourceGesetzlicheKrankenversicherung = this.getGesetzlicheKrankenversicherung();
                    CTGesetzlicheKrankenversicherung copyGesetzlicheKrankenversicherung = ((CTGesetzlicheKrankenversicherung) strategy.copy(LocatorUtils.property(locator, "gesetzlicheKrankenversicherung", sourceGesetzlicheKrankenversicherung), sourceGesetzlicheKrankenversicherung, (this.gesetzlicheKrankenversicherung!= null)));
                    copy.setGesetzlicheKrankenversicherung(copyGesetzlicheKrankenversicherung);
                } else {
                    if (gesetzlicheKrankenversicherungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gesetzlicheKrankenversicherung = null;
                    }
                }
            }
            {
                Boolean einkommenssteuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einkommenssteuer!= null));
                if (einkommenssteuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTEinkommenssteuer sourceEinkommenssteuer;
                    sourceEinkommenssteuer = this.getEinkommenssteuer();
                    CTEinkommenssteuer copyEinkommenssteuer = ((CTEinkommenssteuer) strategy.copy(LocatorUtils.property(locator, "einkommenssteuer", sourceEinkommenssteuer), sourceEinkommenssteuer, (this.einkommenssteuer!= null)));
                    copy.setEinkommenssteuer(copyEinkommenssteuer);
                } else {
                    if (einkommenssteuerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einkommenssteuer = null;
                    }
                }
            }
            {
                Boolean berufstaetigkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty())));
                if (berufstaetigkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBerufstaetigkeit> sourceBerufstaetigkeit;
                    sourceBerufstaetigkeit = (((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty()))?this.getBerufstaetigkeit():null);
                    @SuppressWarnings("unchecked")
                    List<CTBerufstaetigkeit> copyBerufstaetigkeit = ((List<CTBerufstaetigkeit> ) strategy.copy(LocatorUtils.property(locator, "berufstaetigkeit", sourceBerufstaetigkeit), sourceBerufstaetigkeit, ((this.berufstaetigkeit!= null)&&(!this.berufstaetigkeit.isEmpty()))));
                    copy.berufstaetigkeit = null;
                    if (copyBerufstaetigkeit!= null) {
                        List<CTBerufstaetigkeit> uniqueBerufstaetigkeitl = copy.getBerufstaetigkeit();
                        uniqueBerufstaetigkeitl.addAll(copyBerufstaetigkeit);
                    }
                } else {
                    if (berufstaetigkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berufstaetigkeit = null;
                    }
                }
            }
            {
                Boolean einkommenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.einkommen!= null)&&(!this.einkommen.isEmpty())));
                if (einkommenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTEinkommensart> sourceEinkommen;
                    sourceEinkommen = (((this.einkommen!= null)&&(!this.einkommen.isEmpty()))?this.getEinkommen():null);
                    @SuppressWarnings("unchecked")
                    List<CTEinkommensart> copyEinkommen = ((List<CTEinkommensart> ) strategy.copy(LocatorUtils.property(locator, "einkommen", sourceEinkommen), sourceEinkommen, ((this.einkommen!= null)&&(!this.einkommen.isEmpty()))));
                    copy.einkommen = null;
                    if (copyEinkommen!= null) {
                        List<CTEinkommensart> uniqueEinkommenl = copy.getEinkommen();
                        uniqueEinkommenl.addAll(copyEinkommen);
                    }
                } else {
                    if (einkommenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einkommen = null;
                    }
                }
            }
            {
                Boolean haushaltShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haushalt!= null));
                if (haushaltShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTHaushalt sourceHaushalt;
                    sourceHaushalt = this.getHaushalt();
                    CTHaushalt copyHaushalt = ((CTHaushalt) strategy.copy(LocatorUtils.property(locator, "haushalt", sourceHaushalt), sourceHaushalt, (this.haushalt!= null)));
                    copy.setHaushalt(copyHaushalt);
                } else {
                    if (haushaltShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haushalt = null;
                    }
                }
            }
            {
                Boolean ausbildungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausbildung!= null));
                if (ausbildungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAusbildung sourceAusbildung;
                    sourceAusbildung = this.getAusbildung();
                    CTAusbildung copyAusbildung = ((CTAusbildung) strategy.copy(LocatorUtils.property(locator, "ausbildung", sourceAusbildung), sourceAusbildung, (this.ausbildung!= null)));
                    copy.setAusbildung(copyAusbildung);
                } else {
                    if (ausbildungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausbildung = null;
                    }
                }
            }
            {
                Boolean gesundheitsdatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gesundheitsdaten!= null));
                if (gesundheitsdatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGesundheitsdaten sourceGesundheitsdaten;
                    sourceGesundheitsdaten = this.getGesundheitsdaten();
                    CTGesundheitsdaten copyGesundheitsdaten = ((CTGesundheitsdaten) strategy.copy(LocatorUtils.property(locator, "gesundheitsdaten", sourceGesundheitsdaten), sourceGesundheitsdaten, (this.gesundheitsdaten!= null)));
                    copy.setGesundheitsdaten(copyGesundheitsdaten);
                } else {
                    if (gesundheitsdatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gesundheitsdaten = null;
                    }
                }
            }
            {
                Boolean kuenstlernameOrdensnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kuenstlernameOrdensname!= null));
                if (kuenstlernameOrdensnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKuenstlernameOrdensname;
                    sourceKuenstlernameOrdensname = this.getKuenstlernameOrdensname();
                    String copyKuenstlernameOrdensname = ((String) strategy.copy(LocatorUtils.property(locator, "kuenstlernameOrdensname", sourceKuenstlernameOrdensname), sourceKuenstlernameOrdensname, (this.kuenstlernameOrdensname!= null)));
                    copy.setKuenstlernameOrdensname(copyKuenstlernameOrdensname);
                } else {
                    if (kuenstlernameOrdensnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kuenstlernameOrdensname = null;
                    }
                }
            }
            {
                Boolean sozialversicherungsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sozialversicherungsnummer!= null));
                if (sozialversicherungsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSozialversicherungsnummer;
                    sourceSozialversicherungsnummer = this.getSozialversicherungsnummer();
                    String copySozialversicherungsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "sozialversicherungsnummer", sourceSozialversicherungsnummer), sourceSozialversicherungsnummer, (this.sozialversicherungsnummer!= null)));
                    copy.setSozialversicherungsnummer(copySozialversicherungsnummer);
                } else {
                    if (sozialversicherungsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sozialversicherungsnummer = null;
                    }
                }
            }
            {
                Boolean alteSteuernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alteSteuernummer!= null));
                if (alteSteuernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAlteSteuernummer;
                    sourceAlteSteuernummer = this.getAlteSteuernummer();
                    String copyAlteSteuernummer = ((String) strategy.copy(LocatorUtils.property(locator, "alteSteuernummer", sourceAlteSteuernummer), sourceAlteSteuernummer, (this.alteSteuernummer!= null)));
                    copy.setAlteSteuernummer(copyAlteSteuernummer);
                } else {
                    if (alteSteuernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alteSteuernummer = null;
                    }
                }
            }
            {
                Boolean fuehrerscheinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty())));
                if (fuehrerscheinShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTFuehrerschein> sourceFuehrerschein;
                    sourceFuehrerschein = (((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty()))?this.getFuehrerschein():null);
                    @SuppressWarnings("unchecked")
                    List<CTFuehrerschein> copyFuehrerschein = ((List<CTFuehrerschein> ) strategy.copy(LocatorUtils.property(locator, "fuehrerschein", sourceFuehrerschein), sourceFuehrerschein, ((this.fuehrerschein!= null)&&(!this.fuehrerschein.isEmpty()))));
                    copy.fuehrerschein = null;
                    if (copyFuehrerschein!= null) {
                        List<CTFuehrerschein> uniqueFuehrerscheinl = copy.getFuehrerschein();
                        uniqueFuehrerscheinl.addAll(copyFuehrerschein);
                    }
                } else {
                    if (fuehrerscheinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fuehrerschein = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTPerson();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withVorname(String value) {
        setVorname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGeburtsdatum(String value) {
        setGeburtsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGeschlecht(STGeschlecht value) {
        setGeschlecht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withTitel(String value) {
        setTitel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGeburtsort(String value) {
        setGeburtsort(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withStaatsangehoerigkeit(STLaenderkennzeichen value) {
        setStaatsangehoerigkeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withFamilienstand(STFamilienstand value) {
        setFamilienstand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAdelspraedikat(String value) {
        setAdelspraedikat(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGeburtsname(String value) {
        setGeburtsname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGeburtsland(STLaenderkennzeichen value) {
        setGeburtsland(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withInDeutschlandAnsaessigSeit(String value) {
        setInDeutschlandAnsaessigSeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withSteueridentifikationsnummer(String value) {
        setSteueridentifikationsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAusweis(CTAusweis... values) {
        if (values!= null) {
            for (CTAusweis value: values) {
                getAusweis().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAusweis(Collection<CTAusweis> values) {
        if (values!= null) {
            getAusweis().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGesetzlicheKrankenversicherung(CTGesetzlicheKrankenversicherung value) {
        setGesetzlicheKrankenversicherung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withEinkommenssteuer(CTEinkommenssteuer value) {
        setEinkommenssteuer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withBerufstaetigkeit(CTBerufstaetigkeit... values) {
        if (values!= null) {
            for (CTBerufstaetigkeit value: values) {
                getBerufstaetigkeit().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withBerufstaetigkeit(Collection<CTBerufstaetigkeit> values) {
        if (values!= null) {
            getBerufstaetigkeit().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withEinkommen(CTEinkommensart... values) {
        if (values!= null) {
            for (CTEinkommensart value: values) {
                getEinkommen().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withEinkommen(Collection<CTEinkommensart> values) {
        if (values!= null) {
            getEinkommen().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withHaushalt(CTHaushalt value) {
        setHaushalt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAusbildung(CTAusbildung value) {
        setAusbildung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGesundheitsdaten(CTGesundheitsdaten value) {
        setGesundheitsdaten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withKuenstlernameOrdensname(String value) {
        setKuenstlernameOrdensname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withSozialversicherungsnummer(String value) {
        setSozialversicherungsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAlteSteuernummer(String value) {
        setAlteSteuernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withFuehrerschein(CTFuehrerschein... values) {
        if (values!= null) {
            for (CTFuehrerschein value: values) {
                getFuehrerschein().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withFuehrerschein(Collection<CTFuehrerschein> values) {
        if (values!= null) {
            getFuehrerschein().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAnrede(STAnredeschluessel value) {
        setAnrede(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withName(String value) {
        setName(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withNamenszusatz1(String value) {
        setNamenszusatz1(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withNamenszusatz2(String value) {
        setNamenszusatz2(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnernummerVM(String value) {
        setPartnernummerVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnernummer(String value) {
        setPartnernummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withVorsteuerabzugsberechtigt(Boolean value) {
        setVorsteuerabzugsberechtigt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAnschrift(CTPartneranschrift... values) {
        if (values!= null) {
            for (CTPartneranschrift value: values) {
                getAnschrift().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAnschrift(Collection<CTPartneranschrift> values) {
        if (values!= null) {
            getAnschrift().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withZusaetzlichePartnerdaten(CTZusaetzlichePartnerdaten... values) {
        if (values!= null) {
            for (CTZusaetzlichePartnerdaten value: values) {
                getZusaetzlichePartnerdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withZusaetzlichePartnerdaten(Collection<CTZusaetzlichePartnerdaten> values) {
        if (values!= null) {
            getZusaetzlichePartnerdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withKommunikationsverbindung(CTKommunikationsverbindung... values) {
        if (values!= null) {
            for (CTKommunikationsverbindung value: values) {
                getKommunikationsverbindung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withKommunikationsverbindung(Collection<CTKommunikationsverbindung> values) {
        if (values!= null) {
            getKommunikationsverbindung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withBankverbindung(CTBankverbindungBasis... values) {
        if (values!= null) {
            for (CTBankverbindungBasis value: values) {
                getBankverbindung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withBankverbindung(Collection<CTBankverbindungBasis> values) {
        if (values!= null) {
            getBankverbindung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withHandeltAufRechnungVon(CTHandeltAufRechnungVon... values) {
        if (values!= null) {
            for (CTHandeltAufRechnungVon value: values) {
                getHandeltAufRechnungVon().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withHandeltAufRechnungVon(Collection<CTHandeltAufRechnungVon> values) {
        if (values!= null) {
            getHandeltAufRechnungVon().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGruppenvertragspartner(CTGruppenvertragspartner... values) {
        if (values!= null) {
            for (CTGruppenvertragspartner value: values) {
                getGruppenvertragspartner().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withGruppenvertragspartner(Collection<CTGruppenvertragspartner> values) {
        if (values!= null) {
            getGruppenvertragspartner().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnerbeziehung(CTPartnerbeziehung... values) {
        if (values!= null) {
            for (CTPartnerbeziehung value: values) {
                getPartnerbeziehung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnerbeziehung(Collection<CTPartnerbeziehung> values) {
        if (values!= null) {
            getPartnerbeziehung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withVertrauensperson(CTVertrauensperson value) {
        setVertrauensperson(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withKreditkarte(CTKreditkarte... values) {
        if (values!= null) {
            for (CTKreditkarte value: values) {
                getKreditkarte().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withKreditkarte(Collection<CTKreditkarte> values) {
        if (values!= null) {
            getKreditkarte().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withUmsatzsteuerIdentifikationsnummer(String value) {
        setUmsatzsteuerIdentifikationsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withAltePartnernummer(String value) {
        setAltePartnernummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withBesteuerung(CTBesteuerung value) {
        setBesteuerung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withDirektmarketing(CTWerbeerlaubnis... values) {
        if (values!= null) {
            for (CTWerbeerlaubnis value: values) {
                getDirektmarketing().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withDirektmarketing(Collection<CTWerbeerlaubnis> values) {
        if (values!= null) {
            getDirektmarketing().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withFinanzamt(String value) {
        setFinanzamt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartneranmerkung(String value) {
        setPartneranmerkung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withBriefanrede(String value) {
        setBriefanrede(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withKommunikationspartner(CTKommunikationspartner value) {
        setKommunikationspartner(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnernummerExtern(CTPartnernummer... values) {
        if (values!= null) {
            for (CTPartnernummer value: values) {
                getPartnernummerExtern().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withPartnernummerExtern(Collection<CTPartnernummer> values) {
        if (values!= null) {
            getPartnernummerExtern().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withVollmachtgeber(CTVollmachtgeber value) {
        setVollmachtgeber(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPerson withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
