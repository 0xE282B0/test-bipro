
package net.bipro.namespace.partner;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEBerufsBranche;
import net.bipro.namespace.datentypen.STEBerufsschluesselverzeichnis;
import net.bipro.namespace.datentypen.STEStellungImBeruf;
import net.bipro.namespace.datentypen.STPraxisform;
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
 * Angaben zur Berufstaetigkeit.
 * 
 * Die Attribute Beteiligung (ST_Beteiligung) und Bundesland (ST_Bundesland) fehlen, da die entsprechenden einfachen Datentypen nicht definiert sind.
 * 
 * <p>Java class for CT_Berufstaetigkeit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Berufstaetigkeit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Beruf" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="StellungImBeruf" type="{http://www.bipro.net/namespace/datentypen}STE_StellungImBeruf" minOccurs="0"/&gt;
 *         &lt;element name="Mitarbeiteranzahl" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Besoldungsgruppe" type="{http://www.bipro.net/namespace/datentypen}ST_Text006" minOccurs="0"/&gt;
 *         &lt;element name="SelbststaendigSeit" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="ArbeitsvertragBefristetBis" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Betriebseintritt" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="KoerperlichTaetig" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Branche" type="{http://www.bipro.net/namespace/datentypen}STE_BerufsBranche" minOccurs="0"/&gt;
 *         &lt;element name="OeffentlicherDienst" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="AnteilAussendienst" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Aufsichtsfuehrend" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Mitarbeitend" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Berufsschluessel" type="{http://www.bipro.net/namespace/datentypen}ST_Berufsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="NichtKoerperlichTaetig" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Gewerbesteuerpflichtig" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Praxisform" type="{http://www.bipro.net/namespace/datentypen}ST_Praxisform" minOccurs="0"/&gt;
 *         &lt;element name="Einkommen" type="{http://www.bipro.net/namespace/partner}CT_Einkommensart" minOccurs="0"/&gt;
 *         &lt;element name="StellungImBerufSeit" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Berufsschluesselverzeichnis" type="{http://www.bipro.net/namespace/datentypen}STE_Berufsschluesselverzeichnis" minOccurs="0"/&gt;
 *         &lt;element name="Arbeitgeber" type="{http://www.bipro.net/namespace/partner}CT_Arbeitgeber" minOccurs="0"/&gt;
 *         &lt;element name="Teilzeit" type="{http://www.bipro.net/namespace/partner}CT_Teilzeit" minOccurs="0"/&gt;
 *         &lt;element name="Grenzgaenger" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Berufstaetigkeit", propOrder = {
    "beruf",
    "stellungImBeruf",
    "mitarbeiteranzahl",
    "besoldungsgruppe",
    "selbststaendigSeit",
    "arbeitsvertragBefristetBis",
    "betriebseintritt",
    "koerperlichTaetig",
    "branche",
    "oeffentlicherDienst",
    "anteilAussendienst",
    "aufsichtsfuehrend",
    "mitarbeitend",
    "berufsschluessel",
    "nichtKoerperlichTaetig",
    "gewerbesteuerpflichtig",
    "praxisform",
    "einkommen",
    "stellungImBerufSeit",
    "berufsschluesselverzeichnis",
    "arbeitgeber",
    "teilzeit",
    "grenzgaenger"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTBerufstaetigkeit
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Beruf")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String beruf;
    @XmlElement(name = "StellungImBeruf")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEStellungImBeruf stellungImBeruf;
    @XmlElement(name = "Mitarbeiteranzahl")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer mitarbeiteranzahl;
    @XmlElement(name = "Besoldungsgruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String besoldungsgruppe;
    @XmlElement(name = "SelbststaendigSeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String selbststaendigSeit;
    @XmlElement(name = "ArbeitsvertragBefristetBis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String arbeitsvertragBefristetBis;
    @XmlElement(name = "Betriebseintritt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String betriebseintritt;
    @XmlElement(name = "KoerperlichTaetig")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal koerperlichTaetig;
    @XmlElement(name = "Branche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEBerufsBranche branche;
    @XmlElement(name = "OeffentlicherDienst")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean oeffentlicherDienst;
    @XmlElement(name = "AnteilAussendienst")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteilAussendienst;
    @XmlElement(name = "Aufsichtsfuehrend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean aufsichtsfuehrend;
    @XmlElement(name = "Mitarbeitend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean mitarbeitend;
    @XmlElement(name = "Berufsschluessel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String berufsschluessel;
    @XmlElement(name = "NichtKoerperlichTaetig")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal nichtKoerperlichTaetig;
    @XmlElement(name = "Gewerbesteuerpflichtig")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean gewerbesteuerpflichtig;
    @XmlElement(name = "Praxisform")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STPraxisform praxisform;
    @XmlElement(name = "Einkommen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTEinkommensart einkommen;
    @XmlElement(name = "StellungImBerufSeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String stellungImBerufSeit;
    @XmlElement(name = "Berufsschluesselverzeichnis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEBerufsschluesselverzeichnis berufsschluesselverzeichnis;
    @XmlElement(name = "Arbeitgeber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTArbeitgeber arbeitgeber;
    @XmlElement(name = "Teilzeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTTeilzeit teilzeit;
    @XmlElement(name = "Grenzgaenger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean grenzgaenger;

    /**
     * Gets the value of the beruf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBeruf() {
        return beruf;
    }

    /**
     * Sets the value of the beruf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeruf(String value) {
        this.beruf = value;
    }

    /**
     * Gets the value of the stellungImBeruf property.
     * 
     * @return
     *     possible object is
     *     {@link STEStellungImBeruf }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEStellungImBeruf getStellungImBeruf() {
        return stellungImBeruf;
    }

    /**
     * Sets the value of the stellungImBeruf property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEStellungImBeruf }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStellungImBeruf(STEStellungImBeruf value) {
        this.stellungImBeruf = value;
    }

    /**
     * Gets the value of the mitarbeiteranzahl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getMitarbeiteranzahl() {
        return mitarbeiteranzahl;
    }

    /**
     * Sets the value of the mitarbeiteranzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMitarbeiteranzahl(Integer value) {
        this.mitarbeiteranzahl = value;
    }

    /**
     * Gets the value of the besoldungsgruppe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBesoldungsgruppe() {
        return besoldungsgruppe;
    }

    /**
     * Sets the value of the besoldungsgruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBesoldungsgruppe(String value) {
        this.besoldungsgruppe = value;
    }

    /**
     * Gets the value of the selbststaendigSeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getSelbststaendigSeit() {
        return selbststaendigSeit;
    }

    /**
     * Sets the value of the selbststaendigSeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSelbststaendigSeit(String value) {
        this.selbststaendigSeit = value;
    }

    /**
     * Gets the value of the arbeitsvertragBefristetBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getArbeitsvertragBefristetBis() {
        return arbeitsvertragBefristetBis;
    }

    /**
     * Sets the value of the arbeitsvertragBefristetBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArbeitsvertragBefristetBis(String value) {
        this.arbeitsvertragBefristetBis = value;
    }

    /**
     * Gets the value of the betriebseintritt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBetriebseintritt() {
        return betriebseintritt;
    }

    /**
     * Sets the value of the betriebseintritt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBetriebseintritt(String value) {
        this.betriebseintritt = value;
    }

    /**
     * Gets the value of the koerperlichTaetig property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getKoerperlichTaetig() {
        return koerperlichTaetig;
    }

    /**
     * Sets the value of the koerperlichTaetig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKoerperlichTaetig(BigDecimal value) {
        this.koerperlichTaetig = value;
    }

    /**
     * Gets the value of the branche property.
     * 
     * @return
     *     possible object is
     *     {@link STEBerufsBranche }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEBerufsBranche getBranche() {
        return branche;
    }

    /**
     * Sets the value of the branche property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEBerufsBranche }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBranche(STEBerufsBranche value) {
        this.branche = value;
    }

    /**
     * Gets the value of the oeffentlicherDienst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isOeffentlicherDienst() {
        return oeffentlicherDienst;
    }

    /**
     * Sets the value of the oeffentlicherDienst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setOeffentlicherDienst(Boolean value) {
        this.oeffentlicherDienst = value;
    }

    /**
     * Gets the value of the anteilAussendienst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnteilAussendienst() {
        return anteilAussendienst;
    }

    /**
     * Sets the value of the anteilAussendienst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnteilAussendienst(BigDecimal value) {
        this.anteilAussendienst = value;
    }

    /**
     * Gets the value of the aufsichtsfuehrend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isAufsichtsfuehrend() {
        return aufsichtsfuehrend;
    }

    /**
     * Sets the value of the aufsichtsfuehrend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAufsichtsfuehrend(Boolean value) {
        this.aufsichtsfuehrend = value;
    }

    /**
     * Gets the value of the mitarbeitend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isMitarbeitend() {
        return mitarbeitend;
    }

    /**
     * Sets the value of the mitarbeitend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMitarbeitend(Boolean value) {
        this.mitarbeitend = value;
    }

    /**
     * Gets the value of the berufsschluessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBerufsschluessel() {
        return berufsschluessel;
    }

    /**
     * Sets the value of the berufsschluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBerufsschluessel(String value) {
        this.berufsschluessel = value;
    }

    /**
     * Gets the value of the nichtKoerperlichTaetig property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getNichtKoerperlichTaetig() {
        return nichtKoerperlichTaetig;
    }

    /**
     * Sets the value of the nichtKoerperlichTaetig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNichtKoerperlichTaetig(BigDecimal value) {
        this.nichtKoerperlichTaetig = value;
    }

    /**
     * Gets the value of the gewerbesteuerpflichtig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isGewerbesteuerpflichtig() {
        return gewerbesteuerpflichtig;
    }

    /**
     * Sets the value of the gewerbesteuerpflichtig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGewerbesteuerpflichtig(Boolean value) {
        this.gewerbesteuerpflichtig = value;
    }

    /**
     * Gets the value of the praxisform property.
     * 
     * @return
     *     possible object is
     *     {@link STPraxisform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STPraxisform getPraxisform() {
        return praxisform;
    }

    /**
     * Sets the value of the praxisform property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPraxisform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setPraxisform(STPraxisform value) {
        this.praxisform = value;
    }

    /**
     * Gets the value of the einkommen property.
     * 
     * @return
     *     possible object is
     *     {@link CTEinkommensart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart getEinkommen() {
        return einkommen;
    }

    /**
     * Sets the value of the einkommen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEinkommensart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setEinkommen(CTEinkommensart value) {
        this.einkommen = value;
    }

    /**
     * Gets the value of the stellungImBerufSeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getStellungImBerufSeit() {
        return stellungImBerufSeit;
    }

    /**
     * Sets the value of the stellungImBerufSeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStellungImBerufSeit(String value) {
        this.stellungImBerufSeit = value;
    }

    /**
     * Gets the value of the berufsschluesselverzeichnis property.
     * 
     * @return
     *     possible object is
     *     {@link STEBerufsschluesselverzeichnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEBerufsschluesselverzeichnis getBerufsschluesselverzeichnis() {
        return berufsschluesselverzeichnis;
    }

    /**
     * Sets the value of the berufsschluesselverzeichnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEBerufsschluesselverzeichnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBerufsschluesselverzeichnis(STEBerufsschluesselverzeichnis value) {
        this.berufsschluesselverzeichnis = value;
    }

    /**
     * Gets the value of the arbeitgeber property.
     * 
     * @return
     *     possible object is
     *     {@link CTArbeitgeber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTArbeitgeber getArbeitgeber() {
        return arbeitgeber;
    }

    /**
     * Sets the value of the arbeitgeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTArbeitgeber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArbeitgeber(CTArbeitgeber value) {
        this.arbeitgeber = value;
    }

    /**
     * Gets the value of the teilzeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTTeilzeit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilzeit getTeilzeit() {
        return teilzeit;
    }

    /**
     * Sets the value of the teilzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTeilzeit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setTeilzeit(CTTeilzeit value) {
        this.teilzeit = value;
    }

    /**
     * Gets the value of the grenzgaenger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isGrenzgaenger() {
        return grenzgaenger;
    }

    /**
     * Sets the value of the grenzgaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGrenzgaenger(Boolean value) {
        this.grenzgaenger = value;
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
        final CTBerufstaetigkeit that = ((CTBerufstaetigkeit) object);
        {
            String lhsBeruf;
            lhsBeruf = this.getBeruf();
            String rhsBeruf;
            rhsBeruf = that.getBeruf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beruf", lhsBeruf), LocatorUtils.property(thatLocator, "beruf", rhsBeruf), lhsBeruf, rhsBeruf, (this.beruf!= null), (that.beruf!= null))) {
                return false;
            }
        }
        {
            STEStellungImBeruf lhsStellungImBeruf;
            lhsStellungImBeruf = this.getStellungImBeruf();
            STEStellungImBeruf rhsStellungImBeruf;
            rhsStellungImBeruf = that.getStellungImBeruf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellungImBeruf", lhsStellungImBeruf), LocatorUtils.property(thatLocator, "stellungImBeruf", rhsStellungImBeruf), lhsStellungImBeruf, rhsStellungImBeruf, (this.stellungImBeruf!= null), (that.stellungImBeruf!= null))) {
                return false;
            }
        }
        {
            Integer lhsMitarbeiteranzahl;
            lhsMitarbeiteranzahl = this.getMitarbeiteranzahl();
            Integer rhsMitarbeiteranzahl;
            rhsMitarbeiteranzahl = that.getMitarbeiteranzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitarbeiteranzahl", lhsMitarbeiteranzahl), LocatorUtils.property(thatLocator, "mitarbeiteranzahl", rhsMitarbeiteranzahl), lhsMitarbeiteranzahl, rhsMitarbeiteranzahl, (this.mitarbeiteranzahl!= null), (that.mitarbeiteranzahl!= null))) {
                return false;
            }
        }
        {
            String lhsBesoldungsgruppe;
            lhsBesoldungsgruppe = this.getBesoldungsgruppe();
            String rhsBesoldungsgruppe;
            rhsBesoldungsgruppe = that.getBesoldungsgruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besoldungsgruppe", lhsBesoldungsgruppe), LocatorUtils.property(thatLocator, "besoldungsgruppe", rhsBesoldungsgruppe), lhsBesoldungsgruppe, rhsBesoldungsgruppe, (this.besoldungsgruppe!= null), (that.besoldungsgruppe!= null))) {
                return false;
            }
        }
        {
            String lhsSelbststaendigSeit;
            lhsSelbststaendigSeit = this.getSelbststaendigSeit();
            String rhsSelbststaendigSeit;
            rhsSelbststaendigSeit = that.getSelbststaendigSeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selbststaendigSeit", lhsSelbststaendigSeit), LocatorUtils.property(thatLocator, "selbststaendigSeit", rhsSelbststaendigSeit), lhsSelbststaendigSeit, rhsSelbststaendigSeit, (this.selbststaendigSeit!= null), (that.selbststaendigSeit!= null))) {
                return false;
            }
        }
        {
            String lhsArbeitsvertragBefristetBis;
            lhsArbeitsvertragBefristetBis = this.getArbeitsvertragBefristetBis();
            String rhsArbeitsvertragBefristetBis;
            rhsArbeitsvertragBefristetBis = that.getArbeitsvertragBefristetBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arbeitsvertragBefristetBis", lhsArbeitsvertragBefristetBis), LocatorUtils.property(thatLocator, "arbeitsvertragBefristetBis", rhsArbeitsvertragBefristetBis), lhsArbeitsvertragBefristetBis, rhsArbeitsvertragBefristetBis, (this.arbeitsvertragBefristetBis!= null), (that.arbeitsvertragBefristetBis!= null))) {
                return false;
            }
        }
        {
            String lhsBetriebseintritt;
            lhsBetriebseintritt = this.getBetriebseintritt();
            String rhsBetriebseintritt;
            rhsBetriebseintritt = that.getBetriebseintritt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebseintritt", lhsBetriebseintritt), LocatorUtils.property(thatLocator, "betriebseintritt", rhsBetriebseintritt), lhsBetriebseintritt, rhsBetriebseintritt, (this.betriebseintritt!= null), (that.betriebseintritt!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKoerperlichTaetig;
            lhsKoerperlichTaetig = this.getKoerperlichTaetig();
            BigDecimal rhsKoerperlichTaetig;
            rhsKoerperlichTaetig = that.getKoerperlichTaetig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "koerperlichTaetig", lhsKoerperlichTaetig), LocatorUtils.property(thatLocator, "koerperlichTaetig", rhsKoerperlichTaetig), lhsKoerperlichTaetig, rhsKoerperlichTaetig, (this.koerperlichTaetig!= null), (that.koerperlichTaetig!= null))) {
                return false;
            }
        }
        {
            STEBerufsBranche lhsBranche;
            lhsBranche = this.getBranche();
            STEBerufsBranche rhsBranche;
            rhsBranche = that.getBranche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branche", lhsBranche), LocatorUtils.property(thatLocator, "branche", rhsBranche), lhsBranche, rhsBranche, (this.branche!= null), (that.branche!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOeffentlicherDienst;
            lhsOeffentlicherDienst = this.isOeffentlicherDienst();
            Boolean rhsOeffentlicherDienst;
            rhsOeffentlicherDienst = that.isOeffentlicherDienst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oeffentlicherDienst", lhsOeffentlicherDienst), LocatorUtils.property(thatLocator, "oeffentlicherDienst", rhsOeffentlicherDienst), lhsOeffentlicherDienst, rhsOeffentlicherDienst, (this.oeffentlicherDienst!= null), (that.oeffentlicherDienst!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnteilAussendienst;
            lhsAnteilAussendienst = this.getAnteilAussendienst();
            BigDecimal rhsAnteilAussendienst;
            rhsAnteilAussendienst = that.getAnteilAussendienst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteilAussendienst", lhsAnteilAussendienst), LocatorUtils.property(thatLocator, "anteilAussendienst", rhsAnteilAussendienst), lhsAnteilAussendienst, rhsAnteilAussendienst, (this.anteilAussendienst!= null), (that.anteilAussendienst!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAufsichtsfuehrend;
            lhsAufsichtsfuehrend = this.isAufsichtsfuehrend();
            Boolean rhsAufsichtsfuehrend;
            rhsAufsichtsfuehrend = that.isAufsichtsfuehrend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufsichtsfuehrend", lhsAufsichtsfuehrend), LocatorUtils.property(thatLocator, "aufsichtsfuehrend", rhsAufsichtsfuehrend), lhsAufsichtsfuehrend, rhsAufsichtsfuehrend, (this.aufsichtsfuehrend!= null), (that.aufsichtsfuehrend!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMitarbeitend;
            lhsMitarbeitend = this.isMitarbeitend();
            Boolean rhsMitarbeitend;
            rhsMitarbeitend = that.isMitarbeitend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitarbeitend", lhsMitarbeitend), LocatorUtils.property(thatLocator, "mitarbeitend", rhsMitarbeitend), lhsMitarbeitend, rhsMitarbeitend, (this.mitarbeitend!= null), (that.mitarbeitend!= null))) {
                return false;
            }
        }
        {
            String lhsBerufsschluessel;
            lhsBerufsschluessel = this.getBerufsschluessel();
            String rhsBerufsschluessel;
            rhsBerufsschluessel = that.getBerufsschluessel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berufsschluessel", lhsBerufsschluessel), LocatorUtils.property(thatLocator, "berufsschluessel", rhsBerufsschluessel), lhsBerufsschluessel, rhsBerufsschluessel, (this.berufsschluessel!= null), (that.berufsschluessel!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNichtKoerperlichTaetig;
            lhsNichtKoerperlichTaetig = this.getNichtKoerperlichTaetig();
            BigDecimal rhsNichtKoerperlichTaetig;
            rhsNichtKoerperlichTaetig = that.getNichtKoerperlichTaetig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nichtKoerperlichTaetig", lhsNichtKoerperlichTaetig), LocatorUtils.property(thatLocator, "nichtKoerperlichTaetig", rhsNichtKoerperlichTaetig), lhsNichtKoerperlichTaetig, rhsNichtKoerperlichTaetig, (this.nichtKoerperlichTaetig!= null), (that.nichtKoerperlichTaetig!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGewerbesteuerpflichtig;
            lhsGewerbesteuerpflichtig = this.isGewerbesteuerpflichtig();
            Boolean rhsGewerbesteuerpflichtig;
            rhsGewerbesteuerpflichtig = that.isGewerbesteuerpflichtig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbesteuerpflichtig", lhsGewerbesteuerpflichtig), LocatorUtils.property(thatLocator, "gewerbesteuerpflichtig", rhsGewerbesteuerpflichtig), lhsGewerbesteuerpflichtig, rhsGewerbesteuerpflichtig, (this.gewerbesteuerpflichtig!= null), (that.gewerbesteuerpflichtig!= null))) {
                return false;
            }
        }
        {
            STPraxisform lhsPraxisform;
            lhsPraxisform = this.getPraxisform();
            STPraxisform rhsPraxisform;
            rhsPraxisform = that.getPraxisform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "praxisform", lhsPraxisform), LocatorUtils.property(thatLocator, "praxisform", rhsPraxisform), lhsPraxisform, rhsPraxisform, (this.praxisform!= null), (that.praxisform!= null))) {
                return false;
            }
        }
        {
            CTEinkommensart lhsEinkommen;
            lhsEinkommen = this.getEinkommen();
            CTEinkommensart rhsEinkommen;
            rhsEinkommen = that.getEinkommen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkommen", lhsEinkommen), LocatorUtils.property(thatLocator, "einkommen", rhsEinkommen), lhsEinkommen, rhsEinkommen, (this.einkommen!= null), (that.einkommen!= null))) {
                return false;
            }
        }
        {
            String lhsStellungImBerufSeit;
            lhsStellungImBerufSeit = this.getStellungImBerufSeit();
            String rhsStellungImBerufSeit;
            rhsStellungImBerufSeit = that.getStellungImBerufSeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellungImBerufSeit", lhsStellungImBerufSeit), LocatorUtils.property(thatLocator, "stellungImBerufSeit", rhsStellungImBerufSeit), lhsStellungImBerufSeit, rhsStellungImBerufSeit, (this.stellungImBerufSeit!= null), (that.stellungImBerufSeit!= null))) {
                return false;
            }
        }
        {
            STEBerufsschluesselverzeichnis lhsBerufsschluesselverzeichnis;
            lhsBerufsschluesselverzeichnis = this.getBerufsschluesselverzeichnis();
            STEBerufsschluesselverzeichnis rhsBerufsschluesselverzeichnis;
            rhsBerufsschluesselverzeichnis = that.getBerufsschluesselverzeichnis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berufsschluesselverzeichnis", lhsBerufsschluesselverzeichnis), LocatorUtils.property(thatLocator, "berufsschluesselverzeichnis", rhsBerufsschluesselverzeichnis), lhsBerufsschluesselverzeichnis, rhsBerufsschluesselverzeichnis, (this.berufsschluesselverzeichnis!= null), (that.berufsschluesselverzeichnis!= null))) {
                return false;
            }
        }
        {
            CTArbeitgeber lhsArbeitgeber;
            lhsArbeitgeber = this.getArbeitgeber();
            CTArbeitgeber rhsArbeitgeber;
            rhsArbeitgeber = that.getArbeitgeber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arbeitgeber", lhsArbeitgeber), LocatorUtils.property(thatLocator, "arbeitgeber", rhsArbeitgeber), lhsArbeitgeber, rhsArbeitgeber, (this.arbeitgeber!= null), (that.arbeitgeber!= null))) {
                return false;
            }
        }
        {
            CTTeilzeit lhsTeilzeit;
            lhsTeilzeit = this.getTeilzeit();
            CTTeilzeit rhsTeilzeit;
            rhsTeilzeit = that.getTeilzeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilzeit", lhsTeilzeit), LocatorUtils.property(thatLocator, "teilzeit", rhsTeilzeit), lhsTeilzeit, rhsTeilzeit, (this.teilzeit!= null), (that.teilzeit!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGrenzgaenger;
            lhsGrenzgaenger = this.isGrenzgaenger();
            Boolean rhsGrenzgaenger;
            rhsGrenzgaenger = that.isGrenzgaenger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grenzgaenger", lhsGrenzgaenger), LocatorUtils.property(thatLocator, "grenzgaenger", rhsGrenzgaenger), lhsGrenzgaenger, rhsGrenzgaenger, (this.grenzgaenger!= null), (that.grenzgaenger!= null))) {
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
            String theBeruf;
            theBeruf = this.getBeruf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beruf", theBeruf), currentHashCode, theBeruf, (this.beruf!= null));
        }
        {
            STEStellungImBeruf theStellungImBeruf;
            theStellungImBeruf = this.getStellungImBeruf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stellungImBeruf", theStellungImBeruf), currentHashCode, theStellungImBeruf, (this.stellungImBeruf!= null));
        }
        {
            Integer theMitarbeiteranzahl;
            theMitarbeiteranzahl = this.getMitarbeiteranzahl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitarbeiteranzahl", theMitarbeiteranzahl), currentHashCode, theMitarbeiteranzahl, (this.mitarbeiteranzahl!= null));
        }
        {
            String theBesoldungsgruppe;
            theBesoldungsgruppe = this.getBesoldungsgruppe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "besoldungsgruppe", theBesoldungsgruppe), currentHashCode, theBesoldungsgruppe, (this.besoldungsgruppe!= null));
        }
        {
            String theSelbststaendigSeit;
            theSelbststaendigSeit = this.getSelbststaendigSeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selbststaendigSeit", theSelbststaendigSeit), currentHashCode, theSelbststaendigSeit, (this.selbststaendigSeit!= null));
        }
        {
            String theArbeitsvertragBefristetBis;
            theArbeitsvertragBefristetBis = this.getArbeitsvertragBefristetBis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arbeitsvertragBefristetBis", theArbeitsvertragBefristetBis), currentHashCode, theArbeitsvertragBefristetBis, (this.arbeitsvertragBefristetBis!= null));
        }
        {
            String theBetriebseintritt;
            theBetriebseintritt = this.getBetriebseintritt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betriebseintritt", theBetriebseintritt), currentHashCode, theBetriebseintritt, (this.betriebseintritt!= null));
        }
        {
            BigDecimal theKoerperlichTaetig;
            theKoerperlichTaetig = this.getKoerperlichTaetig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "koerperlichTaetig", theKoerperlichTaetig), currentHashCode, theKoerperlichTaetig, (this.koerperlichTaetig!= null));
        }
        {
            STEBerufsBranche theBranche;
            theBranche = this.getBranche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branche", theBranche), currentHashCode, theBranche, (this.branche!= null));
        }
        {
            Boolean theOeffentlicherDienst;
            theOeffentlicherDienst = this.isOeffentlicherDienst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oeffentlicherDienst", theOeffentlicherDienst), currentHashCode, theOeffentlicherDienst, (this.oeffentlicherDienst!= null));
        }
        {
            BigDecimal theAnteilAussendienst;
            theAnteilAussendienst = this.getAnteilAussendienst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteilAussendienst", theAnteilAussendienst), currentHashCode, theAnteilAussendienst, (this.anteilAussendienst!= null));
        }
        {
            Boolean theAufsichtsfuehrend;
            theAufsichtsfuehrend = this.isAufsichtsfuehrend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aufsichtsfuehrend", theAufsichtsfuehrend), currentHashCode, theAufsichtsfuehrend, (this.aufsichtsfuehrend!= null));
        }
        {
            Boolean theMitarbeitend;
            theMitarbeitend = this.isMitarbeitend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitarbeitend", theMitarbeitend), currentHashCode, theMitarbeitend, (this.mitarbeitend!= null));
        }
        {
            String theBerufsschluessel;
            theBerufsschluessel = this.getBerufsschluessel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berufsschluessel", theBerufsschluessel), currentHashCode, theBerufsschluessel, (this.berufsschluessel!= null));
        }
        {
            BigDecimal theNichtKoerperlichTaetig;
            theNichtKoerperlichTaetig = this.getNichtKoerperlichTaetig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nichtKoerperlichTaetig", theNichtKoerperlichTaetig), currentHashCode, theNichtKoerperlichTaetig, (this.nichtKoerperlichTaetig!= null));
        }
        {
            Boolean theGewerbesteuerpflichtig;
            theGewerbesteuerpflichtig = this.isGewerbesteuerpflichtig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewerbesteuerpflichtig", theGewerbesteuerpflichtig), currentHashCode, theGewerbesteuerpflichtig, (this.gewerbesteuerpflichtig!= null));
        }
        {
            STPraxisform thePraxisform;
            thePraxisform = this.getPraxisform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "praxisform", thePraxisform), currentHashCode, thePraxisform, (this.praxisform!= null));
        }
        {
            CTEinkommensart theEinkommen;
            theEinkommen = this.getEinkommen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einkommen", theEinkommen), currentHashCode, theEinkommen, (this.einkommen!= null));
        }
        {
            String theStellungImBerufSeit;
            theStellungImBerufSeit = this.getStellungImBerufSeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stellungImBerufSeit", theStellungImBerufSeit), currentHashCode, theStellungImBerufSeit, (this.stellungImBerufSeit!= null));
        }
        {
            STEBerufsschluesselverzeichnis theBerufsschluesselverzeichnis;
            theBerufsschluesselverzeichnis = this.getBerufsschluesselverzeichnis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berufsschluesselverzeichnis", theBerufsschluesselverzeichnis), currentHashCode, theBerufsschluesselverzeichnis, (this.berufsschluesselverzeichnis!= null));
        }
        {
            CTArbeitgeber theArbeitgeber;
            theArbeitgeber = this.getArbeitgeber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arbeitgeber", theArbeitgeber), currentHashCode, theArbeitgeber, (this.arbeitgeber!= null));
        }
        {
            CTTeilzeit theTeilzeit;
            theTeilzeit = this.getTeilzeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "teilzeit", theTeilzeit), currentHashCode, theTeilzeit, (this.teilzeit!= null));
        }
        {
            Boolean theGrenzgaenger;
            theGrenzgaenger = this.isGrenzgaenger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grenzgaenger", theGrenzgaenger), currentHashCode, theGrenzgaenger, (this.grenzgaenger!= null));
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
        if (draftCopy instanceof CTBerufstaetigkeit) {
            final CTBerufstaetigkeit copy = ((CTBerufstaetigkeit) draftCopy);
            {
                Boolean berufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beruf!= null));
                if (berufShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBeruf;
                    sourceBeruf = this.getBeruf();
                    String copyBeruf = ((String) strategy.copy(LocatorUtils.property(locator, "beruf", sourceBeruf), sourceBeruf, (this.beruf!= null)));
                    copy.setBeruf(copyBeruf);
                } else {
                    if (berufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beruf = null;
                    }
                }
            }
            {
                Boolean stellungImBerufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellungImBeruf!= null));
                if (stellungImBerufShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEStellungImBeruf sourceStellungImBeruf;
                    sourceStellungImBeruf = this.getStellungImBeruf();
                    STEStellungImBeruf copyStellungImBeruf = ((STEStellungImBeruf) strategy.copy(LocatorUtils.property(locator, "stellungImBeruf", sourceStellungImBeruf), sourceStellungImBeruf, (this.stellungImBeruf!= null)));
                    copy.setStellungImBeruf(copyStellungImBeruf);
                } else {
                    if (stellungImBerufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellungImBeruf = null;
                    }
                }
            }
            {
                Boolean mitarbeiteranzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitarbeiteranzahl!= null));
                if (mitarbeiteranzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMitarbeiteranzahl;
                    sourceMitarbeiteranzahl = this.getMitarbeiteranzahl();
                    Integer copyMitarbeiteranzahl = ((Integer) strategy.copy(LocatorUtils.property(locator, "mitarbeiteranzahl", sourceMitarbeiteranzahl), sourceMitarbeiteranzahl, (this.mitarbeiteranzahl!= null)));
                    copy.setMitarbeiteranzahl(copyMitarbeiteranzahl);
                } else {
                    if (mitarbeiteranzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitarbeiteranzahl = null;
                    }
                }
            }
            {
                Boolean besoldungsgruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.besoldungsgruppe!= null));
                if (besoldungsgruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBesoldungsgruppe;
                    sourceBesoldungsgruppe = this.getBesoldungsgruppe();
                    String copyBesoldungsgruppe = ((String) strategy.copy(LocatorUtils.property(locator, "besoldungsgruppe", sourceBesoldungsgruppe), sourceBesoldungsgruppe, (this.besoldungsgruppe!= null)));
                    copy.setBesoldungsgruppe(copyBesoldungsgruppe);
                } else {
                    if (besoldungsgruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.besoldungsgruppe = null;
                    }
                }
            }
            {
                Boolean selbststaendigSeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.selbststaendigSeit!= null));
                if (selbststaendigSeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSelbststaendigSeit;
                    sourceSelbststaendigSeit = this.getSelbststaendigSeit();
                    String copySelbststaendigSeit = ((String) strategy.copy(LocatorUtils.property(locator, "selbststaendigSeit", sourceSelbststaendigSeit), sourceSelbststaendigSeit, (this.selbststaendigSeit!= null)));
                    copy.setSelbststaendigSeit(copySelbststaendigSeit);
                } else {
                    if (selbststaendigSeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.selbststaendigSeit = null;
                    }
                }
            }
            {
                Boolean arbeitsvertragBefristetBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.arbeitsvertragBefristetBis!= null));
                if (arbeitsvertragBefristetBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceArbeitsvertragBefristetBis;
                    sourceArbeitsvertragBefristetBis = this.getArbeitsvertragBefristetBis();
                    String copyArbeitsvertragBefristetBis = ((String) strategy.copy(LocatorUtils.property(locator, "arbeitsvertragBefristetBis", sourceArbeitsvertragBefristetBis), sourceArbeitsvertragBefristetBis, (this.arbeitsvertragBefristetBis!= null)));
                    copy.setArbeitsvertragBefristetBis(copyArbeitsvertragBefristetBis);
                } else {
                    if (arbeitsvertragBefristetBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.arbeitsvertragBefristetBis = null;
                    }
                }
            }
            {
                Boolean betriebseintrittShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betriebseintritt!= null));
                if (betriebseintrittShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBetriebseintritt;
                    sourceBetriebseintritt = this.getBetriebseintritt();
                    String copyBetriebseintritt = ((String) strategy.copy(LocatorUtils.property(locator, "betriebseintritt", sourceBetriebseintritt), sourceBetriebseintritt, (this.betriebseintritt!= null)));
                    copy.setBetriebseintritt(copyBetriebseintritt);
                } else {
                    if (betriebseintrittShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebseintritt = null;
                    }
                }
            }
            {
                Boolean koerperlichTaetigShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.koerperlichTaetig!= null));
                if (koerperlichTaetigShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKoerperlichTaetig;
                    sourceKoerperlichTaetig = this.getKoerperlichTaetig();
                    BigDecimal copyKoerperlichTaetig = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "koerperlichTaetig", sourceKoerperlichTaetig), sourceKoerperlichTaetig, (this.koerperlichTaetig!= null)));
                    copy.setKoerperlichTaetig(copyKoerperlichTaetig);
                } else {
                    if (koerperlichTaetigShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.koerperlichTaetig = null;
                    }
                }
            }
            {
                Boolean brancheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.branche!= null));
                if (brancheShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEBerufsBranche sourceBranche;
                    sourceBranche = this.getBranche();
                    STEBerufsBranche copyBranche = ((STEBerufsBranche) strategy.copy(LocatorUtils.property(locator, "branche", sourceBranche), sourceBranche, (this.branche!= null)));
                    copy.setBranche(copyBranche);
                } else {
                    if (brancheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.branche = null;
                    }
                }
            }
            {
                Boolean oeffentlicherDienstShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.oeffentlicherDienst!= null));
                if (oeffentlicherDienstShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOeffentlicherDienst;
                    sourceOeffentlicherDienst = this.isOeffentlicherDienst();
                    Boolean copyOeffentlicherDienst = ((Boolean) strategy.copy(LocatorUtils.property(locator, "oeffentlicherDienst", sourceOeffentlicherDienst), sourceOeffentlicherDienst, (this.oeffentlicherDienst!= null)));
                    copy.setOeffentlicherDienst(copyOeffentlicherDienst);
                } else {
                    if (oeffentlicherDienstShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.oeffentlicherDienst = null;
                    }
                }
            }
            {
                Boolean anteilAussendienstShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteilAussendienst!= null));
                if (anteilAussendienstShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnteilAussendienst;
                    sourceAnteilAussendienst = this.getAnteilAussendienst();
                    BigDecimal copyAnteilAussendienst = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anteilAussendienst", sourceAnteilAussendienst), sourceAnteilAussendienst, (this.anteilAussendienst!= null)));
                    copy.setAnteilAussendienst(copyAnteilAussendienst);
                } else {
                    if (anteilAussendienstShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteilAussendienst = null;
                    }
                }
            }
            {
                Boolean aufsichtsfuehrendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufsichtsfuehrend!= null));
                if (aufsichtsfuehrendShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAufsichtsfuehrend;
                    sourceAufsichtsfuehrend = this.isAufsichtsfuehrend();
                    Boolean copyAufsichtsfuehrend = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufsichtsfuehrend", sourceAufsichtsfuehrend), sourceAufsichtsfuehrend, (this.aufsichtsfuehrend!= null)));
                    copy.setAufsichtsfuehrend(copyAufsichtsfuehrend);
                } else {
                    if (aufsichtsfuehrendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aufsichtsfuehrend = null;
                    }
                }
            }
            {
                Boolean mitarbeitendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitarbeitend!= null));
                if (mitarbeitendShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMitarbeitend;
                    sourceMitarbeitend = this.isMitarbeitend();
                    Boolean copyMitarbeitend = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mitarbeitend", sourceMitarbeitend), sourceMitarbeitend, (this.mitarbeitend!= null)));
                    copy.setMitarbeitend(copyMitarbeitend);
                } else {
                    if (mitarbeitendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitarbeitend = null;
                    }
                }
            }
            {
                Boolean berufsschluesselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berufsschluessel!= null));
                if (berufsschluesselShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBerufsschluessel;
                    sourceBerufsschluessel = this.getBerufsschluessel();
                    String copyBerufsschluessel = ((String) strategy.copy(LocatorUtils.property(locator, "berufsschluessel", sourceBerufsschluessel), sourceBerufsschluessel, (this.berufsschluessel!= null)));
                    copy.setBerufsschluessel(copyBerufsschluessel);
                } else {
                    if (berufsschluesselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berufsschluessel = null;
                    }
                }
            }
            {
                Boolean nichtKoerperlichTaetigShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nichtKoerperlichTaetig!= null));
                if (nichtKoerperlichTaetigShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNichtKoerperlichTaetig;
                    sourceNichtKoerperlichTaetig = this.getNichtKoerperlichTaetig();
                    BigDecimal copyNichtKoerperlichTaetig = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nichtKoerperlichTaetig", sourceNichtKoerperlichTaetig), sourceNichtKoerperlichTaetig, (this.nichtKoerperlichTaetig!= null)));
                    copy.setNichtKoerperlichTaetig(copyNichtKoerperlichTaetig);
                } else {
                    if (nichtKoerperlichTaetigShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nichtKoerperlichTaetig = null;
                    }
                }
            }
            {
                Boolean gewerbesteuerpflichtigShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerbesteuerpflichtig!= null));
                if (gewerbesteuerpflichtigShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGewerbesteuerpflichtig;
                    sourceGewerbesteuerpflichtig = this.isGewerbesteuerpflichtig();
                    Boolean copyGewerbesteuerpflichtig = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gewerbesteuerpflichtig", sourceGewerbesteuerpflichtig), sourceGewerbesteuerpflichtig, (this.gewerbesteuerpflichtig!= null)));
                    copy.setGewerbesteuerpflichtig(copyGewerbesteuerpflichtig);
                } else {
                    if (gewerbesteuerpflichtigShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerbesteuerpflichtig = null;
                    }
                }
            }
            {
                Boolean praxisformShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.praxisform!= null));
                if (praxisformShouldBeCopiedAndSet == Boolean.TRUE) {
                    STPraxisform sourcePraxisform;
                    sourcePraxisform = this.getPraxisform();
                    STPraxisform copyPraxisform = ((STPraxisform) strategy.copy(LocatorUtils.property(locator, "praxisform", sourcePraxisform), sourcePraxisform, (this.praxisform!= null)));
                    copy.setPraxisform(copyPraxisform);
                } else {
                    if (praxisformShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.praxisform = null;
                    }
                }
            }
            {
                Boolean einkommenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einkommen!= null));
                if (einkommenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTEinkommensart sourceEinkommen;
                    sourceEinkommen = this.getEinkommen();
                    CTEinkommensart copyEinkommen = ((CTEinkommensart) strategy.copy(LocatorUtils.property(locator, "einkommen", sourceEinkommen), sourceEinkommen, (this.einkommen!= null)));
                    copy.setEinkommen(copyEinkommen);
                } else {
                    if (einkommenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einkommen = null;
                    }
                }
            }
            {
                Boolean stellungImBerufSeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellungImBerufSeit!= null));
                if (stellungImBerufSeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStellungImBerufSeit;
                    sourceStellungImBerufSeit = this.getStellungImBerufSeit();
                    String copyStellungImBerufSeit = ((String) strategy.copy(LocatorUtils.property(locator, "stellungImBerufSeit", sourceStellungImBerufSeit), sourceStellungImBerufSeit, (this.stellungImBerufSeit!= null)));
                    copy.setStellungImBerufSeit(copyStellungImBerufSeit);
                } else {
                    if (stellungImBerufSeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellungImBerufSeit = null;
                    }
                }
            }
            {
                Boolean berufsschluesselverzeichnisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berufsschluesselverzeichnis!= null));
                if (berufsschluesselverzeichnisShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEBerufsschluesselverzeichnis sourceBerufsschluesselverzeichnis;
                    sourceBerufsschluesselverzeichnis = this.getBerufsschluesselverzeichnis();
                    STEBerufsschluesselverzeichnis copyBerufsschluesselverzeichnis = ((STEBerufsschluesselverzeichnis) strategy.copy(LocatorUtils.property(locator, "berufsschluesselverzeichnis", sourceBerufsschluesselverzeichnis), sourceBerufsschluesselverzeichnis, (this.berufsschluesselverzeichnis!= null)));
                    copy.setBerufsschluesselverzeichnis(copyBerufsschluesselverzeichnis);
                } else {
                    if (berufsschluesselverzeichnisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berufsschluesselverzeichnis = null;
                    }
                }
            }
            {
                Boolean arbeitgeberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.arbeitgeber!= null));
                if (arbeitgeberShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTArbeitgeber sourceArbeitgeber;
                    sourceArbeitgeber = this.getArbeitgeber();
                    CTArbeitgeber copyArbeitgeber = ((CTArbeitgeber) strategy.copy(LocatorUtils.property(locator, "arbeitgeber", sourceArbeitgeber), sourceArbeitgeber, (this.arbeitgeber!= null)));
                    copy.setArbeitgeber(copyArbeitgeber);
                } else {
                    if (arbeitgeberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.arbeitgeber = null;
                    }
                }
            }
            {
                Boolean teilzeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilzeit!= null));
                if (teilzeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTTeilzeit sourceTeilzeit;
                    sourceTeilzeit = this.getTeilzeit();
                    CTTeilzeit copyTeilzeit = ((CTTeilzeit) strategy.copy(LocatorUtils.property(locator, "teilzeit", sourceTeilzeit), sourceTeilzeit, (this.teilzeit!= null)));
                    copy.setTeilzeit(copyTeilzeit);
                } else {
                    if (teilzeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilzeit = null;
                    }
                }
            }
            {
                Boolean grenzgaengerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grenzgaenger!= null));
                if (grenzgaengerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGrenzgaenger;
                    sourceGrenzgaenger = this.isGrenzgaenger();
                    Boolean copyGrenzgaenger = ((Boolean) strategy.copy(LocatorUtils.property(locator, "grenzgaenger", sourceGrenzgaenger), sourceGrenzgaenger, (this.grenzgaenger!= null)));
                    copy.setGrenzgaenger(copyGrenzgaenger);
                } else {
                    if (grenzgaengerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grenzgaenger = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBerufstaetigkeit();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withBeruf(String value) {
        setBeruf(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withStellungImBeruf(STEStellungImBeruf value) {
        setStellungImBeruf(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withMitarbeiteranzahl(Integer value) {
        setMitarbeiteranzahl(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withBesoldungsgruppe(String value) {
        setBesoldungsgruppe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withSelbststaendigSeit(String value) {
        setSelbststaendigSeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withArbeitsvertragBefristetBis(String value) {
        setArbeitsvertragBefristetBis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withBetriebseintritt(String value) {
        setBetriebseintritt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withKoerperlichTaetig(BigDecimal value) {
        setKoerperlichTaetig(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withBranche(STEBerufsBranche value) {
        setBranche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withOeffentlicherDienst(Boolean value) {
        setOeffentlicherDienst(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withAnteilAussendienst(BigDecimal value) {
        setAnteilAussendienst(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withAufsichtsfuehrend(Boolean value) {
        setAufsichtsfuehrend(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withMitarbeitend(Boolean value) {
        setMitarbeitend(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withBerufsschluessel(String value) {
        setBerufsschluessel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withNichtKoerperlichTaetig(BigDecimal value) {
        setNichtKoerperlichTaetig(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withGewerbesteuerpflichtig(Boolean value) {
        setGewerbesteuerpflichtig(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withPraxisform(STPraxisform value) {
        setPraxisform(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withEinkommen(CTEinkommensart value) {
        setEinkommen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withStellungImBerufSeit(String value) {
        setStellungImBerufSeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withBerufsschluesselverzeichnis(STEBerufsschluesselverzeichnis value) {
        setBerufsschluesselverzeichnis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withArbeitgeber(CTArbeitgeber value) {
        setArbeitgeber(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withTeilzeit(CTTeilzeit value) {
        setTeilzeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withGrenzgaenger(Boolean value) {
        setGrenzgaenger(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerufstaetigkeit withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
