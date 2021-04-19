
package net.bipro.namespace.sachen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STHaftungsgrundlage;
import net.bipro.namespace.datentypen.STIncoterms;
import net.bipro.namespace.datentypen.STTransportmittelSchluessel;
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
 * Klasse zur Beschreibung von Gütern (z. B. Schüttgut oder Stückgut) während eines Transportes.
 * 
 * <p>Java class for CT_Transport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Transport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransportmittelSchluessel" type="{http://www.bipro.net/namespace/datentypen}ST_TransportmittelSchluessel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Transportmittel" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Route" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Besonderheiten" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Zertifikatsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text017" minOccurs="0"/&gt;
 *         &lt;element name="Warenbezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Menge" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Verpackungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Signatur" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Zeitraum" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Gewicht" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://www.bipro.net/namespace/datentypen}ST_Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="Haftungsgrundlage" type="{http://www.bipro.net/namespace/datentypen}ST_Haftungsgrundlage" minOccurs="0"/&gt;
 *         &lt;element name="Empfaenger" type="{http://www.bipro.net/namespace/sachen}CT_Empfaenger" minOccurs="0"/&gt;
 *         &lt;element name="Bestimmungsort" type="{http://www.bipro.net/namespace/sachen}CT_Bestimmungsort" minOccurs="0"/&gt;
 *         &lt;element name="Absender" type="{http://www.bipro.net/namespace/sachen}CT_Absender" minOccurs="0"/&gt;
 *         &lt;element name="Abgangsort" type="{http://www.bipro.net/namespace/sachen}CT_Abgangsort" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Transport", propOrder = {
    "transportmittelSchluessel",
    "transportmittel",
    "route",
    "besonderheiten",
    "zertifikatsnummer",
    "warenbezeichnung",
    "menge",
    "verpackungsart",
    "signatur",
    "zeitraum",
    "gewicht",
    "incoterms",
    "haftungsgrundlage",
    "empfaenger",
    "bestimmungsort",
    "absender",
    "abgangsort"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTTransport
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "TransportmittelSchluessel")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STTransportmittelSchluessel> transportmittelSchluessel;
    @XmlElement(name = "Transportmittel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String transportmittel;
    @XmlElement(name = "Route")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String route;
    @XmlElement(name = "Besonderheiten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String besonderheiten;
    @XmlElement(name = "Zertifikatsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String zertifikatsnummer;
    @XmlElement(name = "Warenbezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String warenbezeichnung;
    @XmlElement(name = "Menge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String menge;
    @XmlElement(name = "Verpackungsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String verpackungsart;
    @XmlElement(name = "Signatur")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String signatur;
    @XmlElement(name = "Zeitraum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum zeitraum;
    @XmlElement(name = "Gewicht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal gewicht;
    @XmlElement(name = "Incoterms")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STIncoterms incoterms;
    @XmlElement(name = "Haftungsgrundlage")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STHaftungsgrundlage haftungsgrundlage;
    @XmlElement(name = "Empfaenger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTEmpfaenger empfaenger;
    @XmlElement(name = "Bestimmungsort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBestimmungsort bestimmungsort;
    @XmlElement(name = "Absender")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTAbsender absender;
    @XmlElement(name = "Abgangsort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTAbgangsort abgangsort;

    /**
     * Gets the value of the transportmittelSchluessel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportmittelSchluessel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportmittelSchluessel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STTransportmittelSchluessel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STTransportmittelSchluessel> getTransportmittelSchluessel() {
        if (transportmittelSchluessel == null) {
            transportmittelSchluessel = new ArrayList<STTransportmittelSchluessel>();
        }
        return this.transportmittelSchluessel;
    }

    /**
     * Gets the value of the transportmittel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getTransportmittel() {
        return transportmittel;
    }

    /**
     * Sets the value of the transportmittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setTransportmittel(String value) {
        this.transportmittel = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the besonderheiten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBesonderheiten() {
        return besonderheiten;
    }

    /**
     * Sets the value of the besonderheiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBesonderheiten(String value) {
        this.besonderheiten = value;
    }

    /**
     * Gets the value of the zertifikatsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getZertifikatsnummer() {
        return zertifikatsnummer;
    }

    /**
     * Sets the value of the zertifikatsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZertifikatsnummer(String value) {
        this.zertifikatsnummer = value;
    }

    /**
     * Gets the value of the warenbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getWarenbezeichnung() {
        return warenbezeichnung;
    }

    /**
     * Sets the value of the warenbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWarenbezeichnung(String value) {
        this.warenbezeichnung = value;
    }

    /**
     * Gets the value of the menge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getMenge() {
        return menge;
    }

    /**
     * Sets the value of the menge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMenge(String value) {
        this.menge = value;
    }

    /**
     * Gets the value of the verpackungsart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVerpackungsart() {
        return verpackungsart;
    }

    /**
     * Sets the value of the verpackungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVerpackungsart(String value) {
        this.verpackungsart = value;
    }

    /**
     * Gets the value of the signatur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getSignatur() {
        return signatur;
    }

    /**
     * Sets the value of the signatur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSignatur(String value) {
        this.signatur = value;
    }

    /**
     * Gets the value of the zeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getZeitraum() {
        return zeitraum;
    }

    /**
     * Sets the value of the zeitraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZeitraum(CTZeitraum value) {
        this.zeitraum = value;
    }

    /**
     * Gets the value of the gewicht property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getGewicht() {
        return gewicht;
    }

    /**
     * Sets the value of the gewicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGewicht(BigDecimal value) {
        this.gewicht = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link STIncoterms }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STIncoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link STIncoterms }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setIncoterms(STIncoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the haftungsgrundlage property.
     * 
     * @return
     *     possible object is
     *     {@link STHaftungsgrundlage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STHaftungsgrundlage getHaftungsgrundlage() {
        return haftungsgrundlage;
    }

    /**
     * Sets the value of the haftungsgrundlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link STHaftungsgrundlage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHaftungsgrundlage(STHaftungsgrundlage value) {
        this.haftungsgrundlage = value;
    }

    /**
     * Gets the value of the empfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link CTEmpfaenger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEmpfaenger getEmpfaenger() {
        return empfaenger;
    }

    /**
     * Sets the value of the empfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEmpfaenger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setEmpfaenger(CTEmpfaenger value) {
        this.empfaenger = value;
    }

    /**
     * Gets the value of the bestimmungsort property.
     * 
     * @return
     *     possible object is
     *     {@link CTBestimmungsort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBestimmungsort getBestimmungsort() {
        return bestimmungsort;
    }

    /**
     * Sets the value of the bestimmungsort property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBestimmungsort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBestimmungsort(CTBestimmungsort value) {
        this.bestimmungsort = value;
    }

    /**
     * Gets the value of the absender property.
     * 
     * @return
     *     possible object is
     *     {@link CTAbsender }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbsender getAbsender() {
        return absender;
    }

    /**
     * Sets the value of the absender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAbsender }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAbsender(CTAbsender value) {
        this.absender = value;
    }

    /**
     * Gets the value of the abgangsort property.
     * 
     * @return
     *     possible object is
     *     {@link CTAbgangsort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbgangsort getAbgangsort() {
        return abgangsort;
    }

    /**
     * Sets the value of the abgangsort property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAbgangsort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAbgangsort(CTAbgangsort value) {
        this.abgangsort = value;
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
        final CTTransport that = ((CTTransport) object);
        {
            List<STTransportmittelSchluessel> lhsTransportmittelSchluessel;
            lhsTransportmittelSchluessel = (((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty()))?this.getTransportmittelSchluessel():null);
            List<STTransportmittelSchluessel> rhsTransportmittelSchluessel;
            rhsTransportmittelSchluessel = (((that.transportmittelSchluessel!= null)&&(!that.transportmittelSchluessel.isEmpty()))?that.getTransportmittelSchluessel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportmittelSchluessel", lhsTransportmittelSchluessel), LocatorUtils.property(thatLocator, "transportmittelSchluessel", rhsTransportmittelSchluessel), lhsTransportmittelSchluessel, rhsTransportmittelSchluessel, ((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty())), ((that.transportmittelSchluessel!= null)&&(!that.transportmittelSchluessel.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsTransportmittel;
            lhsTransportmittel = this.getTransportmittel();
            String rhsTransportmittel;
            rhsTransportmittel = that.getTransportmittel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportmittel", lhsTransportmittel), LocatorUtils.property(thatLocator, "transportmittel", rhsTransportmittel), lhsTransportmittel, rhsTransportmittel, (this.transportmittel!= null), (that.transportmittel!= null))) {
                return false;
            }
        }
        {
            String lhsRoute;
            lhsRoute = this.getRoute();
            String rhsRoute;
            rhsRoute = that.getRoute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "route", lhsRoute), LocatorUtils.property(thatLocator, "route", rhsRoute), lhsRoute, rhsRoute, (this.route!= null), (that.route!= null))) {
                return false;
            }
        }
        {
            String lhsBesonderheiten;
            lhsBesonderheiten = this.getBesonderheiten();
            String rhsBesonderheiten;
            rhsBesonderheiten = that.getBesonderheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besonderheiten", lhsBesonderheiten), LocatorUtils.property(thatLocator, "besonderheiten", rhsBesonderheiten), lhsBesonderheiten, rhsBesonderheiten, (this.besonderheiten!= null), (that.besonderheiten!= null))) {
                return false;
            }
        }
        {
            String lhsZertifikatsnummer;
            lhsZertifikatsnummer = this.getZertifikatsnummer();
            String rhsZertifikatsnummer;
            rhsZertifikatsnummer = that.getZertifikatsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zertifikatsnummer", lhsZertifikatsnummer), LocatorUtils.property(thatLocator, "zertifikatsnummer", rhsZertifikatsnummer), lhsZertifikatsnummer, rhsZertifikatsnummer, (this.zertifikatsnummer!= null), (that.zertifikatsnummer!= null))) {
                return false;
            }
        }
        {
            String lhsWarenbezeichnung;
            lhsWarenbezeichnung = this.getWarenbezeichnung();
            String rhsWarenbezeichnung;
            rhsWarenbezeichnung = that.getWarenbezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warenbezeichnung", lhsWarenbezeichnung), LocatorUtils.property(thatLocator, "warenbezeichnung", rhsWarenbezeichnung), lhsWarenbezeichnung, rhsWarenbezeichnung, (this.warenbezeichnung!= null), (that.warenbezeichnung!= null))) {
                return false;
            }
        }
        {
            String lhsMenge;
            lhsMenge = this.getMenge();
            String rhsMenge;
            rhsMenge = that.getMenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "menge", lhsMenge), LocatorUtils.property(thatLocator, "menge", rhsMenge), lhsMenge, rhsMenge, (this.menge!= null), (that.menge!= null))) {
                return false;
            }
        }
        {
            String lhsVerpackungsart;
            lhsVerpackungsart = this.getVerpackungsart();
            String rhsVerpackungsart;
            rhsVerpackungsart = that.getVerpackungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verpackungsart", lhsVerpackungsart), LocatorUtils.property(thatLocator, "verpackungsart", rhsVerpackungsart), lhsVerpackungsart, rhsVerpackungsart, (this.verpackungsart!= null), (that.verpackungsart!= null))) {
                return false;
            }
        }
        {
            String lhsSignatur;
            lhsSignatur = this.getSignatur();
            String rhsSignatur;
            rhsSignatur = that.getSignatur();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatur", lhsSignatur), LocatorUtils.property(thatLocator, "signatur", rhsSignatur), lhsSignatur, rhsSignatur, (this.signatur!= null), (that.signatur!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsZeitraum;
            lhsZeitraum = this.getZeitraum();
            CTZeitraum rhsZeitraum;
            rhsZeitraum = that.getZeitraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeitraum", lhsZeitraum), LocatorUtils.property(thatLocator, "zeitraum", rhsZeitraum), lhsZeitraum, rhsZeitraum, (this.zeitraum!= null), (that.zeitraum!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGewicht;
            lhsGewicht = this.getGewicht();
            BigDecimal rhsGewicht;
            rhsGewicht = that.getGewicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewicht", lhsGewicht), LocatorUtils.property(thatLocator, "gewicht", rhsGewicht), lhsGewicht, rhsGewicht, (this.gewicht!= null), (that.gewicht!= null))) {
                return false;
            }
        }
        {
            STIncoterms lhsIncoterms;
            lhsIncoterms = this.getIncoterms();
            STIncoterms rhsIncoterms;
            rhsIncoterms = that.getIncoterms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incoterms", lhsIncoterms), LocatorUtils.property(thatLocator, "incoterms", rhsIncoterms), lhsIncoterms, rhsIncoterms, (this.incoterms!= null), (that.incoterms!= null))) {
                return false;
            }
        }
        {
            STHaftungsgrundlage lhsHaftungsgrundlage;
            lhsHaftungsgrundlage = this.getHaftungsgrundlage();
            STHaftungsgrundlage rhsHaftungsgrundlage;
            rhsHaftungsgrundlage = that.getHaftungsgrundlage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haftungsgrundlage", lhsHaftungsgrundlage), LocatorUtils.property(thatLocator, "haftungsgrundlage", rhsHaftungsgrundlage), lhsHaftungsgrundlage, rhsHaftungsgrundlage, (this.haftungsgrundlage!= null), (that.haftungsgrundlage!= null))) {
                return false;
            }
        }
        {
            CTEmpfaenger lhsEmpfaenger;
            lhsEmpfaenger = this.getEmpfaenger();
            CTEmpfaenger rhsEmpfaenger;
            rhsEmpfaenger = that.getEmpfaenger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "empfaenger", lhsEmpfaenger), LocatorUtils.property(thatLocator, "empfaenger", rhsEmpfaenger), lhsEmpfaenger, rhsEmpfaenger, (this.empfaenger!= null), (that.empfaenger!= null))) {
                return false;
            }
        }
        {
            CTBestimmungsort lhsBestimmungsort;
            lhsBestimmungsort = this.getBestimmungsort();
            CTBestimmungsort rhsBestimmungsort;
            rhsBestimmungsort = that.getBestimmungsort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestimmungsort", lhsBestimmungsort), LocatorUtils.property(thatLocator, "bestimmungsort", rhsBestimmungsort), lhsBestimmungsort, rhsBestimmungsort, (this.bestimmungsort!= null), (that.bestimmungsort!= null))) {
                return false;
            }
        }
        {
            CTAbsender lhsAbsender;
            lhsAbsender = this.getAbsender();
            CTAbsender rhsAbsender;
            rhsAbsender = that.getAbsender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "absender", lhsAbsender), LocatorUtils.property(thatLocator, "absender", rhsAbsender), lhsAbsender, rhsAbsender, (this.absender!= null), (that.absender!= null))) {
                return false;
            }
        }
        {
            CTAbgangsort lhsAbgangsort;
            lhsAbgangsort = this.getAbgangsort();
            CTAbgangsort rhsAbgangsort;
            rhsAbgangsort = that.getAbgangsort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abgangsort", lhsAbgangsort), LocatorUtils.property(thatLocator, "abgangsort", rhsAbgangsort), lhsAbgangsort, rhsAbgangsort, (this.abgangsort!= null), (that.abgangsort!= null))) {
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
            List<STTransportmittelSchluessel> theTransportmittelSchluessel;
            theTransportmittelSchluessel = (((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty()))?this.getTransportmittelSchluessel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportmittelSchluessel", theTransportmittelSchluessel), currentHashCode, theTransportmittelSchluessel, ((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty())));
        }
        {
            String theTransportmittel;
            theTransportmittel = this.getTransportmittel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportmittel", theTransportmittel), currentHashCode, theTransportmittel, (this.transportmittel!= null));
        }
        {
            String theRoute;
            theRoute = this.getRoute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "route", theRoute), currentHashCode, theRoute, (this.route!= null));
        }
        {
            String theBesonderheiten;
            theBesonderheiten = this.getBesonderheiten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "besonderheiten", theBesonderheiten), currentHashCode, theBesonderheiten, (this.besonderheiten!= null));
        }
        {
            String theZertifikatsnummer;
            theZertifikatsnummer = this.getZertifikatsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zertifikatsnummer", theZertifikatsnummer), currentHashCode, theZertifikatsnummer, (this.zertifikatsnummer!= null));
        }
        {
            String theWarenbezeichnung;
            theWarenbezeichnung = this.getWarenbezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warenbezeichnung", theWarenbezeichnung), currentHashCode, theWarenbezeichnung, (this.warenbezeichnung!= null));
        }
        {
            String theMenge;
            theMenge = this.getMenge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "menge", theMenge), currentHashCode, theMenge, (this.menge!= null));
        }
        {
            String theVerpackungsart;
            theVerpackungsart = this.getVerpackungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verpackungsart", theVerpackungsart), currentHashCode, theVerpackungsart, (this.verpackungsart!= null));
        }
        {
            String theSignatur;
            theSignatur = this.getSignatur();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatur", theSignatur), currentHashCode, theSignatur, (this.signatur!= null));
        }
        {
            CTZeitraum theZeitraum;
            theZeitraum = this.getZeitraum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitraum", theZeitraum), currentHashCode, theZeitraum, (this.zeitraum!= null));
        }
        {
            BigDecimal theGewicht;
            theGewicht = this.getGewicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewicht", theGewicht), currentHashCode, theGewicht, (this.gewicht!= null));
        }
        {
            STIncoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incoterms", theIncoterms), currentHashCode, theIncoterms, (this.incoterms!= null));
        }
        {
            STHaftungsgrundlage theHaftungsgrundlage;
            theHaftungsgrundlage = this.getHaftungsgrundlage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haftungsgrundlage", theHaftungsgrundlage), currentHashCode, theHaftungsgrundlage, (this.haftungsgrundlage!= null));
        }
        {
            CTEmpfaenger theEmpfaenger;
            theEmpfaenger = this.getEmpfaenger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "empfaenger", theEmpfaenger), currentHashCode, theEmpfaenger, (this.empfaenger!= null));
        }
        {
            CTBestimmungsort theBestimmungsort;
            theBestimmungsort = this.getBestimmungsort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestimmungsort", theBestimmungsort), currentHashCode, theBestimmungsort, (this.bestimmungsort!= null));
        }
        {
            CTAbsender theAbsender;
            theAbsender = this.getAbsender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "absender", theAbsender), currentHashCode, theAbsender, (this.absender!= null));
        }
        {
            CTAbgangsort theAbgangsort;
            theAbgangsort = this.getAbgangsort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abgangsort", theAbgangsort), currentHashCode, theAbgangsort, (this.abgangsort!= null));
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
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof CTTransport) {
            final CTTransport copy = ((CTTransport) draftCopy);
            {
                Boolean transportmittelSchluesselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty())));
                if (transportmittelSchluesselShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STTransportmittelSchluessel> sourceTransportmittelSchluessel;
                    sourceTransportmittelSchluessel = (((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty()))?this.getTransportmittelSchluessel():null);
                    @SuppressWarnings("unchecked")
                    List<STTransportmittelSchluessel> copyTransportmittelSchluessel = ((List<STTransportmittelSchluessel> ) strategy.copy(LocatorUtils.property(locator, "transportmittelSchluessel", sourceTransportmittelSchluessel), sourceTransportmittelSchluessel, ((this.transportmittelSchluessel!= null)&&(!this.transportmittelSchluessel.isEmpty()))));
                    copy.transportmittelSchluessel = null;
                    if (copyTransportmittelSchluessel!= null) {
                        List<STTransportmittelSchluessel> uniqueTransportmittelSchluessell = copy.getTransportmittelSchluessel();
                        uniqueTransportmittelSchluessell.addAll(copyTransportmittelSchluessel);
                    }
                } else {
                    if (transportmittelSchluesselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transportmittelSchluessel = null;
                    }
                }
            }
            {
                Boolean transportmittelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.transportmittel!= null));
                if (transportmittelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTransportmittel;
                    sourceTransportmittel = this.getTransportmittel();
                    String copyTransportmittel = ((String) strategy.copy(LocatorUtils.property(locator, "transportmittel", sourceTransportmittel), sourceTransportmittel, (this.transportmittel!= null)));
                    copy.setTransportmittel(copyTransportmittel);
                } else {
                    if (transportmittelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transportmittel = null;
                    }
                }
            }
            {
                Boolean routeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.route!= null));
                if (routeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRoute;
                    sourceRoute = this.getRoute();
                    String copyRoute = ((String) strategy.copy(LocatorUtils.property(locator, "route", sourceRoute), sourceRoute, (this.route!= null)));
                    copy.setRoute(copyRoute);
                } else {
                    if (routeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.route = null;
                    }
                }
            }
            {
                Boolean besonderheitenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.besonderheiten!= null));
                if (besonderheitenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBesonderheiten;
                    sourceBesonderheiten = this.getBesonderheiten();
                    String copyBesonderheiten = ((String) strategy.copy(LocatorUtils.property(locator, "besonderheiten", sourceBesonderheiten), sourceBesonderheiten, (this.besonderheiten!= null)));
                    copy.setBesonderheiten(copyBesonderheiten);
                } else {
                    if (besonderheitenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.besonderheiten = null;
                    }
                }
            }
            {
                Boolean zertifikatsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zertifikatsnummer!= null));
                if (zertifikatsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZertifikatsnummer;
                    sourceZertifikatsnummer = this.getZertifikatsnummer();
                    String copyZertifikatsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "zertifikatsnummer", sourceZertifikatsnummer), sourceZertifikatsnummer, (this.zertifikatsnummer!= null)));
                    copy.setZertifikatsnummer(copyZertifikatsnummer);
                } else {
                    if (zertifikatsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zertifikatsnummer = null;
                    }
                }
            }
            {
                Boolean warenbezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.warenbezeichnung!= null));
                if (warenbezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWarenbezeichnung;
                    sourceWarenbezeichnung = this.getWarenbezeichnung();
                    String copyWarenbezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "warenbezeichnung", sourceWarenbezeichnung), sourceWarenbezeichnung, (this.warenbezeichnung!= null)));
                    copy.setWarenbezeichnung(copyWarenbezeichnung);
                } else {
                    if (warenbezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.warenbezeichnung = null;
                    }
                }
            }
            {
                Boolean mengeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.menge!= null));
                if (mengeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMenge;
                    sourceMenge = this.getMenge();
                    String copyMenge = ((String) strategy.copy(LocatorUtils.property(locator, "menge", sourceMenge), sourceMenge, (this.menge!= null)));
                    copy.setMenge(copyMenge);
                } else {
                    if (mengeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.menge = null;
                    }
                }
            }
            {
                Boolean verpackungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verpackungsart!= null));
                if (verpackungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVerpackungsart;
                    sourceVerpackungsart = this.getVerpackungsart();
                    String copyVerpackungsart = ((String) strategy.copy(LocatorUtils.property(locator, "verpackungsart", sourceVerpackungsart), sourceVerpackungsart, (this.verpackungsart!= null)));
                    copy.setVerpackungsart(copyVerpackungsart);
                } else {
                    if (verpackungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verpackungsart = null;
                    }
                }
            }
            {
                Boolean signaturShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.signatur!= null));
                if (signaturShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSignatur;
                    sourceSignatur = this.getSignatur();
                    String copySignatur = ((String) strategy.copy(LocatorUtils.property(locator, "signatur", sourceSignatur), sourceSignatur, (this.signatur!= null)));
                    copy.setSignatur(copySignatur);
                } else {
                    if (signaturShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.signatur = null;
                    }
                }
            }
            {
                Boolean zeitraumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeitraum!= null));
                if (zeitraumShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceZeitraum;
                    sourceZeitraum = this.getZeitraum();
                    CTZeitraum copyZeitraum = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "zeitraum", sourceZeitraum), sourceZeitraum, (this.zeitraum!= null)));
                    copy.setZeitraum(copyZeitraum);
                } else {
                    if (zeitraumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeitraum = null;
                    }
                }
            }
            {
                Boolean gewichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewicht!= null));
                if (gewichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGewicht;
                    sourceGewicht = this.getGewicht();
                    BigDecimal copyGewicht = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gewicht", sourceGewicht), sourceGewicht, (this.gewicht!= null)));
                    copy.setGewicht(copyGewicht);
                } else {
                    if (gewichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewicht = null;
                    }
                }
            }
            {
                Boolean incotermsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incoterms!= null));
                if (incotermsShouldBeCopiedAndSet == Boolean.TRUE) {
                    STIncoterms sourceIncoterms;
                    sourceIncoterms = this.getIncoterms();
                    STIncoterms copyIncoterms = ((STIncoterms) strategy.copy(LocatorUtils.property(locator, "incoterms", sourceIncoterms), sourceIncoterms, (this.incoterms!= null)));
                    copy.setIncoterms(copyIncoterms);
                } else {
                    if (incotermsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incoterms = null;
                    }
                }
            }
            {
                Boolean haftungsgrundlageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haftungsgrundlage!= null));
                if (haftungsgrundlageShouldBeCopiedAndSet == Boolean.TRUE) {
                    STHaftungsgrundlage sourceHaftungsgrundlage;
                    sourceHaftungsgrundlage = this.getHaftungsgrundlage();
                    STHaftungsgrundlage copyHaftungsgrundlage = ((STHaftungsgrundlage) strategy.copy(LocatorUtils.property(locator, "haftungsgrundlage", sourceHaftungsgrundlage), sourceHaftungsgrundlage, (this.haftungsgrundlage!= null)));
                    copy.setHaftungsgrundlage(copyHaftungsgrundlage);
                } else {
                    if (haftungsgrundlageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haftungsgrundlage = null;
                    }
                }
            }
            {
                Boolean empfaengerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.empfaenger!= null));
                if (empfaengerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTEmpfaenger sourceEmpfaenger;
                    sourceEmpfaenger = this.getEmpfaenger();
                    CTEmpfaenger copyEmpfaenger = ((CTEmpfaenger) strategy.copy(LocatorUtils.property(locator, "empfaenger", sourceEmpfaenger), sourceEmpfaenger, (this.empfaenger!= null)));
                    copy.setEmpfaenger(copyEmpfaenger);
                } else {
                    if (empfaengerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.empfaenger = null;
                    }
                }
            }
            {
                Boolean bestimmungsortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestimmungsort!= null));
                if (bestimmungsortShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBestimmungsort sourceBestimmungsort;
                    sourceBestimmungsort = this.getBestimmungsort();
                    CTBestimmungsort copyBestimmungsort = ((CTBestimmungsort) strategy.copy(LocatorUtils.property(locator, "bestimmungsort", sourceBestimmungsort), sourceBestimmungsort, (this.bestimmungsort!= null)));
                    copy.setBestimmungsort(copyBestimmungsort);
                } else {
                    if (bestimmungsortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestimmungsort = null;
                    }
                }
            }
            {
                Boolean absenderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.absender!= null));
                if (absenderShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAbsender sourceAbsender;
                    sourceAbsender = this.getAbsender();
                    CTAbsender copyAbsender = ((CTAbsender) strategy.copy(LocatorUtils.property(locator, "absender", sourceAbsender), sourceAbsender, (this.absender!= null)));
                    copy.setAbsender(copyAbsender);
                } else {
                    if (absenderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.absender = null;
                    }
                }
            }
            {
                Boolean abgangsortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abgangsort!= null));
                if (abgangsortShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAbgangsort sourceAbgangsort;
                    sourceAbgangsort = this.getAbgangsort();
                    CTAbgangsort copyAbgangsort = ((CTAbgangsort) strategy.copy(LocatorUtils.property(locator, "abgangsort", sourceAbgangsort), sourceAbgangsort, (this.abgangsort!= null)));
                    copy.setAbgangsort(copyAbgangsort);
                } else {
                    if (abgangsortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abgangsort = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTTransport();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withTransportmittelSchluessel(STTransportmittelSchluessel... values) {
        if (values!= null) {
            for (STTransportmittelSchluessel value: values) {
                getTransportmittelSchluessel().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withTransportmittelSchluessel(Collection<STTransportmittelSchluessel> values) {
        if (values!= null) {
            getTransportmittelSchluessel().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withTransportmittel(String value) {
        setTransportmittel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withRoute(String value) {
        setRoute(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withBesonderheiten(String value) {
        setBesonderheiten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withZertifikatsnummer(String value) {
        setZertifikatsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withWarenbezeichnung(String value) {
        setWarenbezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withMenge(String value) {
        setMenge(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withVerpackungsart(String value) {
        setVerpackungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withSignatur(String value) {
        setSignatur(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withZeitraum(CTZeitraum value) {
        setZeitraum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withGewicht(BigDecimal value) {
        setGewicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withIncoterms(STIncoterms value) {
        setIncoterms(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withHaftungsgrundlage(STHaftungsgrundlage value) {
        setHaftungsgrundlage(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withEmpfaenger(CTEmpfaenger value) {
        setEmpfaenger(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withBestimmungsort(CTBestimmungsort value) {
        setBestimmungsort(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withAbsender(CTAbsender value) {
        setAbsender(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withAbgangsort(CTAbgangsort value) {
        setAbgangsort(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTransport withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
