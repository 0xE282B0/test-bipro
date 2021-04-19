
package net.bipro.namespace.produktmodell;

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
import net.bipro.namespace.allgemein.CTStichtagsbetrag;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STAbgangsgrund;
import net.bipro.namespace.datentypen.STEBedingungen;
import net.bipro.namespace.datentypen.STVertragsform;
import net.bipro.namespace.datentypen.STVertragsstatus;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTBeitragszahler;
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
 * Basisklasse aller Produktbausteine (Verkaufsprodukt, Produkt, Elementarprodukt) gemaess VAA-Modell.
 * 
 * Das Attribut Tarifgeneration (ST_Tarifgeneration) fehlt, da der entsprechende einfache Datentyp nicht spezifiziert ist.
 * 
 * <p>Java class for CT_Produktbaustein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Produktbaustein"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="GewuenschteZahlungsweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kurzbeschreibung" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Bedingungen" type="{http://www.bipro.net/namespace/datentypen}STE_Bedingungen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Unternehmen" type="{http://www.bipro.net/namespace/allgemein}CT_Unternehmen" minOccurs="0"/&gt;
 *         &lt;element name="Kondition" type="{http://www.bipro.net/namespace/produktmodell}CT_Kondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Beitrag" type="{http://www.bipro.net/namespace/produktmodell}CT_Beitrag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZusaetzlicheProduktbausteinDaten" type="{http://www.bipro.net/namespace/produktmodell}CT_ZusaetzlicheProduktbausteinDaten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Aenderungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Aenderungsgrund" type="{http://www.bipro.net/namespace/datentypen}ST_GeVoArt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsform" type="{http://www.bipro.net/namespace/datentypen}ST_Vertragsform" minOccurs="0"/&gt;
 *         &lt;element name="Abgangsgrund" type="{http://www.bipro.net/namespace/datentypen}ST_Abgangsgrund" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.bipro.net/namespace/datentypen}ST_Vertragsstatus" minOccurs="0"/&gt;
 *         &lt;element name="Vertriebsname" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Stichtagswert" type="{http://www.bipro.net/namespace/allgemein}CT_Stichtagsbetrag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Beitragszahler" type="{http://www.bipro.net/namespace/partner}CT_Beitragszahler" minOccurs="0"/&gt;
 *         &lt;element name="Versicherungsdauer" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Zertifizierungsdaten" type="{http://www.bipro.net/namespace/produktmodell}CT_Zertifizierungsdaten" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Produktbaustein", propOrder = {
    "bezeichnung",
    "gewuenschteZahlungsweise",
    "kurzbeschreibung",
    "bedingungen",
    "unternehmen",
    "kondition",
    "beitrag",
    "zusaetzlicheProduktbausteinDaten",
    "aenderungsdatum",
    "aenderungsgrund",
    "vertragsform",
    "abgangsgrund",
    "status",
    "vertriebsname",
    "stichtagswert",
    "beitragszahler",
    "versicherungsdauer",
    "zertifizierungsdaten"
})
@XmlSeeAlso({
    CTElementarprodukt.class,
    CTProdukt.class,
    CTVerkaufsprodukt.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTProduktbaustein
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "GewuenschteZahlungsweise")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STZahlungsweise> gewuenschteZahlungsweise;
    @XmlElement(name = "Kurzbeschreibung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kurzbeschreibung;
    @XmlElement(name = "Bedingungen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STEBedingungen> bedingungen;
    @XmlElement(name = "Unternehmen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTUnternehmen unternehmen;
    @XmlElement(name = "Kondition")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTKondition> kondition;
    @XmlElement(name = "Beitrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTBeitrag> beitrag;
    @XmlElement(name = "ZusaetzlicheProduktbausteinDaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTZusaetzlicheProduktbausteinDaten> zusaetzlicheProduktbausteinDaten;
    @XmlElement(name = "Aenderungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String aenderungsdatum;
    @XmlElement(name = "Aenderungsgrund")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> aenderungsgrund;
    @XmlElement(name = "Vertragsform")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVertragsform vertragsform;
    @XmlElement(name = "Abgangsgrund")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STAbgangsgrund abgangsgrund;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVertragsstatus status;
    @XmlElement(name = "Vertriebsname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vertriebsname;
    @XmlElement(name = "Stichtagswert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTStichtagsbetrag> stichtagswert;
    @XmlElement(name = "Beitragszahler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragszahler beitragszahler;
    @XmlElement(name = "Versicherungsdauer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum versicherungsdauer;
    @XmlElement(name = "Zertifizierungsdaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZertifizierungsdaten zertifizierungsdaten;

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the gewuenschteZahlungsweise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gewuenschteZahlungsweise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGewuenschteZahlungsweise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STZahlungsweise }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STZahlungsweise> getGewuenschteZahlungsweise() {
        if (gewuenschteZahlungsweise == null) {
            gewuenschteZahlungsweise = new ArrayList<STZahlungsweise>();
        }
        return this.gewuenschteZahlungsweise;
    }

    /**
     * Gets the value of the kurzbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKurzbeschreibung() {
        return kurzbeschreibung;
    }

    /**
     * Sets the value of the kurzbeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKurzbeschreibung(String value) {
        this.kurzbeschreibung = value;
    }

    /**
     * Gets the value of the bedingungen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedingungen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedingungen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STEBedingungen }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STEBedingungen> getBedingungen() {
        if (bedingungen == null) {
            bedingungen = new ArrayList<STEBedingungen>();
        }
        return this.bedingungen;
    }

    /**
     * Gets the value of the unternehmen property.
     * 
     * @return
     *     possible object is
     *     {@link CTUnternehmen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen getUnternehmen() {
        return unternehmen;
    }

    /**
     * Sets the value of the unternehmen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUnternehmen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setUnternehmen(CTUnternehmen value) {
        this.unternehmen = value;
    }

    /**
     * Gets the value of the kondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKondition }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTKondition> getKondition() {
        if (kondition == null) {
            kondition = new ArrayList<CTKondition>();
        }
        return this.kondition;
    }

    /**
     * Gets the value of the beitrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beitrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeitrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBeitrag }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTBeitrag> getBeitrag() {
        if (beitrag == null) {
            beitrag = new ArrayList<CTBeitrag>();
        }
        return this.beitrag;
    }

    /**
     * Gets the value of the zusaetzlicheProduktbausteinDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zusaetzlicheProduktbausteinDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZusaetzlicheProduktbausteinDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZusaetzlicheProduktbausteinDaten }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTZusaetzlicheProduktbausteinDaten> getZusaetzlicheProduktbausteinDaten() {
        if (zusaetzlicheProduktbausteinDaten == null) {
            zusaetzlicheProduktbausteinDaten = new ArrayList<CTZusaetzlicheProduktbausteinDaten>();
        }
        return this.zusaetzlicheProduktbausteinDaten;
    }

    /**
     * Gets the value of the aenderungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAenderungsdatum() {
        return aenderungsdatum;
    }

    /**
     * Sets the value of the aenderungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAenderungsdatum(String value) {
        this.aenderungsdatum = value;
    }

    /**
     * Gets the value of the aenderungsgrund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aenderungsgrund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAenderungsgrund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<String> getAenderungsgrund() {
        if (aenderungsgrund == null) {
            aenderungsgrund = new ArrayList<String>();
        }
        return this.aenderungsgrund;
    }

    /**
     * Gets the value of the vertragsform property.
     * 
     * @return
     *     possible object is
     *     {@link STVertragsform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVertragsform getVertragsform() {
        return vertragsform;
    }

    /**
     * Sets the value of the vertragsform property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVertragsform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVertragsform(STVertragsform value) {
        this.vertragsform = value;
    }

    /**
     * Gets the value of the abgangsgrund property.
     * 
     * @return
     *     possible object is
     *     {@link STAbgangsgrund }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STAbgangsgrund getAbgangsgrund() {
        return abgangsgrund;
    }

    /**
     * Sets the value of the abgangsgrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAbgangsgrund }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAbgangsgrund(STAbgangsgrund value) {
        this.abgangsgrund = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STVertragsstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVertragsstatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVertragsstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStatus(STVertragsstatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the vertriebsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVertriebsname() {
        return vertriebsname;
    }

    /**
     * Sets the value of the vertriebsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVertriebsname(String value) {
        this.vertriebsname = value;
    }

    /**
     * Gets the value of the stichtagswert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stichtagswert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStichtagswert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTStichtagsbetrag }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTStichtagsbetrag> getStichtagswert() {
        if (stichtagswert == null) {
            stichtagswert = new ArrayList<CTStichtagsbetrag>();
        }
        return this.stichtagswert;
    }

    /**
     * Gets the value of the beitragszahler property.
     * 
     * @return
     *     possible object is
     *     {@link CTBeitragszahler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitragszahler getBeitragszahler() {
        return beitragszahler;
    }

    /**
     * Sets the value of the beitragszahler property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBeitragszahler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeitragszahler(CTBeitragszahler value) {
        this.beitragszahler = value;
    }

    /**
     * Gets the value of the versicherungsdauer property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getVersicherungsdauer() {
        return versicherungsdauer;
    }

    /**
     * Sets the value of the versicherungsdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVersicherungsdauer(CTZeitraum value) {
        this.versicherungsdauer = value;
    }

    /**
     * Gets the value of the zertifizierungsdaten property.
     * 
     * @return
     *     possible object is
     *     {@link CTZertifizierungsdaten }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZertifizierungsdaten getZertifizierungsdaten() {
        return zertifizierungsdaten;
    }

    /**
     * Sets the value of the zertifizierungsdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZertifizierungsdaten }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZertifizierungsdaten(CTZertifizierungsdaten value) {
        this.zertifizierungsdaten = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
        final CTProduktbaustein that = ((CTProduktbaustein) object);
        {
            String lhsBezeichnung;
            lhsBezeichnung = this.getBezeichnung();
            String rhsBezeichnung;
            rhsBezeichnung = that.getBezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezeichnung", lhsBezeichnung), LocatorUtils.property(thatLocator, "bezeichnung", rhsBezeichnung), lhsBezeichnung, rhsBezeichnung, (this.bezeichnung!= null), (that.bezeichnung!= null))) {
                return false;
            }
        }
        {
            List<STZahlungsweise> lhsGewuenschteZahlungsweise;
            lhsGewuenschteZahlungsweise = (((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty()))?this.getGewuenschteZahlungsweise():null);
            List<STZahlungsweise> rhsGewuenschteZahlungsweise;
            rhsGewuenschteZahlungsweise = (((that.gewuenschteZahlungsweise!= null)&&(!that.gewuenschteZahlungsweise.isEmpty()))?that.getGewuenschteZahlungsweise():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewuenschteZahlungsweise", lhsGewuenschteZahlungsweise), LocatorUtils.property(thatLocator, "gewuenschteZahlungsweise", rhsGewuenschteZahlungsweise), lhsGewuenschteZahlungsweise, rhsGewuenschteZahlungsweise, ((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty())), ((that.gewuenschteZahlungsweise!= null)&&(!that.gewuenschteZahlungsweise.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsKurzbeschreibung;
            lhsKurzbeschreibung = this.getKurzbeschreibung();
            String rhsKurzbeschreibung;
            rhsKurzbeschreibung = that.getKurzbeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kurzbeschreibung", lhsKurzbeschreibung), LocatorUtils.property(thatLocator, "kurzbeschreibung", rhsKurzbeschreibung), lhsKurzbeschreibung, rhsKurzbeschreibung, (this.kurzbeschreibung!= null), (that.kurzbeschreibung!= null))) {
                return false;
            }
        }
        {
            List<STEBedingungen> lhsBedingungen;
            lhsBedingungen = (((this.bedingungen!= null)&&(!this.bedingungen.isEmpty()))?this.getBedingungen():null);
            List<STEBedingungen> rhsBedingungen;
            rhsBedingungen = (((that.bedingungen!= null)&&(!that.bedingungen.isEmpty()))?that.getBedingungen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedingungen", lhsBedingungen), LocatorUtils.property(thatLocator, "bedingungen", rhsBedingungen), lhsBedingungen, rhsBedingungen, ((this.bedingungen!= null)&&(!this.bedingungen.isEmpty())), ((that.bedingungen!= null)&&(!that.bedingungen.isEmpty())))) {
                return false;
            }
        }
        {
            CTUnternehmen lhsUnternehmen;
            lhsUnternehmen = this.getUnternehmen();
            CTUnternehmen rhsUnternehmen;
            rhsUnternehmen = that.getUnternehmen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unternehmen", lhsUnternehmen), LocatorUtils.property(thatLocator, "unternehmen", rhsUnternehmen), lhsUnternehmen, rhsUnternehmen, (this.unternehmen!= null), (that.unternehmen!= null))) {
                return false;
            }
        }
        {
            List<CTKondition> lhsKondition;
            lhsKondition = (((this.kondition!= null)&&(!this.kondition.isEmpty()))?this.getKondition():null);
            List<CTKondition> rhsKondition;
            rhsKondition = (((that.kondition!= null)&&(!that.kondition.isEmpty()))?that.getKondition():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kondition", lhsKondition), LocatorUtils.property(thatLocator, "kondition", rhsKondition), lhsKondition, rhsKondition, ((this.kondition!= null)&&(!this.kondition.isEmpty())), ((that.kondition!= null)&&(!that.kondition.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTBeitrag> lhsBeitrag;
            lhsBeitrag = (((this.beitrag!= null)&&(!this.beitrag.isEmpty()))?this.getBeitrag():null);
            List<CTBeitrag> rhsBeitrag;
            rhsBeitrag = (((that.beitrag!= null)&&(!that.beitrag.isEmpty()))?that.getBeitrag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitrag", lhsBeitrag), LocatorUtils.property(thatLocator, "beitrag", rhsBeitrag), lhsBeitrag, rhsBeitrag, ((this.beitrag!= null)&&(!this.beitrag.isEmpty())), ((that.beitrag!= null)&&(!that.beitrag.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTZusaetzlicheProduktbausteinDaten> lhsZusaetzlicheProduktbausteinDaten;
            lhsZusaetzlicheProduktbausteinDaten = (((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty()))?this.getZusaetzlicheProduktbausteinDaten():null);
            List<CTZusaetzlicheProduktbausteinDaten> rhsZusaetzlicheProduktbausteinDaten;
            rhsZusaetzlicheProduktbausteinDaten = (((that.zusaetzlicheProduktbausteinDaten!= null)&&(!that.zusaetzlicheProduktbausteinDaten.isEmpty()))?that.getZusaetzlicheProduktbausteinDaten():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusaetzlicheProduktbausteinDaten", lhsZusaetzlicheProduktbausteinDaten), LocatorUtils.property(thatLocator, "zusaetzlicheProduktbausteinDaten", rhsZusaetzlicheProduktbausteinDaten), lhsZusaetzlicheProduktbausteinDaten, rhsZusaetzlicheProduktbausteinDaten, ((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty())), ((that.zusaetzlicheProduktbausteinDaten!= null)&&(!that.zusaetzlicheProduktbausteinDaten.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsAenderungsdatum;
            lhsAenderungsdatum = this.getAenderungsdatum();
            String rhsAenderungsdatum;
            rhsAenderungsdatum = that.getAenderungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsdatum", lhsAenderungsdatum), LocatorUtils.property(thatLocator, "aenderungsdatum", rhsAenderungsdatum), lhsAenderungsdatum, rhsAenderungsdatum, (this.aenderungsdatum!= null), (that.aenderungsdatum!= null))) {
                return false;
            }
        }
        {
            List<String> lhsAenderungsgrund;
            lhsAenderungsgrund = (((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))?this.getAenderungsgrund():null);
            List<String> rhsAenderungsgrund;
            rhsAenderungsgrund = (((that.aenderungsgrund!= null)&&(!that.aenderungsgrund.isEmpty()))?that.getAenderungsgrund():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsgrund", lhsAenderungsgrund), LocatorUtils.property(thatLocator, "aenderungsgrund", rhsAenderungsgrund), lhsAenderungsgrund, rhsAenderungsgrund, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty())), ((that.aenderungsgrund!= null)&&(!that.aenderungsgrund.isEmpty())))) {
                return false;
            }
        }
        {
            STVertragsform lhsVertragsform;
            lhsVertragsform = this.getVertragsform();
            STVertragsform rhsVertragsform;
            rhsVertragsform = that.getVertragsform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsform", lhsVertragsform), LocatorUtils.property(thatLocator, "vertragsform", rhsVertragsform), lhsVertragsform, rhsVertragsform, (this.vertragsform!= null), (that.vertragsform!= null))) {
                return false;
            }
        }
        {
            STAbgangsgrund lhsAbgangsgrund;
            lhsAbgangsgrund = this.getAbgangsgrund();
            STAbgangsgrund rhsAbgangsgrund;
            rhsAbgangsgrund = that.getAbgangsgrund();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abgangsgrund", lhsAbgangsgrund), LocatorUtils.property(thatLocator, "abgangsgrund", rhsAbgangsgrund), lhsAbgangsgrund, rhsAbgangsgrund, (this.abgangsgrund!= null), (that.abgangsgrund!= null))) {
                return false;
            }
        }
        {
            STVertragsstatus lhsStatus;
            lhsStatus = this.getStatus();
            STVertragsstatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            String lhsVertriebsname;
            lhsVertriebsname = this.getVertriebsname();
            String rhsVertriebsname;
            rhsVertriebsname = that.getVertriebsname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertriebsname", lhsVertriebsname), LocatorUtils.property(thatLocator, "vertriebsname", rhsVertriebsname), lhsVertriebsname, rhsVertriebsname, (this.vertriebsname!= null), (that.vertriebsname!= null))) {
                return false;
            }
        }
        {
            List<CTStichtagsbetrag> lhsStichtagswert;
            lhsStichtagswert = (((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty()))?this.getStichtagswert():null);
            List<CTStichtagsbetrag> rhsStichtagswert;
            rhsStichtagswert = (((that.stichtagswert!= null)&&(!that.stichtagswert.isEmpty()))?that.getStichtagswert():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stichtagswert", lhsStichtagswert), LocatorUtils.property(thatLocator, "stichtagswert", rhsStichtagswert), lhsStichtagswert, rhsStichtagswert, ((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty())), ((that.stichtagswert!= null)&&(!that.stichtagswert.isEmpty())))) {
                return false;
            }
        }
        {
            CTBeitragszahler lhsBeitragszahler;
            lhsBeitragszahler = this.getBeitragszahler();
            CTBeitragszahler rhsBeitragszahler;
            rhsBeitragszahler = that.getBeitragszahler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragszahler", lhsBeitragszahler), LocatorUtils.property(thatLocator, "beitragszahler", rhsBeitragszahler), lhsBeitragszahler, rhsBeitragszahler, (this.beitragszahler!= null), (that.beitragszahler!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsVersicherungsdauer;
            lhsVersicherungsdauer = this.getVersicherungsdauer();
            CTZeitraum rhsVersicherungsdauer;
            rhsVersicherungsdauer = that.getVersicherungsdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versicherungsdauer", lhsVersicherungsdauer), LocatorUtils.property(thatLocator, "versicherungsdauer", rhsVersicherungsdauer), lhsVersicherungsdauer, rhsVersicherungsdauer, (this.versicherungsdauer!= null), (that.versicherungsdauer!= null))) {
                return false;
            }
        }
        {
            CTZertifizierungsdaten lhsZertifizierungsdaten;
            lhsZertifizierungsdaten = this.getZertifizierungsdaten();
            CTZertifizierungsdaten rhsZertifizierungsdaten;
            rhsZertifizierungsdaten = that.getZertifizierungsdaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zertifizierungsdaten", lhsZertifizierungsdaten), LocatorUtils.property(thatLocator, "zertifizierungsdaten", rhsZertifizierungsdaten), lhsZertifizierungsdaten, rhsZertifizierungsdaten, (this.zertifizierungsdaten!= null), (that.zertifizierungsdaten!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            List<STZahlungsweise> theGewuenschteZahlungsweise;
            theGewuenschteZahlungsweise = (((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty()))?this.getGewuenschteZahlungsweise():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewuenschteZahlungsweise", theGewuenschteZahlungsweise), currentHashCode, theGewuenschteZahlungsweise, ((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty())));
        }
        {
            String theKurzbeschreibung;
            theKurzbeschreibung = this.getKurzbeschreibung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kurzbeschreibung", theKurzbeschreibung), currentHashCode, theKurzbeschreibung, (this.kurzbeschreibung!= null));
        }
        {
            List<STEBedingungen> theBedingungen;
            theBedingungen = (((this.bedingungen!= null)&&(!this.bedingungen.isEmpty()))?this.getBedingungen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bedingungen", theBedingungen), currentHashCode, theBedingungen, ((this.bedingungen!= null)&&(!this.bedingungen.isEmpty())));
        }
        {
            CTUnternehmen theUnternehmen;
            theUnternehmen = this.getUnternehmen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unternehmen", theUnternehmen), currentHashCode, theUnternehmen, (this.unternehmen!= null));
        }
        {
            List<CTKondition> theKondition;
            theKondition = (((this.kondition!= null)&&(!this.kondition.isEmpty()))?this.getKondition():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kondition", theKondition), currentHashCode, theKondition, ((this.kondition!= null)&&(!this.kondition.isEmpty())));
        }
        {
            List<CTBeitrag> theBeitrag;
            theBeitrag = (((this.beitrag!= null)&&(!this.beitrag.isEmpty()))?this.getBeitrag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitrag", theBeitrag), currentHashCode, theBeitrag, ((this.beitrag!= null)&&(!this.beitrag.isEmpty())));
        }
        {
            List<CTZusaetzlicheProduktbausteinDaten> theZusaetzlicheProduktbausteinDaten;
            theZusaetzlicheProduktbausteinDaten = (((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty()))?this.getZusaetzlicheProduktbausteinDaten():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusaetzlicheProduktbausteinDaten", theZusaetzlicheProduktbausteinDaten), currentHashCode, theZusaetzlicheProduktbausteinDaten, ((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty())));
        }
        {
            String theAenderungsdatum;
            theAenderungsdatum = this.getAenderungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aenderungsdatum", theAenderungsdatum), currentHashCode, theAenderungsdatum, (this.aenderungsdatum!= null));
        }
        {
            List<String> theAenderungsgrund;
            theAenderungsgrund = (((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))?this.getAenderungsgrund():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aenderungsgrund", theAenderungsgrund), currentHashCode, theAenderungsgrund, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty())));
        }
        {
            STVertragsform theVertragsform;
            theVertragsform = this.getVertragsform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsform", theVertragsform), currentHashCode, theVertragsform, (this.vertragsform!= null));
        }
        {
            STAbgangsgrund theAbgangsgrund;
            theAbgangsgrund = this.getAbgangsgrund();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abgangsgrund", theAbgangsgrund), currentHashCode, theAbgangsgrund, (this.abgangsgrund!= null));
        }
        {
            STVertragsstatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            String theVertriebsname;
            theVertriebsname = this.getVertriebsname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertriebsname", theVertriebsname), currentHashCode, theVertriebsname, (this.vertriebsname!= null));
        }
        {
            List<CTStichtagsbetrag> theStichtagswert;
            theStichtagswert = (((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty()))?this.getStichtagswert():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stichtagswert", theStichtagswert), currentHashCode, theStichtagswert, ((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty())));
        }
        {
            CTBeitragszahler theBeitragszahler;
            theBeitragszahler = this.getBeitragszahler();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragszahler", theBeitragszahler), currentHashCode, theBeitragszahler, (this.beitragszahler!= null));
        }
        {
            CTZeitraum theVersicherungsdauer;
            theVersicherungsdauer = this.getVersicherungsdauer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versicherungsdauer", theVersicherungsdauer), currentHashCode, theVersicherungsdauer, (this.versicherungsdauer!= null));
        }
        {
            CTZertifizierungsdaten theZertifizierungsdaten;
            theZertifizierungsdaten = this.getZertifizierungsdaten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zertifizierungsdaten", theZertifizierungsdaten), currentHashCode, theZertifizierungsdaten, (this.zertifizierungsdaten!= null));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTProduktbaustein) {
            final CTProduktbaustein copy = ((CTProduktbaustein) target);
            {
                Boolean bezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezeichnung!= null));
                if (bezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBezeichnung;
                    sourceBezeichnung = this.getBezeichnung();
                    String copyBezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "bezeichnung", sourceBezeichnung), sourceBezeichnung, (this.bezeichnung!= null)));
                    copy.setBezeichnung(copyBezeichnung);
                } else {
                    if (bezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezeichnung = null;
                    }
                }
            }
            {
                Boolean gewuenschteZahlungsweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty())));
                if (gewuenschteZahlungsweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STZahlungsweise> sourceGewuenschteZahlungsweise;
                    sourceGewuenschteZahlungsweise = (((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty()))?this.getGewuenschteZahlungsweise():null);
                    @SuppressWarnings("unchecked")
                    List<STZahlungsweise> copyGewuenschteZahlungsweise = ((List<STZahlungsweise> ) strategy.copy(LocatorUtils.property(locator, "gewuenschteZahlungsweise", sourceGewuenschteZahlungsweise), sourceGewuenschteZahlungsweise, ((this.gewuenschteZahlungsweise!= null)&&(!this.gewuenschteZahlungsweise.isEmpty()))));
                    copy.gewuenschteZahlungsweise = null;
                    if (copyGewuenschteZahlungsweise!= null) {
                        List<STZahlungsweise> uniqueGewuenschteZahlungsweisel = copy.getGewuenschteZahlungsweise();
                        uniqueGewuenschteZahlungsweisel.addAll(copyGewuenschteZahlungsweise);
                    }
                } else {
                    if (gewuenschteZahlungsweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewuenschteZahlungsweise = null;
                    }
                }
            }
            {
                Boolean kurzbeschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kurzbeschreibung!= null));
                if (kurzbeschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKurzbeschreibung;
                    sourceKurzbeschreibung = this.getKurzbeschreibung();
                    String copyKurzbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "kurzbeschreibung", sourceKurzbeschreibung), sourceKurzbeschreibung, (this.kurzbeschreibung!= null)));
                    copy.setKurzbeschreibung(copyKurzbeschreibung);
                } else {
                    if (kurzbeschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kurzbeschreibung = null;
                    }
                }
            }
            {
                Boolean bedingungenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bedingungen!= null)&&(!this.bedingungen.isEmpty())));
                if (bedingungenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STEBedingungen> sourceBedingungen;
                    sourceBedingungen = (((this.bedingungen!= null)&&(!this.bedingungen.isEmpty()))?this.getBedingungen():null);
                    @SuppressWarnings("unchecked")
                    List<STEBedingungen> copyBedingungen = ((List<STEBedingungen> ) strategy.copy(LocatorUtils.property(locator, "bedingungen", sourceBedingungen), sourceBedingungen, ((this.bedingungen!= null)&&(!this.bedingungen.isEmpty()))));
                    copy.bedingungen = null;
                    if (copyBedingungen!= null) {
                        List<STEBedingungen> uniqueBedingungenl = copy.getBedingungen();
                        uniqueBedingungenl.addAll(copyBedingungen);
                    }
                } else {
                    if (bedingungenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedingungen = null;
                    }
                }
            }
            {
                Boolean unternehmenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unternehmen!= null));
                if (unternehmenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTUnternehmen sourceUnternehmen;
                    sourceUnternehmen = this.getUnternehmen();
                    CTUnternehmen copyUnternehmen = ((CTUnternehmen) strategy.copy(LocatorUtils.property(locator, "unternehmen", sourceUnternehmen), sourceUnternehmen, (this.unternehmen!= null)));
                    copy.setUnternehmen(copyUnternehmen);
                } else {
                    if (unternehmenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unternehmen = null;
                    }
                }
            }
            {
                Boolean konditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.kondition!= null)&&(!this.kondition.isEmpty())));
                if (konditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKondition> sourceKondition;
                    sourceKondition = (((this.kondition!= null)&&(!this.kondition.isEmpty()))?this.getKondition():null);
                    @SuppressWarnings("unchecked")
                    List<CTKondition> copyKondition = ((List<CTKondition> ) strategy.copy(LocatorUtils.property(locator, "kondition", sourceKondition), sourceKondition, ((this.kondition!= null)&&(!this.kondition.isEmpty()))));
                    copy.kondition = null;
                    if (copyKondition!= null) {
                        List<CTKondition> uniqueKonditionl = copy.getKondition();
                        uniqueKonditionl.addAll(copyKondition);
                    }
                } else {
                    if (konditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kondition = null;
                    }
                }
            }
            {
                Boolean beitragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.beitrag!= null)&&(!this.beitrag.isEmpty())));
                if (beitragShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBeitrag> sourceBeitrag;
                    sourceBeitrag = (((this.beitrag!= null)&&(!this.beitrag.isEmpty()))?this.getBeitrag():null);
                    @SuppressWarnings("unchecked")
                    List<CTBeitrag> copyBeitrag = ((List<CTBeitrag> ) strategy.copy(LocatorUtils.property(locator, "beitrag", sourceBeitrag), sourceBeitrag, ((this.beitrag!= null)&&(!this.beitrag.isEmpty()))));
                    copy.beitrag = null;
                    if (copyBeitrag!= null) {
                        List<CTBeitrag> uniqueBeitragl = copy.getBeitrag();
                        uniqueBeitragl.addAll(copyBeitrag);
                    }
                } else {
                    if (beitragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitrag = null;
                    }
                }
            }
            {
                Boolean zusaetzlicheProduktbausteinDatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty())));
                if (zusaetzlicheProduktbausteinDatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZusaetzlicheProduktbausteinDaten> sourceZusaetzlicheProduktbausteinDaten;
                    sourceZusaetzlicheProduktbausteinDaten = (((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty()))?this.getZusaetzlicheProduktbausteinDaten():null);
                    @SuppressWarnings("unchecked")
                    List<CTZusaetzlicheProduktbausteinDaten> copyZusaetzlicheProduktbausteinDaten = ((List<CTZusaetzlicheProduktbausteinDaten> ) strategy.copy(LocatorUtils.property(locator, "zusaetzlicheProduktbausteinDaten", sourceZusaetzlicheProduktbausteinDaten), sourceZusaetzlicheProduktbausteinDaten, ((this.zusaetzlicheProduktbausteinDaten!= null)&&(!this.zusaetzlicheProduktbausteinDaten.isEmpty()))));
                    copy.zusaetzlicheProduktbausteinDaten = null;
                    if (copyZusaetzlicheProduktbausteinDaten!= null) {
                        List<CTZusaetzlicheProduktbausteinDaten> uniqueZusaetzlicheProduktbausteinDatenl = copy.getZusaetzlicheProduktbausteinDaten();
                        uniqueZusaetzlicheProduktbausteinDatenl.addAll(copyZusaetzlicheProduktbausteinDaten);
                    }
                } else {
                    if (zusaetzlicheProduktbausteinDatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusaetzlicheProduktbausteinDaten = null;
                    }
                }
            }
            {
                Boolean aenderungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aenderungsdatum!= null));
                if (aenderungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAenderungsdatum;
                    sourceAenderungsdatum = this.getAenderungsdatum();
                    String copyAenderungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "aenderungsdatum", sourceAenderungsdatum), sourceAenderungsdatum, (this.aenderungsdatum!= null)));
                    copy.setAenderungsdatum(copyAenderungsdatum);
                } else {
                    if (aenderungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aenderungsdatum = null;
                    }
                }
            }
            {
                Boolean aenderungsgrundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty())));
                if (aenderungsgrundShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceAenderungsgrund;
                    sourceAenderungsgrund = (((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))?this.getAenderungsgrund():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyAenderungsgrund = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "aenderungsgrund", sourceAenderungsgrund), sourceAenderungsgrund, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))));
                    copy.aenderungsgrund = null;
                    if (copyAenderungsgrund!= null) {
                        List<String> uniqueAenderungsgrundl = copy.getAenderungsgrund();
                        uniqueAenderungsgrundl.addAll(copyAenderungsgrund);
                    }
                } else {
                    if (aenderungsgrundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aenderungsgrund = null;
                    }
                }
            }
            {
                Boolean vertragsformShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragsform!= null));
                if (vertragsformShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVertragsform sourceVertragsform;
                    sourceVertragsform = this.getVertragsform();
                    STVertragsform copyVertragsform = ((STVertragsform) strategy.copy(LocatorUtils.property(locator, "vertragsform", sourceVertragsform), sourceVertragsform, (this.vertragsform!= null)));
                    copy.setVertragsform(copyVertragsform);
                } else {
                    if (vertragsformShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsform = null;
                    }
                }
            }
            {
                Boolean abgangsgrundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abgangsgrund!= null));
                if (abgangsgrundShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAbgangsgrund sourceAbgangsgrund;
                    sourceAbgangsgrund = this.getAbgangsgrund();
                    STAbgangsgrund copyAbgangsgrund = ((STAbgangsgrund) strategy.copy(LocatorUtils.property(locator, "abgangsgrund", sourceAbgangsgrund), sourceAbgangsgrund, (this.abgangsgrund!= null)));
                    copy.setAbgangsgrund(copyAbgangsgrund);
                } else {
                    if (abgangsgrundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abgangsgrund = null;
                    }
                }
            }
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVertragsstatus sourceStatus;
                    sourceStatus = this.getStatus();
                    STVertragsstatus copyStatus = ((STVertragsstatus) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
                    }
                }
            }
            {
                Boolean vertriebsnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertriebsname!= null));
                if (vertriebsnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVertriebsname;
                    sourceVertriebsname = this.getVertriebsname();
                    String copyVertriebsname = ((String) strategy.copy(LocatorUtils.property(locator, "vertriebsname", sourceVertriebsname), sourceVertriebsname, (this.vertriebsname!= null)));
                    copy.setVertriebsname(copyVertriebsname);
                } else {
                    if (vertriebsnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertriebsname = null;
                    }
                }
            }
            {
                Boolean stichtagswertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty())));
                if (stichtagswertShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTStichtagsbetrag> sourceStichtagswert;
                    sourceStichtagswert = (((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty()))?this.getStichtagswert():null);
                    @SuppressWarnings("unchecked")
                    List<CTStichtagsbetrag> copyStichtagswert = ((List<CTStichtagsbetrag> ) strategy.copy(LocatorUtils.property(locator, "stichtagswert", sourceStichtagswert), sourceStichtagswert, ((this.stichtagswert!= null)&&(!this.stichtagswert.isEmpty()))));
                    copy.stichtagswert = null;
                    if (copyStichtagswert!= null) {
                        List<CTStichtagsbetrag> uniqueStichtagswertl = copy.getStichtagswert();
                        uniqueStichtagswertl.addAll(copyStichtagswert);
                    }
                } else {
                    if (stichtagswertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stichtagswert = null;
                    }
                }
            }
            {
                Boolean beitragszahlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragszahler!= null));
                if (beitragszahlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBeitragszahler sourceBeitragszahler;
                    sourceBeitragszahler = this.getBeitragszahler();
                    CTBeitragszahler copyBeitragszahler = ((CTBeitragszahler) strategy.copy(LocatorUtils.property(locator, "beitragszahler", sourceBeitragszahler), sourceBeitragszahler, (this.beitragszahler!= null)));
                    copy.setBeitragszahler(copyBeitragszahler);
                } else {
                    if (beitragszahlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragszahler = null;
                    }
                }
            }
            {
                Boolean versicherungsdauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versicherungsdauer!= null));
                if (versicherungsdauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceVersicherungsdauer;
                    sourceVersicherungsdauer = this.getVersicherungsdauer();
                    CTZeitraum copyVersicherungsdauer = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "versicherungsdauer", sourceVersicherungsdauer), sourceVersicherungsdauer, (this.versicherungsdauer!= null)));
                    copy.setVersicherungsdauer(copyVersicherungsdauer);
                } else {
                    if (versicherungsdauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versicherungsdauer = null;
                    }
                }
            }
            {
                Boolean zertifizierungsdatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zertifizierungsdaten!= null));
                if (zertifizierungsdatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZertifizierungsdaten sourceZertifizierungsdaten;
                    sourceZertifizierungsdaten = this.getZertifizierungsdaten();
                    CTZertifizierungsdaten copyZertifizierungsdaten = ((CTZertifizierungsdaten) strategy.copy(LocatorUtils.property(locator, "zertifizierungsdaten", sourceZertifizierungsdaten), sourceZertifizierungsdaten, (this.zertifizierungsdaten!= null)));
                    copy.setZertifizierungsdaten(copyZertifizierungsdaten);
                } else {
                    if (zertifizierungsdatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zertifizierungsdaten = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProduktbaustein withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
