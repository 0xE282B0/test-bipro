
package net.bipro.namespace.versicherung.sach;

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
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STBewegungsrisiko;
import net.bipro.namespace.datentypen.STEGefahrenmerkmal;
import net.bipro.namespace.datentypen.STEigentumsverhaeltnis;
import net.bipro.namespace.datentypen.STLageDerVersicherungsraeume;
import net.bipro.namespace.datentypen.STLagePhotovoltaik;
import net.bipro.namespace.fragen.CTFragenkomplex;
import net.bipro.namespace.versicherung.produktmodell.CTVorschaden;
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
 * Faktoren, die die Risikoeinschätzung von Sachversicherungen in Gewerbe mittelbar beeinflussen.
 * 
 * <p>Java class for CT_GewerbeEinflussfaktoren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_GewerbeEinflussfaktoren"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_ZusaetzlicheGegenstandsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MitversicherungVonFremdenEigentum" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Faktor" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="LageDerVersicherungsraeume" type="{http://www.bipro.net/namespace/datentypen}ST_LageDerVersicherungsraeume" minOccurs="0"/&gt;
 *         &lt;element name="Eigentumsverhaeltnis" type="{http://www.bipro.net/namespace/datentypen}ST_Eigentumsverhaeltnis" minOccurs="0"/&gt;
 *         &lt;element name="LagePhotovoltaik" type="{http://www.bipro.net/namespace/datentypen}ST_LagePhotovoltaik" minOccurs="0"/&gt;
 *         &lt;element name="Einsatzort" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="GewerblichVermietet" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Bewegungsrisiko" type="{http://www.bipro.net/namespace/datentypen}ST_Bewegungsrisiko" minOccurs="0"/&gt;
 *         &lt;element name="Gefahrenmerkmal" type="{http://www.bipro.net/namespace/datentypen}STE_Gefahrenmerkmal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Aufbewahrungsart" type="{http://www.bipro.net/namespace/versicherung/sach}CT_Aufbewahrungsart" minOccurs="0"/&gt;
 *         &lt;element name="Vorschaden" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Vorschaden" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Auslagerungssicherungsdatentraeger" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Fragenkomplex" type="{http://www.bipro.net/namespace/fragen}CT_Fragenkomplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sicherung" type="{http://www.bipro.net/namespace/versicherung/sach}CT_Sicherung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_GewerbeEinflussfaktoren", propOrder = {
    "mitversicherungVonFremdenEigentum",
    "faktor",
    "lageDerVersicherungsraeume",
    "eigentumsverhaeltnis",
    "lagePhotovoltaik",
    "einsatzort",
    "gewerblichVermietet",
    "bewegungsrisiko",
    "gefahrenmerkmal",
    "aufbewahrungsart",
    "vorschaden",
    "auslagerungssicherungsdatentraeger",
    "fragenkomplex",
    "sicherung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGewerbeEinflussfaktoren
    extends CTZusaetzlicheGegenstandsdaten
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "MitversicherungVonFremdenEigentum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean mitversicherungVonFremdenEigentum;
    @XmlElement(name = "Faktor")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal faktor;
    @XmlElement(name = "LageDerVersicherungsraeume")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLageDerVersicherungsraeume lageDerVersicherungsraeume;
    @XmlElement(name = "Eigentumsverhaeltnis")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEigentumsverhaeltnis eigentumsverhaeltnis;
    @XmlElement(name = "LagePhotovoltaik")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLagePhotovoltaik lagePhotovoltaik;
    @XmlElement(name = "Einsatzort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String einsatzort;
    @XmlElement(name = "GewerblichVermietet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean gewerblichVermietet;
    @XmlElement(name = "Bewegungsrisiko")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STBewegungsrisiko bewegungsrisiko;
    @XmlElement(name = "Gefahrenmerkmal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<STEGefahrenmerkmal> gefahrenmerkmal;
    @XmlElement(name = "Aufbewahrungsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTAufbewahrungsart aufbewahrungsart;
    @XmlElement(name = "Vorschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVorschaden> vorschaden;
    @XmlElement(name = "Auslagerungssicherungsdatentraeger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean auslagerungssicherungsdatentraeger;
    @XmlElement(name = "Fragenkomplex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTFragenkomplex> fragenkomplex;
    @XmlElement(name = "Sicherung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSicherung> sicherung;

    /**
     * Gets the value of the mitversicherungVonFremdenEigentum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isMitversicherungVonFremdenEigentum() {
        return mitversicherungVonFremdenEigentum;
    }

    /**
     * Sets the value of the mitversicherungVonFremdenEigentum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMitversicherungVonFremdenEigentum(Boolean value) {
        this.mitversicherungVonFremdenEigentum = value;
    }

    /**
     * Gets the value of the faktor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getFaktor() {
        return faktor;
    }

    /**
     * Sets the value of the faktor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFaktor(BigDecimal value) {
        this.faktor = value;
    }

    /**
     * Gets the value of the lageDerVersicherungsraeume property.
     * 
     * @return
     *     possible object is
     *     {@link STLageDerVersicherungsraeume }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLageDerVersicherungsraeume getLageDerVersicherungsraeume() {
        return lageDerVersicherungsraeume;
    }

    /**
     * Sets the value of the lageDerVersicherungsraeume property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLageDerVersicherungsraeume }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLageDerVersicherungsraeume(STLageDerVersicherungsraeume value) {
        this.lageDerVersicherungsraeume = value;
    }

    /**
     * Gets the value of the eigentumsverhaeltnis property.
     * 
     * @return
     *     possible object is
     *     {@link STEigentumsverhaeltnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEigentumsverhaeltnis getEigentumsverhaeltnis() {
        return eigentumsverhaeltnis;
    }

    /**
     * Sets the value of the eigentumsverhaeltnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEigentumsverhaeltnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEigentumsverhaeltnis(STEigentumsverhaeltnis value) {
        this.eigentumsverhaeltnis = value;
    }

    /**
     * Gets the value of the lagePhotovoltaik property.
     * 
     * @return
     *     possible object is
     *     {@link STLagePhotovoltaik }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLagePhotovoltaik getLagePhotovoltaik() {
        return lagePhotovoltaik;
    }

    /**
     * Sets the value of the lagePhotovoltaik property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLagePhotovoltaik }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLagePhotovoltaik(STLagePhotovoltaik value) {
        this.lagePhotovoltaik = value;
    }

    /**
     * Gets the value of the einsatzort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getEinsatzort() {
        return einsatzort;
    }

    /**
     * Sets the value of the einsatzort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinsatzort(String value) {
        this.einsatzort = value;
    }

    /**
     * Gets the value of the gewerblichVermietet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isGewerblichVermietet() {
        return gewerblichVermietet;
    }

    /**
     * Sets the value of the gewerblichVermietet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGewerblichVermietet(Boolean value) {
        this.gewerblichVermietet = value;
    }

    /**
     * Gets the value of the bewegungsrisiko property.
     * 
     * @return
     *     possible object is
     *     {@link STBewegungsrisiko }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STBewegungsrisiko getBewegungsrisiko() {
        return bewegungsrisiko;
    }

    /**
     * Sets the value of the bewegungsrisiko property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBewegungsrisiko }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBewegungsrisiko(STBewegungsrisiko value) {
        this.bewegungsrisiko = value;
    }

    /**
     * Gets the value of the gefahrenmerkmal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gefahrenmerkmal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGefahrenmerkmal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STEGefahrenmerkmal }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<STEGefahrenmerkmal> getGefahrenmerkmal() {
        if (gefahrenmerkmal == null) {
            gefahrenmerkmal = new ArrayList<STEGefahrenmerkmal>();
        }
        return this.gefahrenmerkmal;
    }

    /**
     * Gets the value of the aufbewahrungsart property.
     * 
     * @return
     *     possible object is
     *     {@link CTAufbewahrungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAufbewahrungsart getAufbewahrungsart() {
        return aufbewahrungsart;
    }

    /**
     * Sets the value of the aufbewahrungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAufbewahrungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAufbewahrungsart(CTAufbewahrungsart value) {
        this.aufbewahrungsart = value;
    }

    /**
     * Gets the value of the vorschaden property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vorschaden property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVorschaden().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVorschaden }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVorschaden> getVorschaden() {
        if (vorschaden == null) {
            vorschaden = new ArrayList<CTVorschaden>();
        }
        return this.vorschaden;
    }

    /**
     * Gets the value of the auslagerungssicherungsdatentraeger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isAuslagerungssicherungsdatentraeger() {
        return auslagerungssicherungsdatentraeger;
    }

    /**
     * Sets the value of the auslagerungssicherungsdatentraeger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAuslagerungssicherungsdatentraeger(Boolean value) {
        this.auslagerungssicherungsdatentraeger = value;
    }

    /**
     * Gets the value of the fragenkomplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fragenkomplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFragenkomplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTFragenkomplex }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTFragenkomplex> getFragenkomplex() {
        if (fragenkomplex == null) {
            fragenkomplex = new ArrayList<CTFragenkomplex>();
        }
        return this.fragenkomplex;
    }

    /**
     * Gets the value of the sicherung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicherung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSicherung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSicherung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTSicherung> getSicherung() {
        if (sicherung == null) {
            sicherung = new ArrayList<CTSicherung>();
        }
        return this.sicherung;
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
        final CTGewerbeEinflussfaktoren that = ((CTGewerbeEinflussfaktoren) object);
        {
            Boolean lhsMitversicherungVonFremdenEigentum;
            lhsMitversicherungVonFremdenEigentum = this.isMitversicherungVonFremdenEigentum();
            Boolean rhsMitversicherungVonFremdenEigentum;
            rhsMitversicherungVonFremdenEigentum = that.isMitversicherungVonFremdenEigentum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitversicherungVonFremdenEigentum", lhsMitversicherungVonFremdenEigentum), LocatorUtils.property(thatLocator, "mitversicherungVonFremdenEigentum", rhsMitversicherungVonFremdenEigentum), lhsMitversicherungVonFremdenEigentum, rhsMitversicherungVonFremdenEigentum, (this.mitversicherungVonFremdenEigentum!= null), (that.mitversicherungVonFremdenEigentum!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFaktor;
            lhsFaktor = this.getFaktor();
            BigDecimal rhsFaktor;
            rhsFaktor = that.getFaktor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faktor", lhsFaktor), LocatorUtils.property(thatLocator, "faktor", rhsFaktor), lhsFaktor, rhsFaktor, (this.faktor!= null), (that.faktor!= null))) {
                return false;
            }
        }
        {
            STLageDerVersicherungsraeume lhsLageDerVersicherungsraeume;
            lhsLageDerVersicherungsraeume = this.getLageDerVersicherungsraeume();
            STLageDerVersicherungsraeume rhsLageDerVersicherungsraeume;
            rhsLageDerVersicherungsraeume = that.getLageDerVersicherungsraeume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageDerVersicherungsraeume", lhsLageDerVersicherungsraeume), LocatorUtils.property(thatLocator, "lageDerVersicherungsraeume", rhsLageDerVersicherungsraeume), lhsLageDerVersicherungsraeume, rhsLageDerVersicherungsraeume, (this.lageDerVersicherungsraeume!= null), (that.lageDerVersicherungsraeume!= null))) {
                return false;
            }
        }
        {
            STEigentumsverhaeltnis lhsEigentumsverhaeltnis;
            lhsEigentumsverhaeltnis = this.getEigentumsverhaeltnis();
            STEigentumsverhaeltnis rhsEigentumsverhaeltnis;
            rhsEigentumsverhaeltnis = that.getEigentumsverhaeltnis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eigentumsverhaeltnis", lhsEigentumsverhaeltnis), LocatorUtils.property(thatLocator, "eigentumsverhaeltnis", rhsEigentumsverhaeltnis), lhsEigentumsverhaeltnis, rhsEigentumsverhaeltnis, (this.eigentumsverhaeltnis!= null), (that.eigentumsverhaeltnis!= null))) {
                return false;
            }
        }
        {
            STLagePhotovoltaik lhsLagePhotovoltaik;
            lhsLagePhotovoltaik = this.getLagePhotovoltaik();
            STLagePhotovoltaik rhsLagePhotovoltaik;
            rhsLagePhotovoltaik = that.getLagePhotovoltaik();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lagePhotovoltaik", lhsLagePhotovoltaik), LocatorUtils.property(thatLocator, "lagePhotovoltaik", rhsLagePhotovoltaik), lhsLagePhotovoltaik, rhsLagePhotovoltaik, (this.lagePhotovoltaik!= null), (that.lagePhotovoltaik!= null))) {
                return false;
            }
        }
        {
            String lhsEinsatzort;
            lhsEinsatzort = this.getEinsatzort();
            String rhsEinsatzort;
            rhsEinsatzort = that.getEinsatzort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einsatzort", lhsEinsatzort), LocatorUtils.property(thatLocator, "einsatzort", rhsEinsatzort), lhsEinsatzort, rhsEinsatzort, (this.einsatzort!= null), (that.einsatzort!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGewerblichVermietet;
            lhsGewerblichVermietet = this.isGewerblichVermietet();
            Boolean rhsGewerblichVermietet;
            rhsGewerblichVermietet = that.isGewerblichVermietet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerblichVermietet", lhsGewerblichVermietet), LocatorUtils.property(thatLocator, "gewerblichVermietet", rhsGewerblichVermietet), lhsGewerblichVermietet, rhsGewerblichVermietet, (this.gewerblichVermietet!= null), (that.gewerblichVermietet!= null))) {
                return false;
            }
        }
        {
            STBewegungsrisiko lhsBewegungsrisiko;
            lhsBewegungsrisiko = this.getBewegungsrisiko();
            STBewegungsrisiko rhsBewegungsrisiko;
            rhsBewegungsrisiko = that.getBewegungsrisiko();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bewegungsrisiko", lhsBewegungsrisiko), LocatorUtils.property(thatLocator, "bewegungsrisiko", rhsBewegungsrisiko), lhsBewegungsrisiko, rhsBewegungsrisiko, (this.bewegungsrisiko!= null), (that.bewegungsrisiko!= null))) {
                return false;
            }
        }
        {
            List<STEGefahrenmerkmal> lhsGefahrenmerkmal;
            lhsGefahrenmerkmal = (((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty()))?this.getGefahrenmerkmal():null);
            List<STEGefahrenmerkmal> rhsGefahrenmerkmal;
            rhsGefahrenmerkmal = (((that.gefahrenmerkmal!= null)&&(!that.gefahrenmerkmal.isEmpty()))?that.getGefahrenmerkmal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahrenmerkmal", lhsGefahrenmerkmal), LocatorUtils.property(thatLocator, "gefahrenmerkmal", rhsGefahrenmerkmal), lhsGefahrenmerkmal, rhsGefahrenmerkmal, ((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty())), ((that.gefahrenmerkmal!= null)&&(!that.gefahrenmerkmal.isEmpty())))) {
                return false;
            }
        }
        {
            CTAufbewahrungsart lhsAufbewahrungsart;
            lhsAufbewahrungsart = this.getAufbewahrungsart();
            CTAufbewahrungsart rhsAufbewahrungsart;
            rhsAufbewahrungsart = that.getAufbewahrungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufbewahrungsart", lhsAufbewahrungsart), LocatorUtils.property(thatLocator, "aufbewahrungsart", rhsAufbewahrungsart), lhsAufbewahrungsart, rhsAufbewahrungsart, (this.aufbewahrungsart!= null), (that.aufbewahrungsart!= null))) {
                return false;
            }
        }
        {
            List<CTVorschaden> lhsVorschaden;
            lhsVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
            List<CTVorschaden> rhsVorschaden;
            rhsVorschaden = (((that.vorschaden!= null)&&(!that.vorschaden.isEmpty()))?that.getVorschaden():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorschaden", lhsVorschaden), LocatorUtils.property(thatLocator, "vorschaden", rhsVorschaden), lhsVorschaden, rhsVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())), ((that.vorschaden!= null)&&(!that.vorschaden.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsAuslagerungssicherungsdatentraeger;
            lhsAuslagerungssicherungsdatentraeger = this.isAuslagerungssicherungsdatentraeger();
            Boolean rhsAuslagerungssicherungsdatentraeger;
            rhsAuslagerungssicherungsdatentraeger = that.isAuslagerungssicherungsdatentraeger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auslagerungssicherungsdatentraeger", lhsAuslagerungssicherungsdatentraeger), LocatorUtils.property(thatLocator, "auslagerungssicherungsdatentraeger", rhsAuslagerungssicherungsdatentraeger), lhsAuslagerungssicherungsdatentraeger, rhsAuslagerungssicherungsdatentraeger, (this.auslagerungssicherungsdatentraeger!= null), (that.auslagerungssicherungsdatentraeger!= null))) {
                return false;
            }
        }
        {
            List<CTFragenkomplex> lhsFragenkomplex;
            lhsFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            List<CTFragenkomplex> rhsFragenkomplex;
            rhsFragenkomplex = (((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty()))?that.getFragenkomplex():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragenkomplex", lhsFragenkomplex), LocatorUtils.property(thatLocator, "fragenkomplex", rhsFragenkomplex), lhsFragenkomplex, rhsFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())), ((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTSicherung> lhsSicherung;
            lhsSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
            List<CTSicherung> rhsSicherung;
            rhsSicherung = (((that.sicherung!= null)&&(!that.sicherung.isEmpty()))?that.getSicherung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherung", lhsSicherung), LocatorUtils.property(thatLocator, "sicherung", rhsSicherung), lhsSicherung, rhsSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())), ((that.sicherung!= null)&&(!that.sicherung.isEmpty())))) {
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
            Boolean theMitversicherungVonFremdenEigentum;
            theMitversicherungVonFremdenEigentum = this.isMitversicherungVonFremdenEigentum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitversicherungVonFremdenEigentum", theMitversicherungVonFremdenEigentum), currentHashCode, theMitversicherungVonFremdenEigentum, (this.mitversicherungVonFremdenEigentum!= null));
        }
        {
            BigDecimal theFaktor;
            theFaktor = this.getFaktor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faktor", theFaktor), currentHashCode, theFaktor, (this.faktor!= null));
        }
        {
            STLageDerVersicherungsraeume theLageDerVersicherungsraeume;
            theLageDerVersicherungsraeume = this.getLageDerVersicherungsraeume();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lageDerVersicherungsraeume", theLageDerVersicherungsraeume), currentHashCode, theLageDerVersicherungsraeume, (this.lageDerVersicherungsraeume!= null));
        }
        {
            STEigentumsverhaeltnis theEigentumsverhaeltnis;
            theEigentumsverhaeltnis = this.getEigentumsverhaeltnis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eigentumsverhaeltnis", theEigentumsverhaeltnis), currentHashCode, theEigentumsverhaeltnis, (this.eigentumsverhaeltnis!= null));
        }
        {
            STLagePhotovoltaik theLagePhotovoltaik;
            theLagePhotovoltaik = this.getLagePhotovoltaik();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lagePhotovoltaik", theLagePhotovoltaik), currentHashCode, theLagePhotovoltaik, (this.lagePhotovoltaik!= null));
        }
        {
            String theEinsatzort;
            theEinsatzort = this.getEinsatzort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einsatzort", theEinsatzort), currentHashCode, theEinsatzort, (this.einsatzort!= null));
        }
        {
            Boolean theGewerblichVermietet;
            theGewerblichVermietet = this.isGewerblichVermietet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewerblichVermietet", theGewerblichVermietet), currentHashCode, theGewerblichVermietet, (this.gewerblichVermietet!= null));
        }
        {
            STBewegungsrisiko theBewegungsrisiko;
            theBewegungsrisiko = this.getBewegungsrisiko();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bewegungsrisiko", theBewegungsrisiko), currentHashCode, theBewegungsrisiko, (this.bewegungsrisiko!= null));
        }
        {
            List<STEGefahrenmerkmal> theGefahrenmerkmal;
            theGefahrenmerkmal = (((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty()))?this.getGefahrenmerkmal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahrenmerkmal", theGefahrenmerkmal), currentHashCode, theGefahrenmerkmal, ((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty())));
        }
        {
            CTAufbewahrungsart theAufbewahrungsart;
            theAufbewahrungsart = this.getAufbewahrungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aufbewahrungsart", theAufbewahrungsart), currentHashCode, theAufbewahrungsart, (this.aufbewahrungsart!= null));
        }
        {
            List<CTVorschaden> theVorschaden;
            theVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorschaden", theVorschaden), currentHashCode, theVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())));
        }
        {
            Boolean theAuslagerungssicherungsdatentraeger;
            theAuslagerungssicherungsdatentraeger = this.isAuslagerungssicherungsdatentraeger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auslagerungssicherungsdatentraeger", theAuslagerungssicherungsdatentraeger), currentHashCode, theAuslagerungssicherungsdatentraeger, (this.auslagerungssicherungsdatentraeger!= null));
        }
        {
            List<CTFragenkomplex> theFragenkomplex;
            theFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragenkomplex", theFragenkomplex), currentHashCode, theFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
        }
        {
            List<CTSicherung> theSicherung;
            theSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherung", theSicherung), currentHashCode, theSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())));
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
        if (draftCopy instanceof CTGewerbeEinflussfaktoren) {
            final CTGewerbeEinflussfaktoren copy = ((CTGewerbeEinflussfaktoren) draftCopy);
            {
                Boolean mitversicherungVonFremdenEigentumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitversicherungVonFremdenEigentum!= null));
                if (mitversicherungVonFremdenEigentumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMitversicherungVonFremdenEigentum;
                    sourceMitversicherungVonFremdenEigentum = this.isMitversicherungVonFremdenEigentum();
                    Boolean copyMitversicherungVonFremdenEigentum = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mitversicherungVonFremdenEigentum", sourceMitversicherungVonFremdenEigentum), sourceMitversicherungVonFremdenEigentum, (this.mitversicherungVonFremdenEigentum!= null)));
                    copy.setMitversicherungVonFremdenEigentum(copyMitversicherungVonFremdenEigentum);
                } else {
                    if (mitversicherungVonFremdenEigentumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitversicherungVonFremdenEigentum = null;
                    }
                }
            }
            {
                Boolean faktorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faktor!= null));
                if (faktorShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFaktor;
                    sourceFaktor = this.getFaktor();
                    BigDecimal copyFaktor = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "faktor", sourceFaktor), sourceFaktor, (this.faktor!= null)));
                    copy.setFaktor(copyFaktor);
                } else {
                    if (faktorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faktor = null;
                    }
                }
            }
            {
                Boolean lageDerVersicherungsraeumeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lageDerVersicherungsraeume!= null));
                if (lageDerVersicherungsraeumeShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLageDerVersicherungsraeume sourceLageDerVersicherungsraeume;
                    sourceLageDerVersicherungsraeume = this.getLageDerVersicherungsraeume();
                    STLageDerVersicherungsraeume copyLageDerVersicherungsraeume = ((STLageDerVersicherungsraeume) strategy.copy(LocatorUtils.property(locator, "lageDerVersicherungsraeume", sourceLageDerVersicherungsraeume), sourceLageDerVersicherungsraeume, (this.lageDerVersicherungsraeume!= null)));
                    copy.setLageDerVersicherungsraeume(copyLageDerVersicherungsraeume);
                } else {
                    if (lageDerVersicherungsraeumeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lageDerVersicherungsraeume = null;
                    }
                }
            }
            {
                Boolean eigentumsverhaeltnisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eigentumsverhaeltnis!= null));
                if (eigentumsverhaeltnisShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEigentumsverhaeltnis sourceEigentumsverhaeltnis;
                    sourceEigentumsverhaeltnis = this.getEigentumsverhaeltnis();
                    STEigentumsverhaeltnis copyEigentumsverhaeltnis = ((STEigentumsverhaeltnis) strategy.copy(LocatorUtils.property(locator, "eigentumsverhaeltnis", sourceEigentumsverhaeltnis), sourceEigentumsverhaeltnis, (this.eigentumsverhaeltnis!= null)));
                    copy.setEigentumsverhaeltnis(copyEigentumsverhaeltnis);
                } else {
                    if (eigentumsverhaeltnisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eigentumsverhaeltnis = null;
                    }
                }
            }
            {
                Boolean lagePhotovoltaikShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lagePhotovoltaik!= null));
                if (lagePhotovoltaikShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLagePhotovoltaik sourceLagePhotovoltaik;
                    sourceLagePhotovoltaik = this.getLagePhotovoltaik();
                    STLagePhotovoltaik copyLagePhotovoltaik = ((STLagePhotovoltaik) strategy.copy(LocatorUtils.property(locator, "lagePhotovoltaik", sourceLagePhotovoltaik), sourceLagePhotovoltaik, (this.lagePhotovoltaik!= null)));
                    copy.setLagePhotovoltaik(copyLagePhotovoltaik);
                } else {
                    if (lagePhotovoltaikShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lagePhotovoltaik = null;
                    }
                }
            }
            {
                Boolean einsatzortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einsatzort!= null));
                if (einsatzortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEinsatzort;
                    sourceEinsatzort = this.getEinsatzort();
                    String copyEinsatzort = ((String) strategy.copy(LocatorUtils.property(locator, "einsatzort", sourceEinsatzort), sourceEinsatzort, (this.einsatzort!= null)));
                    copy.setEinsatzort(copyEinsatzort);
                } else {
                    if (einsatzortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einsatzort = null;
                    }
                }
            }
            {
                Boolean gewerblichVermietetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerblichVermietet!= null));
                if (gewerblichVermietetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGewerblichVermietet;
                    sourceGewerblichVermietet = this.isGewerblichVermietet();
                    Boolean copyGewerblichVermietet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gewerblichVermietet", sourceGewerblichVermietet), sourceGewerblichVermietet, (this.gewerblichVermietet!= null)));
                    copy.setGewerblichVermietet(copyGewerblichVermietet);
                } else {
                    if (gewerblichVermietetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerblichVermietet = null;
                    }
                }
            }
            {
                Boolean bewegungsrisikoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bewegungsrisiko!= null));
                if (bewegungsrisikoShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBewegungsrisiko sourceBewegungsrisiko;
                    sourceBewegungsrisiko = this.getBewegungsrisiko();
                    STBewegungsrisiko copyBewegungsrisiko = ((STBewegungsrisiko) strategy.copy(LocatorUtils.property(locator, "bewegungsrisiko", sourceBewegungsrisiko), sourceBewegungsrisiko, (this.bewegungsrisiko!= null)));
                    copy.setBewegungsrisiko(copyBewegungsrisiko);
                } else {
                    if (bewegungsrisikoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bewegungsrisiko = null;
                    }
                }
            }
            {
                Boolean gefahrenmerkmalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty())));
                if (gefahrenmerkmalShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STEGefahrenmerkmal> sourceGefahrenmerkmal;
                    sourceGefahrenmerkmal = (((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty()))?this.getGefahrenmerkmal():null);
                    @SuppressWarnings("unchecked")
                    List<STEGefahrenmerkmal> copyGefahrenmerkmal = ((List<STEGefahrenmerkmal> ) strategy.copy(LocatorUtils.property(locator, "gefahrenmerkmal", sourceGefahrenmerkmal), sourceGefahrenmerkmal, ((this.gefahrenmerkmal!= null)&&(!this.gefahrenmerkmal.isEmpty()))));
                    copy.gefahrenmerkmal = null;
                    if (copyGefahrenmerkmal!= null) {
                        List<STEGefahrenmerkmal> uniqueGefahrenmerkmall = copy.getGefahrenmerkmal();
                        uniqueGefahrenmerkmall.addAll(copyGefahrenmerkmal);
                    }
                } else {
                    if (gefahrenmerkmalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahrenmerkmal = null;
                    }
                }
            }
            {
                Boolean aufbewahrungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufbewahrungsart!= null));
                if (aufbewahrungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAufbewahrungsart sourceAufbewahrungsart;
                    sourceAufbewahrungsart = this.getAufbewahrungsart();
                    CTAufbewahrungsart copyAufbewahrungsart = ((CTAufbewahrungsart) strategy.copy(LocatorUtils.property(locator, "aufbewahrungsart", sourceAufbewahrungsart), sourceAufbewahrungsart, (this.aufbewahrungsart!= null)));
                    copy.setAufbewahrungsart(copyAufbewahrungsart);
                } else {
                    if (aufbewahrungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aufbewahrungsart = null;
                    }
                }
            }
            {
                Boolean vorschadenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())));
                if (vorschadenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVorschaden> sourceVorschaden;
                    sourceVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
                    @SuppressWarnings("unchecked")
                    List<CTVorschaden> copyVorschaden = ((List<CTVorschaden> ) strategy.copy(LocatorUtils.property(locator, "vorschaden", sourceVorschaden), sourceVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))));
                    copy.vorschaden = null;
                    if (copyVorschaden!= null) {
                        List<CTVorschaden> uniqueVorschadenl = copy.getVorschaden();
                        uniqueVorschadenl.addAll(copyVorschaden);
                    }
                } else {
                    if (vorschadenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorschaden = null;
                    }
                }
            }
            {
                Boolean auslagerungssicherungsdatentraegerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auslagerungssicherungsdatentraeger!= null));
                if (auslagerungssicherungsdatentraegerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAuslagerungssicherungsdatentraeger;
                    sourceAuslagerungssicherungsdatentraeger = this.isAuslagerungssicherungsdatentraeger();
                    Boolean copyAuslagerungssicherungsdatentraeger = ((Boolean) strategy.copy(LocatorUtils.property(locator, "auslagerungssicherungsdatentraeger", sourceAuslagerungssicherungsdatentraeger), sourceAuslagerungssicherungsdatentraeger, (this.auslagerungssicherungsdatentraeger!= null)));
                    copy.setAuslagerungssicherungsdatentraeger(copyAuslagerungssicherungsdatentraeger);
                } else {
                    if (auslagerungssicherungsdatentraegerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auslagerungssicherungsdatentraeger = null;
                    }
                }
            }
            {
                Boolean fragenkomplexShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
                if (fragenkomplexShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTFragenkomplex> sourceFragenkomplex;
                    sourceFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
                    @SuppressWarnings("unchecked")
                    List<CTFragenkomplex> copyFragenkomplex = ((List<CTFragenkomplex> ) strategy.copy(LocatorUtils.property(locator, "fragenkomplex", sourceFragenkomplex), sourceFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))));
                    copy.fragenkomplex = null;
                    if (copyFragenkomplex!= null) {
                        List<CTFragenkomplex> uniqueFragenkomplexl = copy.getFragenkomplex();
                        uniqueFragenkomplexl.addAll(copyFragenkomplex);
                    }
                } else {
                    if (fragenkomplexShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fragenkomplex = null;
                    }
                }
            }
            {
                Boolean sicherungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())));
                if (sicherungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSicherung> sourceSicherung;
                    sourceSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
                    @SuppressWarnings("unchecked")
                    List<CTSicherung> copySicherung = ((List<CTSicherung> ) strategy.copy(LocatorUtils.property(locator, "sicherung", sourceSicherung), sourceSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty()))));
                    copy.sicherung = null;
                    if (copySicherung!= null) {
                        List<CTSicherung> uniqueSicherungl = copy.getSicherung();
                        uniqueSicherungl.addAll(copySicherung);
                    }
                } else {
                    if (sicherungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGewerbeEinflussfaktoren();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withMitversicherungVonFremdenEigentum(Boolean value) {
        setMitversicherungVonFremdenEigentum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withFaktor(BigDecimal value) {
        setFaktor(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withLageDerVersicherungsraeume(STLageDerVersicherungsraeume value) {
        setLageDerVersicherungsraeume(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withEigentumsverhaeltnis(STEigentumsverhaeltnis value) {
        setEigentumsverhaeltnis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withLagePhotovoltaik(STLagePhotovoltaik value) {
        setLagePhotovoltaik(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withEinsatzort(String value) {
        setEinsatzort(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withGewerblichVermietet(Boolean value) {
        setGewerblichVermietet(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withBewegungsrisiko(STBewegungsrisiko value) {
        setBewegungsrisiko(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withGefahrenmerkmal(STEGefahrenmerkmal... values) {
        if (values!= null) {
            for (STEGefahrenmerkmal value: values) {
                getGefahrenmerkmal().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withGefahrenmerkmal(Collection<STEGefahrenmerkmal> values) {
        if (values!= null) {
            getGefahrenmerkmal().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withAufbewahrungsart(CTAufbewahrungsart value) {
        setAufbewahrungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withVorschaden(CTVorschaden... values) {
        if (values!= null) {
            for (CTVorschaden value: values) {
                getVorschaden().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withVorschaden(Collection<CTVorschaden> values) {
        if (values!= null) {
            getVorschaden().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withAuslagerungssicherungsdatentraeger(Boolean value) {
        setAuslagerungssicherungsdatentraeger(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withFragenkomplex(CTFragenkomplex... values) {
        if (values!= null) {
            for (CTFragenkomplex value: values) {
                getFragenkomplex().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withFragenkomplex(Collection<CTFragenkomplex> values) {
        if (values!= null) {
            getFragenkomplex().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withSicherung(CTSicherung... values) {
        if (values!= null) {
            for (CTSicherung value: values) {
                getSicherung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withSicherung(Collection<CTSicherung> values) {
        if (values!= null) {
            getSicherung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGewerbeEinflussfaktoren withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
