
package net.bipro.namespace.sepa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.allgemein.CTVertragsnummer;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STLastschriftart;
import net.bipro.namespace.datentypen.STMandatArt;
import net.bipro.namespace.datentypen.STMandatStatus;
import net.bipro.namespace.datentypen.STMandatsablageort;
import net.bipro.namespace.datentypen.STTypDerBankverbindung;
import net.bipro.namespace.datentypen.STVersandart;
import net.bipro.namespace.partner.CTBankverbindungBasis;
import net.bipro.namespace.partner.CTKommunikationsverbindung;
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
 * Diese Klasse bildet ein SEPA-Mandat ab und enthält alle im Kontext SEPA-Lastschrift relevanten Entitäten.
 * 
 * Zur vollständigen Abbildung des Mandats MÜSSEN die Attribute IBAN und BIC der Basisklasse Bankverbindung belegt werden.
 * 
 * <p>Java class for CT_Mandat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Mandat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_BankverbindungBasis"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Art" type="{http://www.bipro.net/namespace/datentypen}ST_MandatArt"/&gt;
 *         &lt;element name="DatumUnterschrift" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="OrtUnterschrift" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Mandatsreferenz" type="{http://www.bipro.net/namespace/datentypen}ST_Mandatsreferenz" minOccurs="0"/&gt;
 *         &lt;element name="GlaeubigerID" type="{http://www.bipro.net/namespace/datentypen}ST_GlaeubigerID" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.bipro.net/namespace/datentypen}ST_MandatStatus" minOccurs="0"/&gt;
 *         &lt;element name="NotifikationsFrist" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="NotifikationsWeg" type="{http://www.bipro.net/namespace/datentypen}ST_Versandart" minOccurs="0"/&gt;
 *         &lt;element name="GewuenschterAbbuchungstag" type="{http://www.bipro.net/namespace/datentypen}ST_Kalendertag" minOccurs="0"/&gt;
 *         &lt;element name="Sprache" type="{http://www.bipro.net/namespace/datentypen}ST_Sprache" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mandatgeber" type="{http://www.bipro.net/namespace/sepa}CT_Mandatgeber" minOccurs="0"/&gt;
 *         &lt;element name="Glaeubiger" type="{http://www.bipro.net/namespace/allgemein}CT_Unternehmen"/&gt;
 *         &lt;element name="ZugeordneterVertrag" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Notifikationsverbindung" type="{http://www.bipro.net/namespace/partner}CT_Kommunikationsverbindung" minOccurs="0"/&gt;
 *         &lt;element name="AbweichenderSchuldner" type="{http://www.bipro.net/namespace/sepa}CT_AbweichenderSchuldner" minOccurs="0"/&gt;
 *         &lt;element name="MandatsAblageort" type="{http://www.bipro.net/namespace/datentypen}ST_Mandatsablageort" minOccurs="0"/&gt;
 *         &lt;element name="Lastschriftart" type="{http://www.bipro.net/namespace/datentypen}ST_Lastschriftart" minOccurs="0"/&gt;
 *         &lt;element name="Gueltigkeit" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Mandat", propOrder = {
    "art",
    "datumUnterschrift",
    "ortUnterschrift",
    "mandatsreferenz",
    "glaeubigerID",
    "status",
    "notifikationsFrist",
    "notifikationsWeg",
    "gewuenschterAbbuchungstag",
    "sprache",
    "mandatgeber",
    "glaeubiger",
    "zugeordneterVertrag",
    "notifikationsverbindung",
    "abweichenderSchuldner",
    "mandatsAblageort",
    "lastschriftart",
    "gueltigkeit"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTMandat
    extends CTBankverbindungBasis
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Art", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMandatArt art;
    @XmlElement(name = "DatumUnterschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String datumUnterschrift;
    @XmlElement(name = "OrtUnterschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String ortUnterschrift;
    @XmlElement(name = "Mandatsreferenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String mandatsreferenz;
    @XmlElement(name = "GlaeubigerID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String glaeubigerID;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMandatStatus status;
    @XmlElement(name = "NotifikationsFrist")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer notifikationsFrist;
    @XmlElement(name = "NotifikationsWeg")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVersandart notifikationsWeg;
    @XmlElement(name = "GewuenschterAbbuchungstag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String gewuenschterAbbuchungstag;
    @XmlElement(name = "Sprache")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<String> sprache;
    @XmlElement(name = "Mandatgeber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTMandatgeber mandatgeber;
    @XmlElement(name = "Glaeubiger", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTUnternehmen glaeubiger;
    @XmlElement(name = "ZugeordneterVertrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVertragsnummer> zugeordneterVertrag;
    @XmlElement(name = "Notifikationsverbindung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTKommunikationsverbindung notifikationsverbindung;
    @XmlElement(name = "AbweichenderSchuldner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTAbweichenderSchuldner abweichenderSchuldner;
    @XmlElement(name = "MandatsAblageort")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMandatsablageort mandatsAblageort;
    @XmlElement(name = "Lastschriftart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLastschriftart lastschriftart;
    @XmlElement(name = "Gueltigkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum gueltigkeit;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link STMandatArt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STMandatArt getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMandatArt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArt(STMandatArt value) {
        this.art = value;
    }

    /**
     * Gets the value of the datumUnterschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getDatumUnterschrift() {
        return datumUnterschrift;
    }

    /**
     * Sets the value of the datumUnterschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDatumUnterschrift(String value) {
        this.datumUnterschrift = value;
    }

    /**
     * Gets the value of the ortUnterschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getOrtUnterschrift() {
        return ortUnterschrift;
    }

    /**
     * Sets the value of the ortUnterschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setOrtUnterschrift(String value) {
        this.ortUnterschrift = value;
    }

    /**
     * Gets the value of the mandatsreferenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getMandatsreferenz() {
        return mandatsreferenz;
    }

    /**
     * Sets the value of the mandatsreferenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMandatsreferenz(String value) {
        this.mandatsreferenz = value;
    }

    /**
     * Gets the value of the glaeubigerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGlaeubigerID() {
        return glaeubigerID;
    }

    /**
     * Sets the value of the glaeubigerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGlaeubigerID(String value) {
        this.glaeubigerID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STMandatStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STMandatStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMandatStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setStatus(STMandatStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the notifikationsFrist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getNotifikationsFrist() {
        return notifikationsFrist;
    }

    /**
     * Sets the value of the notifikationsFrist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNotifikationsFrist(Integer value) {
        this.notifikationsFrist = value;
    }

    /**
     * Gets the value of the notifikationsWeg property.
     * 
     * @return
     *     possible object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVersandart getNotifikationsWeg() {
        return notifikationsWeg;
    }

    /**
     * Sets the value of the notifikationsWeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNotifikationsWeg(STVersandart value) {
        this.notifikationsWeg = value;
    }

    /**
     * Gets the value of the gewuenschterAbbuchungstag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGewuenschterAbbuchungstag() {
        return gewuenschterAbbuchungstag;
    }

    /**
     * Sets the value of the gewuenschterAbbuchungstag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGewuenschterAbbuchungstag(String value) {
        this.gewuenschterAbbuchungstag = value;
    }

    /**
     * Gets the value of the sprache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sprache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprache().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<String> getSprache() {
        if (sprache == null) {
            sprache = new ArrayList<String>();
        }
        return this.sprache;
    }

    /**
     * Gets the value of the mandatgeber property.
     * 
     * @return
     *     possible object is
     *     {@link CTMandatgeber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandatgeber getMandatgeber() {
        return mandatgeber;
    }

    /**
     * Sets the value of the mandatgeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTMandatgeber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMandatgeber(CTMandatgeber value) {
        this.mandatgeber = value;
    }

    /**
     * Gets the value of the glaeubiger property.
     * 
     * @return
     *     possible object is
     *     {@link CTUnternehmen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen getGlaeubiger() {
        return glaeubiger;
    }

    /**
     * Sets the value of the glaeubiger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUnternehmen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGlaeubiger(CTUnternehmen value) {
        this.glaeubiger = value;
    }

    /**
     * Gets the value of the zugeordneterVertrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zugeordneterVertrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZugeordneterVertrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVertragsnummer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVertragsnummer> getZugeordneterVertrag() {
        if (zugeordneterVertrag == null) {
            zugeordneterVertrag = new ArrayList<CTVertragsnummer>();
        }
        return this.zugeordneterVertrag;
    }

    /**
     * Gets the value of the notifikationsverbindung property.
     * 
     * @return
     *     possible object is
     *     {@link CTKommunikationsverbindung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung getNotifikationsverbindung() {
        return notifikationsverbindung;
    }

    /**
     * Sets the value of the notifikationsverbindung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTKommunikationsverbindung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNotifikationsverbindung(CTKommunikationsverbindung value) {
        this.notifikationsverbindung = value;
    }

    /**
     * Gets the value of the abweichenderSchuldner property.
     * 
     * @return
     *     possible object is
     *     {@link CTAbweichenderSchuldner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAbweichenderSchuldner getAbweichenderSchuldner() {
        return abweichenderSchuldner;
    }

    /**
     * Sets the value of the abweichenderSchuldner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAbweichenderSchuldner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbweichenderSchuldner(CTAbweichenderSchuldner value) {
        this.abweichenderSchuldner = value;
    }

    /**
     * Gets the value of the mandatsAblageort property.
     * 
     * @return
     *     possible object is
     *     {@link STMandatsablageort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STMandatsablageort getMandatsAblageort() {
        return mandatsAblageort;
    }

    /**
     * Sets the value of the mandatsAblageort property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMandatsablageort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMandatsAblageort(STMandatsablageort value) {
        this.mandatsAblageort = value;
    }

    /**
     * Gets the value of the lastschriftart property.
     * 
     * @return
     *     possible object is
     *     {@link STLastschriftart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLastschriftart getLastschriftart() {
        return lastschriftart;
    }

    /**
     * Sets the value of the lastschriftart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLastschriftart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLastschriftart(STLastschriftart value) {
        this.lastschriftart = value;
    }

    /**
     * Gets the value of the gueltigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    /**
     * Sets the value of the gueltigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGueltigkeit(CTZeitraum value) {
        this.gueltigkeit = value;
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
        final CTMandat that = ((CTMandat) object);
        {
            STMandatArt lhsArt;
            lhsArt = this.getArt();
            STMandatArt rhsArt;
            rhsArt = that.getArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt, (this.art!= null), (that.art!= null))) {
                return false;
            }
        }
        {
            String lhsDatumUnterschrift;
            lhsDatumUnterschrift = this.getDatumUnterschrift();
            String rhsDatumUnterschrift;
            rhsDatumUnterschrift = that.getDatumUnterschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datumUnterschrift", lhsDatumUnterschrift), LocatorUtils.property(thatLocator, "datumUnterschrift", rhsDatumUnterschrift), lhsDatumUnterschrift, rhsDatumUnterschrift, (this.datumUnterschrift!= null), (that.datumUnterschrift!= null))) {
                return false;
            }
        }
        {
            String lhsOrtUnterschrift;
            lhsOrtUnterschrift = this.getOrtUnterschrift();
            String rhsOrtUnterschrift;
            rhsOrtUnterschrift = that.getOrtUnterschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ortUnterschrift", lhsOrtUnterschrift), LocatorUtils.property(thatLocator, "ortUnterschrift", rhsOrtUnterschrift), lhsOrtUnterschrift, rhsOrtUnterschrift, (this.ortUnterschrift!= null), (that.ortUnterschrift!= null))) {
                return false;
            }
        }
        {
            String lhsMandatsreferenz;
            lhsMandatsreferenz = this.getMandatsreferenz();
            String rhsMandatsreferenz;
            rhsMandatsreferenz = that.getMandatsreferenz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandatsreferenz", lhsMandatsreferenz), LocatorUtils.property(thatLocator, "mandatsreferenz", rhsMandatsreferenz), lhsMandatsreferenz, rhsMandatsreferenz, (this.mandatsreferenz!= null), (that.mandatsreferenz!= null))) {
                return false;
            }
        }
        {
            String lhsGlaeubigerID;
            lhsGlaeubigerID = this.getGlaeubigerID();
            String rhsGlaeubigerID;
            rhsGlaeubigerID = that.getGlaeubigerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "glaeubigerID", lhsGlaeubigerID), LocatorUtils.property(thatLocator, "glaeubigerID", rhsGlaeubigerID), lhsGlaeubigerID, rhsGlaeubigerID, (this.glaeubigerID!= null), (that.glaeubigerID!= null))) {
                return false;
            }
        }
        {
            STMandatStatus lhsStatus;
            lhsStatus = this.getStatus();
            STMandatStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            Integer lhsNotifikationsFrist;
            lhsNotifikationsFrist = this.getNotifikationsFrist();
            Integer rhsNotifikationsFrist;
            rhsNotifikationsFrist = that.getNotifikationsFrist();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notifikationsFrist", lhsNotifikationsFrist), LocatorUtils.property(thatLocator, "notifikationsFrist", rhsNotifikationsFrist), lhsNotifikationsFrist, rhsNotifikationsFrist, (this.notifikationsFrist!= null), (that.notifikationsFrist!= null))) {
                return false;
            }
        }
        {
            STVersandart lhsNotifikationsWeg;
            lhsNotifikationsWeg = this.getNotifikationsWeg();
            STVersandart rhsNotifikationsWeg;
            rhsNotifikationsWeg = that.getNotifikationsWeg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notifikationsWeg", lhsNotifikationsWeg), LocatorUtils.property(thatLocator, "notifikationsWeg", rhsNotifikationsWeg), lhsNotifikationsWeg, rhsNotifikationsWeg, (this.notifikationsWeg!= null), (that.notifikationsWeg!= null))) {
                return false;
            }
        }
        {
            String lhsGewuenschterAbbuchungstag;
            lhsGewuenschterAbbuchungstag = this.getGewuenschterAbbuchungstag();
            String rhsGewuenschterAbbuchungstag;
            rhsGewuenschterAbbuchungstag = that.getGewuenschterAbbuchungstag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewuenschterAbbuchungstag", lhsGewuenschterAbbuchungstag), LocatorUtils.property(thatLocator, "gewuenschterAbbuchungstag", rhsGewuenschterAbbuchungstag), lhsGewuenschterAbbuchungstag, rhsGewuenschterAbbuchungstag, (this.gewuenschterAbbuchungstag!= null), (that.gewuenschterAbbuchungstag!= null))) {
                return false;
            }
        }
        {
            List<String> lhsSprache;
            lhsSprache = (((this.sprache!= null)&&(!this.sprache.isEmpty()))?this.getSprache():null);
            List<String> rhsSprache;
            rhsSprache = (((that.sprache!= null)&&(!that.sprache.isEmpty()))?that.getSprache():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sprache", lhsSprache), LocatorUtils.property(thatLocator, "sprache", rhsSprache), lhsSprache, rhsSprache, ((this.sprache!= null)&&(!this.sprache.isEmpty())), ((that.sprache!= null)&&(!that.sprache.isEmpty())))) {
                return false;
            }
        }
        {
            CTMandatgeber lhsMandatgeber;
            lhsMandatgeber = this.getMandatgeber();
            CTMandatgeber rhsMandatgeber;
            rhsMandatgeber = that.getMandatgeber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandatgeber", lhsMandatgeber), LocatorUtils.property(thatLocator, "mandatgeber", rhsMandatgeber), lhsMandatgeber, rhsMandatgeber, (this.mandatgeber!= null), (that.mandatgeber!= null))) {
                return false;
            }
        }
        {
            CTUnternehmen lhsGlaeubiger;
            lhsGlaeubiger = this.getGlaeubiger();
            CTUnternehmen rhsGlaeubiger;
            rhsGlaeubiger = that.getGlaeubiger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "glaeubiger", lhsGlaeubiger), LocatorUtils.property(thatLocator, "glaeubiger", rhsGlaeubiger), lhsGlaeubiger, rhsGlaeubiger, (this.glaeubiger!= null), (that.glaeubiger!= null))) {
                return false;
            }
        }
        {
            List<CTVertragsnummer> lhsZugeordneterVertrag;
            lhsZugeordneterVertrag = (((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty()))?this.getZugeordneterVertrag():null);
            List<CTVertragsnummer> rhsZugeordneterVertrag;
            rhsZugeordneterVertrag = (((that.zugeordneterVertrag!= null)&&(!that.zugeordneterVertrag.isEmpty()))?that.getZugeordneterVertrag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zugeordneterVertrag", lhsZugeordneterVertrag), LocatorUtils.property(thatLocator, "zugeordneterVertrag", rhsZugeordneterVertrag), lhsZugeordneterVertrag, rhsZugeordneterVertrag, ((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty())), ((that.zugeordneterVertrag!= null)&&(!that.zugeordneterVertrag.isEmpty())))) {
                return false;
            }
        }
        {
            CTKommunikationsverbindung lhsNotifikationsverbindung;
            lhsNotifikationsverbindung = this.getNotifikationsverbindung();
            CTKommunikationsverbindung rhsNotifikationsverbindung;
            rhsNotifikationsverbindung = that.getNotifikationsverbindung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notifikationsverbindung", lhsNotifikationsverbindung), LocatorUtils.property(thatLocator, "notifikationsverbindung", rhsNotifikationsverbindung), lhsNotifikationsverbindung, rhsNotifikationsverbindung, (this.notifikationsverbindung!= null), (that.notifikationsverbindung!= null))) {
                return false;
            }
        }
        {
            CTAbweichenderSchuldner lhsAbweichenderSchuldner;
            lhsAbweichenderSchuldner = this.getAbweichenderSchuldner();
            CTAbweichenderSchuldner rhsAbweichenderSchuldner;
            rhsAbweichenderSchuldner = that.getAbweichenderSchuldner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abweichenderSchuldner", lhsAbweichenderSchuldner), LocatorUtils.property(thatLocator, "abweichenderSchuldner", rhsAbweichenderSchuldner), lhsAbweichenderSchuldner, rhsAbweichenderSchuldner, (this.abweichenderSchuldner!= null), (that.abweichenderSchuldner!= null))) {
                return false;
            }
        }
        {
            STMandatsablageort lhsMandatsAblageort;
            lhsMandatsAblageort = this.getMandatsAblageort();
            STMandatsablageort rhsMandatsAblageort;
            rhsMandatsAblageort = that.getMandatsAblageort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandatsAblageort", lhsMandatsAblageort), LocatorUtils.property(thatLocator, "mandatsAblageort", rhsMandatsAblageort), lhsMandatsAblageort, rhsMandatsAblageort, (this.mandatsAblageort!= null), (that.mandatsAblageort!= null))) {
                return false;
            }
        }
        {
            STLastschriftart lhsLastschriftart;
            lhsLastschriftart = this.getLastschriftart();
            STLastschriftart rhsLastschriftart;
            rhsLastschriftart = that.getLastschriftart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastschriftart", lhsLastschriftart), LocatorUtils.property(thatLocator, "lastschriftart", rhsLastschriftart), lhsLastschriftart, rhsLastschriftart, (this.lastschriftart!= null), (that.lastschriftart!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsGueltigkeit;
            lhsGueltigkeit = this.getGueltigkeit();
            CTZeitraum rhsGueltigkeit;
            rhsGueltigkeit = that.getGueltigkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigkeit", lhsGueltigkeit), LocatorUtils.property(thatLocator, "gueltigkeit", rhsGueltigkeit), lhsGueltigkeit, rhsGueltigkeit, (this.gueltigkeit!= null), (that.gueltigkeit!= null))) {
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
            STMandatArt theArt;
            theArt = this.getArt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "art", theArt), currentHashCode, theArt, (this.art!= null));
        }
        {
            String theDatumUnterschrift;
            theDatumUnterschrift = this.getDatumUnterschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datumUnterschrift", theDatumUnterschrift), currentHashCode, theDatumUnterschrift, (this.datumUnterschrift!= null));
        }
        {
            String theOrtUnterschrift;
            theOrtUnterschrift = this.getOrtUnterschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ortUnterschrift", theOrtUnterschrift), currentHashCode, theOrtUnterschrift, (this.ortUnterschrift!= null));
        }
        {
            String theMandatsreferenz;
            theMandatsreferenz = this.getMandatsreferenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandatsreferenz", theMandatsreferenz), currentHashCode, theMandatsreferenz, (this.mandatsreferenz!= null));
        }
        {
            String theGlaeubigerID;
            theGlaeubigerID = this.getGlaeubigerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "glaeubigerID", theGlaeubigerID), currentHashCode, theGlaeubigerID, (this.glaeubigerID!= null));
        }
        {
            STMandatStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            Integer theNotifikationsFrist;
            theNotifikationsFrist = this.getNotifikationsFrist();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifikationsFrist", theNotifikationsFrist), currentHashCode, theNotifikationsFrist, (this.notifikationsFrist!= null));
        }
        {
            STVersandart theNotifikationsWeg;
            theNotifikationsWeg = this.getNotifikationsWeg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifikationsWeg", theNotifikationsWeg), currentHashCode, theNotifikationsWeg, (this.notifikationsWeg!= null));
        }
        {
            String theGewuenschterAbbuchungstag;
            theGewuenschterAbbuchungstag = this.getGewuenschterAbbuchungstag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewuenschterAbbuchungstag", theGewuenschterAbbuchungstag), currentHashCode, theGewuenschterAbbuchungstag, (this.gewuenschterAbbuchungstag!= null));
        }
        {
            List<String> theSprache;
            theSprache = (((this.sprache!= null)&&(!this.sprache.isEmpty()))?this.getSprache():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sprache", theSprache), currentHashCode, theSprache, ((this.sprache!= null)&&(!this.sprache.isEmpty())));
        }
        {
            CTMandatgeber theMandatgeber;
            theMandatgeber = this.getMandatgeber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandatgeber", theMandatgeber), currentHashCode, theMandatgeber, (this.mandatgeber!= null));
        }
        {
            CTUnternehmen theGlaeubiger;
            theGlaeubiger = this.getGlaeubiger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "glaeubiger", theGlaeubiger), currentHashCode, theGlaeubiger, (this.glaeubiger!= null));
        }
        {
            List<CTVertragsnummer> theZugeordneterVertrag;
            theZugeordneterVertrag = (((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty()))?this.getZugeordneterVertrag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zugeordneterVertrag", theZugeordneterVertrag), currentHashCode, theZugeordneterVertrag, ((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty())));
        }
        {
            CTKommunikationsverbindung theNotifikationsverbindung;
            theNotifikationsverbindung = this.getNotifikationsverbindung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifikationsverbindung", theNotifikationsverbindung), currentHashCode, theNotifikationsverbindung, (this.notifikationsverbindung!= null));
        }
        {
            CTAbweichenderSchuldner theAbweichenderSchuldner;
            theAbweichenderSchuldner = this.getAbweichenderSchuldner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abweichenderSchuldner", theAbweichenderSchuldner), currentHashCode, theAbweichenderSchuldner, (this.abweichenderSchuldner!= null));
        }
        {
            STMandatsablageort theMandatsAblageort;
            theMandatsAblageort = this.getMandatsAblageort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandatsAblageort", theMandatsAblageort), currentHashCode, theMandatsAblageort, (this.mandatsAblageort!= null));
        }
        {
            STLastschriftart theLastschriftart;
            theLastschriftart = this.getLastschriftart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastschriftart", theLastschriftart), currentHashCode, theLastschriftart, (this.lastschriftart!= null));
        }
        {
            CTZeitraum theGueltigkeit;
            theGueltigkeit = this.getGueltigkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigkeit", theGueltigkeit), currentHashCode, theGueltigkeit, (this.gueltigkeit!= null));
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
        if (draftCopy instanceof CTMandat) {
            final CTMandat copy = ((CTMandat) draftCopy);
            {
                Boolean artShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.art!= null));
                if (artShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMandatArt sourceArt;
                    sourceArt = this.getArt();
                    STMandatArt copyArt = ((STMandatArt) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt, (this.art!= null)));
                    copy.setArt(copyArt);
                } else {
                    if (artShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.art = null;
                    }
                }
            }
            {
                Boolean datumUnterschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datumUnterschrift!= null));
                if (datumUnterschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDatumUnterschrift;
                    sourceDatumUnterschrift = this.getDatumUnterschrift();
                    String copyDatumUnterschrift = ((String) strategy.copy(LocatorUtils.property(locator, "datumUnterschrift", sourceDatumUnterschrift), sourceDatumUnterschrift, (this.datumUnterschrift!= null)));
                    copy.setDatumUnterschrift(copyDatumUnterschrift);
                } else {
                    if (datumUnterschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datumUnterschrift = null;
                    }
                }
            }
            {
                Boolean ortUnterschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ortUnterschrift!= null));
                if (ortUnterschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrtUnterschrift;
                    sourceOrtUnterschrift = this.getOrtUnterschrift();
                    String copyOrtUnterschrift = ((String) strategy.copy(LocatorUtils.property(locator, "ortUnterschrift", sourceOrtUnterschrift), sourceOrtUnterschrift, (this.ortUnterschrift!= null)));
                    copy.setOrtUnterschrift(copyOrtUnterschrift);
                } else {
                    if (ortUnterschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ortUnterschrift = null;
                    }
                }
            }
            {
                Boolean mandatsreferenzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mandatsreferenz!= null));
                if (mandatsreferenzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMandatsreferenz;
                    sourceMandatsreferenz = this.getMandatsreferenz();
                    String copyMandatsreferenz = ((String) strategy.copy(LocatorUtils.property(locator, "mandatsreferenz", sourceMandatsreferenz), sourceMandatsreferenz, (this.mandatsreferenz!= null)));
                    copy.setMandatsreferenz(copyMandatsreferenz);
                } else {
                    if (mandatsreferenzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mandatsreferenz = null;
                    }
                }
            }
            {
                Boolean glaeubigerIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.glaeubigerID!= null));
                if (glaeubigerIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGlaeubigerID;
                    sourceGlaeubigerID = this.getGlaeubigerID();
                    String copyGlaeubigerID = ((String) strategy.copy(LocatorUtils.property(locator, "glaeubigerID", sourceGlaeubigerID), sourceGlaeubigerID, (this.glaeubigerID!= null)));
                    copy.setGlaeubigerID(copyGlaeubigerID);
                } else {
                    if (glaeubigerIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.glaeubigerID = null;
                    }
                }
            }
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMandatStatus sourceStatus;
                    sourceStatus = this.getStatus();
                    STMandatStatus copyStatus = ((STMandatStatus) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
                    }
                }
            }
            {
                Boolean notifikationsFristShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifikationsFrist!= null));
                if (notifikationsFristShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNotifikationsFrist;
                    sourceNotifikationsFrist = this.getNotifikationsFrist();
                    Integer copyNotifikationsFrist = ((Integer) strategy.copy(LocatorUtils.property(locator, "notifikationsFrist", sourceNotifikationsFrist), sourceNotifikationsFrist, (this.notifikationsFrist!= null)));
                    copy.setNotifikationsFrist(copyNotifikationsFrist);
                } else {
                    if (notifikationsFristShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.notifikationsFrist = null;
                    }
                }
            }
            {
                Boolean notifikationsWegShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifikationsWeg!= null));
                if (notifikationsWegShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVersandart sourceNotifikationsWeg;
                    sourceNotifikationsWeg = this.getNotifikationsWeg();
                    STVersandart copyNotifikationsWeg = ((STVersandart) strategy.copy(LocatorUtils.property(locator, "notifikationsWeg", sourceNotifikationsWeg), sourceNotifikationsWeg, (this.notifikationsWeg!= null)));
                    copy.setNotifikationsWeg(copyNotifikationsWeg);
                } else {
                    if (notifikationsWegShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.notifikationsWeg = null;
                    }
                }
            }
            {
                Boolean gewuenschterAbbuchungstagShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewuenschterAbbuchungstag!= null));
                if (gewuenschterAbbuchungstagShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGewuenschterAbbuchungstag;
                    sourceGewuenschterAbbuchungstag = this.getGewuenschterAbbuchungstag();
                    String copyGewuenschterAbbuchungstag = ((String) strategy.copy(LocatorUtils.property(locator, "gewuenschterAbbuchungstag", sourceGewuenschterAbbuchungstag), sourceGewuenschterAbbuchungstag, (this.gewuenschterAbbuchungstag!= null)));
                    copy.setGewuenschterAbbuchungstag(copyGewuenschterAbbuchungstag);
                } else {
                    if (gewuenschterAbbuchungstagShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewuenschterAbbuchungstag = null;
                    }
                }
            }
            {
                Boolean spracheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sprache!= null)&&(!this.sprache.isEmpty())));
                if (spracheShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceSprache;
                    sourceSprache = (((this.sprache!= null)&&(!this.sprache.isEmpty()))?this.getSprache():null);
                    @SuppressWarnings("unchecked")
                    List<String> copySprache = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "sprache", sourceSprache), sourceSprache, ((this.sprache!= null)&&(!this.sprache.isEmpty()))));
                    copy.sprache = null;
                    if (copySprache!= null) {
                        List<String> uniqueSprachel = copy.getSprache();
                        uniqueSprachel.addAll(copySprache);
                    }
                } else {
                    if (spracheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sprache = null;
                    }
                }
            }
            {
                Boolean mandatgeberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mandatgeber!= null));
                if (mandatgeberShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTMandatgeber sourceMandatgeber;
                    sourceMandatgeber = this.getMandatgeber();
                    CTMandatgeber copyMandatgeber = ((CTMandatgeber) strategy.copy(LocatorUtils.property(locator, "mandatgeber", sourceMandatgeber), sourceMandatgeber, (this.mandatgeber!= null)));
                    copy.setMandatgeber(copyMandatgeber);
                } else {
                    if (mandatgeberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mandatgeber = null;
                    }
                }
            }
            {
                Boolean glaeubigerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.glaeubiger!= null));
                if (glaeubigerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTUnternehmen sourceGlaeubiger;
                    sourceGlaeubiger = this.getGlaeubiger();
                    CTUnternehmen copyGlaeubiger = ((CTUnternehmen) strategy.copy(LocatorUtils.property(locator, "glaeubiger", sourceGlaeubiger), sourceGlaeubiger, (this.glaeubiger!= null)));
                    copy.setGlaeubiger(copyGlaeubiger);
                } else {
                    if (glaeubigerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.glaeubiger = null;
                    }
                }
            }
            {
                Boolean zugeordneterVertragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty())));
                if (zugeordneterVertragShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVertragsnummer> sourceZugeordneterVertrag;
                    sourceZugeordneterVertrag = (((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty()))?this.getZugeordneterVertrag():null);
                    @SuppressWarnings("unchecked")
                    List<CTVertragsnummer> copyZugeordneterVertrag = ((List<CTVertragsnummer> ) strategy.copy(LocatorUtils.property(locator, "zugeordneterVertrag", sourceZugeordneterVertrag), sourceZugeordneterVertrag, ((this.zugeordneterVertrag!= null)&&(!this.zugeordneterVertrag.isEmpty()))));
                    copy.zugeordneterVertrag = null;
                    if (copyZugeordneterVertrag!= null) {
                        List<CTVertragsnummer> uniqueZugeordneterVertragl = copy.getZugeordneterVertrag();
                        uniqueZugeordneterVertragl.addAll(copyZugeordneterVertrag);
                    }
                } else {
                    if (zugeordneterVertragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zugeordneterVertrag = null;
                    }
                }
            }
            {
                Boolean notifikationsverbindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifikationsverbindung!= null));
                if (notifikationsverbindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTKommunikationsverbindung sourceNotifikationsverbindung;
                    sourceNotifikationsverbindung = this.getNotifikationsverbindung();
                    CTKommunikationsverbindung copyNotifikationsverbindung = ((CTKommunikationsverbindung) strategy.copy(LocatorUtils.property(locator, "notifikationsverbindung", sourceNotifikationsverbindung), sourceNotifikationsverbindung, (this.notifikationsverbindung!= null)));
                    copy.setNotifikationsverbindung(copyNotifikationsverbindung);
                } else {
                    if (notifikationsverbindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.notifikationsverbindung = null;
                    }
                }
            }
            {
                Boolean abweichenderSchuldnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abweichenderSchuldner!= null));
                if (abweichenderSchuldnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAbweichenderSchuldner sourceAbweichenderSchuldner;
                    sourceAbweichenderSchuldner = this.getAbweichenderSchuldner();
                    CTAbweichenderSchuldner copyAbweichenderSchuldner = ((CTAbweichenderSchuldner) strategy.copy(LocatorUtils.property(locator, "abweichenderSchuldner", sourceAbweichenderSchuldner), sourceAbweichenderSchuldner, (this.abweichenderSchuldner!= null)));
                    copy.setAbweichenderSchuldner(copyAbweichenderSchuldner);
                } else {
                    if (abweichenderSchuldnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abweichenderSchuldner = null;
                    }
                }
            }
            {
                Boolean mandatsAblageortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mandatsAblageort!= null));
                if (mandatsAblageortShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMandatsablageort sourceMandatsAblageort;
                    sourceMandatsAblageort = this.getMandatsAblageort();
                    STMandatsablageort copyMandatsAblageort = ((STMandatsablageort) strategy.copy(LocatorUtils.property(locator, "mandatsAblageort", sourceMandatsAblageort), sourceMandatsAblageort, (this.mandatsAblageort!= null)));
                    copy.setMandatsAblageort(copyMandatsAblageort);
                } else {
                    if (mandatsAblageortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mandatsAblageort = null;
                    }
                }
            }
            {
                Boolean lastschriftartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastschriftart!= null));
                if (lastschriftartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLastschriftart sourceLastschriftart;
                    sourceLastschriftart = this.getLastschriftart();
                    STLastschriftart copyLastschriftart = ((STLastschriftart) strategy.copy(LocatorUtils.property(locator, "lastschriftart", sourceLastschriftart), sourceLastschriftart, (this.lastschriftart!= null)));
                    copy.setLastschriftart(copyLastschriftart);
                } else {
                    if (lastschriftartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastschriftart = null;
                    }
                }
            }
            {
                Boolean gueltigkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigkeit!= null));
                if (gueltigkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceGueltigkeit;
                    sourceGueltigkeit = this.getGueltigkeit();
                    CTZeitraum copyGueltigkeit = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "gueltigkeit", sourceGueltigkeit), sourceGueltigkeit, (this.gueltigkeit!= null)));
                    copy.setGueltigkeit(copyGueltigkeit);
                } else {
                    if (gueltigkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigkeit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTMandat();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withArt(STMandatArt value) {
        setArt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withDatumUnterschrift(String value) {
        setDatumUnterschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withOrtUnterschrift(String value) {
        setOrtUnterschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withMandatsreferenz(String value) {
        setMandatsreferenz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withGlaeubigerID(String value) {
        setGlaeubigerID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withStatus(STMandatStatus value) {
        setStatus(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withNotifikationsFrist(Integer value) {
        setNotifikationsFrist(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withNotifikationsWeg(STVersandart value) {
        setNotifikationsWeg(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withGewuenschterAbbuchungstag(String value) {
        setGewuenschterAbbuchungstag(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withSprache(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSprache().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withSprache(Collection<String> values) {
        if (values!= null) {
            getSprache().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withMandatgeber(CTMandatgeber value) {
        setMandatgeber(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withGlaeubiger(CTUnternehmen value) {
        setGlaeubiger(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withZugeordneterVertrag(CTVertragsnummer... values) {
        if (values!= null) {
            for (CTVertragsnummer value: values) {
                getZugeordneterVertrag().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withZugeordneterVertrag(Collection<CTVertragsnummer> values) {
        if (values!= null) {
            getZugeordneterVertrag().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withNotifikationsverbindung(CTKommunikationsverbindung value) {
        setNotifikationsverbindung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withAbweichenderSchuldner(CTAbweichenderSchuldner value) {
        setAbweichenderSchuldner(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withMandatsAblageort(STMandatsablageort value) {
        setMandatsAblageort(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withLastschriftart(STLastschriftart value) {
        setLastschriftart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withBankverbindung(STTypDerBankverbindung value) {
        setBankverbindung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withBIC(String value) {
        setBIC(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withIBAN(String value) {
        setIBAN(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withInstitut(String value) {
        setInstitut(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withKontoinhaber(String value) {
        setKontoinhaber(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
